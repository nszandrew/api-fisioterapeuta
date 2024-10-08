package br.com.nelmara.physiotherapist.domain.treatment.types.ozonio.dto;

import java.math.BigDecimal;

public record OzonioTreatmentDTO(Long id,
        String ingestaoAgua,
        String eliminacoesFisiologicas,
        String sonoRepouso,
        String habitosToxicos,
        Boolean posturaTrabalhoSentada,
        BigDecimal horasSentada,
        Boolean posturaTrabalhoEmPe,
        BigDecimal horasEmPe,
        String checkupMedico,
        Boolean tratamentoOzonioAnterior,
        Boolean hipertireoidismo,
        String deficienciaG6pd,
        Boolean iam,
        BigDecimal anemiaHb,
        BigDecimal anemiaHt,
        Boolean hemocromatose,
        BigDecimal ferroSerico,
        Boolean trombocitopenia,
        Boolean dm,
        BigDecimal glicemia,
        String dst,
        String alergias,
        String medicamentos,
        String cirurgias,
        String doencaAtual,
        String enfermidadePregressa,
        String queixaPrincipal,
        Boolean gestante,
        Boolean lactentes,
        Boolean marcaPasso,
        Boolean implanteCardiaco,
        Boolean diu,
        Boolean hipercolesterolemia,
        Boolean historicoHepatiteDoencaHepatica,
        Boolean alteracoesSistemaImunologico,
        Boolean cancer,
        Boolean insuficienciaLenosaProfunda,
        Boolean quimioRadioterapia,
        Boolean posCirurgico,
        Boolean pinosProtesesMetalicas,
        Boolean problemasCardiacos,
        Boolean epilepsia,
        Boolean queloides,
        Boolean herpes,
        Boolean usoAntiCoagulantes,
        Boolean labirintite,
        Boolean ostioporose,
        Boolean enxaqueca,
        Boolean erniaDeDisco,
        Boolean pedrasNosRins,
        String patologiaAtiva,
        Boolean trombose){
}
