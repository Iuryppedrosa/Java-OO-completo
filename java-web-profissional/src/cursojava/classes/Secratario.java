package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secratario extends Pessoa implements PermitirAcesso
{
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	//private String login; ambos daria problema quando conectado ao banco
	//private String senha;
	
	private String login;
	private String senha;
	
	
//	public String getLogin() {
//		return login;
//	}
//	public void setLogin(String login) {
//		this.login = login;
//	}
//	public String getSenha() {
//		return senha;
//	}
//	public void setSenha(String senha) {
//		this.senha = senha;
//	}
	
	public Secratario()
	{
		
	}
	
	public Secratario(String login, String senha)
	{
		this.setLogin(login);
		this.setSenha(senha);
	}
	
	
	public Secratario(String registro, String nivelCargo, String experiencia) 
	{
		super();
		this.registro = registro;
		this.nivelCargo = nivelCargo;
		this.experiencia = experiencia;
	}


	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secratario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 5800.00;
	}
	
//	@Override
//	public boolean autenticar() 
//	{
//	
//		return false;
//	}
	
	
//	@Override
//	public boolean autenticar(String loguin, String senha) 
//	 {
//
//		return loguin.equals("admin") && senha.equals("admin");
//	}
	
	public boolean autenticar(String loguin, String senha)
	{
		this.login = loguin;
		this.senha = senha;
		
		return autenticar();
	}
	
	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equals("admin") && senha.equals("admin");
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
