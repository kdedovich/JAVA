import java.util.Arrays;
public class Stack {
    private int[] stack;
    private int top;
    private int size;


    public Stack() {
        this.size = 10;
        this.stack = new int[size];
        this.top = -1;
    }
    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public void push(int x) {
        if (top == size - 1) {
            stack = Arrays.copyOf(stack, size * 2);
            size *= 2;
        }
        top++;
        stack[top] = x;
    }

    public int pop() {
        if (top == -1) {
            return -1;
        }
        else {
            int x = stack[top];
            top--;
            return x;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            return stack[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public int capacity() {
        return size;
    }

}
