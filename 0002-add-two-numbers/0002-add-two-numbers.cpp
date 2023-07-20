/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
      
      int a;
      int carryover = 0;


      if(l1 == nullptr && l2 == nullptr){
          return nullptr;
      }
      else if(l1 == nullptr){
          return l2;
      }
      else if( l2 == nullptr){
          return l1;
      }


      ListNode *p = new ListNode(0);
       
      ListNode *temp = p;
      while( true ){

          if(l1 == nullptr && l2 == nullptr && carryover == 0){
              break;
          }

          int l1Value;
          int l2Value;

          if(l1 == nullptr){
              l1Value = 0;
          }
          else {
              l1Value = l1->val;
          }

          if(l2 == nullptr){
              l2Value = 0;
          }
          else {
              l2Value = l2->val;
          }

          a = l1Value + l2Value;
          a = a + carryover;

          if(a>=10){
              carryover = 1;
          }
          else {
              carryover = 0;
          }
          
          temp->next = new ListNode(a%10);

          temp = temp->next;

          if(l1!= nullptr && l1->next!=nullptr){
          l1 = l1->next;
          }
          else{
           l1 = nullptr;
          }

      
          if(l2!= nullptr && l2->next!=nullptr){
          l2 = l2->next;
          }
          else{
              l2 = nullptr;
          }

      }

      return p->next;
      
    }
};