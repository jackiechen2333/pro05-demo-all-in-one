package com.atguigu.imperial.court.dao.impl;

import com.atguigu.imperial.court.dao.BaseDAO;
import com.atguigu.imperial.court.dao.api.EmpDAO;
import com.atguigu.imperial.court.entity.Emp;

/**
 * Description:
 *
 * @Author cx
 * @Data 2023/3/5-20:58
 * @Version 2022.2 1.8
 */
public class EmpDAOImpl extends BaseDAO<Emp> implements EmpDAO {
    @Override
    public Emp selectEmpByLoginAccount(String loginAccount, String encodedLoginPassword) {

        // 1、编写 SQL 语句
        String sql = "select emp_id empId," +
                "emp_name empName," +
                "emp_position empPosition," +
                "login_account loginAccount," +
                "login_password loginPassword " +
                "from t_emp where login_account=? and login_password=?";

        // 2、调用父类方法查询单个对象
        return super.getSingleBean(sql, Emp.class, loginAccount, encodedLoginPassword);
    }
}