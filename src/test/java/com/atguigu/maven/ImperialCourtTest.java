package com.atguigu.maven;

import com.atguigu.imperial.court.dao.BaseDAO;
import com.atguigu.imperial.court.entity.Emp;
import com.atguigu.imperial.court.util.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

/**
 * Description:
 *
 * @Author cx
 * @Data 2023/3/5-20:11
 * @Version 2022.2 1.8
 */
public class ImperialCourtTest {

    private BaseDAO<Emp> baseDAO = new BaseDAO<>();

    @Test
    public void testsubstring(){
        String substring = "aaa.png".substring( "aaa.png".lastIndexOf("."));
        System.out.println("substring = " + substring);
    }



    @Test
    public void testGetSingleBean() {

        String sql = "select emp_id empId,emp_name empName,emp_position empPosition,login_account loginAccount,login_password loginPassword from t_emp where emp_id=?";

        Emp emp = baseDAO.getSingleBean(sql, Emp.class, 1);

        System.out.println("emp = " + emp);

    }

    @Test
    public void testGetBeanList() {

        String sql = "select emp_id empId,emp_name empName,emp_position empPosition,login_account loginAccount,login_password loginPassword from t_emp";

        List<Emp> empList = baseDAO.getBeanList(sql, Emp.class);

        for (Emp emp : empList) {
            System.out.println("emp = " + emp);
        }

    }

    @Test
    public void testUpdate() {

        String sql = "update t_emp set emp_position=? where emp_id=?";

        String empPosition = "minister";
        String empId = "3";

        int affectedRowNumber = baseDAO.update(sql, empPosition, empId);

        System.out.println("affectedRowNumber = " + affectedRowNumber);

    }

    @Test
    public void testConnection(){
        Connection connection = JDBCUtils.getConnection();
        System.out.println(connection);
//        JDBCUtils.releaseConnection(connection);
        System.out.println();
        System.out.println(connection);
    }
}
