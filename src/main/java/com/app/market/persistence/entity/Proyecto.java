package com.app.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "proyectos")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;

    private String descripcion;

    @Column(name = "ruta_imagen")
    private String rutaImagen;

    @Column(name = "ruta_logo")
    private String rutaLogo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public String getRutaLogo() {
        return rutaLogo;
    }

    public void setRutaLogo(String rutaLogo) {
        this.rutaLogo = rutaLogo;
    }
}
