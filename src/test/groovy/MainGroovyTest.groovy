import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainGroovyTest {
    private static def list
    private def map
    private static def resultMap

    @BeforeAll
    static void beforeAll() {
        list = [1, 3, 4, 5, 1, 5, 4]
        resultMap = [1 : 2, 3 : 1, 4 : 2, 5 : 2]
    }

    @Test
    @DisplayName("Преобразование пустого списка Groovy")
    void emptyArrayToListGroovyTest() {
        map = MainGroovy.arrayToMap([])
        Assertions.assertTrue(map.isEmpty())
    }

    @Test
    @DisplayName("Преобразование списка Groovy")
    void arrayToListGroovyTest() {
        map = MainGroovy.arrayToMap(list)
        Assertions.assertEquals(map.size(), resultMap.size() as Integer)
        Assertions.assertEquals(map, resultMap)
    }
}
