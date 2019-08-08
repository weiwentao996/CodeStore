package com.train.day19.homework;

import java.util.List;

public interface HeroFindable {
    /**
     * 根据名字模糊查询英雄
     * @param sname 名字包含字段
     * @return 匹配的结果
     */
    List<Hero> findByUserNameLike(String sname);

    /**
     * 按照 sname字段对查询列表进行排序（降序）
     * @return
     */
    List<Hero> findOrderByUserName();

    /**
     *分页模糊查询（获取第二页数据的操作（每页显示2条））
     * @param sname 英雄名
     * @param currPage 当前页
     * @param pageSize 每页显示的数量
     * @return
     */
    List<Hero> findByUserNameLikeOrderLimit(String sname,int currPage, int pageSize);
}
