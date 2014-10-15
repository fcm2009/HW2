/**
 * Created by fcm2009 on 3/31/14.
 */
public class PriorityQueueAsLinkedList {
    protected MyLinkedList list;

    public PriorityQueueAsLinkedList() {
        list = new MyLinkedList();
    }

    public void enqueue(Object data, int prioraty) {
        if(list.head == null)
            list.head = list.tail = new Element(null, data, prioraty);
        else if(list.head.priority > prioraty) {
            Element tmp = list.head;
            list.head = new Element(list.head, data, prioraty);
            list.tail = tmp;
        }
        else {
            Element prev, e;
            for(e = list.head, prev = null; e != null && e.priority <= prioraty; prev = e, e = e.next);
            if(e == null)
                list.tail = prev.next = new Element(null, data, prioraty);
            else {
                prev.next = new Element(e, data, prioraty);
            }
        }

    }

    public Object dequeue() {
        if(isEmpty())
            return null;
        else if(list.head == list.tail) {
            Object tmp = list.head.data;
            list.head = null;
            return tmp;
        }
        else {
            Object tmp = list.tail.data;
            Element e;
            for(e = list.head; e.next.next != null; e = e.next);
            e.next = null;
            list.tail = e;
            return tmp;
        }
    }

    private void reverse(Element head) {
        if(head == null)
            return;
        else {
            int priority = head.priority;
            Object data = dequeue();
            reverse(head.next);
            normalEnqueue(data, priority);
        }

    }

    private void normalEnqueue(Object data, int priority) {
        if(list.head == null)
            list.head = list.tail = new Element(null, data, priority);
        else
            list.tail.next = new Element(null, data, priority);
            list.tail = list.tail.next;
    }

    public void reverse() {
        if(list.head != null)
            reverse(list.head);
    }

    public boolean isEmpty() {
        return list.head == null;
    }
}