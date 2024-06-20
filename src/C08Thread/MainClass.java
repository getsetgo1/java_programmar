package C08Thread;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        // 스레드 생성 방법 2가지 : 1. 스레드 상속 방식
//        Thread t1 = new Thread1();
        // start 메서드가 상속되어 있고, 이 메서드를 통해 run 메서드 실행
//        t1. start();
//        Thread t2 = new Thread1();
//        t2.start();

        // 스레드 생성 방법 2가지 : 2.Runnable 구현한 객체를 Thread 클래스에 주입 방식
//        Thread t3 = new Thread(new Thread2());
//        t3.start();
        // 위에 선언을 다른 방법으로 한 거
//        new Thread(new Thread2()).start();
//        new Thread(()-> System.out.println("익명 Runnable 객체 주입 후 실행 Thread")).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("익명 Runnable 객체 주입 후 실행 Thread");
//            }
//        }).start();

        // Thread 동시성 이슈 테스트
        // 아래는 동시성 이슈 없는 단일 쓰레드
//        for(int i=0;i<1000;i++){
//            Library.borrow();
//            new Thread(new LibrayThread1()).start();
//            new Thread(new LibraryThread2()).start();
//        }
//        System.out.println("최종적으로 남은 수량 "+Library.bookCount);

        // 멀티쓰레드로 Library 돌리기
        // 동시성 이슈 있는 멀티쓰레드
//        for(int i=0;i<50000;i++){
//            new Thread(()-> {
//                try {
//                    Library.borrow();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }).start();
//        }
        for(int i=0;i<50000;i++){
            Thread t1 = new Thread(()->Library.borrow());
            t1.start();
            // 동시성 이슈 해결 방법 첫번째. join() 메서드 사용
            // join() : 다른 스레드의 완료전까지 새로운 스레드가 실행되지 않음
            t1.join();
        }
        System.out.println("최종적으로 남은 수량 "+Library.bookCount);


    }
}
