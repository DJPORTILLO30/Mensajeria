import  java.util.*;
public class main {

public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<String> Aviones = new Stack<String>();
        Queue<String> enfilados = new LinkedList<>();
        System.out.println("- - Bienvenido a Mensajeros del Aire - -");
        System.out.println("     ____\n" +
                "     \\\\  `.\n" +
                "      \\\\   `.\n" +
                "       \\ \\   `.\n" +
                "        \\\\GT-251`.\n" +
                "        :. . . . `._______________________.-~|~~-._\n" +
                "        \\                                 ---'-----`-._\n" +
                "         /\"\"\"\"\"\"\"/             _...---------..         ~-._________\n" +
                "        //     .`_________  .-`           \\ .-~           /\n" +
                "       //    .'       ||__.~             .-~_____________/\n" +
                "      //___.`           .~            .-~\n" +
                "                      .~           .-~\n" +
                "                    .~         _.-~\n" +
                "                    `-_____.-~'");
        Ingreso_Al_Hangar(Aviones);
        while (true){
            System.out.println("1.Aviones que estan en el hangar");
            System.out.println("2.Avion listo para salir del hangar");
            System.out.println("3.Aviones por despegar");
            System.out.println("4.Proximo avion a despegar");
            System.out.println("5.Salir");
            int menu = teclado.nextInt();
            if (menu==1){
                if(Aviones.isEmpty()){
                    System.out.println("El hangar esta vacio y todos los aviones estan enfilados");
                }else {
                    System.out.println("Aviones en el hangar " + Aviones);
                }

            }else if(menu==2){

                System.out.println("El avion listo para salir del hangar es: " + Aviones.peek());
                enfilados.add(Aviones.peek());
                Aviones.pop();

            }else if(menu==3){
                if(enfilados.isEmpty()){
                    System.out.println("Todos los aviones han despegado.");
                }else {
                    System.out.println("Aviones listos para despegar:" + enfilados);
                }


            }else if(menu==4){

                System.out.println("Avion listo para despegar" + enfilados.peek());
                enfilados.remove();

            }else if(menu==5){
                break;
            }
        }

    }



    static void Ingreso_Al_Hangar(Stack<String> stack) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese matricula del avion que ingresa al hangar: ");
            String  matricula = teclado.next();
            stack.push("GT-"+matricula);
        }

    }
}
