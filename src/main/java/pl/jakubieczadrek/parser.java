package pl.jakubieczadrek;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

public class parser {
    @Bean
    public static void main(String[] args) throws IOException {
        new parser().getArticles("https://drive.google.com/file/d/10wxYepkZdfkv2fRSyV8E8iJl0NnMnQKY/view?usp=sharing");
    }

    private void getArticles(String string) throws IOException {
        try {
            Document documents = Jsoup.connect("https://drive.google.com/file/d/10wxYepkZdfkv2fRSyV8E8iJl0NnMnQKY/view?usp=sharing").get();
            System.out.println(documents);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
