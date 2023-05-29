class MainGroovy {

    static def arrayToMap(def list) {
        def map = [:]
        if (!list.isEmpty()) {
            for(def item in list) {
                if (!map.containsKey(item)) {
                    map.put(item, 1)
                } else {
                    def count = map.get(item)
                    map.replace(item, ++count)
                }
            }
        }
        return map
    }
}
