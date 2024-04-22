public class practice2 {
    public static void main(String[] args) {
        Que queue = new Que();
        for (int i = 1; i <= 20; i++)
            queue.enqueue(i);
        while (!queue.empty())
            System.out.print(queue.dequeue() + " ");
    }
}