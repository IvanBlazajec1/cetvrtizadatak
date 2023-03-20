import java.util.*;
import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;


public class mapeiliste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> hmap=new HashMap<String, String>();
        Set<Map.Entry<String, String>> entrySet=hmap.entrySet();
        System.out.println("Enter your favourite books and authors.Enter 'stop' to finish.");
        while(true) {
            ArrayList<Map.Entry<String, String>> listEntry=new ArrayList<Map.Entry<String, String>>(entrySet);
            System.out.println("Book title");
            String book = scanner.next();
            if("stop".equalsIgnoreCase(book)){
                for(Map.Entry<String,String> entry : listEntry){
                    System.out.println(entry.getKey()+" by "+entry.getValue());
                }
                break;
            }
            System.out.println("Author name");
            String name = scanner.next();
            hmap.put(name, book);
        }
    }
}
