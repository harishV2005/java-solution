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
    public int getDecimalValue(ListNode head) {
        ListNode a=head;
        StringBuilder d = new StringBuilder();
        while(a!=null)
        {
            d.append(a.val);
            a=a.next;
        }
        int ans = Integer.parseInt(d.toString(), 2);
        return ans;
        
    }
}
