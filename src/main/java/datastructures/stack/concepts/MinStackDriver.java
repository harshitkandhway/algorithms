package datastructures.stack.concepts;

public class MinStackDriver {
    public static void main(String[] args) {
        MinStack stack = new MinStack();

        System.out.println("Element pushed : 12");
        stack.push(12);
        System.out.println("Min Stack :"+stack.minStack());
        System.out.println("Element pushed : 15");
        stack.push(15);
        System.out.println("Min Stack :"+stack.minStack());
        System.out.println("Element pushed : 11");
        stack.push(11);
        System.out.println("Min Stack :"+stack.minStack());
        System.out.println("Popped element : "+stack.pop());
        System.out.println("Min Stack :"+stack.minStack());
        System.out.println("Element pushed : 21");
        stack.push(21);
        System.out.println("Min Stack :"+stack.minStack());
        System.out.println("Popped element : "+stack.pop());
        System.out.println("Min Stack :"+stack.minStack());
        System.out.println("Popped element : "+stack.pop());
        System.out.println("Min Stack :"+stack.minStack());
        System.out.println("Popped element : "+stack.pop());
       // System.out.println("Min Stack :"+stack.minStack());
       // System.out.println("Popped element : "+stack.pop());
        //System.out.println("Min Stack :"+stack.minStack());

    }
}
