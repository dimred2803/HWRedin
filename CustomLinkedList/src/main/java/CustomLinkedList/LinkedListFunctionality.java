package CustomLinkedList;

public interface LinkedListFunctionality<T> {
    public void add (T data);
    public void addGroup (T... arr);
    public T getElementValueByIndex (int index);
    public boolean CheckElementPresenceByValue (T data);
    public void replaceByValue (T data1, T data2);
    public void replaceByIndex (T data, int index);
    public void removeByValue (T data);
    public void removeByIndex (int index);
    public void print ();
}
