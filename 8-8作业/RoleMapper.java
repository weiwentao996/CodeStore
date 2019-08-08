package com.train.day21mybatis;

import java.util.List;

public interface RoleMapper {
    /**
     * 查找所有的role信息
     * @return
     */
    List<Role> findAllRole();

    /**
     * 根据ID查找role信息
     * @param id id
     * @return 用户
     */
    Role findRoleById(int id);

    int insertRole(Role role);
    int updateRole(Role role);
    int deleteRoleById(int id);
}
