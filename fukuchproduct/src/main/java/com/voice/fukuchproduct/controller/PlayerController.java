package com.voice.fukuchproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.voice.fukuchproduct.entity.Player;
import com.voice.fukuchproduct.service.PlayerService;

@Controller
public class PlayerController {
	@Autowired
    private PlayerService service;
	
	@GetMapping("/players/new")
	public String newPlayer(Model model) {
		return "new";
	}

	@PostMapping("/players")
	public String create(@ModelAttribute Player player) {
		System.out.print("players");
		service.save(player);
			return "redirect:/players";
	}
	
	@GetMapping("/players")
    public String index(Model model) {
        List<Player> players = service.findAll();
        model.addAttribute("players", players);
        	return "index";
    }
	
	@GetMapping("/players/{id}")
    public String show(@PathVariable Long id, Model model) {
        Player player = service.findOne(id);
        model.addAttribute("player", player);
        return "show";
    }
	@GetMapping("/players/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        Player player = service.findOne(id);
        model.addAttribute("player", player);
        return "edit";
    }
	@PostMapping("/players/{id}")
    public String update(@PathVariable Long id, @ModelAttribute Player player) {
        player.setId(id);
        service.save(player);
        return "redirect:/players";
    }
	@DeleteMapping("/players/{id}")
    public String destroy(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/players";
    }
}
