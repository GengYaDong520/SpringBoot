package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.dao.EmployeeDao;
import com.baizhi.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)  //初始化SpringBoot的配置
public class EmployeeTest {
    @Autowired
    private EmployeeDao employeeDao;
    @Test
    public void test1() {
        List<Employee> list = employeeDao.selectAll();
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
    @Test
    public void test2() {
        employeeDao.delete("4");
    }
    //我是你大爷
    /*
    你就是个沙雕
    */
    @Test
    public void test3() {
        Employee employee = new Employee("1","haha","321654",66,"女");
        employeeDao.update(employee);
    }
    @Test
    public void test4() {
        Employee employee = new Employee("4","嘻嘻","666666",55,"女");
       employeeDao.insert(employee);
    }

}
