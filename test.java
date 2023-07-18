public /**
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode() {}
*     ListNode(int val) { this.val = val; }
*     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
* }
*/
class Solution {
   public boolean isPalindrome(ListNode head) {
       
       List list1= new ArrayList<>();

       ListNode current= head;

       while(current!=null)
       {
           list1.add(current.val);
           current= current.next;
       }

       int low= integer(list1.get(0));
       int high= list1.get(list1.size()-1);

       while(low<high)
       {
           if(list1.get(low)!=list1.get(high))
           {
               return false;
           }

           low= low+1;
           high= high-1;
       }
       return true;
   }
} {
    
}
