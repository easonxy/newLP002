import java.util.*;

public class comparatorTest implements Comparator<stuEntity> {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //list 测试
        List<stuEntity> list = new ArrayList<>();
        stuEntity stud1=new stuEntity();
        stud1.setAge(10);
        stud1.setName("abc");
        stuEntity stud2=new stuEntity();
        stud2.setAge(10);
        stud2.setName("bdc");
        stuEntity stud3=new stuEntity();
        stud3.setAge(5);
        stud3.setName("bdd");
        stuEntity stud4=new stuEntity();
        stud4.setAge(30);
        stud4.setName("aad");
        list.add(stud1);
        list.add(stud2);
        list.add(stud3);
        list.add(stud4);

        Collections.sort(list, new comparatorTest());
        for(stuEntity stud:list){
            System.out.println(stud.getAge()+":"+stud.getName());
        }

        /**
         *
         */
        //pq测试
        Queue<stuEntity> q1 = new PriorityQueue<>(new comparatorTest());
        stuEntity stud11=new stuEntity();
        stud1.setAge(10);
        stud1.setName("abc");
        stuEntity stud12=new stuEntity();
        stud2.setAge(10);
        stud2.setName("bdc");
        stuEntity stud13=new stuEntity();
        stud3.setAge(5);
        stud3.setName("bdd");
        stuEntity stud14=new stuEntity();
        stud4.setAge(30);
        stud4.setName("aad");
        q1.offer(stud11);
        q1.offer(stud12);
        q1.offer(stud13);
        q1.offer(stud14);
    }






    /**
     *
     */
    @Override
    public int compare(stuEntity stud1, stuEntity stud2) {
//根据姓名排序
        int maxname=stud1.getName().compareTo(stud2.getName());
        if(maxname!=0)
            return maxname;
//根据年龄排序
        int maxage=stud1.getAge()-stud2.getAge();
//if(maxage!=0)
        return maxage;
    }

}
