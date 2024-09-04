package br.com.nelmara.physiotherapist.framework.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class ExceptionResponse {
    private Date timestamp;
    private HttpStatus status;
    private String message;
    private String details;
}
