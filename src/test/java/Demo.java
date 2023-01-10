import com.service.AccountServcie;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    @Test
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
        AccountServcie as = app.getBean(AccountServcie.class);
        as.transfor2("mary", "tom", 15.0);
    }
}
