package com.cocktailz.cocktailzclean.repository;

import com.cocktailz.cocktailzclean.Entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
