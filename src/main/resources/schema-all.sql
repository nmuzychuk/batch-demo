DROP TABLE IF EXISTS users;

CREATE TABLE users  (
    user_id BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20)
);
