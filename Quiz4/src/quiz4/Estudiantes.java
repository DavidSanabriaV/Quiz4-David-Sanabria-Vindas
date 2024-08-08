/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz4;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Estudiantes {

    //Atributos 
    public String NombreEstudiante;
    public String curso;
    public String NombreProfesor;
    public int Calificacion;
    public int suma = 0;
    public int promedio = 0;
    public int notamayor = 0;
    public int notamenor = 100;

    //Constructor
    public Estudiantes(String NombreEstudiante, String curso, String NombreProfesor, int Calificacion) {
        this.NombreEstudiante = NombreEstudiante;
        this.curso = curso;
        this.NombreProfesor = NombreProfesor;
        this.Calificacion = Calificacion;
    }
    //Setter y Getter

    public String getNombreEstudiante() {
        return NombreEstudiante;
    }

    public void setNombreEstudiante(String NombreEstudiante) {
        this.NombreEstudiante = NombreEstudiante;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombreProfesor() {
        return NombreProfesor;
    }

    public void setNombreProfesor(String NombreProfesor) {
        this.NombreProfesor = NombreProfesor;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }

    public void SolicitudDeInformacion(Estudiantes arrEstudiantes[]) {
        for (int i = 0; i < arrEstudiantes.length; i++) {
            NombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            NombreProfesor = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
            curso = JOptionPane.showInputDialog("Ingrese el nombre del curso: ");
            Calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del estudiante: "));
            arrEstudiantes[i] = new Estudiantes(NombreEstudiante, curso, NombreProfesor, Calificacion);
            suma += Calificacion;
        }
    }

    public void MostrarInformacion(Estudiantes arrEstudiantes[]) {
        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, arrEstudiantes);
        }
    }

    public void CalculoNotaMayor(Estudiantes arrEstudiantes[]) {
        for (int i = 0; i < arrEstudiantes.length; i++) {
            if (notamayor < Calificacion) {
                notamayor = Calificacion;
            }
        }
        JOptionPane.showMessageDialog(null, "La nota mayor es: " + notamayor);
    }

    public void CalculoNotaMenor(Estudiantes arrEstudiantes[]) {
        for (int i = 0; i < arrEstudiantes.length; i++) {
            if (notamenor > Calificacion) {
                notamayor = Calificacion;
            }
        }
        JOptionPane.showMessageDialog(null, "La nota mayor es: " + notamenor);
    }

    public void CalcucloPromedio() {
        promedio = suma / 10;
        JOptionPane.showMessageDialog(null, "El promedio es de: " + promedio);
    }
     
    

