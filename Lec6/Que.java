public class Que {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 8;

    public Que() {
        this(DEFAULT_CAPACITY);
    }

    public Que(int capacity) {
        elements = new int[capacity];
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            // Double the array size
            int[] newElements = new int[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        int firstElement = elements[0];
        // Shift elements to the left
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return firstElement;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
