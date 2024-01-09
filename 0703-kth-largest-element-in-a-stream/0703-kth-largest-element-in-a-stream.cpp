class KthLargest {
    multiset<int> m;
    int k;
public:
    KthLargest(int k, vector<int>& nums) {
        this->k = k;
        
        for(auto x:nums){
            m.insert(x);
        }
    }
    
    int add(int val) {
        m.insert(val);
        
        auto it = m.begin();
        advance(it, m.size()-k);
        return *it;
    }
};

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest* obj = new KthLargest(k, nums);
 * int param_1 = obj->add(val);
 */