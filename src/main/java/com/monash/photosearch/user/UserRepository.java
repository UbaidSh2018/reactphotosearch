package com.monash.photosearch.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

   public User findByEmail(String email);
}
