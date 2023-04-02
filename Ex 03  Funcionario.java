public class Funcionario {
	private int Cracha;
  
	private String Nome;
  
	private char TipoVinculo;
  
	private float QtdeHora;
  
	private float ValorHora;
  
	private float Salario ;
  
	private float ValorDesconto;
	
	public float CalcValSal() {
		if(TipoVinculo == 'h') {
			return (ValorHora * QtdeHora) - ValorDesconto;
		}else {
			return Salario - ValorDesconto;
		}
	}
	
	public String Imprimir() {
		String Salario;
		if(tipoVinculo == 'h') {
			Salario =  ValorHora + " * " + QtdeHora +" = " + ValorHora * QtdeHora;
		}else {
			Salario = ""+ this.Salario;
		}
		
		return 
		"Crachá: "+ Cracha+
		"\nNome: "+ Nome+
		"\nTipo Vinculo: "+ TipoVinculo+
		"\nSalario bruto: " + Salario+
		"\nDesconto: "+ ValorDesconto+
		"\nValor liquido a receber: "+ CalcValSal();
	}
	
	public int getCracha() {
		return Cracha;
	}
	public void setCracha(int Cracha) {
		this.Cracha = Cracha;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public char getTipoVinculo() {
		return TipoVinculo;
	}
	public void setTipoVinculo(char TipoVinculo) {
		this.TipoVinculo = TipoVinculo;
	}
	public float getQtdHora() {
		return QtdeHora;
	}
	public void setQtdeHora(float QtdeHora) {
		this.QtdeHora = QtdeHora;
	}
	public float getValorHora() {
		return ValorHora;
	}
	public void setValorHora(float ValorHora) {
		this.ValorHora = ValorHora;
	}
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float Salario) {
		this.Salario = Salario;
	}
	public float getValorDesconto() {
		return ValorDesconto;
	}
	public void setValorDesconto(float ValorDesconto) {
		this.ValorDesconto = ValorDesconto;
	}
