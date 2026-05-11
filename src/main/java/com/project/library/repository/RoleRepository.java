package com.project.library.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.library.domain.Role;
import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role save(Role role);
}
