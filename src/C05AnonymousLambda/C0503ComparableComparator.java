package C05AnonymousLambda;

import java.util.*;

public class C0503ComparableComparator {
    public static void main(String[] args) {
        // 자바에서는 비교를 위한 인터페이스 2개 제공 : Comparable, Comparator
        // Comparable 인터페이스에는 compareTo 메서드
        // Comparator 인터페이스에는 compare메서드 선언

        // String 클래스에 compareTo 내장(Comparable 구현)
        // String 클래스 외에 java 많은 내장 클래스에서 Comparable 구현
//        String a="hello";
//        String b="world";
//        // 두 문자열의 각 자리를 순차적으로 비교
//        // 문자열의 비교는 유니코드값의 차이를 변경
//        System.out.println(a.compareTo(b));
//
//        Integer a1=10;
//        Integer a2=20;
//        System.out.println(a1.compareTo(a2));
//
//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("javascript");
//        Collections.sort(myList); // Comparable의 compareTo메서드를 구현하여 정렬
//
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.naturalOrder());
//        Collections.sort(myList, Comparator.reverseOrder());
//
//        // student객체 5개 정도 담아
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("개똥3",30));
//        students.add(new Student("개똥5",50));
//        students.add(new Student("개똥4",40));
//        students.add(new Student("개똥1",10));
//        students.add(new Student("개똥2",20));
//
//        // Collections.sort 같은 정렬을 하기 위해서
//        // 방법1. Student 객체에서 Comparable 구현 -> compareTo메서드를 오버라이딩
////        Collections.sort(students);
////        for(Student s : students){
////            System.out.println("이름 : "+s.getName()+" 나이 : "+s.getAge());
////        }
//        for(Student s : students){
//            System.out.println(s);
//        }
//
//        // 방법2. Comparator를 구현한 익명 객체를 sort에 주입
//        Comparator<Student> myComparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
////            public int compare(Student o1, Student o2){
////                return o1.getName().compareTo(o2.getName());
////            }
//        };
//        Comparator<Student> myComparator2 = (x,y)->x.getAge()-y.getAge();
//        students.sort(myComparator);
//
//        for(Student s : students){
//            System.out.println("이름 : "+s.getName()+" 나이 : "+s.getAge());
//        }
//        //아래 문자열을 글자길이 순서로 내림차순 정렬하여라
//        String[] stArr = {"hello","java","C++","world2"};
//        Arrays.sort(stArr, (p,q)->q.length()-p.length());
//        for(String s : stArr) System.out.println(s);
//        Arrays.sort(stArr, Comparator.reverseOrder());
//
//        //[4,5], [1,2], [5,0], [3,1]
//        // 위 배열이 들어간 아래 리스트를 배열에 0번째가 아닌 1번째를 기준으로 내림차순
//        List<int[]> myList2=new ArrayList<>();
//        myList2.add(new int[]{4,5});
//        myList2.add(new int[]{1,2});
//        myList2.add(new int[]{5,0});
//        myList2.add(new int[]{3,1});
//        myList2.sort((n,m)->m[1]-n[1]);
//        for(int[] r:myList2) System.out.println(Arrays.toString(r));
//    }
//}
        class Student {
            //    class Student implements Comparable<C05AnonymousLambda.Student>{
            String name;
            int age;

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

    public Student(String name, int age){
     this.name = name;
     this.age = age;
    }
//
////모든 클래스의 조상 클래스와 Object 클래스의 toString 메서드를 Overriding하여
//// 객체 호출 시에 자동으로 toString 메서드호출
//@Override
//public String toString(){
//        return "이름 : "+this.name+" 나이 : "+this.age;
//}


//    @Override
//    public int compareTo(Student s) {
////        return this.name.compareTo(s.getName());
//        return s.name.compareTo(this.getName());
//
////        return  s.getAge()-this.age;
//    }


            //        아래 문자열을 글자 길이 순서로 내림차순 정렬하여라
//        String[] strArr = {"hello", "java", "c++", "world2"};
//        Arrays.sort(strArr, (s1, s2) -> s2.length() - s1.length());
//        System.out.println(Arrays.toString(strArr));
//
//        List<int[]> list = new ArrayList<>();
//        list.add(new int[]{2, 5});
//        list.add(new int[]{4, 5});
//        list.add(new int[]{1, 2});
//        list.add(new int[]{5, 0});
//        list.add(new int[]{3, 1});
////        1번째 내림차순 1번째 같으면 0번째 내림차순
//        list.sort(((o1, o2) -> {
//            if (o2[1] == o1[1]) {
//                return o2[0] - o1[0];
//            }
//            return o2[1] - o1[1];
//        }));
//        for (int[] arr : list) {
//            System.out.println(Arrays.toString(arr));
//        }
//
//        //        문자열 길이 pq
//        String[] stArr = {"hello", "java", "C++", "world2"};
//        Queue<String> pq = new PriorityQueue<>((o1, o2) -> o2.length() - o1.length());
//        for (String s : stArr) {
//            pq.add(s);
//        }
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }
//        // 쓰레드 구현 방법 : 쓰레드 상속, Runnable 주입
//        // Runnable 인터페이스 : 쓰레드 구현
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("새로 생성한 쓰레드1입니다.");
//            }
//        });
//        t1.start();
//        Thread t2 = new Thread(()-> System.out.println("새로 생성한 쓰레드2입니다."));
//        t2.start();
//        new Thread(()-> System.out.println("새로 생성한 쓰레드3입니다.")).start();
//        System.out.println("메인 쓰레드입니다");
        }
    }
}