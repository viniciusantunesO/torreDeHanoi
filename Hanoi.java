import java.util.ArrayList;
/**
 * Escreva uma descrição da classe main aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Hanoi
{   
    public void torre(int n, String origem, String auxiliar, String destino){
        if (n==1){
            System.out.println("Moveu disco 1 de "+origem+" para "+destino);
        }
        else{
            torre(n - 1, origem, auxiliar, destino);
            System.out.println("Moveu disco " + n + " de " + origem + " para " + destino);
            torre(n - 1, auxiliar, destino, origem);
        }
    }
    
    public static void main(String[] args){
        Hanoi h=new Hanoi();
        int n =3;
        h.torre(n, "A", "B", "C");
    }
}