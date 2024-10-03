package br.com.nelmara.physiotherapist;

import br.com.nelmara.physiotherapist.infra.config.FileStorageConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@EnableConfigurationProperties({
		FileStorageConfig.class
})
public class PhysiotherapistApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhysiotherapistApplication.class, args);
	}

}
