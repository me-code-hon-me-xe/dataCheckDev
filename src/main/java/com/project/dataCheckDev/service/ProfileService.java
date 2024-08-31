package com.project.dataCheckDev.service;

import com.project.dataCheckDev.entity.Gmail;
import com.project.dataCheckDev.entity.Profile;

import java.io.IOException;
import java.nio.file.AccessDeniedException;

public interface ProfileService {

    void createProfile(Profile profile);

    void addProfile(int id, Profile profile);



}
