package cn.hgxsp.leileigongzuoshi.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


/**
 * DESC：邮件发送工具类
 * CREATED BY ：@hou.linan
 * CREATED DATE ：2018/10/12
 * Time : 17:30
 */
@Component
public class SendEmailUtils {


    @Autowired
    JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String username;

    public void testSendSimple() {
        SimpleMailMessage message = new SimpleMailMessage();
        System.out.println(username);
        message.setFrom(username);
        message.setTo("2929452@qq.com");
        message.setSubject("标题：测试标题");
        message.setText("测试内容部份");
        System.out.println(message);
        javaMailSender.send(message);
    }


}
