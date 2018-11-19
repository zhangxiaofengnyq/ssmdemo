package com.aaa.sm.service;

import com.aaa.sm.dao.EmpDao;
import com.aaa.sm.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * className:EmpServiceImpl
 * discription:
 * author:Ryb
 * createTime:2018-11-09 16:16
 */
@Service
@Transactional
public class EmpServiceImpl implements EmpService{

    @Autowired
    private EmpDao empDao;

    /**
     *
     * @param map
     * @return
     */
    @Override
    public List<Emp> getList(Map map) {
        map.put("sort",map.get("sort")==null?"empno":map.get("sort"));
        map.put("order",map.get("order")==null?"asc":map.get("order"));
        return empDao.getList(map);
    }

    @Override
    public int add(Map map) {
        return empDao.add(map);
    }

    @Override
    public int delete(int empNo) {
        return empDao.delete(empNo);
    }

    @Override
    public List<Emp> selectById(Integer empNo) {
        return empDao.selectById(empNo);
    }

    @Override
    public int update(Emp emp) {
        return empDao.update(emp);
    }

    @Override
    public int select(Integer empNo, String name) {
        return empDao.select(empNo,name);
    }

    @Override
    public List<Emp> getProListByDeptNo(Integer deptNo) {
        Map map = new HashMap();
        map.put("deptNo",deptNo);
        //调用了根据存储过程获取列表的方法之后
        empDao.getProListByDeptNo(map);
        //调用返回结果
        List<Emp> csrEmp = (List<Emp>) map.get("csrEmp");
        return csrEmp;
    }
}
