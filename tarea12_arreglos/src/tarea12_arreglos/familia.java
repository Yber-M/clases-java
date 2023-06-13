package tarea12_arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Yb.M
 */
public class familia {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int per = 1, fam = 1, famMostrar = 1;
        person[][] personas = new person[5][4];
        person p;

        for (int i = 0; i < personas.length; ++i) {
            for (int j = 0; j < personas[i].length; ++j) {

                System.out.println("----------- Miembro " + per + " de la Familia " + fam + " -----------");
                per++;

                System.out.print("DNI : ");
                String DNI = bf.readLine();

                System.out.print("Nombres : ");
                String name = bf.readLine();
                System.out.print("Apellidos : ");
                String apellido = bf.readLine();

                System.out.print("Edad : ");
                int edad = sc.nextInt();

                System.out.print("Sueldo : ");
                double sueldo = sc.nextDouble();

                p = new person(DNI, name, apellido, edad, sueldo);
                personas[i][j] = p;

            }
            fam++;
            per = 1;
        }

        double totalXfam = 0.0d;
        System.out.println("----------------//RESULTADOS\\----------------");
        for (int i = 0; i < personas.length; ++i) {
            System.out.println("-------- Familia " + famMostrar + " --------");
            for (int j = 0; j < personas[i].length; ++j) {

                totalXfam += personas[i][j].sueldo;
                System.out.println(personas[i][j].mostrar());

            }
            famMostrar++;
            System.out.println("\nSueldo Total de la familia S/" + totalXfam);

            totalXfam = 0.0d;

            if (famMostrar < 6) {
                System.out.println("\n-------------- SIGUIENTE FAMILIA --------------\n");
            } else {
                System.out.println("\n-------------- FIN DEL PROGRAMA --------------\n");
            }
        }

    }

}
//@uthor: {Yb.M};
