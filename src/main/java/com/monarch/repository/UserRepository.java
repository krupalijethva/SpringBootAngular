package com.monarch.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.monarch.model.User;
 

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByusername(String name);

}