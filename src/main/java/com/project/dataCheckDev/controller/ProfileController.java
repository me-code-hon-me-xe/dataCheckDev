package com.project.dataCheckDev.controller;

import com.project.dataCheckDev.entity.Gmail;
import com.project.dataCheckDev.entity.Profile;
import com.project.dataCheckDev.service.GmailService;
import com.project.dataCheckDev.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api")
public class ProfileController {

    public Integer Thread = 0;

    @Autowired
    private GmailService gmailService;
    @Autowired
    private ProfileService profileService;

    @PostMapping("/createGmail")
    public ResponseEntity<Gmail> createGmail(@RequestBody Gmail gmail) {
        Gmail savedGmail = gmailService.createGmail(gmail);
        return new ResponseEntity<>(savedGmail, HttpStatus.CREATED);
    }

    @GetMapping("/gmails/{id}")
    public ResponseEntity<Gmail> getGmailById(@PathVariable("id") Integer gmailId) {
        Gmail gmail = gmailService.findById(gmailId);
        System.out.println(gmail.getUsername());
        return new ResponseEntity<>(gmail, HttpStatus.OK);
    }

    @PostMapping(value = "/createProfile")
    public synchronized void createProfile(Profile profile) {
        profileService.createProfile(profile);
    }
}
