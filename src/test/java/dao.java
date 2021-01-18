import com.hq.pojo.Books;
import com.hq.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class dao {
    @Test
    public void  ceshi(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Books> booksList = bookService.queryAllBook();
        for (Books books : booksList) {
            System.out.println(books);
        }
    }
}
