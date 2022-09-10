package CustomLinkedList;


public class CustomLinkedList<T> implements LinkedListFunctionality<T> {
    private Node<T> head;

    public Node<T> getHead() {
        return head;
    }

    public CustomLinkedList () {
        this.head = null;
    }
    class Node <T> {
        private T data;
        private Node<T> next;

        public Node (T data) {
            this.data = data;
            this.next = null;
        }
    }
    public void add (T data) {
        Node<T> nextNode = new Node<T> (data);
        Node<T> currentNode = head;

        if (head == null) {
            head = nextNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = nextNode;
        }
    }

    public void addGroup(T... arr) {
        for (T t : arr) {
            this.add(t);
        }
    }

    public T getElementValueByIndex (int index) {
        int i = 0;
        T res = null;
        Node<T> currentNode = head;
        Node<T> previousNode = null;

        while (currentNode.next != null) {
            if (i == index) {
                res = currentNode.data;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
            i++;
        }
        if (index > i) {
            System.out.println("Index out of range!!!");
            return null;
        }
        return res;
    }

    public boolean CheckElementPresenceByValue (T data) {
        Node<T> currentNode = head;
        Node<T> previousNode = null;

        while (currentNode.next != null) {
            if (currentNode.data == data) {
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        return false;
    }

    public void replaceByValue (T data1, T data2) {
        Node<T> currentNode = head;
        Node<T> previousNode = null;

        while (currentNode.next != null) {
            if (currentNode.data == data1) {
                currentNode.data = data2;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }
    public void replaceByIndex (T data, int index) {
        int i = 0;
        Node<T> currentNode = head;
        Node<T> previousNode = null;

        while (currentNode.next != null) {
            if (i == index) {
                currentNode.data = data;
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
            i++;
        }
    }

    public void removeByValue (T data) {
        Node<T> currentNode = head;
        Node<T> previousNode = null;

        while (currentNode.next != null) {
            if (currentNode.data == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                }
                else
                {
                    previousNode.next = currentNode.next;
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

    }

    public void removeByIndex (int index) {
        int i = 0;
        Node<T> currentNode = head;
        Node<T> previousNode = null;

        while (currentNode.next != null) {
            if (i == index) {
                if (currentNode == head) {
                    head = currentNode.next;
                }
                else
                {
                    previousNode.next = currentNode.next;
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
            i++;
        }
        if (index > i) {
            System.out.println("Index out of range!!!");
        }
    }

    public void print () {
        Node<T> current = head;

        if (head != null) {
            System.out.println(head.data);
        }
        while (current.next != null) {
            current = current.next;
            System.out.println(current.data);

        }
    }
}
