package com.aaa.mb.dao;

import com.aaa.mb.entity.Role;

import java.util.List;

public interface RoleDao {
    /**
     * 多对多
     * @return
     */
    List<Role> manyToMany();
}
