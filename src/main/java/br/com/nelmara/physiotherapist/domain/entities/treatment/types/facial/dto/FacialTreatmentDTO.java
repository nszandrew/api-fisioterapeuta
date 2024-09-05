package br.com.nelmara.physiotherapist.domain.entities.treatment.types.facial.dto;

import br.com.nelmara.physiotherapist.domain.entities.treatment.types.facial.Fototipo;
import br.com.nelmara.physiotherapist.domain.entities.treatment.types.facial.TipoPele;

import java.math.BigDecimal;
import java.util.Date;

public record FacialTreatmentDTO(String problemaSaude,
        String tratamentoMedico,
        String usoMedicamento,
        String usoHormonioErva,
        String usoAntidepressivo,
        Boolean usoAnticoncepcionalDiu,
        String usoDrogasEndovenosas,
        String alergiaMedicamento,
        String usoAntibiotico,
        String problemaCoracao,
        String doencaRins,
        String problemaTireoide,
        Boolean doencaFigado,
        Boolean bronquiteAsma,
        Boolean tuberculose,
        Boolean febreFrequente,
        String diabetesTipo,
        Boolean epilepsiaConvulsoes,
        Boolean reumatismoFebreReumatica,
        BigDecimal gravidaQuantosMeses,
        Boolean anemia,
        Boolean pressaoArterialProblema,
        String anestesiaProblema,
        Boolean hemorragiaExtracaoDentes,
        Boolean fuma,
        Boolean bebeAlcool,
        String tratamentoPsicologicoPsiquiatrico,
        Boolean doencaAutoImune,
        String tratamentoAnterior,
        Boolean implantesEletronicos,
        String tratamentoEsteticoAnterior,
        String botox,
        String preenchimento,
        Boolean fiosSustentacao,
        Boolean liftCirurgico,
        Boolean peelingQuimico,
        Boolean laser,
        Boolean roacutan,
        Boolean hidroquinona,
        String outroTratamentoEstetico,
        String usoDermocosmeticos,
        Date ultimaLimpezaPele,
        Fototipo fototipo,
        TipoPele tipoPele,
        Boolean cravos,
        Boolean acne,
        Boolean million,
        Boolean flacidezMuscular,
        Boolean flacidezTissular,
        String cicatriz,
        String mancha,
        String expectativasTratamento,
        String observacoesRelevantes,
        String fotosAntesDepois) {
}
