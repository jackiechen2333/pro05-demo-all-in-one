package com.atguigu.imperial.court.dao.api;

import com.atguigu.imperial.court.entity.Memorials;

import java.util.List;

/**
 * Description:
 *
 * @Author cx
 * @Data 2023/3/5-20:59
 * @Version 2022.2 1.8
 */
public interface MemorialsDAO {
    public void updateMemorialsFeedBack(String memorialsId, String feedbackContent);
    public Memorials selectMemorialsById(String memorialsId);
    public void updateMemorialsStatusToRead(String memorialsId);
    public List<Memorials> selectAllMemorialsDigest();
}
