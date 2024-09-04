CREATE TABLE IF NOT EXISTS tb_treatment(
    id INT AUTO_INCREMENT PRIMARY KEY,
    diagnostic_hypothesis TEXT,
    pathologies TEXT,
    description TEXT,
    treatment_type ENUM('OZONIO', 'CORPORAL', 'ESTETICA', 'FACIAL') NOT NULL
);