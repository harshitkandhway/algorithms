package datastructures;

public class BidirectionalNode {
    int data;
    BidirectionalNode next;
    BidirectionalNode prev;

    public BidirectionalNode(BidirectionalNode prev,int data, BidirectionalNode next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public BidirectionalNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
