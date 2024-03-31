package com.anotacao.anotacao.service;

import com.anotacao.anotacao.datasource.entity.NotaEntity;

import java.util.List;

public interface NotaService {

    public NotaEntity create (String token,NotaEntity entity);
    public void delete(String token,Long id);
    public NotaEntity update (String token,Long id,NotaEntity entity);
    public NotaEntity getEntity (String token,Long id);
    public List<NotaEntity> getEntities (String token);
    public List<NotaEntity> getEntities(String token,Long idCaderno);
}
