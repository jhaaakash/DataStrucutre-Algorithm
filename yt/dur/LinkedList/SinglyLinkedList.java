package yt.dur.LinkedList;

public class SinglyLinkedList {
        Node head=null;
        // insert at begininng
        public void insertAtBegining(int item)
        {
                Node newNode= new Node(item);
            if(head==null)
            {
                head=newNode;
                return;
            }
            newNode.next=head.next;
            head=newNode;
        }

        //insertat last
        
 
        
    }

