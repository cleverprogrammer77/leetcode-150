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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        int firstCriticalPoint = 0;
        int prevCriticalPoint = 0;
        int currPosition = 1;
        int minDistance = Integer.MAX_VALUE;
        while(curr.next != null){
            if((curr.val < prev.val && curr.val < curr.next.val) ||  (curr.val > prev.val && curr.val > curr.next.val)){
                if(prevCriticalPoint == 0){
                    firstCriticalPoint = currPosition;
                    prevCriticalPoint = currPosition;
                }else {
                    minDistance = Math.min(minDistance, currPosition - prevCriticalPoint);
                    prevCriticalPoint = currPosition;
                }
            }
            currPosition++;
            prev = curr;
            curr = curr.next;
        }
        if(minDistance == Integer.MAX_VALUE){
            return new int[]{-1, -1};
        }else {
            return new int[]{minDistance, prevCriticalPoint - firstCriticalPoint};
        }
    }
}