

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Stack st=new Stack();
        
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st.pop()); 

        System.out.println(st.size()); 

        System.out.println(st.pop()); 

        System.out.println(st.peek()); 

        System.out.println(st.size()); 


    }
}
