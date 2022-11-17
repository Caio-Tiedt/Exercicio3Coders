import java.util.Scanner;

public class PossoVotar {
    public static void main(String[] args) {
        System.out.print("Digite sua idade: ");
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        System.out.println(Voto(idade));

    }


    public static String Voto(int idade){
        if (idade < 16){
            return ("Sem direito a votar");
        } else if (idade < 18 || idade > 70) {
            return ("Voto facultativo");
        } else {
            return ("Voto  obrigatório");
        }
    }
}
