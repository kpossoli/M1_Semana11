package com.anotacao.anotacao.controller;


import com.anotacao.anotacao.datasource.entity.NotaEntity;
import com.anotacao.anotacao.service.NotaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("notas")
public class NotaController {

    public NotaController(NotaService service) {
        this.service = service;
    }

    private final NotaService service;

    @GetMapping("/caderno/{id}")
    public ResponseEntity<List<NotaEntity>> getAll(
            @RequestHeader(name = "Authorization") String token,
            @PathVariable(name = "id") Long idCaderno
    ){
        return ResponseEntity.status(HttpStatus.OK).body(service.getEntities(token,idCaderno));
    }

    @GetMapping("/{id}")
    public ResponseEntity<NotaEntity> getOne(@RequestHeader(name = "Authorization") String token,
                                             @PathVariable(name = "id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.getEntity(token,id));
    }

    @PostMapping("")
    public ResponseEntity<NotaEntity> create(@RequestHeader(name = "Authorization") String token,
                                             @RequestBody NotaEntity entity){
        return ResponseEntity.status(HttpStatus.OK).body(service.create(token,entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<NotaEntity> update(@RequestHeader(name = "Authorization") String token,
                                             @PathVariable(name = "id") Long id,
                                             @RequestBody NotaEntity entity){
        return ResponseEntity.status(HttpStatus.OK).body(service.update(token,id,entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@RequestHeader(name = "Authorization") String token,
                                       @PathVariable(name = "id") Long id){
        service.delete(token,id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
