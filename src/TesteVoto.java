import java.util.Objects;

public class TesteVoto {
    public static void main(String[] args) {
        int[] idades = new int[9];
        String[] saidas = new String[9];
        idades[0]=18;
        saidas[0]="Voto  obrigatório";
        idades[1]=70;
        saidas[1]="Voto  obrigatório";
        idades[2]=45;
        saidas[2]="Voto  obrigatório";
        idades[3]=15;
        saidas[3]="Sem direito a votar";
        idades[4]=10;
        saidas[4]="Sem direito a votar";
        idades[5]=5;
        saidas[5]="Sem direito a votar";
        idades[6]=71;
        saidas[6]="Voto facultativo";
        idades[7]=17;
        saidas[7]="Voto facultativo";
        idades[8]=16;
        saidas[8]="Voto facultativo";
        for (int i=0;i< idades.length;i++){
            if (Objects.equals(saidas[i], PossoVotar.Voto(idades[i]))){
                System.out.println("Teste " + i + "- Sucesso");
            } else {
                System.out.println("Teste " + i + " - Falha");
            }
        }
    }
}
