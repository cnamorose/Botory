//user 엔티티를 데이터베이스에 저장,조회,삭제,수정할 수 있게
package com.botory.repository;

import com.botory.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
