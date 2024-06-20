package C01Basic;

import java.util.*;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
//        //참조 자료형 : 기본 자료형을 제외한 모든 자료형
//        //WrapperClass : 기본형 타입을 Wrapping한 클래스
//        //int와 Integer간의 형변환
//        int a = 10;
//        Integer b = new Integer(20);
//        // auto unboxing : integer -> int 형변환
//        int c = b; //문제 안생김
//        // auto boxing
//        Integer d = a;

        //String과 int의 형변화
        //int -> String
//        int a =10;
//        String st1 = Integer.toString(a);
//        String st2 = String.valueOf(a);

        //Strin -> int
//        int b = Integer.parseInt(st1);

        //참조자료형에 원시자료형을 담을때는 Wrapper클래스를 써야한다.
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);

//        //String 변수 생성 방법
//        //객체 생성방식
//        String st1 = new String("hello");

//        //리터럴 생성방식 : 권장하는 방식
//        String st2 = "hello";
//
////        List<int> myList = new ArrayList<Int>(); 이렇게 쓰면 안됨
//        String st3 = new String("hello");
//        String st4 = "hello";
//        System.out.println(st1==st3); //st1, st3 : 메모리 주소값이 담겨있음
//        System.out.println(st2==st4);
//        System.out.println(st3==st4);
//
//        //String 문자열 비교는 equals 쓰기!! - 메모리 주소값 비교 x, 값 비교
//        System.out.println(st1.equals(st3)); //equals() : 힙메모리에 있는 값을 가지고옴
//        System.out.println(st2.equals(st4));
//        System.out.println(st3.equals(st4));
//        System.out.println("hello".equals("Hello"));
//        //대소문자 무시하고 비교
//        System.out.println(("hello".equalsIgnoreCase("HeLLo")));  //true

//        //문자열길이 : length();
//        String st1 = "hello java java";
//        System.out.println(st1.length());
//
//        //indexOf : 특정문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치
//        int index1 = st1.indexOf("java");
//        System.out.println(index1);
//        //마지막 문자열의 index 위치
//        System.out.println(st1.lastIndexOf("java"));
//        //contains : 특정 문자열이 있는지 여부를 boolean으로 리턴
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("wordl"));

//        //charAt : 특정 index의 문자(char)값을 리턴
//        String st = "abcdefasteg";
//        char ch1 = st.charAt(0); //리턴값은 항상 char
//        System.out.println(ch1);
//        System.out.println(ch1);
//        //문자 비교하고 싶을때 == 써야함
//        char ch2 = st.charAt(6);
//        System.out.println(ch1 == ch2);
//
//        //위의 문자열의 a의 개수가 몇개인지 count
//        //for문과 charAt, length()
//        int a_num = 0;
//        for(int i = 0; i < st.length(); i++){
//            if(st.charAt(i) == 'a'){
//                a_num ++;
//            }
//        }
//        System.out.println(a_num);
//
//        //toCharArray() : String문자열을 char배열로 리턴
//        System.out.println(Arrays.toString(st.toCharArray()));
//        //toCharArray()를 활용해서 a가 몇갠지 count, 향상된 for문 사용
//        char[] arr = st.toCharArray();
//        int count = 0;
//        for(char a : arr){
//            if (a == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);

//        //문자열 더하기 += -> 이렇게 하면 성능이 떨어짐
//        String st1 = "hello";
//        st1 += " world";
//        System.out.println(st1); //실제 원본 변경

        //문제 풀이 : 특정 문자 제거하기
//        String my_string = "asdfasdfasd";
//        String letter = "a";
//        String answer = "";
//
//        answer += 'a';
//        for (int i=0; i<my_string.length(); i++){
//            if(my_string.charAt(i) != letter.charAt(0)){
//                answer += my_string.charAt(i);
//            }
//        }
//        System.out.println(answer);

        //substring(a,b) : a이상 b미만의 index의 문자를 잘라 리턴
//        String st1 = "hello world";
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(6, st1.length()));

        //substring으로 문제풀기
//        for (int i=0; i<my_string.length(); i++){
//            if(my_string.substring(i,i+1).equals(letter)){
//                answer += my_string.substring(i,i+1);
//            }
//        }
//        System.out.println(answer);

//        //문제 풀이 : 가운데 글자 가져오기
//        String s = "aabbccddee";
//        String answer = "";
//        answer = s.substring((s.length()-1)/2, s.length()/2+1);
//        if(s.length()%2 ==0 ) {
//            answer = s.substring((s.length() /2)-1,(s.length()/2+1));
//        }else {
//            answer = s.substring((s.length() / 2), (s.length() / 2) + 1);
//        }
//        System.out.println(answer);

        // trim. strip : 문자열 양쪽 끝의 공백 제거
//        String trimSt1 = " hello world   ";
//        String trimSt2 = trimSt1.trim();
//        System.out.println(trimSt1);
//        System.out.println(trimSt2);
//        String trimSt3 = trimSt1.strip();
//        System.out.println(trimSt3);

//        // touppercase : 모두 대문자로 변환, tolowercase : 소문자로 변환
//        String s1 = "heLLo";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);

        //char -> String 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
//        char ch2 = st1.charAt(0);
//        System.out.println(st1);

        //replace(a,b) a문자열을 b문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world","java");
//        System.out.println(st2);

        //replaceAll(a,b) : replace와 동일한데, 정규표현식을 쓸 수 있음
//        String st1 = "01abc123한글123"; // 숫자 알파벳 문자 한글 등이 섞여 있을때, 알파벳만 빼는 방법
//        //for문 활용해서 알파벳(소문자) 제거 answer return
//        String answer = "";
//        for(int i=0;i<st1.length();i++){
//            if (st1.charAt(i) >= 'a' && st1.charAt(i)<= 'z'){
//                answer += st1.charAt(i);
//            }
//        }
//        System.out.println(answer);

//        //replaceAll과 정규표현식 활용
//        String st1 = "01abc123ABC한글123";
//        //[a-z]+ : a-z 1개 이상의 소문자 알파벳 표현하는 정규표현식
//        //[A-Za-z]+ : 대소문자 포함
//        //[가-힣]+ : 한글
//        //[0-9]+ : 숫자
//        String answer = st1.replaceAll("[A-Za-z]+","");
//        System.out.println(answer);
//
//        //String의 matches, Pattern.matches()
//        //문자열에 특정 패턴 갖고 있는지 확인
//        String test = "helloA";
//        System.out.println(test.matches("[A-Za-z]+"));
//
//        boolean b1 = Pattern.matches("[0-9]+","12345");
//        System.out.println(b1);
            // ^:정규표현식의 시작, $:정규표현식의 끝
//        boolean b2 = Pattern.matches("^[A-Za-z]*$","Helloworld");
//        System.out.println(b2);
//        //문제 : 문자열 다루기 기본
//        String s = "12345";
//        System.out.println(s.length());


//        if((s.length() == 4 || s.length() == 6) && s.matches("[0-9]+")){
//           boolean answer = true;
//        }

        //전화번호 패턴 검증
//        System.out.println("전화번호를 입력하세요 >> ");
//        Scanner sc = new Scanner(System.in);
//        String number = sc.nextLine();
//        if(Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$",number)){
//            System.out.println("올바르게 입력하셨습니다.");
//        }else {
//            System.out.println("틀린형식의 전화번호 입니다.");
//        }

        //이메일 검증 : 소문자 알파벳, 숫자, @, 소문자 알파벳, .com
//        String email = "abc@email.com";
//        boolean b = Pattern.matches("^[a-z0-9]+@+[a-z]+.com$", email);
//        System.out.println(b);


        //split : 특정문자를 기준으로 문자열을 자르는 것, 문자열 배열을 return
        //== split ==//
        // 중간에 공백이 여러개
        // \s: 공백을 의미하는 이스케이프 시퀀스
//        String b = "a b c  d";
//        String[] bArr = b.split("\\s+");
//        System.out.println(Arrays.toString(bArr));
//
//        // isEmpty와 null(자료 타입)
//        // st1, st2는 다르다.
//        String st1 = null;
//        String st2 = "";
//
//        // 공백과 null의 차이
//
////    System.out.println(st1.isEmpty()); // NullPointerException
//
//        if(st2 != null) {
//            System.out.println(st2.isEmpty()); //
//        }
//
//        //== join: String[]을 하나의 String으로 만드는 메소드
//        String[] sArr = {"java", "python", "C++", "javascript"};
//        String st = String.join(" ", sArr);
//        System.out.println(st);
//
//        //== StringBuffer, StringBuilder ==//
//        // StringBuilder가 더 성능이 좋다.
//        // String += <<< StringBuffer <<< StringBuilder
//        // StringBuilder는 스레드 safe 하지 않다.
//        StringBuffer sb1 = new StringBuffer("hello");
//        sb1.append(" java");
//        sb1.append(" world");
//
//        System.out.println(sb1);
//
//        // 6번째 자리에 문자열 끼워넣기
//        sb1.insert(5, " python");
//        System.out.println(sb1.toString());
//
//
//        sb1.delete(17, sb1.length());
//        System.out.println(sb1);
//
//        //== Builder ==//
//
//        // 백준 풀 때, println 하면 종종 출력 초과 나오는 경우가 있음 -> 그럴 때 sb에다 \n 넣어주기
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("hello");
//        sb2.append("\n");
//        sb2.append("world");
//        System.out.println(sb2);
//
//        //== 실습: StringBuilder ==//
//        String myString = "hello";
//        int n = 3;
//        StringBuilder sb3 = new StringBuilder();
//        char[] cArr = myString.toCharArray();
//        for(char c : cArr) {
//            for(int i=0; i<n; ++i) {
//                sb3.append(c);
//            }
//        }
//        sb3.append("\n");
//        System.out.println(sb3);

        //문제 풀이 문자열 밀기
//        return (B+B).indexOf(A);





    }
}
