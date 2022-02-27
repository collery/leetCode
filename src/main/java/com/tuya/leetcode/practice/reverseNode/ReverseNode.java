package com.tuya.leetcode.practice.reverseNode;

/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * 示例 2：
 *
 *
 * 输入：head = [1,2]
 * 输出：[2,1]
 * 示例 3：
 *
 * 输入：head = []
 * 输出：[]
 *  
 *
 * 提示：
 *
 * 链表中节点的数目范围是 [0, 5000]
 * -5000 <= Node.val <= 5000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReverseNode {


    public static ListNode reverseList(ListNode head) {


        return recursive(new ListNode(head.val),head.next);
    }
    public static ListNode recursive(ListNode a,ListNode b){
        if(b==null ){
            return a;
        }
        if(b.next==null){
            b.next=a;
            return b;
        }

        ListNode bb = b.next;
        b.next=a;
        a=b;

        return recursive( a, bb);
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(33,new ListNode(22));
        ListNode listNode1 = new ListNode(66, listNode);
        ListNode listNode2 = reverseList(listNode1);
        System.out.println(listNode2);
    }

}
class  ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
