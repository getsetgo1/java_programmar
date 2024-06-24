package C10Annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class C10ReflectionBasic {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        // 객체 생성 방법1. 기존의 방식
        Calculator calculator = new Calculator("Samsung");
        calculator.sayHello();

        // 객체 생성 방법2. 런타임 환경에서 리플렉션 기술을 통해 객체 생성 및 메서드 호출
        // <?> 제네릭 표현으로 어떤 클래스 타입도 가능하다는 표현
        // getClass메서드는 런타임시점에 calculator라는 객체의 타입을 가져오는 메서드
        // 이 아래 과정처럼 리플렉션이 생성되고 적용되는 과정을 보여줌
        Class<?> myClass = calculator.getClass(); // 아직 모르는 클래스를 받음

        // 객체 생성 2-1)
        // Calculator calculator = new Calculator("Samsung"); 와 같은 걸 아래와 같이 리플렉션이 하는 거
        Calculator cal1 = (Calculator) myClass.getConstructor(String.class).newInstance("Samsung");
        // 메서드 생성
        Method cal1Method = myClass.getMethod("sayHello");
        cal1Method.invoke(cal1);

        //객체 생성 2-2)
        // constructor 있나->class 있나-> 객체 만들까?의 과정이 아래
        Calculator cal2=Calculator.class.getConstructor(String.class).newInstance("Casio");
        // 메서드 생성
        Method cal2Method = Calculator.class.getMethod("sayHello");
        cal2Method.invoke(cal2);

        // 리플렉션 기술을 통해 필드 접근 및 수정 : 실시간으로 변수 수정하는 과정
        // "name"이라는 필드를 찾음-> 접근 가능한 set메서드가 있으면 private이어도 set 시킴
        Field nameField=Calculator.class.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(cal1,"Casio");
        cal1Method.invoke(cal1);
    }
}
class Calculator{
    private String name;
    public Calculator(){

    }
    public Calculator(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("my name is "+this.name);
    }
}
