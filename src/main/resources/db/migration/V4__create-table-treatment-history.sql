CREATE TABLE IF NOT EXISTS tb_treatment_history(
     id INT AUTO_INCREMENT PRIMARY KEY,
     treatment_date DATE,
     progress TEXT,
     patient_id INT(36),
     treatment_id INT(36),
     FOREIGN KEY (patient_id) REFERENCES tb_patient(id),
     FOREIGN KEY (treatment_id) REFERENCES tb_treatment(id)
);