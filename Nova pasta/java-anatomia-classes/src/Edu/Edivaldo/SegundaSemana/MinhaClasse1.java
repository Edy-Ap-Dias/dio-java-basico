package Edu.Edivaldo.SegundaSemana;
public class MinhaClasse1 {
    public static void main(String[] args) {

        String primeiroNome = "Edivaldo";
        String segundoNome = "Ap Dias";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);

        
    }

    public static String nomeCompleto (String primeiroNome,String segundoNome) {

       return "Resultado do método é igual a " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
