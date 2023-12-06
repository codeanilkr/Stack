import java.util.LinkedList;

public class Listans2 {
    
    public static void main(String[] args){
LinkedList<String> LL = new LinkedList<String>();
LL.addFirst("Song A");
LL.addFirst("Song b");
LL.addFirst("Song c");
LL.addFirst("Song d");
LL.addFirst("Song e");
LL.addFirst("Song f");
LL.addFirst("Song g");
LL.addLast("Song j");
LL.addLast("Song h");
LL.addLast("Song i");
LL.removeFirst();
LL.removeLast();
for( int i=0; i<=LL.size(); i++){
System.out.println(LL.get(i));
}
System.out.println(LL.size());

    }
}
