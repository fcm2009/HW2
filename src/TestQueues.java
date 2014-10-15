/**
 * Created by Mohammed ALshehry on 3/31/14.
 */
public class TestQueues {

    public static void main(String[] args) {
        PriorityQueueAsLinkedList q = new PriorityQueueAsLinkedList();
        q.enqueue("a", 2);
        q.enqueue("c", 1);
        q.enqueue("b", 1);
        q.enqueue("e", 4);
        print(q);
        q.reverse();
        print(q);
    }


    public static void print(PriorityQueueAsLinkedList q) {
        if(q.isEmpty())
            System.out.println("[ ]");
        else {
            String tmp = "[ ";
            for(Element e = q.list.head; e != null; e = e.next)
                tmp += e.data + " ";
            System.out.println(tmp  + "]");
        }
    }
}
