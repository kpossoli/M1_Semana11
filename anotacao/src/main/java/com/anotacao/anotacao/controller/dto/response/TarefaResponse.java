package com.anotacao.anotacao.controller.dto.response;

public record TarefaResponse(Long id,
                             String titulo,
                             String descricao,
                             Boolean finalizada
) {
}
