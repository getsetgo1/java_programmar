package C05AnonymousLambda;

public class C0502AnonymousClass {
    public static void main(String[] args) {
        // AbstractAnimal 상속한 클래스가 별도로 존재하지 않고,
        // 익명의 클래스가 만들어짐과 동시에 익명객체 생성
        AbstractAnimal a1=new AbstractAnimal() {
            @Override
            void makeSound2() {

            }
        };
        // 익명 객체에 구현 메서드가 1개밖에 없을 때에 람다표현식(화살표함수)로 표현 가능
        // ()부분에 매개변수 지정
        // 변수의 개수와 순서를 맞춰서 지정
        Animal a2 = (a)-> System.out.println("동물 소리를 냅니다."+a);
        a2.makesound(10);
//        new Animal() {
//            @Override
//            public void makesound1(){
//                System.out.println("동물 소리를 냅니다");
//            }
//        };

        // Animal2로 익명 객체를 만들어서 input1+input2+input3를 더해서 return 하는 메서드(makeSound) 작성
        // 위에서 return 문자열 출력
        // 실행문이 한줄일때는 {}와 return 생략 가능
        // 실행문이 2줄 이상일때는 {}를 사용해서 return 처리
        Animal2 a3 = (a,b,c)->{return a+b+c;};
//        Animal2 a3 = (a,b,c)->a+b+c;
//        Animal2 a3 = new Animal2() {
//            @Override
//            public String makesound(String a, String b, int c) {
//                return a+b+c;
//            }
//        };
        // 실행문이 2줄 이상일때는 {}를 사용해서 return 처리 예시
        System.out.println(a3.makesound("고양이가","한강위를",3));

        Animal2 a4 = (a,b,c)->{
            if(c>10){
                return a+b;
            }else{
                return a;
            }
        };
        a4.makesound("hello","java",3);

        }
    }

interface Animal{
    void makesound(int a);
}
interface Animal2{
    String makesound(String a, String b, int c);
}
abstract class AbstractAnimal{
    void makesound1(){

    }
    abstract void makeSound2();
}