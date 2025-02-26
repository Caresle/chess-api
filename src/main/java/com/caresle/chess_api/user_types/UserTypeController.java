package com.caresle.chess_api.user_types;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/user_type")
public class UserTypeController {
    @Autowired
    private UserTypeRepository userTypeRepository;
    
    @GetMapping("")
    public Iterable<UserType> getAll() {
        return userTypeRepository.findAll();
    }

    @PostMapping("")
    public @ResponseBody String createOne(@RequestBody UserType entity) { 
        UserType userType = new UserType();
        userType.setName(entity.getName());
        userType.setActive(entity.getActive());
        
        userTypeRepository.save(userType);
        
        return "User type saved";
    }
    
    @PutMapping("/{id}")
    public @ResponseBody String updateOne(@PathVariable String id, @RequestBody UserType entity) {
        UserType userType = userTypeRepository.findById(Integer.parseInt(id)).get();
        userType.setName(entity.getName());
        userType.setActive(entity.getActive());
        
        userTypeRepository.save(userType);
        
        return "User type updated";
    }

    @DeleteMapping("/{id}")
    public @ResponseBody String deleteOne(@PathVariable Integer id) {
        userTypeRepository.deleteById(id);
        return "User type deleted";
    }
}
