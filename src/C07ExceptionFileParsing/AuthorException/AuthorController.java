package C07ExceptionFileParsing.AuthorException;

import java.util.Scanner;

// Author컨트롤러 (while true)
//  - AuthorService service = new AuthorService() // 실제 로직은 서비스에서 하게 던져
//  - 1. 회원가입 : name, email, password 입력받아
//  ----- service의 register 메서드 호출 -> service에서 Author 객체 생성하여
//  ----- -> repository 호출하여 register 완료(List에 담기)
//    1-1. 회원가입 예외처리 => service에서는 throw new 발생, controller에서 try-catch 시키기(동일한 email 있는 경우, 비밀번호가 5자리 이하인 경우)
//  - 2. 로그인 : email, password 입력 받아 service의 login 메서드 호출
//      -> service에서 해당 email user가 있는 지 검증(없으면 예외)
public class AuthorController {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        while(true){
            System.out.println("원하시는 서비스의 번호를 입력하세요");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 서비스 종료");
            int service = Integer.parseInt(sc.nextLine());
            if(service == 1) {
                System.out.println("이름을 입력하세요");
                String name = sc.nextLine();
                System.out.println("이메일을 입력하세요");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력하세요");
                String password = sc.nextLine();
                authorService.register(name,email,password);
            }
            else if(service == 2) {
                System.out.println("이메일을 입력하세요");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력하세요");
                String password = sc.nextLine();
                try {
                    authorService.login(email, password);
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                    e.printStackTrace(); // 서버에 로그 상세히 남기기 위해 이거 함
                }
            }
            else if(service == 3) break;
        }
    }
}
