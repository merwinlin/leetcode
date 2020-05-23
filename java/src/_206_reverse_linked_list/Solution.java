package _206_reverse_linked_list;

/**
 * Created by Administrator on 2019/4/28.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode next = null;
//        ListNode cur = head;
//        while(cur != null){
//            next = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = next;
//        }
//        return prev;
//    }
//}

/**
 * 1->2->3->4->5->null
 */
class Solution {
    ListNode result ;

    /**
     * 递归从1到4，到5的时候直接返回node,而且最后这个node不做修改直接返回到最上层。
     * 最后回到1时，1.next=2,2.next=1. 所以递归中需要加一步head.next = null;
     */
//    public ListNode reverseList(ListNode head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//        result = reverseList(head.next);
//        head.next.next= head;
//        head.next = null;
//        return result;
//    }

    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode next;
        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }



    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        Solution s = new Solution();
        ListNode result = s.reverseList(n1);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
