package datastructures;

public class Node {
    int data;
    Node ptr;

    public Node(int data) {
        this.data = data;
        this.ptr = null;
    }

    public Node(int data, Node ptr) {
        this.data = data;
        this.ptr = ptr;
    }
}
