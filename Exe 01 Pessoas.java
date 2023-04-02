package ex01;

  import java.util.Scanner;

      public class POO {

	          public static void main(String[] args) {
	            	Scanner sc = new Scanner(System.in);
		            String res;
	            	Pessoa pes = new Pessoa();
	            	boolean boo = true;
		
		while(a == true) {
			System.out.println("-> Menu <-");
      
		System.out.println("Digite um numero a baixo.");
      
		System.out.println("1-> Criar pessoa");
      
		System.out.println("2-> Mostrar pessoa criada");
      
		System.out.println("3-> Sair");
      
			resposta = sc.next();
			
			switch(resposta) {
			case "1":
				System.out.println("Digite seu nome: ");
				pes.setNome(sc.next());
        
				System.out.println("Digite seu CPF: ");
				pes.setCpf(sc.next());
        
				System.out.println("Digite seu Sexo: ");
				pes.setIdade(sc.nextInt());
        
				System.out.println("Digite sua Idade: ");
				pes.setSexo(sc.next());
        
				System.out.println(" ");
				break;
        
			case "2":
				System.out.println("Nome: "+ pes.getNome());
        
				System.out.println("CPF: "+ pes.getCpf());
        
				System.out.println("Idade: "+ pes.getIdade());
        
				System.out.println("Sexo: "+ pes.getSexo());
        
				System.out.println(" ");
        
				break;
        
			case "3":
				System.out.println("Saindo...");
				boo = false;
        
				break;
			}	}	}
  }
