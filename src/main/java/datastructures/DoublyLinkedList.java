package datastructures;

public class DoublyLinkedList {
    public static void main(String[] args) {
        BidirectionalNode head = new BidirectionalNode(5);
        BidirectionalNode one = new BidirectionalNode(6 );
        BidirectionalNode two = new BidirectionalNode(7);
        BidirectionalNode three = new BidirectionalNode(8);
        head.next = one;
        one.next=two;
        two.next=three;
        one.prev = head;
        two.prev = one;
        three.prev = two;
        printDoubleLinkedList(head);
        insertElementAtPosition(10 ,2 , head);
        printDoubleLinkedList(head);
    }

    private static void printDoubleLinkedList(BidirectionalNode head) {
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }

    }

    private static BidirectionalNode insertElementAtPosition(int data, int position, BidirectionalNode head) {
        BidirectionalNode temp;
        BidirectionalNode newNode = new BidirectionalNode(data);
        temp = head;
        int count = 0;
        while(temp!=null) {
            count++;
            if (count == 2) {
                newNode.next = temp.next;
                temp.next = newNode;
                newNode.prev = temp;
                temp.next.prev = newNode;
            }
            temp = temp.next;
        }
        return head;
    }
}
