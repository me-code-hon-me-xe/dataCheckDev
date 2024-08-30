package com.project.dataCheckDev.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "tbl_profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 1, columnDefinition = "BIT default false")
    private Boolean loginGmail;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "gmail_id")
//    private Gmail gmail;

    @Column(length = 11)
    private int gmailId;

    @Column(length = 255)
    private String profileUuid;

    @Column(length = 200)
    private String locationNetwork;

    @Column(length = 100)
    private String networkType;

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

    public int getGmailId() {
        return gmailId;
    }

    public void setGmailId(int gmailId) {
        this.gmailId = gmailId;
    }

    //    public Gmail getGmail() {
//        return gmail;
//    }
//
//    public void setGmail(Gmail gmail) {
//        this.gmail = gmail;
//    }

    public Boolean getLoginGmail() {
        return loginGmail;
    }

    public void setLoginGmail(Boolean loginGmail) {
        this.loginGmail = loginGmail;
    }

    public String getLocationNetwork() {
        return locationNetwork;
    }

    public void setLocationNetwork(String locationNetwork) {
        this.locationNetwork = locationNetwork;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
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

    public String getProfileUuid() {
        return profileUuid;
    }

    public void setProfileUuid(String profileUuid) {
        this.profileUuid = profileUuid;
    }
}
