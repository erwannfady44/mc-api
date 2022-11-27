package com.example.spring_boot_api.repository;

import com.example.spring_boot_api.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findByPseudo(String pseudo);
}
