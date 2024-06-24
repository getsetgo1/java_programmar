package C02ClassBasic;

public class Test {
    public static void main(String[] args) {
        MyPerson p1 = new MyPerson();
        p1.name = "hong";
        p1.email = "hong";
    }
}
class MyPerson{
    String name;
    String email;
//    MyPerson(String name, String email){
//        this.email=email;
//        this.name=name;
//    }
    // 이렇게 하면 깡통 생성자가 사라짐

//    나중에는 생성자 argument 없어도 에러 뜨게 할 수 있음 by annotation
}
