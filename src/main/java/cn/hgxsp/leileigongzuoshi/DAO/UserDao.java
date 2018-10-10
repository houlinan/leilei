package cn.hgxsp.leileigongzuoshi.DAO;

import cn.hgxsp.leileigongzuoshi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * DESC：用户DAO层
 * CREATED BY ：@hou.linan
 * CREATED DATE ：2018/10/1
 * Time : 16:33
 */
@Repository
public interface UserDao  extends JpaRepository<User, String> {


    User findUserByUserName(String userName);

}
