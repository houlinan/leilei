package cn.hgxsp.leileigongzuoshi.DAO;

import cn.hgxsp.leileigongzuoshi.entity.AccountNum;
import cn.hgxsp.leileigongzuoshi.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * DESC：账号DAO层
 * CREATED BY ：@hou.linan
 * CREATED DATE ：2018/10/1
 * Time : 16:34
 */
@Repository
public interface AccountNumDao  extends JpaRepository<AccountNum, Long> {

    List<AccountNum> findAccountNumByFromTeam(Team team) ;

    AccountNum findAccountNumByNumber(String number );

    @Query(value = "select DISTINCT t.number from account_num t where t.from_team_id = ?" ,nativeQuery = true)
    List<String> findAllUserNamebyFromTeam(String teamId);
}
