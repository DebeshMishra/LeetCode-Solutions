/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode(0);
        ListNode result = resultHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;
            int sum = l1_val + l2_val + carry;
            carry = sum / 10;
            ListNode nextNode = new ListNode(sum % 10);
            result.next = nextNode;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            result = result.next;
        }
        if (carry > 0) {
            ListNode nextNode = new ListNode(carry);
            result.next = nextNode;
            result = result.next;
        }

        return resultHead.next;
    }
}
// @lc code=end
