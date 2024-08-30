package com.project.dataCheckDev.service;

import com.project.dataCheckDev.entity.Profile;
import com.project.dataCheckDev.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProfileServiceImpl implements ProfileService{


    @Autowired
    ProfileRepository profileRepository;

    @Override
    public Profile createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public Profile addProfile(int id, Profile profile) {
        return profileRepository.insertProfile(id, profile.getLoginGmail());
    }


}
