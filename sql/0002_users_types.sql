CREATE TABLE users_types (
    user_type_id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    active INT NOT NULL DEFAULT 1
);
