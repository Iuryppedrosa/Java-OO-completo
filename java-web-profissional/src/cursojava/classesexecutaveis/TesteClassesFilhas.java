package cursojava.classesexecutaveis;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secratario;

public class TesteClassesFilhas 
{
	public static void main(String[] args)
	{
		Aluno aluno = new Aluno();
		
		aluno.setNome("Alex");
		aluno.setIdade(17);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("12312312");
		diretor.setIdade(50);
		
		Secratario secretario = new Secratario();
		secretario.setExperiencia("Administracao");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(secretario);
		System.out.println(diretor);

		System.out.println(aluno.checkMaioridade() + aluno.msg());
		System.out.println(diretor.checkMaioridade());
		System.out.println(secretario.checkMaioridade());
		
		System.out.println("Salario: " + aluno.salario());
		
		teste(aluno);
		teste(secretario);
		teste(diretor);
		
		//secretario.autenticar();
	}
	
	public static void teste(Pessoa pessoa)
	{
		System.out.println("Essa pessoa é demais " + pessoa.getNome() + "e tem o salario de: " + pessoa.salario());
	}

}
