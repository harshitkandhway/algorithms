package datastructures;

public class SinglyLinkedList {

    public static void check(Node head) {
        Node tmp = head;
        System.out.println("when head!=null is checked");
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.ptr;
        }
        System.out.println("when head.ptr!=null is checked");
        tmp = head;
        while (tmp.ptr != null) {
            System.out.println(tmp.data);
            tmp = tmp.ptr;
        }
    }

//    private static Node rotateLinkedList(Node head){
//        // 1->6->8->3->7
//        // 7,6,8,3,1
//
//        // 7->3->8->6->1
//        Node temp=head;
//
//
//
//    }

    public static void main(String[] args) {
        Node three = new Node(4, null);
        Node two = new Node(15, three);
        Node one = new Node(2, two);
        Node head = new Node(1, one);
        //check(head);

        Node headUpdated = insertAtLast(head,77);//addAtMid(10, head,2);

        printLinkedList(headUpdated);

//        printLinkedList(head);
//        Node updateHead = deleteInBetween(head , 4);
//        printLinkedList(updateHead);
    }

    //delete the node with value 15 if exist or else return -1
    private static Node deleteInBetween(Node head, int i) {
        Node temp;
        temp = head;
        while (temp.ptr != null) {
            if (temp.ptr.data == i) {
                if (temp.ptr.ptr != null)
                    temp.ptr = temp.ptr.ptr;
                else {
                    temp.ptr = null;
                    break;
                }
            }
            temp = temp.ptr;
        }
        return head;
    }

    private static void printLinkedList(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.ptr;
        }
    }

    private static Node add(int data, Node head) {
        return new Node(data, head);
    }

    //data =7
    private static Node addAtLast(int data, Node head) {
        Node temp = head;
        while (temp.ptr!= null) {
            temp = temp.ptr;
        }
        temp.ptr = new Node(data, null);
        return head;
    }


    private static Node addAtMid(int data, Node head, int position) {
        Node temp = head;
        Node newNode = new Node(data, null);
        int count = 1;
        while (temp != null && count < position - 1) {
            temp = temp.ptr;
            count++;
        }
        newNode.ptr = temp.ptr;
        temp.ptr = newNode;
        return head;
    }


    public static Node insertAtLast(Node head, int value){
        Node newNode = new Node(value);
        Node temp = head;
        while(temp.ptr!=null){
            temp =temp.ptr;
        }
        temp.ptr = newNode;
        return head;
    }


}
