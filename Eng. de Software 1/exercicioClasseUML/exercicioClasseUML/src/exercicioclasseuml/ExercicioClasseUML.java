/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioclasseuml;

import javax.swing.JOptionPane;

/**
 *
 * @author Fatec
 */
public class ExercicioClasseUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Usuario usuario = new Usuario();
        usuario.setNome("Isaque");
        usuario.setSenha("paozin");
        Daily daily = new Daily();
        daily.realizarDaily(usuario, "Hoje eu estudei java");
        JOptionPane.showMessageDialog(null, daily.mostrarDaily());

    }
    
}
