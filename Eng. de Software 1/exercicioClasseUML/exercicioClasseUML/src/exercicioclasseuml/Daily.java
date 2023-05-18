/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioclasseuml;

/**
 *
 * @author Fatec
 */
public class Daily {
    
    
    Usuario usuario=new Usuario();
    String conteudo;

    public void realizarDaily(Usuario usuario, String conteudo) {
        this.usuario = usuario;
        this.conteudo = conteudo;
    }

    public String mostrarDaily() {
        String daily = "";
        daily+= "------------------------------\n";
        daily+= "Nome: "+usuario.getNome()+"\n";
        daily+= "Conteudo: "+conteudo+ "\n";
        daily+= "------------------------------";

        return daily;

    }





}
