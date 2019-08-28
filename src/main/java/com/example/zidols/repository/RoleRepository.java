package com.example.zidols.repository;

import com.example.zidols.model.RoleName;
import com.example.zidols.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
