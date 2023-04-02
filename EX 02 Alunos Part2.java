import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno al = new Aluno();
		int a = 0;
		
		while(a != 3) {
			System.out.println("->Menu<-");
			System.out.println("Digite o numero seguir:);
			System.out.println("1-> Criar aluno");
			System.out.println("2-> Mostrar aluno criado");
			System.out.println("3>- Sair");
			a = sc.nextInt();
			
			switch(a) {
			case 1:
				System.out.println("Digite seu RA: ");
				al.setRa(l.next());
          
				System.out.println("Digite seu Nome: ");
				al.setNome(l.next());
          
				System.out.println("Digite a nota da sua AC1: ");
				al.setAc1(l.nextFloat());
          
				System.out.println("Digite a nota da sua AC2: ");
				al.setAc2(l.nextFloat());
          
				System.out.println("Digite a nota da sua AG: ");
				al.setAg(l.nextFloat());
          
				System.out.println("Digite a nota da sua AF: ");
				al.setAf(l.nextFloat());
          
				break;
			case 2:
				System.out.println(al.imprimir());
				break;
			case 3:
				System.out.println("Adeus");
				break;
			default:
				System.out.println("Não existente");
				System.out.println(" ");
			}		}	}}
