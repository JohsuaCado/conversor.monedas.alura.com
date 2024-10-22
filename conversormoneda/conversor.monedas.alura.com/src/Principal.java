import java.util.Scanner;

public class Principal extends Variables{
    public static void main(String[] args){
        ConvertirMoneda convertirMoneda = new ConvertirMoneda();
        Scanner lectura = new Scanner(System.in);
        System.out.println("************************************************************\n"
                + "Por favor introduzca el codigo de la moneda de su region:");
        codigo = lectura.nextLine();
        while (opcion!=9) {
            System.out.println("************************************************************\n"
                    + "Por favor eliga alguna de siguientes opciones:");
            System.out.println("************************************************************\n"
                    + "1)De " + codigo + " a ARS-Peso Argentino\n"
                    + "2)De " + codigo + " a BOB - Boliviano boliviano\n"
                    + "3)De " + codigo + " a BRL - Real brasileño\n"
                    + "4)De " + codigo + " a CLP - Peso chileno\n"
                    + "5)De " + codigo + " a COP - Peso colombiano\n"
                    + "6)De " + codigo + " a USD - Dólar estadounidense\n"
                    + "7)De " + codigo + " a otro\n"
                    + "9) Salir\n"
                    + "************************************************************");
            Scanner lectura1 = new Scanner(System.in);
            opcion = lectura1.nextInt();
            switch (opcion) {
                case 1:
                    convertirMoneda.convertir(moneda="ARS");
                    break;
                case 2:
                    convertirMoneda.convertir(moneda="BOB");
                    break;
                case 3:
                    convertirMoneda.convertir(moneda="BRL");
                    break;
                case 4:
                    convertirMoneda.convertir(moneda="CLP");
                    break;
                case 5:
                    convertirMoneda.convertir(moneda="COP");
                    break;
                case 6:
                    convertirMoneda.convertir(moneda="USD");
                    break;
                case 7:
                    convertirMoneda.convertirOtraMoneda();
                    break;
                case 9:
                    System.out.println("Gracias por confiar en nosotros");
                    break;

                default: {

                    System.out.println("Opcion incorrecta");
                }
            }
        }
    }
}
