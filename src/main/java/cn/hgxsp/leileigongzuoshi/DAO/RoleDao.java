package cn.hgxsp.leileigongzuoshi.DAO;

import cn.hgxsp.leileigongzuoshi.entity.Bill;
import cn.hgxsp.leileigongzuoshi.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * DESC：
 * CREATED BY ：@hou.linan
 * CREATED DATE ：2018/10/1
 * Time : 16:37
 */
@Repository
public interface RoleDao  extends JpaRepository<Role, Long> {
}
