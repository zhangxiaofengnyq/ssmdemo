package com.aaa.sm.service;

import com.aaa.sm.entity.Emp;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

/**
 * className:EmpService
 * discription:
 * author:Ryb
 * createTime:2018-11-09 16:15
 */
public interface EmpService {
    /**
     * 员工列表方法
     * @param map
     * @return
     */
    List<Emp> getList(Map map);

    /**
     * 添加员工
     * @return
     */
    int add(Map map);

    /**
     * 删除
     * @return
     */
    int delete(int empNo);

    /**
     * 根据empNo查询
     * @param empNo
     * @return
     */
    List<Emp> selectById(Integer empNo);

    int update(Emp emp);

    /**
     * 查询登录
     * @param empNo
     * @param name
     * @return
     */
    int select(Integer empNo,String name);

    /**
     * 调用存储过程，根据部门编号获取人员列表
     * @param map
     * @return
     */
    List<Emp> getProListByDeptNo(Integer deptNo);
}
