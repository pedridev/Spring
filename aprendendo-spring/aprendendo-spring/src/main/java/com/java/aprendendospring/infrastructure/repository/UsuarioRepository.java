package com.java.aprendendospring.infrastructure.repository;

import com.java.aprendendospring.infrastructure.entity.Usuario;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@ComponentScan("com.java.aprendendospring")
@SpringBootApplication
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
     boolean existsByEmail(String email);
}
