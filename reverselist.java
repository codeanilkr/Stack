public class reverselist {
    private int size;
    reverselist(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }}
// Add Node
public int getSize(){
    return size;
}
Node head;
public void addFirst(String data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
}

// Print List Of Node
public void printList(){
    Node currNode = head;
    while(currNode != null){
        System.out.print(currNode.data + " ->");
        currNode = currNode.next;
    }
    System.out.println("null");
}

//    ReverseList
public void reverseListIterative(){
Node prevNode = head;
Node currNode = head.next;
while(currNode != null){
    Node nextNode = currNode.next;
    currNode.next = prevNode;
    // Updating
    prevNode = currNode;
    currNode = nextNode;
}
head.next = null;
head = prevNode;
}


    public static void main(String[] args){
        reverselist list = new reverselist();
        list.addFirst("Song A");
        list.addFirst("Song B");
        list.addFirst("Song C");
        list.addFirst("Song D");
        list.addFirst("Song E");
        list.addFirst("Song F"); 
        list.printList();  
        list.reverseListIterative();
         list.printList();  
        System.out.println("Size Of Node " + list.getSize());
    }
    
}
