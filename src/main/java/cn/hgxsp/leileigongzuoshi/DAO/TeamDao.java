package cn.hgxsp.leileigongzuoshi.DAO;

import cn.hgxsp.leileigongzuoshi.entity.Bill;
import cn.hgxsp.leileigongzuoshi.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * DESC：小组DAO层
 * CREATED BY ：@hou.linan
 * CREATED DATE ：2018/10/1
 * Time : 16:38
 */
@Repository
public interface TeamDao  extends JpaRepository<Team, String> {
}
