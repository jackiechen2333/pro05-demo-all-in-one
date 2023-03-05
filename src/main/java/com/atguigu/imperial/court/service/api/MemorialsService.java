package com.atguigu.imperial.court.service.api;

import com.atguigu.imperial.court.entity.Memorials;

import java.util.List;

/**
 * Description:
 *
 * @Author cx
 * @Data 2023/3/5-22:59
 * @Version 2022.2 1.8
 */
public interface MemorialsService {

    public void updateMemorialsFeedBack(String memorialsId, String feedbackContent);

    public Memorials getMemorialsDetailById(String memorialsId);

    public void updateMemorialsStatusToRead(String memorialsId);

    public List<Memorials> getAllMemorialsDigest();
}
