package com.anotacao.anotacao.datasource.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "nota")
public class NotaEntity implements Serializable {

//    Nota: id, title, content, id_caderno, id_usuario;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long nota_id;

    @Column(name="titulo", columnDefinition = "varchar(255)", nullable = false)
    private String titulo;

    @Column(name="conteudo", columnDefinition = "varchar(600)", nullable = false)
    private String conteudo;

    @JsonIgnore
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id", nullable = false)
    private UsuarioEntity usuario;


    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "caderno_id", nullable = false)
    private CadernoEntity caderno;


    public long getNota_id() {
        return nota_id;
    }

    public void setNota_id(long nota_id) {
        this.nota_id = nota_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }

    public CadernoEntity getCaderno() {
        return caderno;
    }

    public void setCaderno(CadernoEntity caderno) {
        this.caderno = caderno;
    }
}
