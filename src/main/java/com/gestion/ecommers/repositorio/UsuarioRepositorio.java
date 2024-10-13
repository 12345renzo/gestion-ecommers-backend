/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gestion.ecommers.repositorio;

import com.gestion.ecommers.modelos.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Humberto
 */
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
    Optional<Usuario> findByUsuario(String usuario);
}
