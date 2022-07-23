import com.huayu.entity.Parts;
import com.huayu.entity.User;
import com.huayu.service.PartsService;
import com.huayu.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {

    UserService service;
    PartsService dao;

    @Before
    public void init(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        service = context.getBean(UserService.class);
        dao = context.getBean(PartsService.class);
    }

    @Test
    public void select_test(){
        List<User> list = service.selectAll();
        list.forEach(System.out::println);
    }
    @Test
    public void select_test1(){
        List<Parts> list = dao.selectAll();
        list.forEach(x->{
            if(x.getPartsprodate()!=null){
                System.out.println(x.getPartsprodate());
            }
        });
    }
}
