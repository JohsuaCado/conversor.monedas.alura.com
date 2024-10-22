import java.util.Scanner;
public class ConvertirMoneda extends Variables{
    public void convertir(String moneda){
        ConsultaApi consultaApi= new ConsultaApi();
        System.out.println("************************************************************\n"+
                "El cambio de hoy de un 1 "+codigo+" es igual a "+consultaApi.ConsultaApi().conversion_rate()
        +" "+moneda+"\n************************************************************");
        System.out.println("Ingrese la cantidad:");
        Scanner lectura2 = new Scanner(System.in);
        cantidad= lectura2.nextDouble();
        total=cantidad* consultaApi.ConsultaApi().conversion_rate();
        System.out.println(cantidad+" "+codigo+" "+total+" "+moneda);

    }
    public void convertirOtraMoneda(){
        ConsultaApi consultaApi= new ConsultaApi();
        System.out.println("Por favor ingrese el codigo del pais de la moneda que desa convertir:");
        Scanner lectura=new Scanner(System.in);
        moneda= lectura.nextLine();
        System.out.println("************************************************************\n"+
                "El cambio de hoy de un 1 "+codigo+" es igual a "+consultaApi.ConsultaApi().conversion_rate()
                +" "+moneda+"\n************************************************************");
        System.out.println("Ingrese la cantidad:");
        Scanner lectura2 = new Scanner(System.in);
        cantidad= lectura2.nextDouble();
        total=cantidad* consultaApi.ConsultaApi().conversion_rate();
        System.out.println(cantidad+" "+codigo+" "+total+" "+moneda);

    }

}
