package cn.acyou.diana.activity.test;

import cn.acyou.diana.activity.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author youfang
 * @version [1.0.0, 2019-02-22 下午 01:57]
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class DianaActivityApplicationTests {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void test1(){
        System.out.println(("----- selectAll method test ------"));
    }
}
