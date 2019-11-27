DROP TABLE Products;
CREATE TABLE Products(
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(200) NOT NULL,
    description TEXT,
    price FLOAT NOT NULL
);
INSERT INTO Products(name, price, description)
VALUES("iphone 7", 650.23, "This is iphone 7");
