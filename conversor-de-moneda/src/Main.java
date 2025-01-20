import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    ConsultarMoneda consulta = new ConsultarMoneda();
    int opcion = 0;

    while (opcion != 8){
        System.out.println("--------------------------------------------------------------\n" +
                "------------------ [ CONVERSOR DE MONEDAS ] ------------------\n" +
                "--------------------------------------------------------------\n" +
                "Indique la conversion que desea realizar\n" +
                "[1] Dollar (USD) a Peso Argentino (ARS)\n" +
                "[2] Peso Argentino (ARS) a Dollar (USD)\n" +
                "[3] Dollar (USD) a Real Brasilero (BRL)\n" +
                "[4] Real Brasilero (BRL) a Dollar (USD)\n" +
                "[5] Dollar (USD) a Peso Colombiano (COP)\n" +
                "[6] Peso Colombiano (COP) a Dollar (USD)\n" +
                "[7] Convertir otra Moneda\n" +
                "[8] Salir");

        opcion = lectura.nextInt();
        lectura.nextLine();

        switch (opcion) {
            case 1:
                ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                break;
            case 2:
                ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                break;
            case 3:
                ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                break;
            case 4:
                ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                break;
            case 5:
                ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                break;
            case 6:
                ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                break;
            case 7:
                ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                break;
            case 8:
                System.out.println("¡Gracias por utilizar el conversor de monedas!");
                break;

            default:
                System.out.println("Opción no valida.");
                break;
        }


        }
    }
}