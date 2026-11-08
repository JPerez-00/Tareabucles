import java.util.Scanner;

public class bucle7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;

        System.out.println("Hasta que número quieres que cuente?");
        System.out.print("Número: ");
        int numusuario= sc.nextInt();

        while (numero<=numusuario) {
            System.out.println("Número: "+numero);
            numero++;
        }
        System.out.println("He llegado al número "+numusuario);

        numero=0;
        System.out.print("Dime otro numero: ");
        numusuario= sc.nextInt();

        do {
            System.out.println("Numero: "+numero);
            numero++;
        } while (numero<=numusuario);

        System.out.println("He llegado a "+numusuario);

        System.out.print("Dime otro numero: ");
        numusuario= sc.nextInt();

        for (numero=0;numero<=numusuario;numero++){
            System.out.println("Número: "+numero);
        }
        System.out.println("Ya he llegado al numero "+numusuario);
    }
}
