import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    Carro objC = new Carro();

    System.out.print("Digite o nome do carro: ");
    objC.modelo = sc.next();

    System.out.print("O nome do carro é: "+objC.modelo);
       
        



    }
}