package com.project.dataCheckDev.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_gmail")
public class Gmail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    // tai khoan gmail
    @Column(length = 255)
    private String username;

    // mat khau gmail
    @Column(length = 255)
    private String password;

    //  tai khoan mail khoi phuc
    @Column(length = 255)
    private String mailRecovery;


    @Column(length = 1, columnDefinition = "BIT default false")
    private Boolean useStatus;

    @Column(length = 200)
    private String createdBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(columnDefinition="DATETIME")
    private LocalDateTime createdDate;

    @Column(length = 200)
    private String updatedBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(columnDefinition="DATETIME")
    private LocalDateTime updatedDate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMailRecovery() {
        return mailRecovery;
    }

    public void setMailRecovery(String mailRecovery) {
        this.mailRecovery = mailRecovery;
    }

    public Boolean getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Boolean useStatus) {
        this.useStatus = useStatus;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

}
