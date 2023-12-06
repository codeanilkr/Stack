import java.util.*;

public class Listans5 {
    
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("Enter Value 1 to 50");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<=10; i++){
            list.add(i, sc.nextInt());
        }
        System.out.println(list);

ListIterator<Integer> ll = list.listIterator();
while(ll.hasNext()){
    if(ll.next()>25){
        ll.remove();
    }
}
System.out.println(list);

sc.close();
    }
}
