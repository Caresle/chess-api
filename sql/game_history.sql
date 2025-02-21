
CREATE TABLE games_history (
    game_history_id SERIAL PRIMARY KEY,
    white_user_id INT NOT NULL,
    black_user_id INT NOT NULL,
    white_username VARCHAR(255) NOT NULL,
    black_username VARCHAR(255) NOT NULL,
    white_result GameResult NOT NULL,
    black_result GameResult NOT NULL,
    white_prev_elo INT NOT NULL,
    black_prev_elo INT NOT NULL,
    white_after_elo INT NOT NULL,
    black_after_elo INT NOT NULL,
    game_mode_id INT NOT NULL,
    FOREIGN KEY (white_user_id) REFERENCES users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (black_user_id) REFERENCES users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (game_mode_id) REFERENCES games_mode(game_mode_id) ON DELETE CASCADE
);
