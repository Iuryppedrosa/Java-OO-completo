package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

//apenas receber quem tem o contrato da interface de permitir acesso
public class FuncaoAutenticacao
{
	private PermitirAcesso permitirAcesso;//interface
	
	public boolean autenticarAqui()
	{
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso)
	{
		this.permitirAcesso = acesso;
	}

}
