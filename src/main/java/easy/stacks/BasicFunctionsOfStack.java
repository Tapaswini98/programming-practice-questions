package easy.stacks;
import java.util.*;
public class BasicFunctionsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(10);
        st.push(20);
        System.out.println(st);
        st.push(30);
        System.out.println(st);
        System.out.println(st.peek() + "  "+st.size());
        st.pop();
        System.out.println(st +" " +st.peek() + "  "+st.size());
        }
    }



