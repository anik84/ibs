package com.iiht.training.eloan.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iiht.training.eloan.dto.UserDto;
import com.iiht.training.eloan.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

	//List<Users> findByRole(String role);
	
	
	@Query(value="select usr.role from users usr where usr.id=:userId",nativeQuery=true)
	String getRole(@Param("userId")Long userId);

	List<Users> findByRole(String role);

	
	//boolean existsByEmail(String email);

}
