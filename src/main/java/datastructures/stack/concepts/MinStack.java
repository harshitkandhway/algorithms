package datastructures.stack.concepts;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> tempStack = new Stack<>();

    public void push(int num){
        if(tempStack.empty()){
            tempStack.push(num);
        } else{
            int top = tempStack.peek();
            if(top>num)
                tempStack.push(num);
        }
        stack.push(num);
    }

    public int pop(){
        if(stack.empty()) {
            throw new RuntimeException("Cannot pop element from an empty stack");
        }
        int popped = stack.pop();
        if(tempStack.peek()==popped)
            tempStack.pop();
        return popped;
    }

    public int minStack(){
        if(tempStack.empty())
            throw new RuntimeException("Cannot get minimum for an empty stack");
        return tempStack.peek();
    }

}
