package C01Basic;

import java.math.BigDecimal;
import java.util.Scanner;

public class C02Variable {
    public static void main(String[] args) {
        // 정수 : byte(1바이트 = 마리아디비의 tinyint, int(4바이트), long(8바이트)
//        byte a = 127;
//        byte b = -128;
//        System.out.println(a);
//        System.out.println(b);
        // 오버 플로우 또는 언더 플로우 발생
//        a++;
//        b--;
//
//        int int_a = 10;
//        // long 명시적으로 L을 붙여 long 타입을 명시하기도 함
//        long long_a=20L;
//
//        //실수 : float , double(기본)
//        float f1 = 1.123f;
//        double d1 = 1.123;

        // 부동 소수점 오차 테스트
//        double d2 = 0.1;
//        System.out.println(d2);
//
//        double total=0;
//        for(int i=0;i<1000;i++){
//            total+=0.1;
////        }
////        System.out.println(total);
//
//        // 소수점 오차의 대안으로 Bigdecimal 클래스 사용
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1-d2);
//        // Bigdecimal의 원리 : 저장할 때 문자열로 저장해서,
//        // 연산할 때 정수로 변환, 최종 결과는 실수로 변환
//        BigDecimal n1 = new BigDecimal("1.03");
//        BigDecimal n2 = new BigDecimal("0.42");
//        double result = n1.subtract(n2).doubleValue();
//        System.out.println(result);
//
//        // 문자형 : char
//        char m1 = '가';
//        System.out.println(m1);
//
//        // boolean : true or false
//        boolean bool1 = true;
//        boolean bool2 = false;
//        Scanner sc = new Scanner(System.in);
//        int input1 = sc.nextInt();
//        // if 조건절 안에 boolean 타입값이 들어옴에 유의
//        if(input1>0) System.out.println("입력하신 값이 0보다 큽니다");

        // 타입 변환
        // 묵시적 타입 변환 : 코딩으로 굳이 표현 안 해도 알아서 변환
//        char ch1 = 'a';
//        int ch1_num=ch1;
//        System.out.println(ch1_num);
//        // 명시적 타입 변환 : 코딩으로 명확하게 변환을 표현
//        System.out.println((int)'a');
//        System.out.println('b');
//        // 알파벳 비교를 위해 묵시적 타입 변환 발생
//        System.out.println('a'>'b');
//
//        // int -> double로 형변환은 문제 없음 (아래 묵시적 형변환)
//        int i1 = 10;
//        double d1 = i1;
//
//        //double->int로 묵시적 형변환은 불가능
//        // 명시적 형변환은 가능, 소수점이 절산됨
//        double d2 = 10.5;
//        int i2=d2; // 얘는 안됨
//        int i2=(int)d2;

        // 형변환 관련 나눗셈 문제
//        int a =1;
//        int b=4;
//        int c=1/4;
//        // int/int 이므로 결과값을 int로 판단하여 소수점 절사
//        // 두값 중에 한 값이라도 double로 명시적 형변환 시켜주면 결과값 double
//        double d = 1/4;
//        System.out.println(c);
//        System.out.println(d);
//
//        // 변수와 상수
//        int a1 = 10;
//        // 변수값 재할당
//        a1 = 20;
//        // 상수는 초기화 이후에 값이 재할당되는 것이 불가능
//        // 상수는 final 키워드로 표현
//        final int a2 = 10;
//        a2 = 20; // 이거 에러남
//        // 일반적으로 상수값은 대문자로 표현
//        final int AGE = 20;

    }
}


