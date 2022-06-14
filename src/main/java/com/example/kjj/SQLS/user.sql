CREATE TABLE users(
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    email VARCHAR(50),
    username VARCHAR(120),
    password VARCHAR(120),
    is_allowed_to_trade BOOLEAN
);