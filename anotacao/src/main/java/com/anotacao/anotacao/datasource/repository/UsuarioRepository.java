package com.anotacao.anotacao.datasource.repository;

import com.anotacao.anotacao.datasource.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    Optional<UsuarioEntity> findByNomeUsuario(String nomeUsuario); //query que busca os usuarios pelo nome de usuario
}
