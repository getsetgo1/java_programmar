package C02ClassBasic;


//게시판 서비스 만들기
//1. 회원가입
//=> Author 클래스 : id, name, email, password
// (id는 static으로 두고 생성자에서 id+=1 하면 됑, 그리고 각 객체의 id는 private으로 두고 저장하고)
//----------------------------------------------------
//2. 회원 전체 조회(by id로 조회)
//=> id, email 조회
//----------------------------------------------------
//3. 회원 상세 조회(by id로 조회)
//=> id, email 조회
//----------------------------------------------------
//4. 게시글 작성(Post클래스)
//=> id, title, contents, email(입력 받되, Author 객체)
//----------------------------------------------------
//5. 게시글 목록 조회
//=> id, title
//----------------------------------------------------
//6. 게시글 상세 조회
//=> id, title, contents, 저자(email or name or author_id)


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Author> authors = new ArrayList<>();
        List<List<Post>> posts = new ArrayList<>();
        int service_num;
        while(true){
            System.out.println("---------------게시판 서비스---------------");
            System.out.println("1. 회원가입");
            System.out.println("2. 회원 전체 조회");
            System.out.println("3. 회원 상세 조회");
            System.out.println("4. 게시글 작성");
            System.out.println("5. 게시글 목록 조회");
            System.out.println("6. 게시글 상세 조회");
            System.out.println("7. 회원 게시글 조회");
            System.out.println("-------원하는 서비스의 숫자를 입력하세요-------");
            service_num = Integer.parseInt(sc.nextLine());
            if(service_num==1){
                int check;
                System.out.println("-------회원가입 화면입니다-------");
                while(true) {
                    System.out.println("이름을 입력해주세요");
                    String nameInput = sc.nextLine();
                    System.out.println("이메일을 입력해주세요");
                    String emailInput = sc.nextLine();
                    System.out.println("비밀번호를 입력해주세요");
                    String passwordInput = sc.nextLine();
                    System.out.println("이름 : "+nameInput);
                    System.out.println("이메일 : "+emailInput);
                    System.out.println("비밀번호 : "+passwordInput);
                    System.out.println("다시 입력하고 싶으시면 1을 아니면 2를 입력해주세요");
                    check=Integer.parseInt(sc.nextLine());
                    if(check==2) {
                        authors.add(new Author(nameInput, emailInput, passwordInput));
                        posts.add(new ArrayList<>());
                        // id별로 넣는 걸 맵이나 셋으로 하는 법을 잘 모르겠어서 우선 이중 리스트로 합니다. id별로 넣는 걸 알려주시길 부탁드리비다!
                        break;
                    }
                }

            }
            else if(service_num==2){
                System.out.println("-------회원 전체 조회 화면입니다-------");
                for(Author author : authors){
                    author.viewAuthorAll();
                }
                System.out.println("-------회원 전체 조회 끝났습니다-------");
            }
            else if(service_num==3){
                int searchOn = 0;
                int check=1;
                System.out.println("-----회원 상세 조회 화면입니다-----");
                while(check==1){
                    System.out.println("id로 조회하신다면 1을 입력해주세요");
                    System.out.println("email로 조회하실 거면 2를 입력해주세요");
                    searchOn=Integer.parseInt(sc.nextLine());
                    if(searchOn==1){
                        System.out.println("--조회하실 ID를 입력해주세요--");
                        int searchId = Integer.parseInt(sc.nextLine());
                        for(int i=0;i<authors.size();i++){
                            if(authors.get(i).getId() == searchId) authors.get(i).viewDetailAuthor();
                        }
                    }
                    else{
                        System.out.println("--조회하실 이메일을 입력해주세요--");
                        String searchEmail = sc.nextLine();
                        for(int i=0;i<authors.size();i++){
                            if(authors.get(i).getEmail().equals(searchEmail)) authors.get(i).viewDetailAuthor();
                        }
                    }
                    System.out.println("다시 조회하고 싶다면 1을, 맞다면 2를 입력해주세요");
                    check=Integer.parseInt(sc.nextLine());
                    if(check==2)break;
                }

            }
            else if(service_num==4){
                // author 받기 : 로그인 화면(email, password)
                // author별 post 리스트 : 이중리스트
                System.out.println("----게시글 작성을 위해 로그인이 필요합니다-----");
                Author loginAuthor = null;
                while(true) {
                    for (Author author : authors) {
                        System.out.println("이메일을 입력해주세요");
                        String emailInput = sc.nextLine();
                        System.out.println("비밀번호를 입력해주세요");
                        String passwordInput = sc.nextLine();
                        if (author.getEmail().equals(emailInput) && author.getPassword().equals(passwordInput)) {
                            loginAuthor = author;
                            break;
                        }
                    }
                    if(loginAuthor !=null) break;
                    else System.out.println("다시 로그인해주세요");
                }
                System.out.println("-----게시글 작성-----");
                System.out.println("제목을 입력해주세요");
                String titleInput = sc.nextLine();
                System.out.println("내용을 입력해주세요");
                String contentsInput = sc.nextLine();
                posts.get(Math.toIntExact(loginAuthor.getId())).add(new Post(titleInput,contentsInput,loginAuthor));
            }
            else if(service_num==5){
                for(int i=0;i<authors.size();i++){
                    for(int j=0;j<posts.get(i).size();j++) posts.get(i).get(j).getPostAll();
                }
            }
            else if(service_num==6){

                for(int i=0;i<authors.size();i++){
                    for(int j=0;j<posts.get(i).size();j++) posts.get(i).get(j).getPostAll();
                }
                int searchOn = 0;
                int check=1;
                System.out.println("-----게시글 상세 조회 화면입니다-----");
                while(check==1){
                    System.out.println("id로 조회하신다면 1을 입력해주세요");
                    System.out.println("제목으로 조회하실 거면 2를 입력해주세요");
                    searchOn=Integer.parseInt(sc.nextLine());
                    if(searchOn==1){
                        System.out.println("--조회하실 ID를 입력해주세요--");
                        int searchId = Integer.parseInt(sc.nextLine());
                        for(int i=0;i<authors.size();i++){
                            for(int j=0;j<posts.get(i).size();j++)
                                if(posts.get(i).get(j).getId()==searchId)posts.get(i).get(j).getPostDetail();
                        }
                    }
                    else{
                        System.out.println("--조회하실 제목을 입력해주세요--");
                        String searchTitle = sc.nextLine();
                        for(int i=0;i<authors.size();i++){
                            for(int j=0;j<posts.get(i).size();j++)
                                if(posts.get(i).get(j).getTitle().equals(searchTitle))posts.get(i).get(j).getPostDetail();
                        }
                    }
                    System.out.println("다시 조회하고 싶다면 1을, 맞다면 2를 입력해주세요");
                    check=Integer.parseInt(sc.nextLine());
                    if(check==2)break;
                }


            }
            else{
                System.out.println("-----회원 게시글 전체 조회 화면입니다-----");
                int searchOn = 0;
                int check=1;
                System.out.println("-----회원 검색 화면입니다-----");
                while(check==1){
                    System.out.println("회원 id로 조회하신다면 1을 입력해주세요");
                    System.out.println("회원 email로 조회하실 거면 2를 입력해주세요");
                    searchOn=Integer.parseInt(sc.nextLine());
                    if(searchOn==1){
                        System.out.println("--조회하실 ID를 입력해주세요--");
                        int searchId = Integer.parseInt(sc.nextLine());
                        for(int i=0;i<authors.size();i++){
                            if(authors.get(i).getId() == searchId) for(int j=0;j<posts.get(i).size();j++){
                                posts.get(i).get(j).getPostAll();
                            }
                        }
                    }
                    else{
                        System.out.println("--조회하실 이메일을 입력해주세요--");
                        String searchEmail = sc.nextLine();
                        for(int i=0;i<authors.size();i++){
                            if(authors.get(i).getEmail().equals(searchEmail)) for(int j=0;j<posts.get(i).size();j++){
                                posts.get(i).get(j).getPostAll();
                            }
                        }
                    }
                    System.out.println("다시 조회하고 싶다면 1을, 맞다면 2를 입력해주세요");
                    check=Integer.parseInt(sc.nextLine());
                    if(check==2)break;
                }
            }
        }
    }
}



class Author{
    static long static_id = 0L;
    private long id;
    private String name;
    private String email;
    private String password;

    Author(String name, String email, String password){
        this.id = static_id;
        static_id+=1;
        this.name=name;
        this.email=email;
        this.password=password;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    public void viewAuthorAll(){
        System.out.println("--------------------");
        System.out.println("ID : "+this.id);
        System.out.println("이름 : "+this.name);
        System.out.println("이메일 : "+this.email);
        System.out.println("--------------------");
    }
    public void viewDetailAuthor(){
        System.out.println("------상세조회 화면 입니다------");
        System.out.println("ID : "+this.id);
        System.out.println("이름 : "+this.name);
        System.out.println("이메일 : "+this.email);
        System.out.println("비밀번호 : "+this.password);
        System.out.println("--------------------");
    }

}
class Post{
    static long static_id=0L;
    private long id;
    private String title;
    private String contents;
    private Author author;
    Post(String title, String contents, Author author){
        this.id=static_id;
        static_id+=1;
        this.title = title;
        this.contents=contents;
        this.author = author;
    }
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Author getAuthor() {
        return author;
    }


    public void getPostAll(){
        System.out.println("--------------------");
        System.out.println("ID : "+this.id +" | "+"제목 : "+this.title);
        System.out.println("--------------------");
    }
    public void getPostDetail(){
        System.out.println("--------------------");
        System.out.println("글 ID : "+this.id);
        System.out.println("글 제목 : "+this.title);
        System.out.println("글 내용 : "+this.contents);
        System.out.println("글 저자 정보");
        System.out.println("글 저자 ID :"+this.author.getId());
        System.out.println("글 저자 이름 : "+this.author.getName());
        System.out.println("글 저자 이메일 : "+this.author.getEmail());
        System.out.println("--------------------");
    }

}

