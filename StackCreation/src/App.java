public class App {
    public static void main(String[] args) throws Exception {

        Stack<String>st=new Stack<>();

        st.push("hello");
        st.push("my");
        st.push("name");
        st.push("is");
        st.push("Cristian");

        System.out.println(st.size());

        int stSize=st.size();

        for (int i=0; i<stSize; i++){
            // System.out.println(i);
            System.out.println(st.pop());
        }
    }
}
