package C07ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepository {
    List<Author> authorList;
    AuthorRepository(){
        authorList= new ArrayList<>();
    }

    public void register(Author author){
        this.authorList.add(author);
    }

    public List<Author> getAuthorList() {
        return authorList;
    }
    //상민님 코드
//    public Optional<Author> findByEmail(String email) {
//        return authorList.stream().filter(author -> author.getEmail().equals(email)).findFirst();
//    }

    // 세정이 코드
//    public Optional<Author> findAuthorByEmail(String email) {
//        for (Author author : authorList) {
//            if(email.equals(author.getEmail())) {
//                return Optional.of(author);
//            }
//        }
//        return Optional.empty();
//    }
}
