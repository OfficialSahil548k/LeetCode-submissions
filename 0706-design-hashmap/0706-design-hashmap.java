class MyHashMap {
    int n = 1000001;
    int[] map = new int[n];

    public MyHashMap() {
        Arrays.fill(map,-1);
    }
    
    public void put(int key, int value) {
        int index = key % n;
        map[index] = value;
    }
    
    public int get(int key) {
        int index = key % n;
        return map[index];
    }
    
    public void remove(int key) {
        int index = key % n;
        map[index] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */