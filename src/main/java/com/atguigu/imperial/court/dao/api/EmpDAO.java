package com.atguigu.imperial.court.dao.api;

import com.atguigu.imperial.court.entity.Emp;

/**
 * Description:
 *
 * @Author cx
 * @Data 2023/3/5-20:58
 * @Version 2022.2 1.8
 */
public interface EmpDAO {
    public Emp selectEmpByLoginAccount(String loginAccount, String encodedLoginPassword);
}
