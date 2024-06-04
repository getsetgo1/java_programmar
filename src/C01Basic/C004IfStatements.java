package C01Basic;

import java.util.Scanner;

public class C004IfStatements {
    public static void main(String[] args) {
        // 도어락키 if문
//        int answer = 1234;

//        if(조건식){
//            참일 경우 실행문;
//        }else 거짓일 경우 실행문;
        Scanner sc = new Scanner(System.in);
//        if(sc.nextInt()== answer){
//            System.out.println("문이 열렸습니다");
//        }else System.out.println("비밀번호가 틀렸습니다");

        // 알파벳이 소문자인지 대문자인지 판별하는 프로그램
        // 소문자 알파벳, 대문자 알파벳, 그외
//        char input = sc.nextLine().charAt(0);
//        if(input >= 'a' && input <= 'z') System.out.println("소문자입니다");
//        else if(input>='A' && input <='Z') System.out.println("대문자입니다");
//        else System.out.println("알파벳이 아닙니다");

        // 택시요금 : 10000, 버스요금 : 3000, 킥보드 : 2000
        // 사용자에게 얼마 있는 지 물어보고
        // 구간별로 교통수단 추천
        int input = sc.nextInt();
        if(input>=10000) System.out.println("택시 타세요");
        if(input>=3000 && input <10000) System.out.println("버스 타세요"); //else if(input>=3000)
        if(input<3000 && input >=2000) System.out.println("킥보드 타세요");
        else System.out.println("걸어가세요");


    }
}
