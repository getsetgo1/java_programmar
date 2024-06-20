package C07ExceptionFileParsing.AuthorException;
// Author 엔티티
//  - id,name,email,password
//  - 생성자에서 초기화, getter로만 구성

public class Author {
    static int static_id =0;
    private int id;

    public int getId() {
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

    public Author(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = static_id++;
    }


    private String name;
    private String email;
    private String password;
}
