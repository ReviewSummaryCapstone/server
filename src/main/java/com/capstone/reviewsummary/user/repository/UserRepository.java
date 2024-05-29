package com.capstone.reviewsummary.user.repository;

import com.capstone.reviewsummary.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findBySocialId(String socialId);
    Optional<User> findByRefreshToken(String refreshToke);

}
