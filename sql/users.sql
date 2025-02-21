CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255) UNIQUE NOT NULL,
    phone_number VARCHAR(255),
    user_type_id INT NOT NULL,
    country VARCHAR(255),
    FOREIGN KEY (user_type_id) REFERENCES users_types(user_type_id) ON DELETE CASCADE
);
