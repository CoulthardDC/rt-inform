import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class MainTest {
    private static List<Integer> list;
    private Map<Integer, Integer> map;

    private static Map<Integer, Integer> resultMap;

    @BeforeAll
    public static void beforeAll() {
        list = Arrays.asList(1, 2, 2, 3, 4, 5, 4, 3, 1, 4, 6, 8);
        resultMap = new HashMap<>();
        resultMap.put(1, 2);
        resultMap.put(2, 2);
        resultMap.put(3, 2);
        resultMap.put(4, 3);
        resultMap.put(5, 1);
        resultMap.put(6, 1);
        resultMap.put(8, 1);
    }

    @Test
    @DisplayName("Преобразование пустого списка")
    public void emptyArrayToMapTest() {
        map = Main.arrayToMap(new ArrayList<>());
        Assertions.assertTrue(map.isEmpty());
    }

    @Test
    @DisplayName("Преобразованеи пустого списка forEach")
    public void emptyArrayToMapForEachTest() {
        map = Main.arrayToMapForEach(new ArrayList<>());
        Assertions.assertTrue(map.isEmpty());
    }

    @Test
    @DisplayName("Преобразование списка")
    public void arrayToMap() {
        map = Main.arrayToMap(list);
        Assertions.assertEquals(map.size(), resultMap.size());
        Assertions.assertEquals(map, resultMap);
    }

    @Test
    @DisplayName("Преобразование списка forEach")
    public void arrayToMapForEach() {
        map = Main.arrayToMapForEach(list);
        Assertions.assertEquals(map.size(), resultMap.size());
        Assertions.assertEquals(map, resultMap);
    }
}
