package _237;

/**
 * node 就是要删除的节点，但是无法获取node前面的节点，所以没办法调整它的next
 * 办法就是使node的val为下一个节点的val,使node代替下一个节点
 * 然后删除下一个节点。
 */
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
