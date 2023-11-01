import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DoubleLinkedList<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

    public DoubleLinkedList() {
        this.firstNode = null;
        this.lastNode = null;
        this.size = 0;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            newNode.setNext(firstNode);
            firstNode.setPrevious(newNode);
            firstNode = newNode;
        }
        size++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.setNext(newNode);
            newNode.setPrevious(lastNode);
            lastNode = newNode;
        }
        size++;
    }

    public void deleteFirst() {
        firstNode = firstNode.getNext();
        firstNode.setPrevious(null);
        size--;
    }

    public void deleteLast() {
        lastNode = lastNode.getPrevious();
        lastNode.setNext(null);
        size--;
    }

    public void getAll() {
        if (firstNode == null) {
            System.out.println("List is empty.");
            return;
        }
        Node<T> currentNode = firstNode;
        System.out.println("Double linked list: ");
        while (currentNode != null) {
            System.out.println(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    public void deleteAll() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public void deleteMinionByName(String name) {
        Node<T> currentNode = firstNode;
        while (currentNode != null) {
            if (currentNode.getData() instanceof Minion) {
                Minion minion = (Minion) currentNode.getData();
                if (minion.getName().equals(name)) {
                    if (currentNode == firstNode && currentNode == lastNode) {
                        firstNode = null;
                        lastNode = null;
                    } else if (currentNode == firstNode) {
                        firstNode = currentNode.getNext();
                        firstNode.setPrevious(null);
                    } else if (currentNode == lastNode) {
                        lastNode = currentNode.getPrevious();
                        lastNode.setNext(null);
                    } else {
                        currentNode.getPrevious().setNext(currentNode.getNext());
                        currentNode.getNext().setPrevious(currentNode.getPrevious());
                    }
                    break;
                }
            }
            currentNode = currentNode.getNext();
        }
        size--;
    }

    public void changeMinionAgeByName(String name, int age) {
        Node<T> currentNode = firstNode;
        while (currentNode != null) {
            if (currentNode.getData() instanceof Minion) {
                Minion minion = (Minion) currentNode.getData();
                if (minion.getName().equals(name)) {
                    minion.setAge(age);
                    break;
                }
            }
            currentNode = currentNode.getNext();
        }
    }

//  Iterator
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private Node<T> currentNode = firstNode;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                T data = currentNode.getData();
                currentNode = currentNode.getNext();
                return data;
            }
        };
    }

//  Indexer
    public T indexer(int index) {
        Node<T> currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

//  Comparator
    public void sortByComparison(Comparator<T> comparator) {

        if (firstNode == null || firstNode.getNext() == null) {
            return;
        }

        T[] elements = (T[]) new Object[size];
        Node<T> currentNodeForConvertion = firstNode;
        int position = 0;
        while (currentNodeForConvertion != null) {
            elements[position] = currentNodeForConvertion.getData();
            currentNodeForConvertion = currentNodeForConvertion.getNext();
            position++;
        }

        Arrays.sort(elements, comparator);

        firstNode = new Node<>(elements[0]);
        Node<T> currentNodeForDll = firstNode;
        for (int i = 1; i < elements.length; i++) {
            Node<T> newNode = new Node<>(elements[i]);
            currentNodeForDll.setNext(newNode);
            newNode.setPrevious(currentNodeForDll);
            currentNodeForDll = newNode;
        }
        lastNode = currentNodeForDll;
    }
}