import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean1.getMessage());
        System.out.println(bean==bean1);

        Cat bean2 = (Cat) applicationContext.getBean("catbean");
        Cat bean3 = (Cat) applicationContext.getBean("catbean");
        System.out.println(bean2.getName());
        System.out.println(bean3.getName());
        System.out.println(bean2==bean3);

    }
}