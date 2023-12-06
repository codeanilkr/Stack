public class Listans3 {
    private int size;
    Listans3(){
        this.size = 0;
    }
class Node{
    String data;
    Node next;
    Node(String data){
        this.data = data;
        this.next = null;
        size++;
    }
}
Node head;
// Add First Node
public void addFirst(String data){
    Node newNode = new Node(data);
    if(head == null){
head = newNode;
return;
    }
    newNode.next = head;
    head = newNode;
}

// Add Last
public void addLast(String data){
     Node newNode = new Node(data);
    if(head == null){
head = newNode;
    } 
    Node currNode = head;
    while(currNode.next !=null){
        currNode = currNode.next;
    }
    currNode.next = newNode;
}
// Print List
public void printList(){
    if(head == null){
        System.out.println("List Is Empty");
    }
    Node currNode = head;
    while(currNode != null){
        System.out.print(currNode.data + " -> ");
        currNode = currNode.next;
    }
    System.out.println("Null");
}
// Delete First
public void delFirst(){
    if(head == null){
        System.out.println("List is Empty");
    }
    head = head.next;
    size--;
}

// Del Last Node
public void delLast(){
    size--;
    if(head.next == null){
       head = null;
    }
    Node currNode = head;
    Node lastNode = head.next;
    while(lastNode.next != null ){
        currNode = currNode.next;
        lastNode = lastNode.next;
    }
    currNode.next = null;
}
public int getSize(){
    return size;
}

// Del Specific Node
public void delNode(){
    size--;
    if(head.next == null){
       head = null;
    }
    Node currNode = head;
    while(currNode.data != "Song 3" ){
        currNode = currNode.next;
    }
    currNode.next = null;
}
    public static void main(String[] args){
        Listans3 ll = new Listans3();
        ll.addFirst("Song 1");
        ll.addFirst("Song 2");
        ll.addFirst("Song 3");
        ll.addFirst("Song 4");
        ll.addFirst("Song 5");
        ll.addFirst("Song 6"); 
        ll.addLast("Song 7"); 
        ll.addLast("Song 8");      
        ll.addLast("Song 9"); 
ll.printList();
ll.delFirst();
ll.printList();
ll.delLast();
ll.printList();
System.out.println(ll.getSize());
ll.delLast();
System.out.println(ll.getSize());

ll.delNode();
ll.printList();
    }
    
}
