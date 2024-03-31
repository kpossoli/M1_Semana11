package com.anotacao.anotacao.datasource.repository;

import com.anotacao.anotacao.datasource.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    public UsuarioEntity findByLogin(String Login);
}
