CREATE TABLE vareds(
    id INT NOT NULL AUTO_INCREMENT,
    user_id INT UNIQUE,
    product_id INT UNIQUE,
    created DATE,
    updated DATE,
    deleted DATE,
    is_active BOOLEAN NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(user_id) REFERENCES users(id),
    FOREIGN KEY(product_id) REFERENCES products(id)
);