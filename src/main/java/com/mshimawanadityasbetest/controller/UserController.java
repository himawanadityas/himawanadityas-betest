package com.mshimawanadityasbetest.controller;

import com.mshimawanadityasbetest.entity.User;
import com.mshimawanadityasbetest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{accNumber}")
    public ResponseEntity<User> getByAccNumber(@RequestParam("accNumber") String accNumber) throws Exception {

            User userByAccNumber = userService.getUserByAccountNumber(accNumber);
            return ResponseEntity.ok(userByAccNumber);

    }

    @GetMapping("/{IdNumber}")
    public ResponseEntity<User> getByIdNumber(@RequestParam("idNumber") String idNumber) throws Exception {
        User userByIdNumber = userService.getUserByIdentityNumber(idNumber);
        return ResponseEntity.ok(userByIdNumber);
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody User newUser){
        userService.save(newUser);
        return ResponseEntity.ok("Save");
    }

    @PutMapping
    public ResponseEntity<User> edit(@RequestBody User newUser) {
        User user = userService.update(newUser);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@RequestParam("id") String id){
        userService.delete(Integer.valueOf(id));
    }

}
