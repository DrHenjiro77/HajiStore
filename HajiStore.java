import java.util.Scanner;

public class HajiStore{

    
    public static void main(String[] args){

	var scanner = new Scanner(System.in);

	System.out.println("================");
	System.out.println("   HAJISTORE");
	System.out.println("================");
	System.out.println(" ");
	System.out.println("Informe o seu nome:");
	var name = scanner.nextLine();
	System.out.println("Informe a sua idade:");
	var age = scanner.nextInt();
	System.out.println("Informe o valor da compra:");
	var value = scanner.nextDouble();

	if (age >= 18){
	    System.out.println(" ");
	    System.out.println("|FORMAS DE PAGAMENTO|");
	    System.out.println("[1] Pix");
	    System.out.println("[2] Cartão Débito/Crédito");
	    System.out.println("[3] Dinheiro em  Espécie");
	    System.out.println(" ");
	    System.out.println("Sua forma de pagamento aqui:");
	    var payment = scanner.nextInt();
	    System.out.printf("Cliente: %s \n", name);
	    System.out.printf("Idade: %s \n", age);
	    System.out.printf("Valor: %s \n", value);
	    System.out.println(" ");

	    if (payment == 1){
		var descont = 0.9;
		var newvalue = value * descont;
		System.out.println("Você irá concluir uma compra no pix");
		System.out.printf("A compra que era de R$: %s ganhou um desconto de 10% e passará a ser R$: %s.\n", value, newvalue);
		System.out.println(" ");
		if (age >= 60){
		    var descont1 = 0.95;
		    var newvalue1 = newvalue * descont1;
		    System.out.println("Você tem 60 anos ou mais e ganhou mais um desconto de 5%");
		    System.out.printf("A compra que era de R$: %s passará a ser R$: %s. \n", newvalue, newvalue1);
		    
		} else if (age >= 60 && value >= 1000){
		    var descont2 = 0.9;
		    var newvalue2 = newvalue * descont2;
		    System.out.println("Você tem 60 anos ou mais e a sua compra atingiu os R$ 1000 ou mais.");
		    System.out.println("Com isso, você ganhou desconto de 10%.");
		    System.out.printf("A compra que seria de R$: %s passará a ser R$: %s.\n", newvalue, newvalue2);
		} else if (value >= 1000){
		    var descont3 = 0.95;
		    var newvalue3 = newvalue * descont3;
		    System.out.println("Sua compra atingiu ou passou dos R$ 1000.");
		    System.out.println("Com isso, você ganhou um desconto de 5%.");
		    System.out.printf("A compra que seria de R$: %s passará a ser R$: %s.\n", newvalue, newvalue3);
		}
	    } else if (payment == 2){
		System.out.println("|OPÇÕES DE CARTÃO|");
		System.out.println("[1] Débito");
		System.out.println("[2] Crédito");
		System.out.println(" ");
		System.out.println("Sua opção de cartão desejada aqui:");
		var card = scanner.nextInt();
		System.out.println(" ");

		if (card == 1){
		    var descont = 0.95;
		    var newvalue = value * descont;
		    System.out.println("Você irá concluir uma compra no cartão de débito");
		    System.out.printf("A compra que era de R$: %s ganhou um desconto de 5% e passará a ser R$: %s.\n ", value, newvalue);
		    if (age >= 60){
			var descont1 = 0.95;
			var newvalue1 = newvalue * descont1;
			System.out.println("Você tem 60 anos ou mais.");
			System.out.println("Você ganhará mais um desconto de 5%");
			System.out.printf("A compra que seria de R$: %s passará a ser R$: %s.\n",newvalue, newvalue1);
		    } else if (age >= 60 && value >= 1000){
			var descont2 = 0.9;
			var newvalue2 = newvalue * descont2;
			System.out.println("Você tem 60 anos ou mais e a sua compra atingiu ou passou do R$ 1000.");
			System.out.println("Com isso, você ganhou mais um desconto de 10%.");
			System.out.printf("A sua compra que seria de R$: %s passará a ser R$: %s.\n", newvalue, newvalue2);
		    } else if (value >= 1000){
			var descont3 = 0.95;
			var newvalue3 = newvalue * descont3;
			System.out.println("A sua compra atingiu ou passou dos R$ 1000.");
			System.out.println("Com isso, você ganhará mais um desconto de 5%.");
			System.out.printf("A sua compra que seria de R$: %s passará a ser R$: %s.\n", newvalue, newvalue3);
		    }
		
		} else if (card == 2){
		    System.out.println("Você irá concluir uma compra no cartão de crédito.");
		    System.out.println("Você não obterá um desconto nessa compra.");
		    System.out.printf("A compra sairá por R$: %s.\n " , value);
		    if (age >= 60){
			var descont4 = 0.95;
			var newvalue4 = value * descont4;
			System.out.println("Você tem 60 anos ou mais.");
			System.out.println("Com isso, você ganhará um desconto de 5%.");
			System.out.printf("A sua compra que seria de R$: %s passará a ser R$: %s. \n", value, newvalue4);
		    } else if (age >= 60 && value >= 1000){
			var descont5 = 0.9;
			var newvalue5 = value * descont5;
			System.out.println("Você tem 60 ou mais e a sua compra atingou ou passou dos R$ 1000");
			System.out.println("Com isso, você ganhará um desconto de 10%.");
			System.out.printf("A sua compra que seria de R$: %s passará a ser R$: %s. \n", value, newvalue5);
			
		    } else if (value >= 1000){
			var descont6 = 0.95;
			var newvalue6 = value * descont6;
			System.out.println("A sua compra atingou ou passou dos R$ 1000.");
			System.out.println("Com isso, você ganhará um desconto de 5%.");
			System.out.printf("A sua compra que seria de R$: %s passará a ser R$: %s. \n", value, newvalue6);
			
		    }
		}
	    } else if (payment == 3){
		var descont7 = 0.92;
		var newvalue7 = value * descont7;
		System.out.println("Você irá concluir uma compra no Dinheiro em Espécie");
		System.out.printf("A compra que era de R$: %s ganhou um desconto de 8% e passará a ser R$: %s.", value, newvalue7);
		if (age >= 60){
		    var descont8 = 0.95;
		    var newvalue8 = newvalue7 * descont8;
		    System.out.println("Você tem 60 anos ou mais.");
		    System.out.println("Com isso, você ganhará um desconto de 5%.");
		    System.out.printf("A sua compra que seria de R$: %s passará a ser R$: %s. \n", newvalue7, newvalue8);
		    
		} else if (age >= 60 && value >= 1000){
		    var descont9 = 0.9;
		    var newvalue9 = newvalue7 * descont9;
		    System.out.println("Você tem 60 anos ou mais e a sua compra atingou ou passou dos R$ 1000.");
		    System.out.println("Com isso, você ganhará um desconto de 10%.");
		    System.out.printf("A sua compra que seria de R$: %s passará a ser R$: %s. \n", newvalue7, newvalue9);
		    
		} else if (value >= 1000){
		    var descont10 = 0.95;
		    var newvalue10 = newvalue7 * descont10;
		    System.out.println("Você tem 60 anos ou mais e a sua compra atingiu ou passou dos R$ 1000.");
		    System.out.println("Com isso, você ganhará um desconto de 5%.");
		    System.out.printf("A sua compra que seria de R$: %s passará a ser R$: %s. \n", newvalue7, newvalue10);
		}
	    }
	} else {
	    System.out.println("Você é Menor de idade e não poderá concluir essa compra.");
	}
	System.out.println("A sua aplicação foi encerrada.");
    }
}
