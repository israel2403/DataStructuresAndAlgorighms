package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList mLinkedList = new LinkedList(1);
        mLinkedList.append(2);
        mLinkedList.append(3);
        mLinkedList.append(4);
        
        mLinkedList.reverse();

        mLinkedList.printLists();
    }
}
