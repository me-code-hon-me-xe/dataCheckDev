package com.project.dataCheckDev.service;

import com.project.dataCheckDev.entity.Gmail;
import com.project.dataCheckDev.entity.Profile;

public interface ProfileService {

    Profile createProfile(Profile profile);

    Profile addProfile(int id, Profile profile);
}
