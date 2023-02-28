package cursojava.classesexecutaveis;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secratario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class AlunoTeste 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//Secratario secretario = new Secratario();// uma forma para usar interface
		//PermitirAcesso secretario = new Secratario(); ha outra forma ainda abaixo
		
		
		System.out.println("Loguin: ");
		String loguin = input.next();
		
		System.out.println("Senha: ");
		String senha = input.next();
		
		
		//FuncaoAutenticacao funcaoAutenticacao = new FuncaoAutenticacao();
		
		
		
		//PermitirAcesso pa = new Secratario(loguin, senha);
		
		
		
		//secretario.setLogin(loguin);// n acessa mais get
		//secretario.setSenha(senha); // n acessa mais get
		
//		if(new Secratario().autenticar(loguin, senha))
//		{
//			System.out.println("Acesso liberado.");
//		} else System.out.println("Acesso negado.");
		
		
//		if(pa.autenticar())
//		{
//			System.out.println("Acesso liberado.");
//		}else System.out.println("Acesso negado.");
		
		
//		if(funcaoAutenticacao.autenticarAqui(pa))//travar o contrato de interface maximo
//		{
//			System.out.println("Acesso liberado.");
//			
//		} else System.out.println("Acesso negado.");
		
		
		if(new FuncaoAutenticacao(new Secratario(loguin, senha)).autenticarAqui())
		{
			System.out.println("Acesso liberado.");
			
		}else System.out.println("Acesso negado.");

		
		
		
		List<Aluno> alunos = new ArrayList<>();
		
		
		System.out.print("Quantos alunos deseja add? ");
		int qtdAlunos = input.nextInt();
		
		HashMap<String, List<Aluno>> maps = new HashMap<>(); // tambem é uma lista com chave que identifica
															// uma sequencia de valor
		
		


		
		for(int i = 0; i < qtdAlunos; i++)
		{
			System.out.print("Qual nome do aluno: ");
			String nome = input.next();
			
			System.out.print("Qual idade do aluno? ");
			int idade = input.nextInt();
			
			Aluno aluno = new Aluno(nome, idade);
			
			alunos.add(aluno);
			
			System.out.print("Quantas disciplinas deseja add? ");
			int nDisciplinas = input.nextInt();
			
			for(int j = 1; j <= nDisciplinas; j++)
			{
				System.out.print("Qual nota da disciplina " + j + " ?");
				double nota = input.nextDouble();
				
				System.out.print("Qual nome da disciplina "+ j + " ?");
				String nomeD = input.next();
				
				Disciplina d = new Disciplina(nota, nomeD);
				
				
				aluno.getDisciplina().add(d);
			}
			
			List<Disciplina> disp = aluno.getDisciplina();
			
			for(int k = 0; k < disp.size(); k++)
			{
				Disciplina d1 = disp.get(k);
				System.out.print("Disciplinas: \n" + d1.getNome());
			}
			
			System.out.printf("Media do aluno: %.2f\n", aluno.getMediaNota());
			
			System.out.print("Disciplinas: \n" + aluno.getDisciplina().toString());
			
			System.out.print("Deseja remover alguma disciplina?");
			String escolha = input.next();
			
			if(escolha.equalsIgnoreCase("sim"))
			{
				System.out.println("Qual disciplina? ");
				String escolhaD = input.next();
				
				int convertido = Integer.parseInt(escolhaD);
				convertido -= 1;
				
				aluno.getDisciplina().remove(convertido);
				
				//aluno1.getDisciplina().remove(Integer.valueOf(escolhaD));
			}
			
			maps.put(StatusAluno.APROVADO, new ArrayList<>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<>());

			
			
			
			System.out.println("Disciplinas: " + aluno.getDisciplina().toString());
			System.out.println(aluno.getSituacaoAluno());
			
			for(Aluno a : alunos)  //listas separadas
			{
				if(a.getSituacaoAluno().equalsIgnoreCase(StatusAluno.APROVADO))
				{
					maps.get(StatusAluno.APROVADO).add(a);
					
				}else if (a.getSituacaoAluno().equalsIgnoreCase(StatusAluno.REPROVADO))
				{
					maps.get(StatusAluno.REPROVADO).add(a);
				}else 
				{
					maps.get(StatusAluno.RECUPERACAO).add(a);
				}
				
			}
			
			
		}
		
		
		for(Aluno a : maps.get(StatusAluno.APROVADO))
		{
			
			System.out.println("Aprovados: " + a.getSituacaoAluno() + " " + a.getNome());
		}
		
		for(Aluno a : maps.get(StatusAluno.REPROVADO))
		{
			
			System.out.println("Reprovados: " + a.getSituacaoAluno() + " " + a.getNome());
		}
		
		for(Aluno a : maps.get(StatusAluno.RECUPERACAO))
		{
			
			System.out.println("Recuperacao: " + a.getSituacaoAluno() + " " + a.getNome());
		}
	}

}

//Disciplina d1 = new Disciplina(7, "Portugues");

		//aluno1.getDisciplina().setNome("Portugues");;
		
		//System.out.println(aluno1.getDisciplina().getNome());
		
		//if (aluno1.equals(aluno2))
		//{
		//	System.out.println("Alunos sao iguais");
		//}else System.out.println("Alunos nao sao iguais");

//System.out.println(aluno1.getNome() + "\n" + aluno1.getIdade());

/*
 * System.out.print("Deseja mudar o nome para qual?"); String nomeNovo =
 * input.nextLine();
 * 
 * aluno1.mudarNome(nomeNovo);
 * 
 * System.out.println(aluno1);//tem metodo toString
 * 
 * input.close();
 */