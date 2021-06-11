package com.voice.fukuchproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voice.fukuchproduct.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {

public Player getOne(Long id);

}
