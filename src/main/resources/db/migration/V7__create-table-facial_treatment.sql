CREATE TABLE IF NOT EXISTS tb_facial_treatment (
    id INT PRIMARY KEY AUTO_INCREMENT,
    problema_saude VARCHAR(255), -- 1 - Tem algum problema de saúde? Qual?
    tratamento_medico VARCHAR(255), -- 2 - Atualmente está sob tratamento médico? Motivo:
    uso_medicamento VARCHAR(255), -- 3 - Está tomando algum medicamento?  Qual?
    uso_hormonio_erva VARCHAR(255), -- 29 - Faz uso de hormônio? ou erva? Qual?
    uso_antidepressivo VARCHAR(255), -- 4 - Toma antidepressivo? Qual?
    uso_anticoncepcional_diu BOOLEAN, -- 27 - Faz uso de anticoncepcional, DIU?
    uso_drogas_endovenosas VARCHAR(255), -- 4 - Faz uso de drogas endovenosas? Qual?
    alergia_medicamento VARCHAR(255), -- 5 - Tem alergia a algum medicamento? Qual?
    uso_antibiotico VARCHAR(255), -- 6 - Já tomou antibiótico? Qual?
    problema_coracao VARCHAR(255), -- 7 - Tem sopro ou outra doença no coração? marca-passo? Qual?
    doenca_rins VARCHAR(255), -- 8 - Doença dos rins? Qual?
    problema_tireoide VARCHAR(255), -- 9 - Problemas de tireoide? Qual?
    doenca_figado BOOLEAN, -- 10 - Teve ou tem alguma doença no fígado?
    bronquite_asma BOOLEAN, -- 11 - Bronquite ou asma?
    tuberculose BOOLEAN, -- 12 - Teve ou tem tuberculose?
    febre_frequente BOOLEAN, -- 13 - Tem febre com frequência?
    diabetes_tipo VARCHAR(255), -- 14 - Diabetes? Tipo:
    epilepsia_convulsoes BOOLEAN, -- 15 - Epilepsia ou convulsões?
    reumatismo_febre_reumatica BOOLEAN, -- 16 - Reumatismo ou Febre Reumática?
    gravida_quantos_meses DECIMAL(4,1), -- 17 - Você está grávida? Quantos meses?
    anemia BOOLEAN, -- 18 - Anemia?
    pressao_arterial_problema BOOLEAN, -- 19 - Tem problemas de pressão arterial?
    anestesia_problema VARCHAR(255), -- 21 - Já passou mal com anestesia em tratamento dentário? Como foi?
    hemorragia_extracao_dentes BOOLEAN, -- 22 - Já teve hemorragia após a extração de dentes?
    fuma BOOLEAN, -- 23 - Você fuma?
    bebe_alcool BOOLEAN, -- 24 - Bebe bebidas alcoólicas frequentemente?
    tratamento_psicologico_psiquiatrico VARCHAR(255), -- 26 - Faz/fez tratamento psicológico/psiquiátrico? Usa medicamento para dormir? Qual?
    doenca_auto_imune BOOLEAN, -- 28 - Doença auto imune?
    tratamento_anterior VARCHAR(255), -- 30 - Você já fez algum tipo de tratamento o qual pretende fazer?
    implantes_eletronicos BOOLEAN, -- 32 - Tem implantes eletrônicos?
    tratamento_estetico_anterior VARCHAR(255), -- 33 - Já fez tratamento estético anteriormente? Botox, Preenchimento, etc.
    botox VARCHAR(255), -- Botox? Em qual região?
    preenchimento VARCHAR(255), -- Preenchimento? Em qual região?
    fios_sustentacao BOOLEAN, -- Fios de sustentação?
    lift_cirurgico BOOLEAN, -- Lift cirúrgico?
    peeling_quimico BOOLEAN, -- Peeling Químico?
    laser BOOLEAN, -- Laser?
    roacutan BOOLEAN, -- Roacutan?
    hidroquinona BOOLEAN, -- Hidroquinona?
    outro_tratamento_estetico VARCHAR(255), -- Se outro... Qual?
    uso_dermocosmeticos VARCHAR(255), -- Faz uso de dermocosméticos ou medicamento dermatológicos, e filtro solar diariamente? Quais?
    ultima_limpeza_pele DATE, -- Quando foi a sua última limpeza de pele?
    fototipo ENUM('I', 'II', 'III', 'IV', 'V', 'VI'), -- Fototipo: I ( )  II (  )   III (  )  IV (  )   V (  )   VI (  )
    tipo_pele ENUM('Seca', 'Normal', 'Mista', 'Oleosa'), -- Tipo de Pele : Seca (  )   Normal (  )   Mista (  )   Oleosa (  )
    cravos BOOLEAN, -- Cravos (  )
    acne BOOLEAN, -- Acne (  )
    million BOOLEAN, -- Million (  )
    flacidez_muscular BOOLEAN, -- Flacidez Muscular (  )
    flacidez_tissular BOOLEAN, -- Flacidez Tissular (  )
    cicatriz VARCHAR(255), -- Cicatriz:
    mancha VARCHAR(255), -- Mancha:
    expectativas_tratamento VARCHAR(255), -- 34- O que você espera do tratamento?
    observacoes_relevantes VARCHAR(255), -- Observações relevantes:
    fotos_antes_depois VARCHAR(255), -- Anexas fotos antes e depois:
    treatment_id INT,
    FOREIGN KEY (treatment_id) REFERENCES tb_treatment(id)
);
