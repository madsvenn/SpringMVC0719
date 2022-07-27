import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huayu.entity.*;
import com.huayu.mapper.PartsMapper;
import com.huayu.mapper.PartsrepertoryMapper;
import com.huayu.service.BillService;
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
import java.util.Map;

public class UserTest {

    OrderService orderService;
    UserService service;
    PartsService dao;
    BillService billService;

    @Before
    public void init(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        service = context.getBean(UserService.class);
        dao = context.getBean(PartsService.class);
        orderService = context.getBean(OrderService.class);
        billService = context.getBean(BillService.class);
    }

    @Test
    public void select_test(){

//        List<Partsrepbill> list = billService.select_bill(Partsrepbill.builder()
//                .codename("")
//                .partsname("")
//                .typename("")
//                .build());
//        list.forEach(System.out::println);

//        String code = "入库";
//        System.out.println(code.length());
        String codename = "入库";
        String partsname = "滤清器件";
        String typename = "采购入库";
        String billtime = "2018-04-04";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(billtime);
        } catch (ParseException e) {
            System.out.println("转失败");
        }
        System.out.println(date);
        List<Partsrepbill> list = null;
        list = billService.select_bill(Partsrepbill.builder()
                .codename(codename)
                .partsname(partsname)
                .typename(typename)
                .billtime(date)
                .build());
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


    @Test
    public void billselect_id(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        PartsrepertoryMapper mapper = context.getBean(PartsrepertoryMapper.class);
        PartsrepertoryExample example = new PartsrepertoryExample();
        List<Map<String,Object>> list = mapper.selectRepertoryByExamole(example);
//        List<>
        list.forEach(x-> System.out.println(x.get("partsName")));
    }
}
