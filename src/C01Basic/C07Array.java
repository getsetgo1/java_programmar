package C01Basic;

import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//        //배열 표현식 1: 리터럴 방식
//        int[] intArr1 = {1,2,3,4,5};
//
//        //배열 표현식 2 : 배열 선언 후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 2;
//        intArr2[2] = 3;
//        intArr2[3] = 4;
//        System.out.println(intArr2[4]);
//
//        for(int i=0; i<5; i++){
//            System.out.println(intArr2[i]);
//        }
//        for(int i=0; i<intArr2.length; i++){ //배열의 길이 .length
//            System.out.println(intArr2[i]);
//        }

//
//        String[] charArr = new String[10];
//        System.out.println(intArr2[4]);
//
//        //배열 표현식 3
//        int[] intArr3 = new int[]{1,2,3,4};
//
//        //배열 표현식 4 : 불가 -> 배열의 길이는 사전에 지정되어야함
//        int[] intArr4 = new int[];

//        String[] stArr1 = new String [5];
//        stArr1[0] = "hello";
//        stArr1[1] = "java";
//        //null pointer exceptions
//        //System.out.println(stArr1[2].length());
//
//        //배열에 값 한꺼번에 세팅
//        String[] stArr2 = new String[5];
//        Arrays.fill(stArr2,"");
//        System.out.println(stArr2[3]);

        //85,65,90인 int배열을 선언하고, 총합, 평균을 구해보자
//        int[] arr = new int[]{85,65,90};
//        int sum = 0;
//        for(int i=0; i<arr.length; i++){
//            sum += arr[i];
//        }
//        int avg = sum/arr.length;
//        System.out.println("총합 : " + sum + " 평균 : " + avg);

        //최대값, 최소값
//        int[] arr = {10,20,30,12,8,17};
//        int max = arr[0]; //int max = Integer.MIN_VALUE; 로 세팅가능
//        int min = arr[0]; //int min = Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(max < arr[i]){
//                max = arr[i];
//            }
//            if(min > arr[i]){
//                min = arr[i];
//            }
//        }
//
//        System.out.println(max);
//        System.out.println(min);

        //배열의 자리 바꾸기
//        int[] arr = {10,20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//        int[] arr2 = {10,20,30,40,50,60,70,80,90};
//        for(int i=0; i<arr2.length-1; i++){
//            int temp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp;
//        }
//
//        //배열 뒤집기
//        int[] arr = {1,2,3,4,5};
//        //새로운 배열에 위 arr을 뒤집은 값 세팅
////        System.out.println(arr[arr.length-1]);
//        int[] newArr = new int[arr.length];
//        int num = arr.length-1;
//        for(int i=0; i<arr.length; i++){
//            newArr[num-i] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));
//
        //숫자 뒤집기
        //int num = 1234;
        //문자 배열로 만들고 문자열로 합해서 문자열로 출력
        //Arrays.toString(arr);

//        int num = 1234;
//        String s_num = Integer.toString(num);
//        StringBuilder sb = new StringBuilder();
//        int count = s_num.length();
//        for(int i=0; i<s_num.length(); i++){
//            sb.append(s_num.charAt(count-i-1));
//
//        }
//
//        String answer = sb.toString();
//        System.out.println(answer);
//        //방법 2
//        String result = sb.reverse().toString();
//        System.out.println(result);
//
//        int[] arr = {5,1,2,7,3,1,2};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        //문자정렬
//        //아스키코드 기주으로 정렬 => 대문자가 소문자보다 아스키코드 숫자가 낮다
//        String[] fruits = {"banana","apple","cherry","Apple"};
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//        //문자열의 index순서로 비교
//        String[] fruits2 = {"apple1","apple11","apple2"};
//        Arrays.sort(fruits2);
//        System.out.println(Arrays.toString(fruits2));
//
//        //내림차순 정렬
//        String[] starr = {"hello","hi","bye","goodmornig"};
//        //오름차순 정렬
//        //Arrays.sort(starr);
//
//        //기본형타입은 comparator로 처리 불가
//        Arrays.sort(starr, Comparator.reverseOrder());

//        int[] int_arr = {5,1,2,7,3,1,2};
        //참조형 타입만 사용가능함.
        //Arrays.sort(int_arr, Comparator.reverseOrder()); ->X
        //해결방법 1
//        Integer[] int_arr = {5,1,2,7,3,1,2};
//        Arrays.sort(int_arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(int_arr));

        //해결방법 2 : 오름차순 정렬 수 배열 뒤집기
//        Arrays.sort(int_arr);
        //해결방법 3 : streamapi, lambda를 활용한 내림차순 정렬

//        int answer = Arrays.stream(int_arr) //int_arr 대상으로 stream 객체 생성 int_arr.stream -> 하면 이렇게 바뀜
//                .boxed() //int요소를 integer로 형변환 시키는 메서드
//                .sorted(Comparator.reverseOrder())
//                .mapToInt(a->a) //Integer을 int로 형변환
//                .toArray(); //배열로 변환

        //정렬 직접구 (선택, 버블 정렬) Arrays.sort활용
        //문제풀이 : k번째 수

//        int[] array = {1, 5, 2, 6, 3, 7, 4};
//        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int [] answer = new int[commands.length];
//        for(int i=0; i<commands.length; i++){
//            int start = commands[i][0] -1;
//            int end = commands[i][1] -1;
//            int value = commands[i][2]-1;
//            int[] temp = new int[end-start+1];
//            int count = 0;
//            for(int j= start; j<end; j++){
//                temp[count++] = array[j];
//            }
//            Arrays.sort(temp);
//            answer[i] = temp[value];
//    }
//        System.out.println(Arrays.toString(answer));

        //선택정렬 알고리즘
//        int[] arr ={17,20,19,25,12};
//        for(int i=0;i<arr.length;i++){
//            int index = i;
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[index] > arr[j]) {
//                    index=j;
//                }
//                int temp=arr[i];
//                arr[i]=arr[index];
//                arr[index]=temp;
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[i] > arr[j]) {
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        // 숫자 조합의 합
        // 만들어질 수 있는 2개의 조합을 출력
//        int[] intArr = {10, 20, 30, 40, 50, 60};
        // 내 풀이
//        for(int i=0;i< intArr.length;i++){
//            int sum=intArr[i];
//            for(int j=i+1;j<intArr.length;j++ ){
//                sum+=intArr[j];
//            }
//            System.out.println(sum);
//        }
        // 강사님 풀이
//        for(int i=0;i< intArr.length;i++){
//            for(int j=i+1;j<intArr.length;j++){
//                System.out.println(intArr[i]+intArr[j]);
//            }
//        }
        // 배열의 복사
        // copyOf(배열, endindex), copyOfRange(배열, start,end)
//        int[] arr = {10, 20, 30, 40, 50, 60};
//        int[] newArr1=Arrays.copyOf(arr,10);
//        System.out.println(Arrays.toString(newArr1));
//
//        int[] newArr2=Arrays.copyOfRange(arr,1,4);
//        System.out.println(Arrays.toString(newArr2));

        // 배열의 중복 제거
        // list, set 쓰지 않고 중복 제거
        // 내 풀이
//        int[] temp = {10,10,5,7,40,40,10,10};
//        for(int i=0;i< temp.length;i++){
//            for(int j=i+1;j< temp.length;j++){
//               if (temp[i]==temp[j]) temp[i]=0;
//            }
//        }
//        for(int i=0;i<temp.length;i++){
//           if(temp[i]!=0) System.out.print(temp[i] + " ");
//        }
        // 강사님 풀이
//        int[] temp = {10,10,5,7,40,40,10,10};

//        Arrays.sort(temp);
//        int[] newTemp = new int[temp.length];
//        int num=0;
//        for(int i=0;i<temp.length;i++){
//            if(i==0||temp[i]!=temp[i-1]){
//                newTemp[num]=temp[i];
//                num++;
//
//            }
//        }
//        System.out.println(Arrays.toString(newTemp));

        // 프로그래머스 두 개 뽑아서 더하기
//        int[] numbers = {2, 1, 3, 4, 1};
//        int[] answer1 = new int[25];
//        int num = 0;
//        Arrays.sort(numbers);
//        for(int i = 0 ; i < numbers.length ; i++){
//            for (int j = i+1 ; j < numbers.length ; j++){
//                answer1[num] = numbers[i] + numbers[j];
//                num++;
//            }
//        }
//        answer1 = Arrays.copyOf(answer1, num);
//        Arrays.sort(answer1);
//        num = 0;
//        int[] answer = new int[answer1.length];
//        for(int i = 0 ; i < answer.length ; i++){
//            if(i == 0 || answer1[i] != answer1[i-1])
//                answer[num++] = answer1[i];
//        }
//        answer = Arrays.copyOf(answer, num);
//        System.out.println(Arrays.toString(answer));

        // 배열의 검색
//        int[] arr = {5, 3, 1, 8, 7};
//        int num=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==8) {
//                num=i;
//                break;
//            }
//        }
//        System.out.println(num);

        // 이진 검색(binary Search)
//        // 복잡도 O(logn)
//        int[] arr = {1,3,6,8,9,11,15};
//        // 사전에 오름차순 정렬이 되어 있어야 이진 검색 가능
//        System.out.println(Arrays.binarySearch(arr,15));

        // 배열간 비교
//        int[] arr1 = {10, 20, 30};
//        int[] arr2 = {10, 20, 30};
//        System.out.println(arr1==arr2);
//        //Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1,arr2));

        // 이차원 배열 선언과 할당
//        int[][] arr = new int[2][3];
//        arr[0][0]=1;
//        arr[0][1]=2;
//        arr[0][2]=3;
//        arr[1][0]=4;
//        arr[1][1]=5;
//        arr[1][2]=6;
//
//        // 리터럴 방식으로 할당
//        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
//
//        // 이차원배열 출력
//        System.out.println(Arrays.deepToString(arr2));

        // 가변배열 선언 후 할당
//        int[][] arr = new int[2][];
//        arr[0] = new int[3];
//        arr[1] = new int[4];
//
//        // 가변 배열 리터럴 방식
//        int[][] arr2 = {{10,20},{10,20,30}};

        //[3][4] 사이즈 배열을 선언한 뒤
        // 1~12까지 숫자값 각 배열에 할당 후 출력
        //{1,2,3,4},{5,6,7,8},{9,10,11,12}
//        int[][] arr = new int[3][4];
//        int count=1;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                arr[i][j]=count++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));


//        // 행렬의 덧셈 프로그래머스
//        int[][] arr1={{1,2},{2,3}};
//        int[][] arr2={{3,4},{5,6}};
//        int[][] answer= new int[arr1.length][arr1[0].length];
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;j<arr1[i].length;j++){
//                answer[i][j]=arr1[i][j]+arr2[i][j];
//            }
//        }

        // 가변 배열 실습 : 행의 길이(전체 배열의 길이) 5 => {{10},{20,20},{30,30,30},{40,40,40,40},{50,50,50,50,50};
        int[][] arr= new int[5][];
        for(int i=0;i< arr.length;i++){
            arr[i] = new int[i + 1];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = (i+1) * 10;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}