CREATE TABLE contact (
    contact_id INT PRIMARY KEY IDENTITY,
    user_id INT,
    telephone NVARCHAR(10) NOT NULL,
    create_date DATE,
    update_date DATE,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);