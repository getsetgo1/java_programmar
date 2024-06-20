package C02ClassBasic;
// 내부 클래스 : Calendar
// 객체 변수 : year, month, day 모두 String
// 메서드 : getter, setter 정의
public class C0205Constructor {
    public static void main(String[] args) {
        Calendar cal = new Calendar();
//        cal.setYear("2024");
//        cal.setMonth("06");
//        cal.setDay("12");
        System.out.println("오늘은 "+cal.getYear()+"년 "+ cal.getMonth()+"월 "+ cal.getDay()+ "일 ");
    }
    static class Calendar{
        private String year;
        private String month;
        private String day;

        public String getYear() {
            return year;
        }
        // 생성자 : 클래스명과 동일, 초기화하고 싶은 변수명 나열
        // 별도의 생성자를 만들 경우, 초기생성자를 따로 선언 필요
        // 즉 Calendar 아래처럼 만들면
        // Calendar cal = new Calendar(); 이거 오류뜸
        // 왜냐면 원래 default로 Calendar() 초기생성자로 주는데,
        // 별도로 만들어서 위에 default로 주는 거 무시되니까
        // 그래서 new Calendar() 되게 하려면 Calendar(){} 선언 해야해
        Calendar(String year, String month, String day){
            this.year = year;
            this.month = month;
            this.day = day;
        }
        Calendar(String year, String month){
            this(year,month,null);
            // 위에 메서드를 호출하는 거
            // 같은 생성자 내에 다른 생성자 호출시 this() 사용
            // 매개변수의 개수와 타입을 보고 프로그램이 알아서 찾아감
        }
        Calendar(){

        }

//        public void setYear(String year) {
//            this.year = year;
//        }
//
//        public void setMonth(String month) {
//            this.month = month;
//        }
//
//        public void setDay(String day) {
//            this.day = day;
//        }

        public String getMonth() {
            return month;
        }

        public String getDay() {
            return day;
        }
    }
}
