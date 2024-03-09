CREATE TABLE users (
    user_id INT PRIMARY KEY IDENTITY,
    username NVARCHAR(255) NOT NULL,
    password NVARCHAR(255) NOT NULL,
    email NVARCHAR(255) NOT NULL
);

CREATE TABLE address (
    address_id INT PRIMARY KEY IDENTITY,
    user_id INT,
    street NVARCHAR(255) NOT NULL,
    city NVARCHAR(255) NOT NULL,
    state NVARCHAR(255),
    postal_code NVARCHAR(10) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);