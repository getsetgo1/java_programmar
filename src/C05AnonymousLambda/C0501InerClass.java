package C05AnonymousLambda;

public class C0501InerClass {
    public static void main(String[] args) {
        //
        MemberInnerClass.StaticInnerClass m1=new MemberInnerClass.StaticInnerClass();
        m1.display();
    }
}
// (일반)내부 클래스
class MemberInnerClass{
    int a;
    void display(){
        System.out.println("a의 값은 "+a);
    }
    // static 내부클래스
    // 해당 클래스는 MemberInnerClass의 정적 멤버처럼 활용
    static class StaticInnerClass{
        int b;
        void display(){
            System.out.println("b의 값은 "+b);
        }
    }
}
