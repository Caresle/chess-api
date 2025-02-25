package com.caresle.chess_api.game_mode;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class GameModeController {
    @Autowired
    private GameModeRepository gameModeRepository;

    @GetMapping("/api/gamemode")
    public @ResponseBody Iterable<GameMode> getGameModes(@RequestParam(required = false, defaultValue = "") String param) {
        return gameModeRepository.findAll();
    }
    
}
