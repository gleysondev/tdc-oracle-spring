package oracle.tdc.recife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oracle.tdc.recife.model.Praia;
import oracle.tdc.recife.repository.PraiaRepository;

@RestController
@RequestMapping("/")
public class PraiaController {
	@Autowired
	private PraiaRepository repository;
	
	@GetMapping("/")
	public String home() {
		return "Hello Oracle TDC Recife 2020";
	}
	@GetMapping("/praias")
	public List<Praia> praias() {
		return repository.findAll();
	}
}
