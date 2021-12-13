import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Hello;

public class Test {
//    @org.junit.Test
//    public void Test(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Hello hello  = (Hello) context.getBean("hello3");
//        System.out.println(hello);
//    }

    @org.junit.Test
    public void Tests(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("helloDog");
        hello.getDog().jiao();
    }
}
