/**
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
    public ListNode middleNode(ListNode head) {
        int a=0;
        ListNode temp=head;
        while(temp != null)
        {
            a++;
            temp=temp.next;
        }
        ListNode temp1=head;
        for(int i=0;i<a/2;i++)
        {
            temp1=temp1.next;
        }
        head=temp1;
        return head;


        
    }
}
