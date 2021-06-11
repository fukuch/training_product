package com.voice.fukuchproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.voice.fukuchproduct.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Long>{
	/*public Login search(Long id,String userName,String password);*/
	
	@Query(value="SELECT id,user_name,password FROM login_list WHERE user_name=:userName AND password=:password",nativeQuery = true)
	public Login search (@Param("userName") String userName,@Param("password") String password);
}