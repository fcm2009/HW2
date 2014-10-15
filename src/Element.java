

public final class Element {
    Object data;
    int priority;
    Element next;

    Element(Element next, Object data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = next;
    }
}