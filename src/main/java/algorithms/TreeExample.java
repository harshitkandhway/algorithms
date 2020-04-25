package algorithms;

import datastructures.BidirectionalNode;

public class TreeExample {
    public static void main(String[] args) {
        BidirectionalNode l1 = new BidirectionalNode(2);
        BidirectionalNode l3 = new BidirectionalNode(4);
        BidirectionalNode l4 = new BidirectionalNode(5);
        BidirectionalNode l2 = new BidirectionalNode(l3, 3, l4);
        BidirectionalNode head = new BidirectionalNode(l1, 1, l2);
        inOrder(head);
        mirror(head);
        System.out.print("| ");
        inOrder(head);
    }

    public static BidirectionalNode mirror(BidirectionalNode node) {
        if (node == null)
            return node;

        /* do the subtrees */
        BidirectionalNode left = mirror(node.prev);
        BidirectionalNode right = mirror(node.next);

        /* swap the left and right pointers */
        node.prev = right;
        node.next = left;
        return node;
    }

    public static void inOrder(BidirectionalNode node) {
        if (node == null)
            return;
        inOrder(node.prev);
        System.out.print(node.data + " ");
        inOrder(node.next);
    }
}
