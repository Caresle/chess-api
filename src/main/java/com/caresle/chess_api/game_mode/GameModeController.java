package com.caresle.chess_api.game_mode;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class GameModeController {
    @Autowired
    private GameModeRepository gameModeRepository;

    @GetMapping("/api/gamemode")
    public @ResponseBody Iterable<GameMode> getGameModes(@RequestParam(required = false, defaultValue = "") String param) {
        return gameModeRepository.findAll();
    }
    
    @PostMapping("/api/gamemode")
    public @ResponseBody String createOne(@RequestBody GameMode entity) {
        GameMode gameMode = new GameMode();
        gameMode.setName(entity.getName());

        gameModeRepository.save(gameMode);
        return "Game mode saved";
    }

    @PutMapping("/api/gamemode/{id}")
    public String updateOne(@PathVariable String id, @RequestBody GameMode entity) {
        GameMode gameMode = gameModeRepository.findById(Integer.parseInt(id)).get();
        gameMode.setName(entity.getName());
        gameModeRepository.save(gameMode);

        return "Game mode updated";
    }

    @DeleteMapping("/api/gamemode/{id}")
    public @ResponseBody String deleteOne(@PathVariable Integer id) {
        gameModeRepository.deleteById(id);
        return "Game mode deleted";
    }
    
}
