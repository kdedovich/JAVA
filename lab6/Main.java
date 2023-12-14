

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        System.out.println("size = " + stack.size());
        System.out.println("push: " + 1);
        stack.push(1);
        System.out.println("push: " + 2);
        stack.push(2);
        System.out.println("push: " + 3);
        stack.push(3);
        System.out.println("push: " + 4);
        stack.push(4);
        System.out.println("size = " + stack.size());
        System.out.println("capacity = " + stack.capacity());
        System.out.println("push: " + 5);
        stack.push(5);
        System.out.println("size = " + stack.size());
        System.out.println("capacity = " + stack.capacity());
        System.out.println("peek :" + stack.peek());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("push: " + 6);
        stack.push(6);
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("pop: " + stack.pop());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("pop: " + stack.pop());
        System.out.println("isEmpty: " + stack.isEmpty());



    }
}