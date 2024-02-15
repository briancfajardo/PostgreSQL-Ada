package org.eci.ada.postgreSQLDemo.repository;

import org.eci.ada.postgreSQLDemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}