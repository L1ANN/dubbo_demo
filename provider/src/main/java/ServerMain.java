import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 下午2:52 2018/9/23
 * @Modified By:
 */
public class ServerMain {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        context.start();
        System.in.read();
    }
}
