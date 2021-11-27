import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class pq09 {
    public static void main(String[] args) {

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
}
class myComparator implements Comparator<student> {

        @Override
        public int compare(student o1, student o2) {
            if ((o1.getName().compareTo(o2.getName())) < 0){
                return -1;
            } else {
                return 1;
            }
        }

}
