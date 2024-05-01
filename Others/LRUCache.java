public class LRUCache {

    class Data{
        private int key;
        private int value;

        public Data(int key, int value){
            this.key = key;
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }

        public int getKey(){
            return this.key;
        }
    }

    private int capacity;

    private HashMap<Integer,Data> cache;
    private List<Data> cacheList;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.cacheList = new LinkedList<>();
    }

    public int get(int key) {
        if(!cache.containsKey(key)){
            return - 1;
        } else {
            cacheList.remove(cache.get(key));
            // Add it to the end of the list
            cacheList.addFirst(cache.get(key));

            return cache.get(key).getValue();
        }
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Data old = cache.get(key);
            // Evict old value from the list and put it to the front of it
            cacheList.remove(old);
            Data newData = new Data(key, value);
            cache.put(key, newData);
            cacheList.addFirst(newData);
        } else {
            if (cache.size() >= capacity){
                // Evict the oldest value from both map and list
                cache.remove(cacheList.removeLast().getKey());
            }
            Data newData = new Data(key, value);
            cache.put(key, newData);
            cacheList.addFirst(newData);
        }
    }
}