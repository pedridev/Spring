package com.java.aprendendospring.infrastructure.repository;

import com.java.aprendendospring.infrastructure.entity.Usuario;
import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
     boolean existsByEmail(String email);
}
