/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrcCondicionales;

/**
 *
 * @author Yber-M
 */
public class Alumno {
    // Marlon Yber Quispe Olano - Yb.M;
    String nombre;
    String cod;
    private double not1;
    private double not2;
    private double not3;
    String asignatura;

    public Alumno(String nombre, String cod, double not1, double not2, double not3, String asignatura) {
        this.nombre = nombre;
        this.cod = cod;
        this.not1 = not1;
        this.not2 = not2;
        this.not3 = not3;
        this.asignatura = asignatura;
    }
    public double promedio() {
        return (not1 + not2 + not3)/3;
    }
    public double getNot1() {
        return not1;
    }

    public double getNot2() {
        return not2;
    }

    public double getNot3() {
        return not3;
    }
    
}