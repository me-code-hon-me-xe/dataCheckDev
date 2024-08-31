package com.project.dataCheckDev.service;

import com.project.dataCheckDev.entity.Gmail;
import com.project.dataCheckDev.entity.Profile;
import com.project.dataCheckDev.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProfileServiceImpl implements ProfileService {


    @Autowired
    GmailService gmailService;


    @Autowired
    ProfileRepository profileRepository;

    public int count = 0;
    @Override
    public void createProfile(Profile profile){

        Gmail unusedGmail = this.getUnusedEmail();
        System.out.println("Number request: " + count++ + " -> Add gmail: " + unusedGmail.getUsername());
        gmailService.updateGmail(unusedGmail);
        this.addProfile(unusedGmail.getId(), profile);
    }

    private Gmail getUnusedEmail(){
        return gmailService.findUnusedGmail();
    }


    @Override
    public void addProfile(int id, Profile profile) {
        profileRepository.insertProfile(id, profile.getLoginGmail(), profile.getLocationNetwork());
    }



}
