import java.util.Scanner;

public class PossoVotarTernario {
    public static void main(String[] args) {
        System.out.print("Digite sua idade: ");
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        System.out.println(Voto(idade));
    }
    public static String Voto(int idade){
        String saida1 = (idade < 16) ? "Sem direito a votar" : "Pode votar";
        String saida2 = (idade < 18 || idade > 70) ? "Voto facultativo" : "Voto  obrigatório";


        return ((saida1.equals("Pode votar")) ? saida2 : saida1);
    }
}
