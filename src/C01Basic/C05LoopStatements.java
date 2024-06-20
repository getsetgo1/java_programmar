package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
//        while (1>0){
//            System.out.println("helloworld");
//        }
//        int a = 0;
//        while (a<10){
//            System.out.println("Hello world");
//            a = a+1;
//        }

        //2~10까지 출력하는 while문 예제
//        int i = 1;
//        while(i<10){
//            System.out.println(i+1);
//            i++;
//        }

        //입력한 숙자의 구구단 단수 출력
//        Scanner sc = new Scanner(System.in);
//        System.out.println("숫자를 입력하세요 >>");
//        int n = sc.nextInt();
//
//        for(int i=1; i<10; i++){
//            System.out.println(n + " X " + i + " = " + n*i);
//        }
//        System.out.println("while문을 이용한 구구단");
//        int num = 1;
//        while (num<10){
//            System.out.println(n + " X " + num + " = " + n*num);
//            num ++;
//        }

//        System.out.println("무한반복 구구단");
//        while (true){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("숫자를 입력하세요 >>");
//            int n = sc.nextInt();
//
//            int num = 1;
//            while (num<10){
//                System.out.println(n + " X " + num + " = " + n*num);
//                num ++;
//            }
//        }

        //반복되는 도어락 키 예제, int->String으로 바꾸기, 비밀번호 맞추면 종료, 5회이상 틀리면 종료
//
//        int count = 1;
//        while (true) {
//            String answer = "1234";
//            System.out.println("비밀번호를 입력하세요 >>>");
//            Scanner sc = new Scanner(System.in);
//            String key = sc.nextLine();
//            if (answer.equals(key)) { //문자 비교할때는 .equals 사용해야함
//                System.out.println("문이 열렸습니다.");
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//                count++;
//            }
//            if(count>5){
//                System.out.println("입력횟수를 초과했습니다.");
//                break;
//            }
//        }

//        int num = 1234;
//        int result = 0;
//        //result에 숫자 num을 반대로 뒤집은 숫자값을 넣어주세요.
//        while(true){
//            int temp = num%10;
//            result = result * 10 +temp;
//            num =  num/10;
//            if (num ==0){
//                break;
//            }
//        }
//
//        System.out.println(result);
//
//        //do while문 : 무조건 1번은 실행되는 반복문 //잘 안씀
//        int a = 1;
//        do{
//            a++;
//            System.out.println(a);
        //a에 대한 검증 작업 가능
//        }while (a<10);

//        //2~10까지의 출력 for문 활용하여 출력
//        for(int i = 2; i<=10; i++){
//            System.out.println(i);
//        }
//
//        //1~10중에 홀수만 출력하기
//        for(int i=1; i<=10; i++){
//            if (i%2==1){
//                System.out.println(i);
//            }
//        }
//
//        //1~20까지의 수 중에 짝수를 모두 더한 값
//        int sum=0;
//        for(int i=1;i<=20;i++){
//            if(i%2==0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);

        //최대 공약수 구하기
//        int a = 24; int b= 36;
//        int max = a>b? a:b;
//        int answer=0;
//        for (int i=1;i<max;i++){
//            if(a%i==0 && b%i==0){
//                answer = i;
//            }
//        }
//        System.out.println(answer);

        //소수 구하기 1과 자기 자신을 제외한 숫자로 나누어지지 않는 수
        //사용자가 입력받은 숫자가 소수인지 확인
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
        boolean tureOrNot = false;

        //2...63까지 나눠서 나눠지는 수가 있으면 소수아님
//        for(int i=2; i<input; i++){
//        //for(int i=2; i*i<input; i++){
//            if(input%i == 0){
//                //소수 아닌상황
//                tureOrNot = true;
//                break;
//            }
//        }
//        if(tureOrNot == false){
//            System.out.println("소수입니다.");
//        }
        //소수 문제 중요
        //1~24까지 수 중에 소수를 출력 2 3 5 7 11 13 17 19 23

//        for(int i=2;i<25;i++){
//            int count = 0;
//            for(int j=2;j<=i;j++){
//                if((i!=j)&&i%j==0) count++;
//            }
//            if(count==0) System.out.println(i);
//        }
//
//        //홀수만 출력하기 1~10 continue 활용
//        for(int i=1; i<=10; i++){
//            if (i%2==0){
//                continue;
//            }
//            System.out.println(i);
//        }

        //배열과 enhanced for문(향상된 for문 - for each문)
//        int[] arr = {1,3,5,7,9};
////        //배열값 출력 : 일반 for 문
////        for(int i=0; i<5; i++){
////            System.out.println(arr[i]);
////        }
//        //향상된 for문 , 반복횟수 : arr에 들어가있는 데이터 개수 만큼 반복
//        for(int i : arr){ // 값만 가지고 옴, 본래 arr의 값을 수정할 수는 없음
//            System.out.println(i);
//        }

        //일반 for문을 통한 arr값 변경 후 출력
//        for (int i=0;i<5;i++){
//            arr[i] += 10;
//        }
//        //System.out.println(arr);//arr 메모리 주소 출력
//        //내용출력
//        System.out.println(Arrays.toString(arr));

//        //향상된 for문을 통한 arr값 변경 후 출력
//        //향상된 for문으로는 실제 arr 값의 변경 불가능
//        for(int i : arr){
//            i += 10;
//        }
//        System.out.println(Arrays.toString(arr));

        //자바 변수의 유효범위 : {}
//        int a = 10;
//        //int a = 10; // 같은 변수 여러번 선언 불가
//        if(a>1){
//            int abc = 20;
//            a=20;
//        }
//        abc= 30; //if문 중괄호 밖에서는 abc변수의 존재를 모름

        //다중반복문
//        for(int i=1; i<10; i++){
//            System.out.println(i + "단입니다.");
//            for(int j=1; j<10; j++){
//                System.out.println( i + " X " + j + " = "+ i*j);
//            }
//        }

        //라벨문
//        loop1:
//        for(int i=0;i<5;i++){
//            for(int j=0;j<5;j++){
//                System.out.println("hello world");
//                if(j == 2){
//                    break loop1;
//                }
//            }
//        }
        //라벨문 활용
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
//        System.out.println(arr[2][0]);

        int target = 11;
        //원하는 숫자 찾으는 for문
        loop:
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] == target){
                    System.out.println( i + "," + j + "에 " + target + "이 있습니다." );
                    break loop;
                }
            }
        }

    }
}
