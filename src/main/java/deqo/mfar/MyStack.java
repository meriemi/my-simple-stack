package deqo.mfar;

import org.mockito.Mock;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack implements SimpleStack{

    private Stack<Mock> stack = new Stack();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int getSize() {
        return stack.size();
    }

    public void push(Mock mock) {
        stack.push(mock);
    }

    public Mock peek() throws EmptyStackException {
        return stack.peek();
    }

    public Mock pop() throws EmptyStackException {
        return stack.pop();
    }
}
