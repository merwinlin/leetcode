package _160;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/solution/tu-jie-xiang-jiao-lian-biao-by-user7208t/
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while(a != b){
            if(a == null){
                a = headB;
            }else{
                a = a.next;
            }
            if(b == null){
                b = headA;
            }else{
                b = b.next;
            }
        }
        return a;
    }
    /**
     * headA ->-> tail ->-> headB ->-> 交点 ->-> tail
     * headB ->-> tail ->-> headA ->-> 交点 ->-> tail
     *
     * 如没有交点：
     * headA ->-> tail ->-> headB ->-> tail ->null
     * headB ->-> tail ->-> headA ->-> tail ->null
     */
}
