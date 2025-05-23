package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Profile;
import com.bezkoder.springjwt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    Optional<Profile> findByUser(User user);
    boolean existsByUser(User user);
}