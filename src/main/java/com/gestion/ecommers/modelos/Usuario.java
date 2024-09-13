/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestion.ecommers.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Humberto
 */

@AllArgsConstructor //genera el constructor
@NoArgsConstructor //este constructor no recibe parametro
@Data //genera geter y seter
@Entity //este ase llamar a la entidad
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private long idusuario;
    
    @Column(name = "correo")
    private String correo;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "fechaCreacion")
    private Date fechaCreacion;
    
    @Column(name = "estado")
    private int estado;
   
    //aki le digo que muchos usuarios tendran un solo rol
    @ManyToOne
    @JoinColumn(name = "idrol", referencedColumnName = "idrol")
    private Rol rol;
