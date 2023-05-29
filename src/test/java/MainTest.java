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
        list = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        resultMap = new HashMap<>();
        resultMap.put(1, 2);
        resultMap.put(3, 1);
        resultMap.put(4, 2);
        resultMap.put(5, 2);
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
    public void arrayToMapTest() {
        map = Main.arrayToMap(list);
        Assertions.assertEquals(map.size(), resultMap.size());
        Assertions.assertEquals(map, resultMap);
    }

    @Test
    @DisplayName("Преобразование списка forEach")
    public void arrayToMapForEachTest() {
        map = Main.arrayToMapForEach(list);
        Assertions.assertEquals(map.size(), resultMap.size());
        Assertions.assertEquals(map, resultMap);
    }
}
