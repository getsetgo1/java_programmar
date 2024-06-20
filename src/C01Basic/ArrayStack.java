package C01Basic;
import java.io.*;

public class ArrayStack{
    public static void main(String[] args) throws IOException {
        ArrayStack as = new ArrayStack(10);

        as.push(1);
        as.push(2);
        as.push(3);
        as.push(4);
        as.push(5);
        as.push(6);
        as.push(7);
        as.push(8);
        as.push(9);
        as.push(10);
        as.pop();
        as.peek();
        System.out.println(as.empty());
        System.out.println(as.search(5));
    }
    // 오늘 할 것 스택 자료구조 만들어보기 -> 데이터 타입은 Integer

    // 스택 자료구조의 특징
    // 스택은 후입선출 (LIFO : Last In First Out, 리포)의 특징을 가진 자료구조이다.
    // 스택은 단방향 입출력이며 들어온 곳으로 나간다고 생각하면 됨.
    // 깊이 우선 탐색, 재귀호출 구조의 데이터 흐름을 가지고 있다. -> 홈페이지 뒤로 가기 시스템에 사용.
    // 재귀 : 함수가 자기 자신을 탈출문을 만날 때까지 호출하는 형식.
    // 잘못 사용하면 무한 호출에 빠질수 있다 무한 루프 와 거의 동일

    // 큐 자료구조의 특징
    // 큐는 선입선출(FIFO : First In First Out, 피포)의 특징을 가진 자료구조이다.
    // 큐는 양방향 입출력으로 들어오는 곳과 나가는 곳이 따로있다.
    // 우선순위 예약, 프로세스 관리 등에 사용 은행시스템, 병원 예약 시스템 등에 사용될 수 있다.
    int size;
    int top = -1;
    Object[] stack;

    public ArrayStack(int size){
        this.size = size;
        stack = new Object[size];
    }

    // 그냥 예외 발생시키는 방법 설명~~
    public void except(){
        throw new IndexOutOfBoundsException();
    }

    // push 메소드 구현 -
    // 스택이 가득 찬 상태에서 push 할 시 ArrayIndexOfBoundsException 예외를 발생
    public void push(Object ob){
        if (this.top == this.size-1) throw new IndexOutOfBoundsException();
        this.stack[++this.top] = ob;
    }

    // pop 구현 -
    // 데이터가 없는 상태에서 pop 을 하면 NullPointerException 예외를 발생
    // isEmpty 는 밑에 구현되어 있음.
    public void pop(){
        if(top==-1) throw new NullPointerException();
        System.out.println(stack[this.top]);
        stack[this.top--]=null;
    }

    // peek 구현 - stack 에 마지막에 들어온 데이터를 출력만 한다.
    // 만약 데이터가 없는 상태에서 pop 을 하면 NullPointerException 예외를 발생
    public void peek(){
        if(top==-1) throw new NullPointerException();
        System.out.println(stack[this.top]);
    }

    // empty 구현 - stack 이 비어있으면 True, 아니면 False 반환
    public Boolean empty(){
        if(this.top==-1) return true;
        return false;
    }

    // search 구현 - stack에서 값을 찾는다
    // 찾을 수 없다면 IndexOutOfBoundsException() 을 발생
    public int search(Object ob){
        for(int i =0; i<=top;i++){
            if(stack[i].equals(ob)) {
                return i;

            }
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean isEmpty() {
        if(top == -1) return true;
        return false;
    }

}


