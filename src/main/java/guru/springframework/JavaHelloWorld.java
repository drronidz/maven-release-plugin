package guru.springframework;

/**
 * Created by jt on 2018-12-09.
 */
public class JavaHelloWorld {
    private String name;

    public String getHello(){
        return "Hello World";
    }

    public String setHello(String helloMessage) {
        return "Hello my Brother";
    }

    public void setName(String name) {
        this.name = name;
    }

}
