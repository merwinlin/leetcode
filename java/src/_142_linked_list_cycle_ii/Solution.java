package _142_linked_list_cycle_ii;

/**
 * 快慢指针首次相遇时：设head到环入口的距离为a,环入口到相遇点距离为b，环节点数为c,链表长度为L
 * a+b=n.
 * a+b+ k*c = 2n
 * 所以在首次相遇后，fast指针回到head，slow在原地继续往前，两个指针再次相遇时，就是环的入口：
 * kc = n = a+b
 * a+b = kc = (k-1)c + c = (k-1)c + L - a
 * 所以 a= (k-1)c + L - a - b
 * 也就是转了k-1圈以后，相遇点到入口的距离 等于a。
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode fast,slow;
        fast = head;
        slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                fast = head;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}
