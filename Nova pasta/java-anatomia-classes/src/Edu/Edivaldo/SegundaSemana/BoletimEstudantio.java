package Edu.Edivaldo.SegundaSemana;
import javax.lang.model.util.ElementScanner6;

public class BoletimEstudantio {

    public static void main(String[] args) {
        
        int mediaFinal = 5;         
        if(mediaFinal<6)
        System.out.println("Reprovado");
        else if(mediaFinal == 6)
        System.out.println("Prova Minerva");
        else 
        System.out.println("Aprovado");
    }
    
}
