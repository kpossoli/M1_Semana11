package com.anotacao.anotacao.datasource.entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "usuario")
public class UsuarioEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long usuario_id;

    @Column(name="nome", columnDefinition = "varchar(255)")
    private String nome;
    @Column(name="login", columnDefinition = "varchar(255) not null", unique = true)
    private String login;
    @Column(name="senha", columnDefinition = "varchar(255) not null")
    private String senha;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<CadernoEntity> cadernos;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<NotaEntity> notas;

    public long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
