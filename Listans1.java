public class Listans1 {
    private int size;
    Listans1(){
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
// Add first
public void addFirst(String data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
}
// AddLast Node
public void addLast(String data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    Node currNode = head;
    while(currNode.next != null){
        currNode = currNode.next;
    }
    currNode.next = newNode;
}
// Print Node List
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
        System.out.println("List is Empety");
    }
    head = head.next;
    size--;
}

// Delete Last
public void DelLast(){
    size--;
     if(head.next == null){
        head = null;
    }
Node curNode = head;
Node LastNode = head.next;
while(LastNode.next != null){
    curNode = curNode.next;
    LastNode = LastNode.next;
}
curNode.next = null;



}

public int getSize(){
    return size;
}

    public static void main(String[] args){
       Listans1 list = new Listans1();
       list.addFirst("Song A");
        list.addFirst("Song B");
         list.addFirst("Song C");
          list.addFirst("Song D");
          System.out.println(list.getSize());
          list.printList();
          list.addLast("Song E");
          System.out.println(list.getSize());
           list.printList();
           list.delFirst();
           System.out.println(list.getSize());
               list.printList();
               System.out.println(list.getSize());
               list.DelLast();
                list.printList();
                System.out.println(list.getSize());

    }
    
}
