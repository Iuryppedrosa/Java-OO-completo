package cursojava.classes;

public class Disciplina 
{
	private double nota;
	private String nome;
	
	public Disciplina()
	{
		
	}
	public Disciplina(double nota, String nome) 
	{
		super();
		this.nota = nota;
		this.nome = nome;
	}
	
	public double getNota() 
	{
		return nota;
	}
	
	public void setNota(double nota) 
	{
		this.nota = nota;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	@Override
	public String toString() 
	{
		String frase = nome + " ";
		
		return frase;
	}
	
	
	
}
