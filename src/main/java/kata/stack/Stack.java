package kata.stack;

import java.util.LinkedList;

public class Stack {

    private final LinkedList<String> elements;
    private int limit;

    public Stack(int limit) {
        if (limit < 0) throw new IllegalCapacityException("You cannot set negative size");
        this.limit = limit;
        this.elements = new LinkedList<>();
    }

    public int getSize () {
        return elements.size();
    }

    public void push(String element) {
        if (elements.size() >= 5) {
            throw new StackOverflowException("You have passed the limit which is " + limit);
        }
        elements.add(element);
    }

    public void pop() {
        if (elements.size() == 0) {
            throw new StackUnderflowException("There is no element to pop");
        }
        elements.removeLast();
    }

    public boolean contains(String element) {
        return elements.contains(element);
    }
}
