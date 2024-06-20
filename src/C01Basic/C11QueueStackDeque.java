package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;


public class C11QueueStackDeque {
    public static void main(String[] args) {



//    Queue<Integer> myQueue = new LinkedList<>();
//    myQueue.add(10);
//    myQueue.add(20);
//    myQueue.add(30);
//    System.out.println(myQueue.peek()); // 10. 맨위의 값을 조회만 함
//    System.out.println(myQueue.poll()); // 10. 맨위의 값을 꺼냄
//    System.out.println(myQueue);

                //== Queue가 왜 내부적으로 LinkedList인지 ==> 시간복잡도와 관련해서 대답하면 좋을 듯 ==//

                // List : 동적배열

                // 참고: 검색과 인덱스를 통한 접근은 다른 이야기이다.

                //== LinkedList는 삽입/삭제 성능이 높다. (중간 삽입과 중간 삭제) ==//

                // Queue에는 get() 메소드가 구현돼있지 않다.
                // LinkedList에는 get()이 비효율적이지만 구현돼있다. (List도 상속 받고 있기 때문에)
                // LinkedList

                // LinkedList와 ArrayList 비교
//
//                final int MAX_COUNT = 10000;
//
//                // LinkedList
//                LinkedList<Integer> linkedlist = new LinkedList<>();
//                long startTime = System.currentTimeMillis();
//                for (int i = 0; i < MAX_COUNT; ++i) {
//                    linkedlist.add(0, 10);
//                }
//                long endTime = System.currentTimeMillis();
//                System.out.println("linkedlist의 중간 삽입: " + (endTime - startTime));
//
//
//                // ArrayList
//                ArrayList<Integer> arraylist = new ArrayList<>();
//                long startTime2 = System.currentTimeMillis();
//                for (int i = 0; i < MAX_COUNT; ++i) {
//                    arraylist.add(0, 10);
//                }
//                long endTime2 = System.currentTimeMillis();
//                System.out.println("arraylist의 중간 삽입: " + (endTime2 - startTime2));
//
//
//                // 조회 테스트
//                // LinkedList
//                LinkedList<Integer> linkedlist2 = new LinkedList<>();
//                long startTime3 = System.currentTimeMillis();
//                for (int i = 0; i < MAX_COUNT; ++i) {
//                    linkedlist.get(i);
//                }
//                long endTime3 = System.currentTimeMillis();
//                System.out.println("linkedlist의 조회: " + (endTime3 - startTime3));
//
//
//                // ArrayList
//                long startTime4 = System.currentTimeMillis();
//                for (int i = 0; i < MAX_COUNT; ++i) {
//                    arraylist.get(i);
//                }
//                long endTime4 = System.currentTimeMillis();
//                System.out.println("arraylist의 조회: " + (endTime4 - startTime4));
//
//                //== 큐 사용 예제 ==//
//                // 큐: 선입 선출
//                // 스택: 후입 선출
//
//                Queue<String> myQueue = new LinkedList<>();
//                myQueue.add("문서1");
//                myQueue.add("문서2");
//                myQueue.add("문서3");
//                myQueue.add("문서4");
//                while (!myQueue.isEmpty()) {
//                    System.out.println(myQueue.poll());
//                }
//
//                // ArrayBlockingQueue: 길이 제한 큐
//                Queue<String> abq = new ArrayBlockingQueue<>(3);
//
//                // add를 사용하면 길이 제한 초과시 예외 발생
//                abq.add("10");
//                abq.add("20");
//                abq.add("30");
////    abq.add("40");
////    abq.add("50");
//                System.out.println(abq);
//
//                // offer를 쓰면 예외 발생하지 않음
//                abq.offer("10");
//                abq.offer("20");
//                System.out.println(abq);
//
//                // 우선순위 큐: 데이터를 꺼낼 때 정렬된 데이터 pop
//                Queue<Integer> pq = new PriorityQueue<>();
//                pq.add(50);
//                pq.add(30);
//                pq.add(10);
//                pq.add(20);
//                pq.add(40);
//                pq.add(50);
//
//                System.out.println(pq);
//
//                while (!pq.isEmpty()) {
//                    System.out.println(pq.poll());
//                }

                // pq는 하나를 꺼낼때마다 logn이다. 다 꺼내면 NlogN ->

                // pq를 쓰는 경우 => 안에 들어있는 데이터가 **동적으로 바뀔때** priorityQueue를 쓴다.


            //stack
//            Stack<Integer> st1 = new Stack<>();
//            st1.push(10);
//            st1.push(20);
//            st1.push(30);
//
//            // pop : stack에서 요소를 제거 후 해당 요소 반환
//        System.out.println(st1.pop());
//        System.out.println(st1.peek());
//        System.out.println(st1.size());
//        System.out.println(st1.isEmpty());

        //String객체 5개 정도 Stack 추가 후에 while문으로출력
//        Stack<String> st2 = new Stack<>();
//        st2.push("집 가고 싶");
//        st2.push("ㅎ손흥민");
//        st2.push("럭키비키");
//        st2.push("선지국");
//        st2.push("test");
//        while(!st2.isEmpty())  System.out.println(st2.pop());


        // 같은 숫자는 싫어(프로그래머스)
        // stack으로 풀기
//        int[] arr = {4,4,4,3,3};
//        int number = arr.length;
//        Stack<Integer> st = new Stack<>();
//        for(int x : arr) if(st.isEmpty() || st.peek()!=x) st.push(x);
//        while(!st.isEmpty()) System.out.println(st.pop());
        // List로 풀기
//        int[] arr ={1,1,3,3,0,1,1};
//        List<Integer> myList = new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            if(i==0 || arr[i-1] !=arr[i]) myList.add(arr[i]);
//        }



        //Deque
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addLast(10);
        d1.addLast(20);
        System.out.println(d1);
        d1.addLast(30);
        System.out.println(d1);
        System.out.println(d1.peekFirst());
        System.out.println(d1.peekLast());
        System.out.println(d1.poll());

        // 다리를 지나는 트럭 풀어보기


        }
    }

