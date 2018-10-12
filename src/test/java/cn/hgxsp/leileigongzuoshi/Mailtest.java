package cn.hgxsp.leileigongzuoshi;

import cn.hgxsp.leileigongzuoshi.Utils.SendEmailUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * DESC：
 * CREATED BY ：@hou.linan
 * CREATED DATE ：2018/10/12
 * Time : 17:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("163")
public class Mailtest {

    @Autowired
    SendEmailUtils sendEmailUtils ;

        @Test
        public void testSendSimple() {


            sendEmailUtils.testSendSimple();

        }


}
