import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombrearanha = "";
        int opcion;
        int vida = 100;
        int distancia;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("==========================================================");
        System.out.println("\nBIENVENIDO A LA AVENTURA DE LA ARAÑA");
        System.out.println("Primero tienes que darle un nombre, como quieres que sellame la araña?: ");
        nombrearanha = input.nextLine();

        System.out.println("\n==========================================================");
        System.out.println(nombrearanha + " comienza la aventura empiezas con 100 de vida intenta sobrevivir en el liceo");
        System.out.println("\nSITUACION 1:");
        System.out.println("Pulsa 1 si decides entrar a la clase de DAM por la ventana");
        System.out.println("Pulsa 2 si decides entrar a la clase de DAM por los conductos de ventilacion\n");
        opcion = input.nextInt();
        if (opcion != 1 && opcion != 2) {
            do {
                System.out.println("opcion incorrecta pulsa 1 o 2 : ");
                opcion = input.nextInt();
            } while (opcion != 1 && opcion != 2);
        }
        if (opcion == 1) {
            System.out.println(nombrearanha + " Entraste sin complicaciones a la clase bien hecho...");
            System.out.println("VIDA ACTUAL: " + vida + " ===================");

        } else if (opcion == 2) {
            vida -= 25;
            System.out.println(nombrearanha + "Los conductos estaban muy calientes debido al calor y sufriste daño...");
            System.out.println("VIDA ACTUAL: " + vida + " ===================");
        }

        System.out.println("\nSITUACION 2:");
        System.out.println("Pulsa 1 si decides Bajar usando telarañas desde el techo");
        System.out.println("Pulsa 2 si decides Bajar por la pared\n");
        opcion = input.nextInt();
        if (opcion != 1 && opcion != 2) {
            do {
                System.out.println("opcion incorrecta pulsa 1 o 2 : ");
                opcion = input.nextInt();
            } while (opcion != 1 && opcion != 2);
        }
        if (opcion == 1) {
            vida -= 25;
            System.out.println("Tu telaraña no es muy fuerte y sufres una gran caida...");
            System.out.println("VIDA ACTUAL: " + vida + " ===================\n");

            System.out.println(nombrearanha + "QUE QUIERES HACER AHORA?");
            System.out.println("Pulsa 1 si decides volver a intentarlo ya que todos en la clase se rieron de ti...");
            System.out.println("Pulsa 2 si decides continuar a la siguiente habitacion\n");
            opcion = input.nextInt();
            if (opcion != 1 && opcion != 2) {
                do {
                    System.out.println("opcion incorrecta pulsa 1 o 2 : ");
                    opcion = input.nextInt();
                } while (opcion != 1 && opcion != 2);
            }
            if (opcion == 1) {
                vida -= 25;
                System.out.println(nombrearanha + " TE VOLVISTE A CAER DE NUEVO!!! QUE VERGUENZA, SIMPLEMENTE AVANZAS A LA SIGUIENTE HABITACIÓN...");
                System.out.println("VIDA ACTUAL: " + vida + " ===================\n");

            } else if (opcion == 2) {
                System.out.println("Tardas un poco en avanzar ya que te estas recuperando del golpe...");
                System.out.println("VIDA ACTUAL: " + vida + " ===================\n");
            }


        } else if (opcion == 2) {
            System.out.println("Tardaste más pero era la opcion más segura...");
            System.out.println("VIDA ACTUAL: " + vida + " ===================\n");
        }

        System.out.println("\nSITUACION 3:");
        System.out.println("Pulsa 1 si decides entrar al baño...");
        System.out.println("Pulsa 2 si decides ir a la cocina\n");
        opcion = input.nextInt();
        if (opcion != 1 && opcion != 2) {
            do {
                System.out.println("opcion incorrecta pulsa 1 o 2 : ");
                opcion = input.nextInt();
            } while (opcion != 1 && opcion != 2);
        }
        if (opcion == 1) {
            vida -= 25;
            System.out.println("El suelo esta mojado y recibiste daño, chocaste contra un pie POR POCO TE PISAN !!...");
            System.out.println("VIDA ACTUAL: " + vida + " ===================\n");

            System.out.println("\nSITUACION 4:");
            System.out.println("Pulsa 1 si decides salir por la ventana del baño...");
            System.out.println("Pulsa 2 si decides volver a la clase de DAM y salir por la ventana \n");
            opcion = input.nextInt();
            if (opcion != 1 && opcion != 2) {
                do {
                    System.out.println("opcion incorrecta pulsa 1 o 2 : ");
                    opcion = input.nextInt();
                } while (opcion != 1 && opcion != 2);
            }
            if (opcion == 1) {

                System.out.println(nombrearanha + " TE COMIO UN PAJARO...");
                System.out.println(" ============================ U LOSE ==========================");


            } else if (opcion == 2) {
                System.out.println("El profe de PRO te deja salir por la ventana...");
                System.out.println(" ============================ U WIN ==========================");
                System.out.println("Felicidades sobreviviste con " + vida + " de vida...");
            }


        } else if (opcion == 2) {
            System.out.println("AAAAA UNA ESTAMPIDA DE NIÑOS IMPOSIBLE ESQUIVARLOS, TE PISARON Y MORISTE");
            System.out.println(" ============================ U LOSE ==========================");
        }
    }
}