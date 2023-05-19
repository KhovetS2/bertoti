/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioclasseuml;

import java.util.List;

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

        Usuario usuario = new Usuario("Isaque","paozin");
        Usuario usuario2 = new Usuario("Danilo","Artista");
        
        Daily daily = new Daily();
        daily.realizarDaily(usuario2, "Adicionei hovers nas telas");
        Daily daily2 = new Daily();
        daily2.realizarDaily(usuario2, "Adicionei atalhos no programa");
        usuario2.adicionarDaily(daily);
        usuario2.adicionarDaily(daily2);
        Daily daily3 = new Daily();
        daily3.realizarDaily(usuario, "Adicionei Date picker nas telas de cadastrar");
        Daily daily4 = new Daily();
        daily4.realizarDaily(usuario, "Adicionei time picker nas telas de cadastrar");
        usuario.adicionarDaily(daily3);
        usuario.adicionarDaily(daily4);


        Gerenciador gerenciador = new Gerenciador();
        gerenciador.adicionarUsuario(usuario);
        gerenciador.adicionarUsuario(usuario2);

        gerenciador.adicionarTodasDailysDoUsuario(usuario.getListaDaily());
        gerenciador.adicionarTodasDailysDoUsuario(usuario2.getListaDaily());

        Usuario usuario3 = gerenciador.buscarUsuarioPorNomeESenha("Isaque", "paozin");

        List<Daily> listaDailys = gerenciador.buscarTodasDailysDoUsuario(usuario3);
        
        for (Daily daily5 : listaDailys) {
            System.out.println(daily5.mostrarDaily());
        }

        gerenciador.adicionarTodasDailysDoUsuario(usuario.getListaDaily());
        
        List<Daily> listaDailys2 = gerenciador.buscarTodasDailysDoUsuario(usuario3);
        
        for (Daily daily5 : listaDailys2) {
            System.out.println(daily5.mostrarDaily());
        }

        gerenciador.removerUsuario(usuario3);

        for (Daily daily5 : listaDailys2) {
            gerenciador.removerDaily(daily5);
        }
        System.out.println(gerenciador.buscarTodasDailysDoUsuario(usuario3).size());
    }
    
}
