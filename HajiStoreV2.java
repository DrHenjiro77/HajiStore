import java.util.Scanner;

public class HajiStoreV2{

    public static void main(String[] args){

	var scanner = new Scanner(System.in);
	while(true){
	    System.out.println("=============HAJISTORE-V2===============");
	    System.out.println(" ");
	    System.out.println("");
	    var ksk = scanner.nextLine();
	    System.out.println(ksk);
	    System.out.print("Digite seu nome:");
	    var name = scanner.nextLine();
	    System.out.print("Digite sua idade:");
	    var age = scanner.nextInt();
	    System.out.print("Digite o valor da compra:");
	    var value = scanner.nextDouble();
	    System.out.println(" ");
	    System.out.printf("Cliente:%s \n", name);
	    System.out.printf("Idade:%s \n", age);
	    System.out.printf("Valor da compra:%s", value);
	    System.out.println(" ");
	    
	    if (age >=18){
		System.out.println("=====FORMAS DE PAGAMENTO=====");
		System.out.println("[0] Para cancelar a compra");
		System.out.println("[1] Para pagar com o Pix");
		System.out.println("[2] Para pagar com o cartão Débito/Crédito");
		System.out.println("[3] Para pagar com o dinheiro em espécie");
		System.out.println(" ");
		System.out.printf("%s Você quer utilizar qual forma de pagamento?:", name);
		var option = scanner.nextInt();

		switch((option)){
		case 0:
		    System.out.println("Você está cancelando a compra atual!");
		    break;
		case 1:
		    var descont00 = 0.95;
		    var valuefinal00 = descont00 * value;
		    System.out.println("Você irá pagar com o pix");
		    System.out.println("Você obteve um desconto de 5%% por pagar no pix");
		    System.out.printf("Sua compra que daria R$:  %s \n", value);
		    System.out.printf("Agora ficará por R$: %s", valuefinal00);		    
		    if (age >= 60){
			var descont0 = 0.95;
			var valuefinal0 = valuefinal00 * descont0;
			System.out.println("Por você ter 60 anos ou mais, você ganhou um desconto de 5%%");
			System.out.printf("O valor final da compra vai ser R$:%s\n",valuefinal0 );
			break;
		    } else if (value >= 1000){
			var descont1 = 0.95;
			var valuefinal1 = valuefinal00 * descont1;
			System.out.println("Por sua compra ter dado ou ultrapassar R$:1000, você ganhou um desconto de 5%%");
			System.out.printf("O valor final da compra vai ser R$:%s\n", valuefinal1);
			break;
		    } else if (value >= 1000 && age >= 60){
			var descont2 = 0.925;
			var valuefinal2 = valuefinal00 * descont2;
			System.out.println("Por você ter 60 anos ou mais e a sua compra for R$ 1000 ou mais você ganhou um desconto de 9.75%%");
			System.out.printf("O valor final da compra vai ser R:%s\n", valuefinal2);
			break;
		    } else {
			System.out.println("Você não obteve desconto infelizmente.");
		    }
		    break;
		case 2:
		    System.out.println("Você irá pagar com o Cartão");
		    System.out.println(" ");
		    System.out.println("[1] Para Débito");
		    System.out.println("[2] Para Crédito");
		    System.out.println(" ");
		    System.out.print("Sua opção desejada aqui ->:");
		    var card = scanner.nextInt();
		    
		    if (card == 1){
			var descont3 = 0.95;
			var valuefinal3 = value * descont3;
			System.out.println("Você escolheu pagar no cartão de débito e com isso você ganhou um 5%% de desconto");
			System.out.printf("A sua compra que daria R$:%s\n ", value);
			System.out.printf("Ficará por R$:%s\n", valuefinal3 );
			if (age >= 60){
			    var descont4 = 0.95;
			    var valuefinal4 = valuefinal3 * descont4;
			    System.out.println("Por você ter 60 anos ou mais, você ganhou um desconto de 5%%");
			    System.out.printf("A sua compra que daria R$:%s\n", valuefinal3);
			    System.out.printf("Agora ficará por R$: %s\n", valuefinal4);
			    break;
			} else if(value >= 1000){
			    var descont5 = 0.95;
			    var valuefinal5 = valuefinal3 * descont5;
			    System.out.println("Por sua compra ter dado ou ultrapassado os R$:1000, você ganhou um desconto de 5%%");
			    System.out.printf("A sua compra que daria R$:%s\n", valuefinal3);
			    System.out.printf("Ficará por R$:%s\n", valuefinal5);
			    break;
			} else if (age >= 60 && value >= 1000) {
			    var descont6 = 0.90;
			    var valuefinal6 = value * descont6;
			    System.out.println("Por você ter 60 anos ou mais e a sua compra ter dado ou ultrapassado os R$:1000");
			    System.out.println("Você ganhou um desconto de 10%%");
			    System.out.printf("A sua compra que daria R$:%s\n", valuefinal3);
			    System.out.printf("Ficará por R$:%s",valuefinal6);
			    break;
			} else {
			    System.out.println("Você não obteve nenhum desconto!");
			}
			break;
		    } else if (card == 2){
			System.out.println("Você não obteve nenhum desconto na compra por comprar no cartão de crédito");
			System.out.printf("Sua compra ficará por R$:%s\n", value);
			if (age >= 60){
			    var descont7 = 0.95;
			    var valuefinal7 = value * descont7;
			    System.out.println("Por você ter 60 anos ou mais, você ganhou um desconto de 5%%");
			    System.out.printf("A sua compra que daria R$:%s\n", value);
			    System.out.printf("Ficará por R$:%s\n", valuefinal7);
			    break;			    
			} else if (value >= 1000){
			    var descont8 = 0.95;
			    var valuefinal8 = value * descont8;
			    System.out.println("Por sua sua compra ter dado ou ultrapassado os R$:1000, você ganhou um desconto de 5%%");
			    System.out.printf("A sua compra que daria R$:%s\n", value);
			    System.out.printf("Ficará por R$:%s\n", valuefinal8);
			    break;
			} else if (age >=60 && value >= 1000){
			    var descont9 = 0.90;
			    var valuefinal9 = value * descont9;
			    System.out.println("Por você ter 60 anos ou mais e a sua compra ter dado ou ultrapassado R$:1000");
			    System.out.println("Você ganhou um desconto de 10%%");
			    System.out.printf("A sua compra que daria R$:%s\n", value);
			    System.out.printf("Ficará por R$:%s\n", valuefinal9);
			    break;
			} else {
			    System.out.println("Você não ganhou desconto!");			    
			}
		       
		    }
		    break;
		case 3:
		    var descont10 = 0.92;
		    var valuefinal10 = value * descont10;
		    System.out.println("Você irá pagar em espécie e você ganhou um desconto de 8%%");
		    System.out.printf("A compra que daria R$:%s\n", value);
		    System.out.printf("Ficará por R$:%s\n", valuefinal10);
		    if (age >= 60){
			var descont11 = 0.95;
			var valuefinal11 = valuefinal10 * descont11;
			System.out.println("Por você ter 60 anos ou mais, você ganhou um desconto de 5%%");
			System.out.printf("A compra que daria R$:%s\n", valuefinal10);
			System.out.printf("Ficará por R$:%s\n", valuefinal11);
			break;
		    } else if (value >=1000){
			var descont12 = 0.95;
			var valuefinal12 = valuefinal10 * descont12;
			System.out.println("Por sua compra ter dado ou ultrapassado os R$:1000, você ganhou um desconto de 5%%");
			System.out.printf("A compra que daria R$:%s\n", valuefinal10);
			System.out.printf("Ficará por R$:%s\n", valuefinal12);
			break;
		    } else if (age >= 60 && value >= 1000){
			var descont13 = 0.90;
			var valuefinal13 = valuefinal10 * descont13;
			System.out.println("Por você ter 60 anos ou mais e a sua compra ter dado ou ultrapassado os R$:1000");
			System.out.println("Você ganhou um desconto de 10%%");
			System.out.printf("A sua compra que daria R$:%s\n", valuefinal10);
			System.out.printf("Ficará por R$:%s\n", valuefinal13);
			break;
		    } else {
			System.out.println("Você não ganhou um desconto!");
		    break;
		    }
		default:
		    System.out.println("Digite uma opção válida!");
		    break;
		}
		
	    } else {
		System.out.println("Você não poderá comprar por ser menor de idade");
		break;
	    }
	}
	System.out.println("Aplicação encerrada com sucesso.");
	scanner.close();
    }
}

