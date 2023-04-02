public class Aluno {
  
  private String Ra;
  
  private String Nome;
	
  private float Ac1;
	
  private float Ac2;
	
  private float Ag;
	
  private float Af;
	
	public String Mostrar() {
		
    return
		
      "Ra: " + Ra +
		
      "\nNome: " + Nome +
		
      "\nAC1: " + Ac1 +
		
      "\nAC2: " + Ac2 +
	
      "\nAG: " + Ag +
	
      "\nAF: " + Af +
	
      "\nMédia: " + CalcMed() + 
	
      "\nSituação: " + Situacao();
	}
	
	public double CalcMed() {
		return (Ac1 * 0.15) + (Ac2 *0.30) + (Ag * 0.10) + (Af * 0.45);
	}
	
	public String Situacao() {
		String result;
	 if(CalcMed()>= 5) {
		 result = "aprovado";
		 }
	 else {
		 result = "reprovado";
		 }
	return result;
	}
	
	public String getRa() {
		return Ra;
	}

	public void setRa(String Ra) {
		this.Ra = Ra;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public float getAc1() {
		return Ac1;
	}

	public void setAc1(float Ac1) {
		this.Ac1 = Ac1;
	}

	public float getAc2() {
		return Ac2;
	}

	public void setAc2(float Ac2) {
		this.Ac2 = Ac2;
	}

	public float getAg() {
		return ag;
	}

	public void setAg(float Ag) {
		this.Ag = Ag;
	}

	public float getAf() {
		return Af;
	}

	public void setAf(float Af) {
		this.Af = Af;
  }}
