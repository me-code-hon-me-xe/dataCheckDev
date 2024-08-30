package com.project.dataCheckDev.service;

import com.project.dataCheckDev.entity.Gmail;

import java.util.List;

public interface GmailService {
    Gmail createGmail(Gmail gmail);
    Gmail findById(Integer id);
    void deleteGmailById(Integer id);
    Gmail updateGmail(Gmail gmail);
    List<Gmail> getAllGmail();
    Gmail findUnusedGmail();

    void updateUsedStatusById(int id);
}
