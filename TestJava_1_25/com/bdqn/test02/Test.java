package bdqn.test02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ListNode head5 =new ListNode(5,null);
        ListNode head4 =new ListNode(4,head5);
        ListNode head3 =new ListNode(3,head4);
        ListNode head2 =new ListNode(2,head3);
        ListNode head1 =new ListNode(1,head2);
        ListNode head = head1;
        //遍历
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
        reorderList(head1);
        System.out.println("-------");
        head = head1;
        //遍历
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }

    }

    public static void reorderList(ListNode head) {
        //首先要保证传入的不是空链表
        if(head == null)
            return;
        //因为只是数据交换数组型的效率较高
        ArrayList<ListNode> arrayList =new ArrayList<>();
        //将数据传入 因为传入的是地址
        ListNode node =head;
        while (node!=null){
            arrayList.add(node);
            node = node.next;
        }

        //将数据交替插入
        int i =0;
        int j= arrayList.size()-1;
        while (i<j){
            if(i<j){
                arrayList.get(i).next = arrayList.get(j);
                i++;
            }else if(i == j)
                break;
            arrayList.get(j).next = arrayList.get(i);
            j--;
        }
        arrayList.get(i).next =null;


    }
}
