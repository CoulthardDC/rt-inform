import java.util.*;

public class Main {
    public static Map<Integer, Integer> arrayToMap(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        if (!list.isEmpty()) {
            for (Integer item : list) {
                if (!map.containsKey(item)) {
                    map.put(item, 1);
                } else {
                    Integer count = map.get(item);
                    map.replace(item, ++count);
                }
            }
        }
        return map;
    }

    public static Map<Integer, Integer> arrayToMapForEach(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        if (!list.isEmpty()) {
            list.forEach(
                    (item) -> {
                        if (!map.containsKey(item)) {
                            map.put(item, 1);
                        } else {
                            Integer count = map.get(item);
                            map.replace(item, ++count);
                        }
                    }
            );
        }
        return map;
    }
}
