package com.anotacao.anotacao.datasource.repository;

import com.example.demo.datasource.entity.TarefaEntity;
import com.example.demo.datasource.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaEntity, Long> {
    List<TarefaEntity> findAllByUsuarioId(Long idUsuario);
}
