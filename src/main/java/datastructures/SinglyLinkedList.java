package datastructures;

public class SinglyLinkedList {

    public static void main(String[] args) {
        Node three = new Node(4);
        Node two = new Node(15,three);
        Node one = new Node(2,two);
        Node head = new Node(1,one);
        printLinkedList(head);
        Node updateHead = deleteInBetween(head , 4);
        printLinkedList(updateHead);
    }

    //delete the node with value 15 if exist or else return -1
    private static Node deleteInBetween(Node head, int i) {
        Node temp;
        temp = head;
        while(temp.ptr!=null ){
            if(temp.ptr.data == i ) {
                if (temp.ptr.ptr != null)
                    temp.ptr = temp.ptr.ptr;
                else {
                    temp.ptr = null;
                    break;
                }
            }
            temp=temp.ptr;
        }
        return head;
    }

    private static void printLinkedList(Node head) {
        while(head!=null){
            System.out.println(head.data);
            head = head.ptr;
        }
    }



}
