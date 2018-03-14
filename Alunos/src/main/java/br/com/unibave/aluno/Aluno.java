package br.com.unibave.aluno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Aluno {

	private Long id;
	private String nome;
	private Integer matricula;
	private String email;
}