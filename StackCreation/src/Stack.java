import java.util.List;
import java.util.ArrayList;


public class Stack {
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

   List<Integer>arrList=new ArrayList<>();

   public Stack(){
    arrList=new ArrayList<>();

   }

   public void push(int item){
    arrList.add(item);
   }

   public int peek(){
    return arrList.get(arrList.size()-1);
   }

   public int pop(){
    
     int toBePopped=arrList.get(arrList.size()-1);
    
     arrList.remove(arrList.size()-1);

     return toBePopped;
   }

   public int size(){
    return arrList.size();
   }


}
