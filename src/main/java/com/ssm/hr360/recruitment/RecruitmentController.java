package com.ssm.hr360.recruitment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/recruitment")
public class RecruitmentController {

    @Autowired
    private RecruitmentService recruitmentService;


    @GetMapping
    public ResponseEntity<List<Recruitment>> getAllRecruitment(){
        return new ResponseEntity<List<Recruitment>>(recruitmentService.AllRecruitment(), HttpStatus.OK);


    }
}
