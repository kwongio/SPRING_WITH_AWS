package com.example.spring_with_aws;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/")
    public ResponseEntity<?> hi(){
        User user = new User(1L, "name");
        return ResponseEntity.ok(user);
    }

    @PostMapping("/test")
    public ResponseEntity<?> user(){
        return ResponseEntity.ok("get a post request");
    }

    @PutMapping("/test")
    public ResponseEntity<?> ser(){
        return ResponseEntity.ok("get a post request");
    }

    @DeleteMapping("/test")
    public ResponseEntity<?> test(){
        return ResponseEntity.ok("get a post request");
    }

    private static class User {
        private Long id;
        private String name;

        public User(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
