CREATE TABLE products(
    id INT NOT NULL AUTO_INCREMENT,
    title VARCHAR(35),
    description VARCHAR(1000),
    price INT(100),
    is_allowed BOOLEAN,
    is_active BOOLEAN,
    created DATE,
    updated DATE,
    deleted DATE,
    status enum ('EXPORTED', 'IMPORTED', 'STOCK') NOT NULL,
    PRIMARY KEY(id)
) ;