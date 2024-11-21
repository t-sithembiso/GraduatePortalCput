package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.JobPosting;
import za.ac.cput.service.JobPostingService;

import java.util.List;

@RestController
@RequestMapping("/jobPosting")
public class JobPostingController {
    @Autowired
    private JobPostingService jobPostingService;

    @PostMapping("/create")
    public JobPosting create(@RequestBody JobPosting jobPosting){
        System.out.println("Entered create");
        return jobPostingService.create(jobPosting);
    }

    @GetMapping("/read/{jobId}")
    public JobPosting read(@PathVariable int jobId){
        return  jobPostingService.read(jobId);
    }

    @PostMapping("/update")
    public  JobPosting update(@RequestBody JobPosting jobPosting){
        return  jobPostingService.update(jobPosting);
    }

    @GetMapping("/getAll")
    public List<JobPosting> getAll(){
        return  jobPostingService.getAll();
    }
}
