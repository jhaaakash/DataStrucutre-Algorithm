package yt.dur.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertAtBeginning(12);
       linkedList.insertAtBeginning(11);
      linkedList.insertAtEnd(13);
      linkedList.insertAtEnd(908);
      linkedList.insertAtPosition(10, 1);
        linkedList.printData();
    }
}
