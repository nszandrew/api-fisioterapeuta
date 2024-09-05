CREATE TABLE IF NOT EXISTS tb_treatment_history(
    id INT AUTO_INCREMENT PRIMARY KEY,
    treatment_date DATE,
    progress TEXT,
    patient_id INT(36),
    corporal_id INT(36),
    neurological_id INT(36),
    facial_id INT(36),
    ozonio_id INT(36),
    FOREIGN KEY (patient_id) REFERENCES tb_patient(id),
    FOREIGN KEY (corporal_id) REFERENCES tb_corporal_treatment(id),
    FOREIGN KEY (neurological_id) REFERENCES tb_neurological_treatment(id),
    FOREIGN KEY (facial_id) REFERENCES tb_facial_treatment(id),
    FOREIGN KEY (ozonio_id) REFERENCES tb_ozonio_treatment(id)
);