/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestion.ecommers.modelos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
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
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrol")
    private long idrol;
    
    @Column(name = "rol")
    private String rols;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "estado")
    private int estado;
    
    //aqui le digo que un rol va a tener muchos usuarios
    @OneToMany(mappedBy = "rol",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Usuario> usuarios;
}
