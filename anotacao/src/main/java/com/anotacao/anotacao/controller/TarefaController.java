package com.anotacao.anotacao.controller;

import com.example.demo.controller.dto.request.InserirTarefaRequest;
import com.example.demo.controller.dto.response.TarefaResponse;
import com.example.demo.service.TarefaService;
import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("tarefas")
public class TarefaController {

    private final TarefaService tarefaService;

    @GetMapping
    public ResponseEntity<List<TarefaResponse>> retornarTarefas(
            @RequestHeader(name = "Authorization") String token // Bearer ahsdjkahkjdahjksd
    ){
        String tokenReal = token.split(" ")[1];
        return ResponseEntity.ok(tarefaService.retornaTarefas(token.substring(7)));
    }

    @PostMapping
    public ResponseEntity<TarefaResponse> retornarTarefas(
            @RequestHeader(name = "Authorization") String token, // Bearer ahsdjkahkjdahjksd
            @RequestBody InserirTarefaRequest incluiTarefaRequest
    ){
        return ResponseEntity.ok(tarefaService.salvaTarefa(incluiTarefaRequest,token.substring(7)));
    }
}
