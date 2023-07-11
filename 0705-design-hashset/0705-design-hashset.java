class MyHashSet {

    int arr[];

    public MyHashSet() {
        arr = new int[1000001];
    }
    
    public void add(int key) {
        int hash = key % 1000001;
        arr[hash] = 1;
    }
    
    public void remove(int key) {
        int hash = key % 1000001;
        arr[hash] = 0;
    }
    
    public boolean contains(int key) {
        int hash = key % 1000001;
        if(arr[hash] == 0){
            return false;
        }
        else
        return true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */