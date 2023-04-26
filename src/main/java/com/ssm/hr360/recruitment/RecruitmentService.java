package com.ssm.hr360.recruitment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecruitmentService {
    @Autowired
    private RecruitmentRepository recruitmentRepository;

    public List<Recruitment> AllRecruitment(){
        return recruitmentRepository.findAll();

    }
}
