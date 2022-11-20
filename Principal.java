import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		apresentacao(false);
		
		cod();
		
		apresentacao(true);
        
	
	}	
	public static Boolean apresentacao(boolean d){
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date data = new Date();
		if(d == false) {
			System.out.println("Programa iniciado em: " + formatador.format(data));
		}else {
			System.out.println("\nPrograma finalizado em: " + formatador.format(data));
		}
		System.out.println("\n********************************  IOMH CORPORATION  ************************************\n");
		System.out.println("*****************************  Republica de alunos  *************************************\n");
		System.out.println("Desenhado por:\n\n- Italo Guilherme\n- Ântonio Otaviano\n- Miguel Ângelo\n- Hiarley\n\n");
		return d;
	}    
	public static String menu() {
		Scanner scan = new Scanner(System.in);
		String opcao;
		System.out.println("\n********************************************************");
		System.out.println("**     DIGITE O NÚMERO OPÇÃO DA OPERAÇÃO DESEJADA      **");
		System.out.println("********************************************************");
		System.out.println("*                1 - Cadastrar Aluno                   *");
		System.out.println("*                2 - Cadastrar Despesa Fixa            *");
		System.out.println("*                3 - Cadastrar Despesa Variada         *");
		System.out.println("*                4 - Listar Alunos Cadastrados         *");
		System.out.println("*                5 - Remover Cadastro                  *");
		System.out.println("*                6 - Reserva de Emergência             *");
		System.out.println("*                7 - Valor que Cada Morador Deve Pagar *");
		System.out.println("*                8 - Sair                              *");
		System.out.println("********************************************************");
		System.out.print("-> ");
		opcao = scan.nextLine();
			return opcao;
    }
	
	public static void cod() {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		FixedExpense fixedExpense = new FixedExpense();
        VariableExpense variableExpense = new VariableExpense();
        int fim = 0;
        int i = 0;
        int l = 0;
        Byte id = 0;
        float t = 0;
        String u = "";
        float b = 0;
        float g = 0;
        float h = 0;
        float j = 0;
		do {
			switch(menu()) {
				case "1": 
					System.out.println("\n---------------------------------------------------");
					System.out.println("--                  Cadastrar Aluno                --");
					System.out.println("---------------------------------------------------");
					System.out.println("\nNome do aluno");
					System.out.print("->");
					student.nameList.add(scan.nextLine());
					System.out.println("\nEmail do aluno");
					System.out.print("->");
					student.emailList.add(scan.nextLine());
					System.out.println("\nRenda do aluno");
					System.out.print("->");
					student.incomeList.add(scan.nextFloat());
					student.emergencyDeposit((float) student.incomeList.get(l));
					student.idStudent.add((byte)id);
					id++;
					l++;
					fim = 1;
					System.out.println("\n-- Cadastro de Aluno Registrado com sucesso!");
					scan.nextLine();					
					break;
				case "2": 
					System.out.println("\n---------------------------------------------------");
					System.out.println("--               Cadastrar Despesa Fixa            --");
					System.out.println("-----------------------------------------------------");
				    System.out.println("\nNome da Despesa");
				    System.out.print("->");
				    fixedExpense.nameList.add(scan.nextLine());
				    System.out.println("\nDescrição da Despesa");
				    System.out.print("->");
				    fixedExpense.descriptionList.add(scan.nextLine());
				    System.out.println("\nValor da Despesa");
				    System.out.print("->");
				    fixedExpense.valueList.add(scan.nextFloat());
				    System.out.println("\nData do pagamento: ");
				    System.out.print("->");
				    fixedExpense.paydayList.add(scan.nextLine());
				    fim = 2;
					System.out.println("\n-- Cadastro de Despesa Fixa Registrada Com Sucesso!");
					scan.nextLine();					
					break;
				case "3":
					System.out.println("\n---------------------------------------------------");
					System.out.println("--               Cadastrar Despesa Variada         --");
					System.out.println("-----------------------------------------------------");
				    System.out.println("\nNome da Despesa");
				    System.out.print("->");
				    variableExpense.nameList.add(scan.nextLine());
				    System.out.println("\nDescrição da Despesa");
				    System.out.print("->");
				    variableExpense.descriptionList.add(scan.nextLine());
				    System.out.println("\nValor da Despesa");
				    System.out.print("->");
				    variableExpense.valueList.add(scan.nextFloat());
				    System.out.println("\nDigite a prioridade da despesa[5(prioridade máxima) a 1[pode esperar]: ");
				    System.out.print("->");
				    variableExpense.priorityList.add(scan.nextByte());
				    fim = 3;
					System.out.println("\n-- Cadastro de Despesa Variada Registrada Com Sucesso!");
					scan.nextLine();					
					break;
				case "4":
					System.out.println("\n---------------------------------------------------");
					System.out.println("--          Listagem dos Alunos Cadastrados        --");
					System.out.println("---------------------------------------------------\n");
					for(i = 0; i < student.nameList.size();i++) {
						System.out.println("ID do Aluno: " + student.idStudent.get(i) + "\nAluno: " + student.nameList.get(i) + "\nEmail: " + student.emailList.get(i) +
				        "\nRenda: " + student.incomeList.get(i));
						System.out.println("\n-------------------------------------------------------------\n");
					}
					fim = 4;
				    break;
				case "5":
					System.out.println("\n-----Digite o ID do Aluno que você quer remover do cadastro: ");
					student.deleteAccount(scan.nextByte());
					fim = 5;
					break;
				case "6":
					System.out.println("\n---------------------------------------------------");
					System.out.println("--      Lista de Reserva de Emergência(RE)       --");
					System.out.println("-----------------------------------------------------");
					for(int s=0; s < student.taxStudent.size();s++) {
						u += "\n\n-------------------------------------------\nNome do aluno: " + student.nameList.get(s) + 
					    "\nValor de Contrubuição para RE: " + student.taxStudent.get(s) + 
					    "\n-------------------------------------------\n";
					}
					for(int r=0; r < student.taxStudent.size();r++) {
						t += student.taxStudent.get(r);
					}
					System.out.println(u);
					System.out.println("\n\nTotal de Reserva de Emergência = " + t);
					fim = 6;
					break;
				case "7":
					for(int a=0; a < fixedExpense.valueList.size();a++) {
					   b += fixedExpense.valueList.get(a);
					}
					for(int f=0; f < variableExpense.priorityList.size();f++) {
						if (variableExpense.priorityList.get(f) == 5 || variableExpense.priorityList.get(f) == 4) {
						   g += variableExpense.valueList.get(f);
					    } else {
					    	continue;
					    }
					}
				    h = (b+g);
				    j = (h/student.nameList.size());
				    System.out.println("\nValor Total de Despesas Fixas mais Despesas Variadas de prioridade 5 e 4: " + "R$" + h );
				    System.out.println("\nValor Que cada Cada Aluno Deverá Pagar Pelas Despesas: " + "R$" + j);
				case "8":	
					fim = 8;
					break;
				default:
					System.out.println("\n-- Digite um número correspondente a operação desejada --");
			}
		}while(fim < 8);
	}
	
}