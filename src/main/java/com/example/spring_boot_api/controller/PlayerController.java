package com.example.spring_boot_api.controller;

import com.example.spring_boot_api.model.Player;
import com.example.spring_boot_api.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
@AllArgsConstructor
public class PlayerController {
    private final PlayerService playerService;

    @PostMapping("/signIn")
    public Player signIn(@RequestBody Player player) throws RuntimeException{
        Player p = playerService.findByPseudo(player.getPseudo());
        if (p == null) {
           playerService.createPlayer(player);
        } else {
            throw new RuntimeException("Pseudo already exist");
        }
        return player;
    }

    @GetMapping("/getAll")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayer();
    }
}
