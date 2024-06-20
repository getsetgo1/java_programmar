package C02ClassBasic;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0208RecurPermu {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> answer = new ArrayList<>();
        boolean[] check=new boolean[myList.size()];

        permu(answer, new ArrayList<>(), myList, 2, new boolean[myList.size()]);
        System.out.println(answer);
    }
    static void permu(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, boolean[] visited){
        if(temp.size() == count){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<myList.size(); i++){
            if(visited[i]==false) {
                visited[i] = true;
                temp.add(myList.get(i));
                permu(answer, temp, myList, count, visited);
                temp.remove(myList.size() - 1);
                visited[i]=false;
            }
        }
    }
}