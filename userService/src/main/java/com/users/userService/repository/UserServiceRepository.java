package com.users.userService.repository;

import com.users.userService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserServiceRepository extends JpaRepository<User, Long> {

}
