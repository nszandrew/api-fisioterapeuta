CREATE TABLE IF NOT EXISTS tb_patient(
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    date_of_birth DATE,
    address VARCHAR(255),
    email VARCHAR(255),
    phone VARCHAR(50),
    gender ENUM('MALE', 'FEMALE', 'N/A'),  -- Utilizando ENUM diretamente no MySQL
    profession VARCHAR(255),
    indication TEXT,
    user_id INT(36),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES tb_user(id)
);