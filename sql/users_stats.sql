CREATE TABLE users_stats (
    user_stat_id SERIAL PRIMARY KEY,
    game_mode_id INT NOT NULL,
    user_id INT NOT NULL,
    elo INT NOT NULL DEFAULT 1200,
    FOREIGN KEY (game_mode_id) REFERENCES games_mode(game_mode_id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);
