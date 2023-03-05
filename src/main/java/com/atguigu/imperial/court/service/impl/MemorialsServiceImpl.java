package com.atguigu.imperial.court.service.impl;

import com.atguigu.imperial.court.dao.api.MemorialsDAO;
import com.atguigu.imperial.court.dao.impl.MemorialsDAOImpl;
import com.atguigu.imperial.court.entity.Memorials;
import com.atguigu.imperial.court.service.api.MemorialsService;

import java.util.List;

/**
 * Description:
 *
 * @Author cx
 * @Data 2023/3/5-22:59
 * @Version 2022.2 1.8
 */
public class MemorialsServiceImpl implements MemorialsService {

    private MemorialsDAO memorialsDao = new MemorialsDAOImpl();

    @Override
    public void updateMemorialsFeedBack(String memorialsId, String feedbackContent) {
        memorialsDao.updateMemorialsFeedBack(memorialsId, feedbackContent);
    }

    @Override
    public void updateMemorialsStatusToRead(String memorialsId) {
        memorialsDao.updateMemorialsStatusToRead(memorialsId);
    }

    @Override
    public Memorials getMemorialsDetailById(String memorialsId) {

        return memorialsDao.selectMemorialsById(memorialsId);

    }

    @Override
    public List<Memorials> getAllMemorialsDigest() {
        return memorialsDao.selectAllMemorialsDigest();
    }
}
