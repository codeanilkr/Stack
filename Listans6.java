public class Listans6 {
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // Add Node
    Node head;
public void addfirst(String data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
}
// print Node
public void printList(){
    if(head == null){System.out.print("List is Empty");}
Node currNode = head;
while(currNode != null){
    System.out.print(currNode.data + " -> ");
     currNode = currNode.next;
}
System.out.println(" null");

}

// Reverse List Iterative Method
public void reverselist(){
Node prevNode = head;
Node currNode = head.next;
while(currNode != null){
    Node nextNode = currNode.next;
    currNode.next = prevNode;
    // Update
    prevNode = currNode;
    currNode = nextNode;

}
head.next = null;
head = prevNode;
}
public Node recursiveLL(Node head){
    if(head == null || head.next == null){
        return head;
    }
   Node newHead = recursiveLL(head.next);
   head.next.next = head;
   head.next = null;
   return newHead;
}


    public static void main(String[] args){
        Listans6 list = new Listans6();
        list.addfirst("Song A");
        list.addfirst("Song B");
        list.addfirst("Song C");
        list.addfirst("Song D");
        list.printList();
        // list.reverselist();
list.head = list.recursiveLL(list.head);
         list.printList();

    }
    
}
