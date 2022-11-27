package com.example.spring_boot_api.service;

import com.example.spring_boot_api.model.Player;
import com.example.spring_boot_api.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player logIn(Player player) {
        return null;
    }

    public List<Player> getAllPlayer() {
        return playerRepository.findAll();
    }

    public Player getOnePlayer(Player player) {
        return playerRepository.findById(player.getPlayerId()).orElseThrow(() -> new RuntimeException("Player not found"));
    }

    public Player findByPseudo(String pseudo) {
        return playerRepository.findByPseudo(pseudo);
    }
}
