import java.util.Scanner;

public class VendaBebidasIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu pedido: ");
        int escolha = sc.nextInt();
        System.out.println("Resumo do seu pedido");
        System.out.println(Venda(escolha));
        sc.close();
    }

    public static String Venda(int escolha) {
        if (escolha==1){
            return ("Coca-Cola - R$ 5");
        } else if (escolha==2) {
            return ("Coca-Cola 0 - R$ 4.50");
        } else if (escolha==3) {
            return ("Pepsi - R$ 4,40");
        } else if (escolha==4) {
            return ("Guaraná Antartica - R$ 3,50");
        } else if (escolha==5) {
            return ("Fanta Laranja - R$ 4,23");
        } else if (escolha==6) {
            return ("Água - R$ 2,50");
        } else {
            System.out.println("Input inválido. ");
            return ("Digite um número inteiro entre 1 e 6: ");
        }
    }
}
