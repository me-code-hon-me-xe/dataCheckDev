package com.project.dataCheckDev.repository;

import com.project.dataCheckDev.entity.Gmail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GmailRepository extends JpaRepository<Gmail, Integer> {


    @Query(value = "Select * from tbl_gmail g Where g.use_status = 0 Limit 1", nativeQuery = true)
    Gmail findUnusedGmail();


    @Query(value = "Update tbl_gmail g Set g.use_status = true Where id = :id", nativeQuery = true)
    void updateUsedStatusById(@Param("id") int id);
}
