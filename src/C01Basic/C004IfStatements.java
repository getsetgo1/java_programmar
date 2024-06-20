package C01Basic;

import java.util.*;

public class C004IfStatements {
    public static void main(String[] args) {
//         도어락키 if문
//        int answer = 1234;

//        if(조건식){
//            참일 경우 실행문;
//        }else 거짓일 경우 실행문;
//        Scanner sc = new Scanner(System.in);
//        if(sc.nextInt()== answer){
//            System.out.println("문이 열렸습니다");
//        }else System.out.println("비밀번호가 틀렸습니다");

//        반복되는 도어락키 예제
//        int를 string으로 변경
//        비밀번호를 맞추면 종료
//        String answer = "1234";
//        int trial = 5;
//        while(trial>0){
//            Scanner sc = new Scanner(System.in);
//            if (answer.equals(sc.nextLine())) {
//                System.out.println("문이 열렸습니다");
//                break;
//            } else System.out.println("비밀번호가 틀렸습니다");
//
//            trial--;
//        }
//        if (trial<1) {
//            System.out.println("비밀번호 최대 시도횟수가 초과되었습니다");
//        }
        // result에 숫자 num을 반대로 뒤집은 숫자값을 넣어주세요
        // % 활용
//        Scanner sc = new Scanner(System.in);
//        String result = sc.next();
//        List<String> getResult= Arrays.asList(result.split(""));
//        Collections.reverse(getResult);
////        System.out.println(String.join("",getResult));
//
        Scanner sc = new Scanner(System.in);
//        int num=sc.nextInt();
//        int len = String.valueOf(num).length();
//        int[] result=new int[len];
//        while(len>1){
//            result[len-1]=num/(int)(Math.pow(10,len-1));
//            num%=(int)(Math.pow(10,len-1));
//            len--;
//        }
//
//        result[0]=num;
//        for(int i : result) System.out.print(i + "");


// 두수의 최대 공약수 구하기
//        Scanner sc = new Scanner(System.in);  ````````````
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int max=0;
//        for(int i=1;i<(a>b?a:b);i++){
//            if((a%i==0)&&(b%i==0)) max=i;
//        }
//        System.out.println(max);

        // 소수 구하기 : 1과 자기자신을 제외한 숫자로 나누어지지 않는 수
        // 1~24까지 수 중에 소수를 출력
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean trueOrNot=false;
//        for(int i =2;i<input;i++){
//            if (input%i==0){
//                trueOrNot = true;
//                break;
//            }
//        }
//        if(trueOrNot == false){
//            System.out.println("소수입니다.");
//        }
//        for(int i=2;i<25;i++){
//            int count = 0;
//            for(int j=2;j<=i;j++){
//                if((i!=j)&&i%j==0) count++;
//            }
//            if(count==0) System.out.println(i);
//        }

        // 홀수만 출력하기 1~10까지
        // continue 하면 아래 print 안 하고 바로 위의 증감식으로 감
//        for(int i=1;i<=10;i++){
//            if(i%2 == 0){
//                continue;
//            }
//            System.out.println(i);
//        }


        //강사님 코드
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





        // 알파벳이 소문자인지 대문자인지 판별하는 프로그램
        // 소문자 알파벳, 대문자 알파벳, 그외
//        char input = sc.nextLine().charAt(0);
//        if(input >= 'a' && input <= 'z') System.out.println("소문자입니다");
//        else if(input>='A' && input <='Z') System.out.println("대문자입니다");
//        else System.out.println("알파벳이 아닙니다");

        // 택시요금 : 10000, 버스요금 : 3000, 킥보드 : 2000
        // 사용자에게 얼마 있는 지 물어보고
        // 구간별로 교통수단 추천
//        int input = sc.nextInt();
//        if(input>=10000) System.out.println("택시 타세요");
//        if(input>=3000 && input <10000) System.out.println("버스 타세요"); //else if(input>=3000)
//        if(input<3000 && input >=2000) System.out.println("킥보드 타세요");
//        else System.out.println("걸어가세요");


        //enhanced for문(향상된 for문 - for each문)
//        int[] arr = {1,3,5,7,9};
        // 일반 for문
//        for(int i = 0;i<5;i++){
//            System.out.println(arr[i]);
//        }
        // enhanced for 문 : 반복 횟수는 arr에 들어가있는 데이터 개수 만큼 반복
//        for(int i : arr){
//            System.out.println(i);
//        }
        // 일반 for문을 통한 arr 값 변경 후 출력
//        for(int i=0;i<5;i++){
//            arr[i]+= 10;
//        }
//        System.out.println(Arrays.toString(arr));
        // 향상된 for문을 통한 arr 값 변경 후 출력
        // 향사된 for문으로는 실제 arr값의 변경은 불가능
//        for(int i :arr){
//            i+=10;
//        }
//        System.out.println(Arrays.toString(arr));
//        // 자바 변수의 유효 범위 : {}
//        int num =10;
//        if(num>1){
//            int abc = 20;
//            num=20;
//        }
//        abc=30; if문 중괄호 밖에서는 abc 변수의 존재를 모름
//        System.out.println(num);
//        System.out.println(abc); if문 중괄호 밖에서는 abc 변수의 존재를 모름


        // 다중 반복문 : 2 X 1
        // 각 단마다 몇단입니다. 출력
//        for(int i=1;i<10;i++){
//            System.out.println(i+"단 입니다.");
//            for(int j=1;j<10;j++){
//                System.out.println(i +" X " + j + " = "+(i*j));
//            }
//        }

        //라벨문 활용해서 값찾기
        //11을 찾으면 3,1에 있습니다. 라고 출력
        int [][] arr = {{1,2,3},{4,5,11},{7,8,9},{10,11,12}};
        int target = 11;
        loop1:
        for(int i=0;i<arr.length;i++){
            boolean test=false;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target) {
                    System.out.println(i + " , " + j + "에 있습니다");
                    break loop1;
                }
            }
        }

    }
}
