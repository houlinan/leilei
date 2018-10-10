package cn.hgxsp.leileigongzuoshi.DAO;



import cn.hgxsp.leileigongzuoshi.entity.AccountNum;
import cn.hgxsp.leileigongzuoshi.entity.Bill;
import cn.hgxsp.leileigongzuoshi.entity.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * DESC：账单收入DAO层
 * CREATED BY ：@hou.linan
 * CREATED DATE ：2018/10/1
 * Time : 16:36
 */
@Repository
public interface BillDao extends JpaRepository<Bill, Long> {


    Page<Bill> findAllByFromAccountNum(AccountNum accountNum , Pageable pageable ) ;

    List<String> findOperUserNameByTeam(Team team ) ;

}
