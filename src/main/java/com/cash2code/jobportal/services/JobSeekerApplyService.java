package com.cash2code.jobportal.services;

import com.cash2code.jobportal.entity.JobPostActivity;
import com.cash2code.jobportal.entity.JobSeekerApply;
import com.cash2code.jobportal.entity.JobSeekerProfile;
import com.cash2code.jobportal.repository.JobSeekerApplyRepository;
import com.cash2code.jobportal.repository.JobSeekerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerApplyService {

    private final JobSeekerApplyRepository jobSeekerApplyRepository;

    @Autowired
    public JobSeekerApplyService(JobSeekerApplyRepository jobSeekerApplyRepository) {
        this.jobSeekerApplyRepository = jobSeekerApplyRepository;
    }

    public List<JobSeekerApply> getCandidatesJobs(JobSeekerProfile userAccountId) {
        return jobSeekerApplyRepository.findByUserId(userAccountId);
    }

    public List<JobSeekerApply> getJobCandidates(JobPostActivity job) {
        return jobSeekerApplyRepository.findByJob(job);
    }
}
