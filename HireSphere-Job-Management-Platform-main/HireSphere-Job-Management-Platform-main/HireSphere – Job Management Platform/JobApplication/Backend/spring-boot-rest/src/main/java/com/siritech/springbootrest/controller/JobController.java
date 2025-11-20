package com.siritech.springbootrest.controller;

import com.siritech.springbootrest.model.JobPost;
import com.siritech.springbootrest.repo.JobRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private final JobRepo jobRepo;

    public JobController(JobRepo jobRepo) {
        this.jobRepo = jobRepo;
    }

    @GetMapping
    public List<JobPost> getAll() {
        return jobRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<JobPost> getById(@PathVariable Long id) {
        return jobRepo.findById(id);
    }

    @PostMapping
    public JobPost create(@RequestBody JobPost job) {
        return jobRepo.save(job);
    }

    @PutMapping("/{id}")
    public JobPost update(@PathVariable Long id, @RequestBody JobPost job) {
        job.setId(id);
        return jobRepo.save(job);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        jobRepo.deleteById(id);
    }
}
