package com.JZhi.quartz.service;

import com.JZhi.quartz.job.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JobEntityRepository extends JpaRepository<JobEntity, Long> {
    JobEntity getById(Integer id);
}
