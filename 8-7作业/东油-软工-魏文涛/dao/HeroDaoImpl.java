package com.train.day20.dao;

import com.train.day20.base.BaseDaoImpl;
import com.train.day20.pojo.Hero;

import java.util.List;

public class HeroDaoImpl extends BaseDaoImpl implements HeroDao {
    @Override
    public List<Hero> findAll() {
        String sql ="select * from hero";
        List<Hero> list = executeQuery(sql,Hero.class);
        return list;
    }

    @Override
    public List<Hero> findBySnameLike(String sname) {
        String sql = "select * from hero where sname like ?";
        List<Hero> list = executeQuery(sql, Hero.class, sname);
        return list;
    }

    @Override
    public Hero findById(int id) {
        String sql = "select * from hero where id=?";
        List<Hero> list = executeQuery(sql, Hero.class, id);

        if(null == list || list.isEmpty()){
            return null;
        }else {
            return list.get(0);
        }
    }

    @Override
    public List<Hero> findHeroByPage(int currPage, int pageSize) {
        int currIndex = (currPage-1) * pageSize;
        String sql = "select * from hero limit ?,?";
        List<Hero> list = executeQuery(sql, Hero.class, currIndex, pageSize);
        return list;
    }

    @Override
    public int insertHero(Hero hero) {
        String sql = "insert into hero values(null,?,?,?,?)";

        return executeUpdate(sql,hero.getSno(),hero.getSname(),hero.getSsex(),hero.getSage());
    }

    @Override
    public int updateHero(Hero hero) {
        Hero hero1 = new Hero();
        hero1.setSname("DFDS");
        String sql = "update hero set ";
        // 更改需要修改的字段
        if(null != hero.getSname()){// 如果这个字段不为空，就需要修改
            sql= sql + "sname=? ";
        }
        if(null != hero.getSsex()){
            sql= sql + "ssex=? ";
        }
        return executeUpdate(sql,hero.getSno(),hero.getSname(),hero.getSsex(),hero.getSage());
    }

    @Override
    public int deleteHero(int id) {
        String sql = "delete from hero where id=?";
        return executeUpdate(sql,id);
    }
}
