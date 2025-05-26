import java.util.List;
import java.util.ArrayList;

public class Stack <T> {
  /*
   methods needed: push, pop, peek(), size();
   Use arraylist as a member variable
   - Push: use .add(item);
   - peek(): use .get(arr.size()-1),
   - pop: use .get(arr.size()-1), and .remove(arr.size()-1);
   - size: use .size();

   - Time complexity?
  
   Other improvements/follow-ups:
   - Try using generics too
   */

   List<T>arrList=new ArrayList<>();

   public Stack(){
    arrList=new ArrayList<>();

   }

   public void push(T item){
    arrList.add(item);
   }

   public T peek(){
    return arrList.get(arrList.size()-1);
   }

   public T pop(){
    
     T toBePopped=arrList.get(arrList.size()-1);
    
     arrList.remove(arrList.size()-1);

     return toBePopped;
   }

   public int size(){
    return arrList.size();
   }


}
