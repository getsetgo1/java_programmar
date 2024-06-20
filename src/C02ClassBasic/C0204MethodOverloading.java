package C02ClassBasic;

public class C0204MethodOverloading {
    public static void main(String[] args) {
        C0204MethodOverloading cs = new C0204MethodOverloading();
        System.out.println(cs.sum(10,20));
    }
    //접근제어자를 안붙이면 기본적으로 default 접근제어자 : 같은 패키지내에서만 유효
    // static 붙이면 객체 안 만들어도 되는데 static 안 붙이면 객체 만들어서 호출해야함
    // 아래에 static 붙이면 위에서 객체 안 만들고 그냥 바로 sum하면 되고
    // static 안 붙이면
    // (1) 저렇게 객체 선언하던지,
    // (2) C0204MethodOverloading.sum 하던지 해야함
    int sum(int a, int b){
        return a+b;
    }
    // 매개변수의 타입 또는 개수가 다르면, 같은 이름의 메소드 정의 가능.
    // 즉, 메서드 오버로딩
    // 매개변수의 타입이 다른 경우
    double sum(double a, double b){
        return a+b;
    }
    // 매개변수의 개수가 다른 경우
    int sum(int a, int b,int c){
        return a+b+c;
    }
}
