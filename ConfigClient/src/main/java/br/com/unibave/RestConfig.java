package br.com.unibave;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RestConfig {

	@Value("${minha.nome}")
	private String minhaNome;
	
	@Value("${minha.conf}")
	private String minhaConf;
	
	@Value("${semProfile}")
	private String semProfile;
	
	@GetMapping()
	public List<String> getConfigs() {
		return Arrays.asList(minhaNome, minhaConf, semProfile);
	}
} 
