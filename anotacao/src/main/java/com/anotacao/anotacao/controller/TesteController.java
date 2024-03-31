package com.anotacao.anotacao.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("teste")
public class TesteController {

    @GetMapping
    public ResponseEntity testeGet(){
        return ResponseEntity.ok("teste get");
    }

    @PostMapping
    public ResponseEntity testePost(){
        return ResponseEntity.ok("teste post");
    }
    @DeleteMapping
    public ResponseEntity testeDelete(){
        return ResponseEntity.ok("teste delete");
    }
    @PutMapping
    public ResponseEntity testePut(){
        return ResponseEntity.ok("teste put");
    }
}
