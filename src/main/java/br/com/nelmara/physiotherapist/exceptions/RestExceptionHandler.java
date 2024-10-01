package br.com.nelmara.physiotherapist.exceptions;

import br.com.nelmara.physiotherapist.exceptions.custom.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex){
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(), "Exception");

        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(PatientNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleBadRequestExceptions(Exception ex){
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), HttpStatus.NOT_FOUND, ex.getMessage(), "Patient Not Found");

        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(TreatmentExistsException.class)
    public final ResponseEntity<ExceptionResponse> handleTreatmentExistsExceptions(Exception ex){
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), HttpStatus.CONFLICT, ex.getMessage(), "Treatment Exists");
        return new ResponseEntity<>(exceptionResponse, HttpStatus.CONFLICT);
    }
    @ExceptionHandler(TreatmentNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleTreatmentNotFoundExceptions(Exception ex){
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), HttpStatus.NOT_FOUND, ex.getMessage(), "Treatment Not Found");
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(FileUploadException.class)
    public final ResponseEntity<ExceptionResponse> handleFileUploadExceptions(Exception ex){
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), HttpStatus.BAD_REQUEST, ex.getMessage(), "File Upload Error");
        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(FileDownloadException.class)
    public final ResponseEntity<ExceptionResponse> handleFileDownloadExceptions(Exception ex){
        ExceptionResponse exceptionResponse =  new ExceptionResponse(new Date(), HttpStatus.BAD_REQUEST, ex.getMessage(), "File Download Error");
        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(NeurologicalTreatmentNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleNeurologicalTreatmentNotFoundExceptions(Exception ex){
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), HttpStatus.NOT_FOUND, ex.getMessage(), "Neurological treatment not found!");
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }
}
