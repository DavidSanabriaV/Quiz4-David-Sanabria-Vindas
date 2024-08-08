/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz4;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiantes arrEstudiantes[] = new Estudiantes[10];

        SolicitudDeInformacion(arrEstudiantes);
        MostrarInformacion(arrEstudiantes);
       

        
    }

    public static void SolicitudDeInformacion(Estudiantes arrEstudiantes[]) {
        int suma = 0;
        for (int i = 0; i < arrEstudiantes.length; i++) {
            String NombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            String NombreProfesor = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
            String curso = JOptionPane.showInputDialog("Ingrese el nombre del curso: ");
            int Calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del estudiante: "));
            arrEstudiantes[i] = new Estudiantes(NombreEstudiante, curso, NombreProfesor, Calificacion);
            suma += Calificacion;

        }
    }

    public static void MostrarInformacion(Estudiantes arrEstudiantes[]) {
        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, arrEstudiantes);
        }
    }
}
   
