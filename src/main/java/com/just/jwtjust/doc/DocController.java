package com.just.jwtjust.doc;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/doc")
public class DocController {
    @GetMapping
    public String getDoc(){
        return "Doc get";
    }

    @PostMapping
    public String postDoc(){
        return "Doc post";
    }

    @PutMapping
    public String putDoc(){
        return "Doc put";
    }

    @DeleteMapping
    public String deleteDoc(){
        return "Doc delete";
    }
}
