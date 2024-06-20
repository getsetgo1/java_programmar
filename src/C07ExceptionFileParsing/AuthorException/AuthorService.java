package C07ExceptionFileParsing.AuthorException;

import java.util.List;

public class AuthorService {
    private AuthorRepository repo;
    AuthorService(){
        repo= new AuthorRepository();
    }
    // 회원가입
    public void register(String name, String email, String password){
        List<Author> authorList = repo.getAuthorList();
        for(Author a:authorList) if(a.getEmail().equals(email)) throw new RuntimeException("등록된 이메일입니다.");
        if(password.length()<=5) throw new IllegalArgumentException("비밀번호는 6자 이상 입력해야합니다.");
        Author author = new Author(name,email,password);
        repo.register(author);
    }

    // 로그인
    public void login(String email, String password) throws IllegalArgumentException{
        List<Author> authorList = repo.getAuthorList();
        System.out.println(authorList);
        boolean emailNotfound = false;
        boolean passwordNorEqual = false;
        for(Author a:authorList) {
            if(a.getEmail().equals(email)){
                emailNotfound= true;
                if(a.getPassword().equals(password)) passwordNorEqual = true;
            }
        }
        if(emailNotfound == false) throw new IllegalArgumentException("없는 이메일입니다");
        if(passwordNorEqual == false) throw new IllegalArgumentException("맞는 비밀번호가 아닙니다");
    }
    // 세정님 코드
//    public Long login2(String email, String password) throws IllegalArgumentException {
//        Optional<Author> authorOpt = authorRepository.findAuthorByEmail(email);
//        Author author = authorOpt.orElseThrow(() -> new IllegalArgumentException("[Login Error] 존재하지 않는 유저입니다."));
//
//        if(!password.equals(author.getPassword())) {
//            throw new IllegalArgumentException("[Login Error] 비밀번호가 일치하지 않습니다.");
//        }
//
//        System.out.println("[Login Success] 로그인 되셨습니다.");
//        return author.getId();
//    }

}
