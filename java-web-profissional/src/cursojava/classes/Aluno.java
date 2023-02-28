package cursojava.classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa
{
	private String dataMatricula;

	private String nomeEscola;
	private String serieMatriculado;

	
	private List<Disciplina> disciplina = new ArrayList<Disciplina>();
	
	

	public List<Disciplina> getDisciplina() 
	{
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) 
	{
		this.disciplina = disciplina;
	}

	public Aluno() {

	}

	public Aluno(String nome, int idade) 
	{
		super.idade = idade;
		super.nome = nome;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		super.nome = nome;
	}

	public int getIdade()
	{
		return idade;
	}

	public void setIdade(int idade) 
	{
		super.idade = idade;
	}
	
	public String mudarNome(String novoNome)
	{
		super.nome = novoNome;
		
		return novoNome;
	}

	@Override
	public String toString() 
	{
		return "Aluno " + nome;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}
	
	public double getMediaNota()
	{
		double somaNotas = 0.0;
		
		for (Disciplina d : disciplina) 
		{
			somaNotas += d.getNota();
			
		}
		
		return somaNotas / disciplina.size();
	}
	
	public String getSituacaoAluno()
	{
		if(getMediaNota() >= 60)
		{
			return StatusAluno.APROVADO;
		}else if (getMediaNota() <= 50)
		{
			return StatusAluno.REPROVADO;
		}else 
			return StatusAluno.RECUPERACAO;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	public String getNomeEscola() {
		return nomeEscola;
	}
	
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	@Override
	public boolean checkMaioridade() 
	{
		return super.checkMaioridade();
		
	}
	
	public String msg()
	{
		return this.checkMaioridade() ? "é maior de idaide" : "é menor de idade!";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1500.00;
	}
	
	
}
