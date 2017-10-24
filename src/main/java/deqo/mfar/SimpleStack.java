package deqo.mfar;

import org.mockito.Mock;

import java.util.EmptyStackException;

public interface SimpleStack {


        /**
         * Tests if this stack is empty
         */
        public boolean isEmpty();
        /**
         * Returns the number of items in this stack.
         */
        public int getSize();
        /**
         * Pushes an item onto the top of this stack.
         * null item is allowed.
         */
        public void push(Mock mock);
        /**
         * Looks at the object at the top of this stack without removing it from the stack.
         */
        public Mock peek() throws EmptyStackException;
        /**
         * Removes the object at the top of this stack and returns that object as the value of this function.
         * @throws EmptyStackException if this stack is empty.
         */
        public Mock pop() throws EmptyStackException;


    }

