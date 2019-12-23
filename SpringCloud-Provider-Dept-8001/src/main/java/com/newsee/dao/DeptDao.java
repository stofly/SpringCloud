package com.newsee.dao;

import com.newsee.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    /**
     * 添加部门信息
     * @param dept
     * @return
     */
    public boolean addDept(Dept dept);

    /**
     * 根据id查找部门
     * @param id
     * @return
     */
    public Dept findById(Long id);

    /**
     * 找到所有部门
     * @return
     */
    public List<Dept> findAll();
}
