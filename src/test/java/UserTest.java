import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huayu.entity.*;
import com.huayu.mapper.PartsMapper;
import com.huayu.service.OrderService;
import com.huayu.service.PartsService;
import com.huayu.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class UserTest {

    OrderService orderService;
    UserService service;
    PartsService dao;

    @Before
    public void init(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        service = context.getBean(UserService.class);
        dao = context.getBean(PartsService.class);
        orderService = context.getBean(OrderService.class);
    }

    @Test
    public void select_test(){
        List<User> list = service.selectAll();
        list.forEach(System.out::println);
    }
    @Test
    public void select_test1(){

//        PageHelper.startPage(1,10);
//        List<Parts> list = dao.selectByKey("");
//        PageInfo<Parts> pageInfo = new PageInfo<>(list);
//
//        System.out.println(pageInfo);
//        System.out.println(pageInfo.getTotal());
//        System.out.println(pageInfo.getPageNum());
//        System.out.println(pageInfo.getPageSize());
//        pageInfo.getList().forEach(System.out::println);

        PageHelper.startPage(1,10);
        List<Partsrepertory> list = dao.selectRepertory(null);
        PageInfo<Partsrepertory> pageInfo = new PageInfo<>(list);
        list.forEach(System.out::println);
        System.out.println(pageInfo);
        System.out.println(pageInfo.getTotal());
    }

    @Test
    public void orderselect_test(){
        List<Order> list = orderService.selectAll();
        list.forEach(System.out::println);
    }

    @Test
    public void orderSelectByParam_test(){
        Date date = new Date();
        String d = "2019-06-13";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = sdf.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<Order> list = orderService.selectByParam("DD2011103001",date,"待审核");
        list.forEach(System.out::println);
    }


    @Test
    public void orderselect_id(){
        System.out.println(orderService.selectById(1));
    }
}
