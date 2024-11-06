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

        public void insertAtEnd(int item)
        {
            Node newNode= new Node(item);
            if(head==null)
            {
                head= newNode;
                return;
            }
            // importat to keep our head intact and track the tail
            Node temp = head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next =newNode;
        }
        
        // insert at specific position
        public void insertAtPosition(int item, int position)
        {
                Node newNode = new Node(item);
            if(position<0)
            {
                System.out.println("Invalid Position");
            }

            if(position==0)
            {
                newNode.next=head;
                head= newNode;       
            }

            Node temp=head;
            int index=0;
            while (temp.next!=null) {

                temp=temp.next;
                index++;
                if(index==position-1)
                {
                    break;
                }

                if(temp==null)
                {
                    System.out.println("Position out of bounce");
                }

                //insert

                
            }

        }

        
    }

