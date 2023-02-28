package cursojava.classes;

public class Diretor extends Pessoa
{
	private String registro;
	private int tempo;
	private String titulacao;
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	@Override
	public String toString() {
		return "Diretor [registro=" + registro + ", tempo=" + tempo + ", titulacao=" + titulacao + ", nome=" + nome
				+ ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral=" + registroGeral
				+ ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1900.00 * 0.3;
	}
	
	

}
