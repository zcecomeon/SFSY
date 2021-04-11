import java.rmi.StubNotFoundException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class practice1_2 {

    public static void main(String args[]){
//        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(11, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
        Queue<Integer> queue1=new PriorityQueue<Integer>();
        queue1.add(2);
        queue1.add(1);
        queue1.add(3);

        while (!queue1.isEmpty()){
            Integer i=queue1.poll();
            System.out.println(i);
        }

        Comparator<Student> comparator=new Comparator<Student>() {//实现大顶堆
            @Override
            public int compare(Student o1, Student o2) {
                return (o2.id-o1.id);
            }
        };

        Queue<Student> queue2 = new PriorityQueue<Student>(comparator);
        queue2.add(new Student(2,"B"));
        queue2.add(new Student(1,"A"));
        queue2.add(new Student(3,"C"));

        while(!queue2.isEmpty()){
            Student s=queue2.poll();
            System.out.println(s.toString());
        }
    }

    public static class Student{
        private int id;
        private String name;

        public Student(int id, String name){
            this.id=id;
            this.name=name;
        }

        public String toString(){
            return id + "-"+ name;
        }
    }
}
