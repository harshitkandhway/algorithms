package algorithms;

import datastructures.Node;

import java.util.ArrayList;
import java.util.List;

/*
    Given two (singly) linked lists, determine if the two lists intersect.Return the intersecting
    node. Note that the intersection is defined based on reference, not value. That is, if the kth
    node of the first linked list is the exact same node (by reference) as the jth node of the
    second linked list, then they are intersecting.
 */
public class IntersectionInSingleLinkedList {
    public static Node findsIntersection(Node head1, Node head2){
        List<Node> check = new ArrayList<>();
        while(head1!=null){
            check.add(head1);
            head1 = head1.ptr;
        }
        while(head2!=null){
            if(check.contains(head2))
                return head2;
            head2 = head2.ptr;
        }
        return null;
    }

//    public static Node findsIntersectionInOrderOfN(Node head1, Node head2){
//
//        while(head1!=null){
//            check.add(head1);
//            head1 = head1.ptr;
//        }
//        while(head2!=null){
//            if(check.contains(head2))
//                return head2;
//            head2 = head2.ptr;
//        }
//        return null;
//    }
public static void main(String[] args) {

}

}
