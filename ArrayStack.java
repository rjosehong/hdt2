import java.util.*;

public class ArrayStack<T> implements Stack<T> {

    private ArrayList<T> data = new ArrayList<>();

    @Override
    public void push(T element) {
        data.add(element);
    }

    @Override
    public T pop() {
        if (data.isEmpty()) {
            throw new RuntimeException("Empty stack");
        }
        return data.remove(data.size() - 1);
    }

    @Override
    public T peek() {
        if (data.isEmpty()) {
            throw new RuntimeException("Empty stack");
        }
        return data.get(data.size() - 1);
    }

    @Override
    public int size() {
        return data.size();
    }
}