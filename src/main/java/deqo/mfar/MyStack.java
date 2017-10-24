package deqo.mfar;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack implements SimpleStack{

    private Stack<Item> stack = new Stack();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int getSize() {
        return stack.size();
    }

    public void push(Item item) {
        stack.push(item);
    }

    public Item peek() throws EmptyStackException {
        return stack.peek();
    }

    public Item pop() throws EmptyStackException {
        return stack.pop();
    }
}
