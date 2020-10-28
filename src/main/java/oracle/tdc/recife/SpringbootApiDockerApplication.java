package oracle.tdc.recife;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oracle.tdc.recife.model.Praia;
import oracle.tdc.recife.repository.PraiaRepository;

@SpringBootApplication
@RestController
public class SpringbootApiDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApiDockerApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run(PraiaRepository repository) {
		return args -> {
			Praia praia = new Praia("Praia de Boa Viagem");
			repository.save(praia);
			praia = new Praia("Praia de Muro Alto, Ipojuca");
			repository.save(praia);
			praia = new Praia("Praia e Pontal de Maracaípe, Ipojuca");
			repository.save(praia);
			praia = new Praia("Praia de Porto de Galinhas, Ipojuca");
			repository.save(praia);
			praia = new Praia("Praia de Calhetas, Cabo de Santo Agostinho");
			repository.save(praia);
			praia = new Praia("Praia de Coroa do Avião, Itamaracá");
			repository.save(praia);
		};
	}
	

}
