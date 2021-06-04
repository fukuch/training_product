package com.voice.fukuchproduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voice.fukuchproduct.entity.Player;
import com.voice.fukuchproduct.repository.PlayerRepository;

@Service
	public class PlayerService {
	
@Autowired
	private PlayerRepository rep;
	public Player save(Player player) {    
	return rep.save(player);
    }
	public List<Player> findAll() {
        return rep.findAll();
    }

	public Player findOne(Long id) {
        return rep.getOne(id);
    }
	
	public void delete(Long id){
		Player obj = rep.getOne(id); rep.delete(obj);
	}
}
