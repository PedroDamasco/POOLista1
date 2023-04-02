import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario fun = new Funcionario();
		int a = 0;
		
		while(a != 4) {
				System.out.println(">Menu<");
      
				System.out.println("Digite o numero para selecionar");
      
				System.out.println("1 - Criar Funcionário");
      
				System.out.println("2 - Folha de Pagamento");
      
				System.out.println("3 - Alterar remuneração");
      
				System.out.println("4 - Sair");
      
			a = sc.nextInt();
      
			
			switch(a) {
			case 1:
				System.out.println("Digite seu Cracha: ");
				fun.setCracha(sc.nextInt());
          
				System.out.println("Digite seu Nome: ");
				fun.setNome(sc.next());
          
				System.out.println("Digite o seu tipo de vinculo empregaticio ");
				fun.setTipoVinculo(sc.next().charAt(0));
          
				if(fun.getTipoVinculo() == 'h') {
					System.out.println("Valor Hora: ");
						fun.setValorHora(sc.nextFloat());
					System.out.println("Quantidade de horas trabalhadas: ");
          
						fun.setQtdHora(sc.nextFloat());
				}else {
					System.out.println("Salario: ");
						fun.setSalario(sc.nextFloat());
				}
          
					System.out.println("Digite o valor do desconto: ");
						fun.setValorDesconto(sc.nextFloat());
				break;
          
			case 2:
				 System.out.println(fun.Imprimir());
				break;
          
			case 3:
				if(fun.getTipoVinculo() == 'h') {
					System.out.println("Valor Hora: ");
						fun.setValorHora(sc.nextFloat());
          
					System.out.println("Quantidade de horas trabalhadas: ");
						fun.setQtdHora(sc.nextFloat());
          
					System.out.println("Nova remuneração bruta: "+ fun.getValorHora() * fun.getQtdHora());
				}else {
					System.out.println("Salario: ");
						fun.setSalario(sc.nextFloat());
          
						System.out.println("Nova remuneração bruta: "+ fun.getSalario());
				}
				break;
          
			case 4:
					System.out.println("Adeus");
				break;
			default:
					System.out.println("Opção invalida, escolha novamente: ");
					System.out.println(" ");
			}    }	}}
