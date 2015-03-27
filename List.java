import java.util.ArrayList;
 
public class ListComprehension {
 
    public static void main (String[] args) {
 
       ArrayList<Integer> list = new ArrayList<Integer>();
       //for (i in Range.between(0, 10)){
       for(int x = 0; x < 10; x++){
          int num = x + 10;
          list.add(num);
       }
 
       System.out.println(list.toString());
    }
 
}