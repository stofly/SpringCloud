package com.newsee.controller;

import com.newsee.entities.Dept;
import com.newsee.service.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "部门相关API")
@RestController
public class DeptController {
    @Autowired
    private DeptService service;

    @ApiOperation(value = "添加部门信息")
    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    @ApiImplicitParams(@ApiImplicitParam(name = "dname", value = "部门名称", required = true, dataType = "String", paramType = "path"))
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @ApiOperation(value = "根据id获取部门信息")
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    @ApiImplicitParam(name = "id", value = "部门id", required = true, dataType = "int", paramType = "path")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @ApiOperation(value = "获取所有部门信息")
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return service.list();
    }

}
