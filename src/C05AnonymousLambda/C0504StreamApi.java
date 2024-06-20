package C05AnonymousLambda;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0504StreamApi {
    public static void main(String[] args) {
//        int[] arr={20,10,4,12};
//        //전통적인 방식의 데이터 접근 방식
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        //함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
        //java에서 함수형 프로그래밍을 지원하기 위한 라이브러리가 streamAPI
        //foreach : 스트림의 각 요소를 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a-> System.out.println(a));
//
//        //스트림의 생성
//        String[] stArr={"HTML", "CSS", "JAVA", "PYTHON"};
//        // stream<클래스> : 제네릭타입으로 stream객체가 생성
//        Stream<String> stream1=Arrays.stream(stArr);
//
//        List<String> stList = new ArrayList<>(Arrays.asList(stArr));
//        Stream<String> stream2 = stList.stream();
//
//        int[] intArr={10,20,30,40,50};
//        // 기본형 자료는 별도의 stream 제공
////        Stream<Integer> stream3= Arrays.stream(intArr); // int를 Integer로 하는 건 에러뜸
//        //따라서 별도의 stream 써서 해. 기본형은 별도의 기본형이 제공됨
//        IntStream stream3 = Arrays.stream(intArr);
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
//        Stream<Integer> stream4 = myList.stream();
        // int가 아니라 Integer이기 때문에 Intstream은 사용 불가
        // Integer는 그냥 Stream
//        IntStream stream5 = myList.stream(); // 에러

        // stream 변환(중개 연산) : filter, map, sorted, distinct, limit
        // filter, map 많이 쓰임
//        String[] stArr={"HTML", "CSS", "JAVA", "PYTHON"};
//        // filter : 특정 기준으로 대사을 filtering하는 것. Stream<String>반환
//        // 제네릭의 타입 소거 문제 발생
//        // 제네릭의 타입소거란 제네릭 타입을 런타임시점에는 제거하는 것을 의미
//        // 그래서, 타입이 소거된 Stream객체에서 배열로 변환하려면 타입이 뭔지를 명시해줘야함(타입캐스팅)
//        // 컴파일 시점에서 제네릭이 소거되기 때문에 String인걸 알려주기 위해 toArray(ㅋ-a->newString[a])해줘야함
//
////        List<String> myList = new ArrayList<>();
////        String[] myArr = myList.toArray(); // 이렇게 하면 에러
//        String[] newStArr=Arrays.stream(stArr).filter(a->a.length()<=4).toArray(a->new String[a]); //String인 거 알려줘야함
//
//        // 메소드 참조 방식 :   클래스::메서드  (매개변수가 추론 가능할 때 주로 한개일 때 생략하는 것)
//        String[] newStArr2 = Arrays.stream(stArr).filter(a->a.length()<=4).toArray(String[]::new);
//        Arrays.stream(stArr).forEach(System.out::println); // 클래스 :: 메소드
//        Arrays.stream(stArr).forEach(a-> System.out.println(a)); // 위랑 같은 거!
//
//        // distinct : 중복제거
//        int[] intArr={10,10,30,40,50};
//        int[] newIntArr=Arrays.stream(intArr).filter(a->a<=30).toArray();
//        int[] newIntArr2=Arrays.stream(intArr).distinct().toArray();
//        System.out.println(Arrays.toString(newIntArr2));
//        int total = Arrays.stream(intArr).sum();
//
//        // map : 기존의 스트림을 조작하여 새로운 스트림 반환
//        int[] newMapArr=Arrays.stream(intArr).map(a->a*10).toArray();
//        System.out.println(Arrays.toString(newMapArr));
//

        // 홀수 찾기
//        int[] arr1={1,2,3,4,5,6};
//        int[] newArr1 = Arrays.stream(arr1).filter(a->a%2!=0).toArray();
//        // 홀수만 담은 배열 제곱하기
//        int[] newArr2 = Arrays.stream(newArr1).filter(a->a%2!=0).map(a->a*a).toArray();
//        // 홀수만 담은 배열 제곱한 새로운 배열 내림차순 정렬 생성
//        int[] newArr3 = Arrays.stream(newArr1).filter(a->a%2!=0).map(a->a*a).sorted().toArray();
//
//
//        System.out.println(Arrays.toString(newArr1));
//        System.out.println(Arrays.toString(newArr2));
//
//        // mapToInt : intstream 형태로 변환해주는 map
//        String[] stArr={"HTML","CSS","JAVASCRIPT","JAVA"};
//        // 각 문자열의 길이를 담은 새로운 int 배열 생성
//        int[] getStringLength = Arrays.stream(stArr).mapToInt(a->a.length()).toArray();
//        // limit
//        int[] getStringLength2 = Arrays.stream(stArr).mapToInt(a->a.length()).limit(3).toArray();


        // 스트림의 소모 -> sum : 합계, reduce:누적연산, foreach(출력)
//        int[] intArr ={10,20,30,40};
//        Arrays.stream(intArr).forEach(System.out::println);
//        int intArrSum = Arrays.stream(intArr).sum();
//        // optional 객체 : 값이 있을 수도 있고, 없을 수도 있음을 명시한 객체
//        int intArrMax=Arrays.stream(intArr).max().getAsInt();
//        int intArrMin = Arrays.stream(intArr).min().getAsInt();
//        int intArrCount= (int)Arrays.stream(intArr).count();
//
//        // reduce(초기값, 연산식);
//        // 실무에서 많이 쓰는 함수임
//        int allMultiply = Arrays.stream(intArr).reduce(1,(a,b)-> a*b);
//        int allAdd=Arrays.stream(intArr).reduce(1,(a,b)->a+b);
//        System.out.println(allAdd);
//        String[] stArr={"Hello","java","world"};
//        String stAllAdd=Arrays.stream(stArr).reduce("",(a,b)->a+b);
//        System.out.println(stAllAdd);
//
//        int[] numArr={10,10,20,30};
//        int numArrSum= Arrays.stream(numArr).distinct().sum();
//
//        //findFirst
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("kim",20));
//        students.add(new Student("choi",32));
//        students.add(new Student("lee",35));
//        students.add(new Student("park",22));
//
//        // 나이가 30이 넘는 학생 중에 첫번째 index 값을 가지는 학생 객체 생성
//        Student first = students.stream().filter(a->a.getAge()>=30).findFirst().get();
//
//        // student 객체 실습
//        // 1) 모든 객체의 평균 나이
//        int averrageAge=(int)students.stream().mapToInt(a->a.getAge()).average().getAsDouble();
//        System.out.println(averrageAge);
//        // 2) 가장 나이 어린 사람 찾기
//        Student s2 = students.stream().sorted((a,b)->a.getAge()-b.getAge()).findFirst().get();
//        System.out.println(s2.getName());
//        // 3) 30대가 몇명인지 출력
//        String[] nameArr = students.stream().filter(a->a.getAge()>=30).map(a->a.getName()).toArray(String[]::new);
//        System.out.println(Arrays.toString(nameArr));
//
//        // Optional 객체 : 특정 객체에 값이 없을지도 모른다는 것을 명시적으로 표현
//        // ofNullable : null이 있을 수도 있는 경우에 Optional 객체를 생성하는 메서드
//        Optional<String> opt1 = Optional.ofNullable(null);
//        String st1=null;
//
//        if(opt1.isPresent()){
//            System.out.println(opt1.get().compareTo("hello"));
//        }
//        else{
//            System.out.println("값이 없습니다");
//        }
        // Optional 객체 생성 3가지 방법
        Optional<String> opt1=Optional.empty();
        Optional<String> opt2 = Optional.of("hello");//null이 못 들어감, null 넣으면 에러남
        Optional<String> opt3 = Optional.ofNullable("hello");//null이 들어갈 수 있음
        // opt들 자체에도 Optional값이 이미 들어가이씀

        // Optioanl 객체 처리 방법
        // 방법1. isPresent() 확인 후 get()
        if(opt3.isPresent()) System.out.println(opt3.get().length()); // 그냥 get하면 string값 꺼내짐 sout(opt.get)은 안 돼 없을 수도 있자나
        // 방법2. orElse() : 값이 있으면 있는 값 return, 없으면 지정값 return
        System.out.println(opt3.orElse("").length());
        // 방법3. orElseGet() : 값이 있으면 있는 값 return, 없으면 람다함수 실행
        System.out.println(opt3.orElseGet(()->new String("")).length());
        // 방법4. orElseThrow() : 가중. 가장 중요하단 뜻 : 값이 있으면 있는 값 return, 없으면 지정된 예외 강제 발생
        // 개발에서 예외를 사용자에게 적절한 메시지 전달 목적으로 강제 발생시키는 경우도 존재. 에러메시지 확인하려고 등 적절한 메시지와 적절한 기록을 남기려고 예외를 강제 발생시킴
        // 우리가 원하는 예외를 보낼 수 있다.
        System.out.println(opt3.orElseThrow(()-> new NoSuchElementException("값이 없습니다.")).length());

        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 20));
        students.add(new Student("kim1", 21));
        students.add(new Student("kim2", 23));
        students.add(new Student("kim3", 25));
//        방법1
        OptionalDouble answer = students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average();
        if(answer.isPresent()){
            System.out.println(answer.getAsDouble());
        }else {
            System.out.println("값이 없습니다.");
        }
        System.out.println(answer);
//        방법2
        double answer2 = students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average().orElseThrow(()->new NoSuchElementException("값이 없습니다."));
        students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average(); // sum 값 없으면 0됨 따라서 optional 객체 처리필요 없음 , average나 max는 optional됨
    }
}
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
}