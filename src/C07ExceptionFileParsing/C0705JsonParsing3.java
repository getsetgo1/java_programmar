package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C0705JsonParsing3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        // spring에서는 RestTemplate을 통해 Http 요청하고
        // 여기서는 java에 내장된 http 클라이언트 사용
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String posts = response.body();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonList = objectMapper.readTree(posts);
//        System.out.println(posts);
        List<Post> postList = new ArrayList<>();

        for(JsonNode j : jsonList){
            Post temp = objectMapper.readValue(j.toString(), Post.class);
            postList.add(temp);
        }
        // List<Post> 객체를 json으로 직렬화
        String PostJson = objectMapper.writeValueAsString(postList);

        System.out.println(postList);

    }
}
class Post{
    private int id;
    private int userId;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    private String title;
    private String body;

    @Override
    public String toString(){
        return "유저 아이디는 " +this.userId + " 제목은 " + this.title + " 냉용은 "+this.body+"\n";
    }

}
