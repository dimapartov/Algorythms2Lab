import java.util.Arrays;
import java.util.Iterator;

public class Stack<T> implements Iterable<T> {

    private Object[] objectArray;
    private int size;
    private int defaultSize = 100;

    public Stack() {
        objectArray = new Object[defaultSize];
        size = 0;
    }

    public void push(T object) {
        if (size == objectArray.length) {
            int newSize = objectArray.length * 2;
            objectArray = Arrays.copyOf(objectArray, newSize);
        }
        objectArray[size] = object;
        size++;
    }

    public T pop() throws Exception {
        if (size == 0) {
            throw new Exception("Stack is empty");
        }
        T object = (T) objectArray[size-1];
        objectArray[size-1] = null;
        size--;
        return object;
    }

    public T peek() throws Exception {
        if (size == 0) {
            throw new Exception("Stack is empty");
        }
        T object = (T) objectArray[size-1];
        return object;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private int currentIndex = size - 1;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public T next() {
                return (T) objectArray[currentIndex--];
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Stack: ");
        for (int i = size - 1; i >= 0; i--) {
            result.append(objectArray[i]);
            if(i != 0){
                result.append(", ");
            }
        }
        return result.toString();
    }
}