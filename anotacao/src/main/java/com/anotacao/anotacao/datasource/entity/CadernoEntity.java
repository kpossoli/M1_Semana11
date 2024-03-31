package com.anotacao.anotacao.datasource.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "caderno")
public class CadernoEntity  implements Serializable {
//    id, nome, id_usuario

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long caderno_id;

    @Column(name="nome", columnDefinition = "varchar(255)", nullable = false)
    private String nome;


    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id", nullable = false)
    private UsuarioEntity usuario;


    @OneToMany(mappedBy = "caderno", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<NotaEntity> notas;

    public long getCaderno_id() {
        return caderno_id;
    }

    public void setCaderno_id(long caderno_id) {
        this.caderno_id = caderno_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }
}
