CREATE TABLE IF NOT EXISTS tb_contract(
                             id INT AUTO_INCREMENT PRIMARY KEY,
                             patient_id INT,
                             contract_text VARCHAR(255),
                             pix_code VARCHAR(255),
                             payment_status BOOLEAN DEFAULT FALSE,
                             created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                             updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                             FOREIGN KEY (patient_id) REFERENCES tb_patient(id)
);
