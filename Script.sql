CREATE TABLE customerf (
   	customerid VARCHAR(10) NOT NULL PRIMARY KEY,
    name VARCHAR(10) NOT NULL,
    contact VARCHAR(15) NOT NULL,
    address VARCHAR(100) NOT NULL
);

CREATE TABLE restaurant (
    restaurantid VARCHAR(20) NOT NULL PRIMARY KEY,
    name VARCHAR(10) NOT NULL,
    location VARCHAR(100) NOT NULL,
    contact VARCHAR(15) NOT NULL
);

CREATE TABLE menu (
    menuid INTEGER NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    price INTEGER NOT NULL,
    restaurantid VARCHAR(20) NOT NULL,
    FOREIGN KEY (restaurantID) REFERENCES restaurant(restaurantid)
);

CREATE TABLE morder (
    orderID INTEGER NOT NULL PRIMARY KEY,
    orderDateTime TIMESTAMP NOT NULL,
    status VARCHAR(20) NOT NULL,
    totalamount INTEGER NOT NULL,
    customerID VARCHAR(10) NOT NULL,
    FOREIGN KEY (customerID) REFERENCES customerf (customerid)
);
