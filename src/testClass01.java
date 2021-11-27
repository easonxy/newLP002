import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class testClass01 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        pq02();
        pq03();
        pq04();
        pq05();
        pq06();
        pq07();
        pq11();
    }
    public static void pq02() {
        Queue<String> q = new PriorityQueue<>();
        // 添加3个元素到队列:
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        System.out.println(q.poll()); // apple
        System.out.println(q.poll()); // banana
        System.out.println(q.poll()); // pear
        System.out.println(q.poll()); // null,因为队列为空
    }
        public static void pq03(){
            Queue<String> q = new PriorityQueue<>();
            // 添加3个元素到队列:
            q.offer("1");
            q.offer("2");
            q.offer("3");
            System.out.println(q.poll()); // apple
            System.out.println(q.poll()); // banana
            System.out.println(q.poll()); // pear
            System.out.println(q.poll()); // null,因为队列为空
        }
    public static void pq04(){
        Queue<Integer> q = new PriorityQueue<>();
        // 添加3个元素到队列:
        q.offer(4);
        q.offer(5);
        q.offer(6);
        System.out.println(q.poll()); // apple
        System.out.println(q.poll()); // banana
        System.out.println(q.poll()); // pear
        System.out.println(q.poll()); // null,因为队列为空
    }
    public static void pq05(){
        Queue<Integer> q = new PriorityQueue<>();
        // 添加3个元素到队列:
        q.offer(10);
        q.offer(25);
        q.offer(3);
        q.offer(14);
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
    public static void pq06(){
        Queue<String> q = new PriorityQueue<>();
        // 添加3个元素到队列:
        q.offer("10");
        q.offer("25");
        q.offer("3");
        q.offer("14");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
    public static void pq07(){
        Queue<String> q = new PriorityQueue<>();
        // 添加3个元素到队列:
        q.offer("xaa");
        q.offer("abc");
        q.offer("acb");
        q.offer("dcb");
        q.offer("aaa");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
    public static void pq11(){
        Queue<student> q = new PriorityQueue<>(new myComparator());
        // 添加3个元素到队列:
        q.offer(new student("Tom", "USA", 12));
        q.offer(new student("April", "Ukrine",23));
        q.offer(new student("Hanmeiemei", "CHINA", 55));
        //打印
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
}
    static class myComparator implements Comparator<student> {

        @Override
        public int compare(student o1, student o2) {
            return o1.getName().compareTo(o2.getName());
//            if (o1.getName().compareTo(o2.getName()) ){
//                return -1;
//            } else {
//                return 1;
//            }
        }
    }


}
