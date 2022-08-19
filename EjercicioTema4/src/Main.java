
public class Main {
    public static void main(String[] args) {
        //if
        System.out.println("---If---");
        int numeroIf = 8;
        if (numeroIf > 0){
            System.out.println("El numero es positivo "+numeroIf);
        } else if (numeroIf < 0){
            System.out.println("El numero es negativo "+numeroIf);
        } else {
            System.out.println("El numero es cero "+numeroIf);
        }

        //bucle While
        System.out.println("---bucle While---");
        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile ++;
        }

        //bucle Do While
        System.out.println("---bucle Do While---");
        int numeroDoWhile = 3;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile ++;
        }while (numeroDoWhile < 3);

     //For
        System.out.println("---bucle For---");
        for (int numeroFor = 0; numeroFor <=3; numeroFor++){
            System.out.println(numeroFor);
        }

       //case
        System.out.println("---case---");
        String estacion = "VERANO";
        switch (estacion){
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("El valor no es una estacion");
                break;
        }
    }
}