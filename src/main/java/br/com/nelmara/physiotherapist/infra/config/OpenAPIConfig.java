package br.com.nelmara.physiotherapist.infra.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Andrew Souza",
                        email = "nszandrew10@gmail.com",
                        url = "nszandrew.com.br"
                ),
                description = "API for a physiotherapist Nel Ribeiro",
                title = "API Physiotherapist - nszandrew",
                version = "1.0",
                license = @License(
                        name = "Apache License 2.0",
                        url = "https://github.com/nszandrew/api-fisioterapeuta/blob/master/LICENSE"
                ),
                termsOfService = "https://github.com/nszandrew/api-fisioterapeuta/blob/master/LICENSE"
        ),
        servers = {
                @Server(
                        description = "LOCAL ENV",
                        url = "not defined"
                )
        },
        security = {
                @SecurityRequirement(
                        name = "bearerAuth"
                )
        }
)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenAPIConfig {
}
