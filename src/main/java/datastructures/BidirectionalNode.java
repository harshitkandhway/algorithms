package datastructures;

public class BidirectionalNode {
    public int data;
    public BidirectionalNode next;
    public BidirectionalNode prev;

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
