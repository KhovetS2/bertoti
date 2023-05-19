/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioclasseuml;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fatec
 */
public class Usuario {

    private String nome;
    private String senha;
    private List<Daily> listaDaily;


    

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        listaDaily = new ArrayList<>();
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public List<Daily> getListaDaily() {
        return this.listaDaily;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void adicionarDaily(Daily daily) {
        listaDaily.add(daily);
    }

    public void removerDaily(Daily daily) {
        listaDaily.remove(daily);
    }

    public Daily buscarDaily(String conteudo) {
        for (Daily daily : listaDaily) {
            if (daily.getConteudo().equals(conteudo)) {
                return daily;
            }
        }
        return null;
    }

}
