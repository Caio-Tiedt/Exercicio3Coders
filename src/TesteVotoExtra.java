import java.util.Objects;

public class TesteVotoExtra {
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

        String[] resultadoTestes  = ResultadoTestes(idades,saidas);

        boolean erro=false;

        for (String s : resultadoTestes){
            if (s.endsWith("a")){
                erro = true;
                break;
            }
        }


        if (!erro){
            System.out.println("Testes executados com sucesso");
        } else {
            System.out.println("Os seguintes testes falharam: ");
            for (int i =0;i< resultadoTestes.length; i++){
                if (resultadoTestes[i].endsWith("a")){
                    System.out.println("Teste " + i + " - Resultado: "+ PossoVotar.Voto(idades[i])+ " - Correto: "+ saidas[i]);
                }
            }
        }

    }

    public static String[] ResultadoTestes(int[] idades, String[] saidas){
        String[] resultadoTestes  = new String[9];
        for (int i=0;i< idades.length;i++){
            if (Objects.equals(saidas[i], PossoVotar.Voto(idades[i]))){
                resultadoTestes[i] = "Teste " + i + "- Sucesso";
            } else {
                resultadoTestes[i] = "Teste " + i + " - Falha";
            }
        }
        return resultadoTestes;
    }
}
