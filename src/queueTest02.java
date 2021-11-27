import java.util.*;

public class queueTest02 {
    public static void main(String[] args) {

        System.out.println("Heelo");
        qTest01();
    }

    public static void qTest01(){
        Deque<String> qq1 = new LinkedList<>();
        qq1.add("AABBCC");

        qq1.add("CCDDBB");
        System.out.println(qq1.peek());
        System.out.println(qq1);
        System.out.println(qq1.poll());
        System.out.println(qq1);
    }
}
