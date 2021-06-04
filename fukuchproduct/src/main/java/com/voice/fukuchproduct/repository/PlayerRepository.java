package com.voice.fukuchproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.voice.fukuchproduct.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

public Player getOne(Long id);

/*
 * @Modifying
 * 
 * @Query{Value ="DELETE FROM player WHERE id = id"},nativeQuery
 */
}
