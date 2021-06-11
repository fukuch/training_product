package com.voice.fukuchproduct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voice.fukuchproduct.entity.Login;
import com.voice.fukuchproduct.repository.LoginRepository;

@Service
/*@Transactional*/
public class LoginService {
 @Autowired
 private LoginRepository rep;
 public Login search(String userName,String password){
	 return rep.search(userName,password);
 }
 
}