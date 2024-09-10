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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        
        while (curr != null && curr.next != null) {

            int gcd = cal_gcd(curr.val, curr.next.val);
            ListNode newNode = new ListNode(gcd);
            
            newNode.next = curr.next;

            curr.next = newNode;

            curr = newNode.next;
        }
        return head;
    }
    
    private int cal_gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}