package com.project.dataCheckDev.repository;

import com.project.dataCheckDev.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {


    @Query(value = "insert into tbl_profile (gmail_id, login_gmail) values (:gmail_id, :login_gmail)", nativeQuery = true)
    Profile insertProfile(@Param("gmail_id") Integer gmailId, @Param("login_gmail") Boolean loginGmail);


}
