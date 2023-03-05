package com.atguigu.imperial.court.service.api;

import com.atguigu.imperial.court.entity.Emp;

/**
 * Description:
 *
 * @Author cx
 * @Data 2023/3/5-22:23
 * @Version 2022.2 1.8
 */
public interface EmpService {
    public Emp getEmpByLoginAccount(String loginAccount, String loginPassword);
}
