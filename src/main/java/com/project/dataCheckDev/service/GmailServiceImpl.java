package com.project.dataCheckDev.service;

import com.project.dataCheckDev.entity.Gmail;
import com.project.dataCheckDev.repository.GmailRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GmailServiceImpl implements GmailService{

    @Autowired
    private GmailRepository gmailRepository;

    @Override
    public Gmail createGmail(Gmail gmail) {
        return gmailRepository.save(gmail);
    }

    @Override
    @Transactional
    public Gmail findById(Integer id) {
        return gmailRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteGmailById(Integer id) {
        gmailRepository.deleteById(id);
    }

    @Override
    public Gmail updateGmail(Gmail gmail) {
        Gmail exitingGmail = gmailRepository.findById(gmail.getId()).get();
        exitingGmail.setId(gmail.getId());
        exitingGmail.setUsername(gmail.getUsername());
        exitingGmail.setPassword(gmail.getPassword());
        exitingGmail.setUseStatus(true);
        exitingGmail.setMailRecovery(gmail.getMailRecovery());
        exitingGmail.setCreatedBy(gmail.getCreatedBy());
        exitingGmail.setCreatedDate(gmail.getCreatedDate());
        exitingGmail.setUpdatedBy(gmail.getUpdatedBy());
        exitingGmail.setUpdatedDate(gmail.getUpdatedDate());

        Gmail updatedGmail = gmailRepository.save(exitingGmail);
        return updatedGmail;
    }

    @Override
    public List<Gmail> getAllGmail() {
        return gmailRepository.findAll();
    }

    @Override
    public Gmail findUnusedGmail() {
        return gmailRepository.findUnusedGmail();
    }

    @Override
    public void updateUsedStatusById(int id) {
        gmailRepository.updateUsedStatusById(id);
    }


}
