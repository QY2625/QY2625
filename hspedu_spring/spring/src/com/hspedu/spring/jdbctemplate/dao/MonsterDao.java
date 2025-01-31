package com.hspedu.spring.jdbctemplate.dao;

import com.hspedu.spring.bean.Monster;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author ZhouYu
 * @version 1.0
 */
@Repository //将MonsterDao 注入到spring容器
public class MonsterDao {

    //注入一个属性
    @Resource
    private JdbcTemplate jdbcTemplate;

    //完成一个保存任务
    public void save(Monster monster) {
        //组织sql
        String sql = "insert into monster values(?,?,?)";
        int affected = jdbcTemplate.update
                (sql, monster.getMonsterId(), monster.getName(), monster.getSkill());
        System.out.println("affected= " + affected);
    }
}
