package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Career;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.JobPosting;
import za.ac.cput.service.CareerService;
import za.ac.cput.service.ContactService;
import za.ac.cput.service.JobPostingService;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @PostMapping("/create")
    public Contact create(@RequestBody Contact contact){
        System.out.println("Entered create");
        return contactService.create(contact);
    }

    @GetMapping("/read/{contactId}")
    public Contact read(@PathVariable int contactId){
        return  contactService.read(contactId);
    }

    @PostMapping("/update")
    public  Contact update(@RequestBody Contact contact){
        return  contactService.update(contact);
    }

    @GetMapping("/getAll")
    public List<Contact> getAll(){
        return  contactService.getAll();
    }
}
