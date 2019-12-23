package com.newsee.service;

import com.newsee.entities.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 业务逻辑--添加部门
     * @param dept
     * @return
     */
    public boolean add(Dept dept);

    /**
     * 业务逻辑--根据id查询部门
     * @param id
     * @return
     */
    public Dept    get(Long id);

    /**
     * 业务逻辑--获取所有部门信息
     * @return
     */
    public List<Dept> list();
}
