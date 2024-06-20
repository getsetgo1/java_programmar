package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 2개의 조합 뿐만 아니라 n개의 조합을 위해 재귀
// 전형적인 패턴이라 이거 외우기
// myList : 대상이 되는 리스트
// temp: 실제로 count개 만큼 담기는 배열
// answer : 모든 조합 담기는 배열
public class C0207RecurCombiPermu {
    static List<Integer> myList;

    static List<List<Integer>> answer;
    static int count;
    public static void main(String[] args) {

//        List<Integer>myList = new ArrayList<>(Arrays.asList(1,2,3,4));
////        myList로 만들수 있는 2개짜리 숫자조합을 이중리스트에 담기
////        [[1,2], [1,3] [1,4], ...]
//        List<List<Integer>> combinations = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for(int i=0; i<myList.size()-1; i++){
//            temp.add(myList.get(i));
//            for(int j=i+1; j<myList.size(); j++){
//                temp.add(myList.get(j));
//                combinations.add(temp);
//                temp.remove(myList.size()-1);
//            }
//            temp.remove(myList.size()-1);
//        }

        myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        answer = new ArrayList<>();
        count=2;
        combinations(new ArrayList<>(), 0);
        System.out.println(answer);
    }
    static void combinations(List<Integer>temp, int start  ){
        if(temp.size()==count){
//            temp값을 그대로 add할경우 temp메모리값이 add되므로, 모든 answer리스트에 같은 temp리스트 add
//            answer.add(temp);
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start; i<myList.size(); i++){
            temp.add(myList.get(i));
            combinations(temp, i+1 );
            temp.remove(temp.size()-1);
        }
    }
}







//package C02ClassBasic;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class C0207RecurCombiPermu {
//    public static void main(String[] args) {
//
////        List<Integer>myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//////        myList로 만들수 있는 2개짜리 숫자조합을 이중리스트에 담기
//////        [[1,2], [1,3] [1,4], ...]
////        List<List<Integer>> combinations = new ArrayList<>();
////        List<Integer> temp = new ArrayList<>();
////        for(int i=0; i<myList.size()-1; i++){
////            temp.add(myList.get(i));
////            for(int j=i+1; j<myList.size(); j++){
////                temp.add(myList.get(j));
////                combinations.add(temp);
////                temp.remove(myList.size()-1);
////            }
////            temp.remove(myList.size()-1);
////        }
//
//        List<Integer>myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//        List<List<Integer>> answer = new ArrayList<>();
//        combinations(answer, new ArrayList<>(), myList, 2, 0);
//        System.out.println(answer);
//    }
//    static void combinations(List<List<Integer>> answer, List<Integer>temp , List<Integer>myList, int count, int start  ){
//        if(temp.size()==count){
////            answer.add(temp);
//            // 아래 기억하기 중요
//            // temp값을 그대로 add할 경우 temp 메모리값이 add되므로, 모든 answer 리스트에 같은 temp 리스트 add
//            answer.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int i=start; i<myList.size(); i++){
//            temp.add(myList.get(i));
//            combinations(answer, temp, myList, count, i+1 );
//            temp.remove(temp.size()-1);
//        }
//    }
//}
