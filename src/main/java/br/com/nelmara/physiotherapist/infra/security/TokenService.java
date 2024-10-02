package br.com.nelmara.physiotherapist.infra.security;

import br.com.nelmara.physiotherapist.domain.user.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

    @Value("${api.security.token.secret}")
    private String secret;

    public String generateToken(User user){
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.create()
                    .withIssuer("nszandrew")
                    .withSubject(user.getLogin())
                    .withExpiresAt(expirationTime())
                    .sign(algorithm);
        }catch (JWTCreationException exception){
            throw new RuntimeException("Erro while generating token", exception);
        }
    }

    public String validateToken(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.require(algorithm)
                    .withIssuer("nszandrew")
                    .build()
                    .verify(token)
                    .getSubject();
        }catch (JWTVerificationException e){
            throw new RuntimeException("Erro while validating token", e);
        }
    }

    private Instant expirationTime(){
        return LocalDateTime.now().plusMonths(2).toInstant(ZoneOffset.of("-03:00"));
    }
}
