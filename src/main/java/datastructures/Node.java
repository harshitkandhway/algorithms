package datastructures;

public class Node {
    public int data;
    public Node ptr;

    public Node(int data) {
        this.data = data;
        this.ptr = null;
    }

    public Node(int data, Node ptr) {
        this.data = data;
        this.ptr = ptr;
    }
}
