package br.com.nelmara.physiotherapist.adapters.service;

import br.com.nelmara.physiotherapist.domain.patient.Patient;
import br.com.nelmara.physiotherapist.domain.patient.dto.GetPatientDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Service
public class MapperModel implements Serializable {

    private static ModelMapper mapper = new ModelMapper();

    public static <O, D> D parseObject(O origin, Class<D> destination) {
        return mapper.map(origin, destination);
    }

    public static List<GetPatientDTO> parseListObjects(List<Patient> all, Class<GetPatientDTO> destination) {
        List<GetPatientDTO> destinationObjects = new ArrayList<GetPatientDTO>();

        for (Patient patient : all) {
            destinationObjects.add(mapper.map(patient, destination));
        }
        return destinationObjects;
    }
}
