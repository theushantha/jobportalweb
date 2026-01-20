package com.cash2code.jobportal.repository;

import com.cash2code.jobportal.entity.JobPostActivity;
import com.cash2code.jobportal.entity.JobSeekerApply;
import com.cash2code.jobportal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);

    void deleteByJob(JobPostActivity job);


}
