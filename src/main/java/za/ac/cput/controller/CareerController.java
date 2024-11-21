package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import za.ac.cput.domain.Career;
import za.ac.cput.service.CareerService;


import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/career")
public class CareerController {
    @Autowired
    private CareerService careerService;

    @PostMapping("/create")
    public Career create(@RequestParam("eventName") String eventName,
                         @RequestParam("date") String date,
                         @RequestParam("time") String time,
                         @RequestParam("location") String location,
                         @RequestParam("employers") String employers,
                         @RequestParam("description") String description,
                         @RequestParam("image") MultipartFile image) {
        // Convert the MultipartFile to byte[]
        byte[] imageBytes = null;
        try {
            imageBytes = image.getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create the Career object using the builder pattern
        Career career = new Career.Builder()
                .setEventName(eventName)
                .setDate(date)
                .setTime(time)
                .setLocation(location)
                .setEmployers(employers)
                .setDescription(description)
                .setImage(imageBytes)  // Set the image byte array
                .build();

        return careerService.create(career);
    }

    @GetMapping("/read/{careerId}")
    public Career read(@PathVariable int careerId){
        return  careerService.read(careerId);
    }

    @PostMapping("/update")
    public  Career update(@RequestBody Career career){
        return  careerService.update(career);
    }

    @GetMapping("/getAll")
    public List<Career> getAll(){
        return  careerService.getAll();
    }
}
