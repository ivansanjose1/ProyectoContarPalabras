package primerodam;

import java.util.Scanner;

public class PruebaDebugger {

    public static void main(String[] args) {
        depurar clase = new depurar();
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        scan.close();
        double valor = clase.echaCuentas(entrada);
        System.out.println("Sale "+valor);
    }
}
