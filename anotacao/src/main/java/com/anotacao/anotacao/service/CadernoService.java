package com.anotacao.anotacao.service;

import com.anotacao.anotacao.datasource.entity.CadernoEntity;

import java.util.List;

public interface CadernoService {

    public CadernoEntity create (String token,CadernoEntity entity);
    public void delete(String token,Long id);
    public CadernoEntity update (String token,Long id,CadernoEntity entity);
    public CadernoEntity getEntity (String token,Long id);
    public List<CadernoEntity> getEntities (String token);
}
