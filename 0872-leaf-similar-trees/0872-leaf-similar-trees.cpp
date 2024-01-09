/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool leafSimilar(TreeNode* root1, TreeNode* root2) {
        stack<TreeNode*> s1;
        stack<TreeNode*> s2;
        vector<int> a;
        vector<int> b;
        
        s1.push(root1);
        
        //DFS for TREE1
        while(!s1.empty()){
            TreeNode* p = s1.top();
            s1.pop();
            
            if(p->right){
                s1.push(p->right);
            }
            if(p->left){
                s1.push(p->left);
            }
         
            if(!p->left && !p->right){
                a.push_back(p->val);
            }
            
        }
        
        s2.push(root2);
        
        //DFS for TREE2
        while(!s2.empty()){
            TreeNode* p = s2.top();
            s2.pop();
            
            if(p->right){
                s2.push(p->right);
            }
            if(p->left){
                s2.push(p->left);
            }
         
            if(!p->left && !p->right){
                b.push_back(p->val);
            }
            
        }
        
      //Check if two vectors are equal
      if(a.size()!=b.size()){
          return false;
      }
        
      for(auto i=0; i<a.size();++i){
          if(a[i]!=b[i]){
              return false;
          }
      }
        return true;
    }
};