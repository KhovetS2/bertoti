package exercicioclasseuml;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    
    private List<Usuario> listaUsuarios;
    private List<Daily> listaDaily;


    public Gerenciador() {
        listaUsuarios = new ArrayList<>();
        listaDaily = new ArrayList<>();
    }


    public void adicionarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void adicionarDaily(Daily daily) {
        listaDaily.add(daily);
    }

    public void adicionarTodasDailysDoUsuario(List<Daily> listaDailysUsuario) {
        for (Daily daily : listaDailysUsuario) {
            if (!listaDaily.contains(daily)) {
                adicionarDaily(daily);
            }
        }
    }

    public Usuario buscarUsuarioPorNomeESenha(String nome, String senha) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        return null;
    }



    public List<Daily> buscarTodasDailysDoUsuario(Usuario usuario) {
        List<Daily> listaDeRetorno = new ArrayList<>();

        for (Daily daily : listaDaily) {
            if (daily.getUsuario()== usuario) {
                listaDeRetorno.add(daily);
            }
        }
        return listaDeRetorno;
    }


    public void removerUsuario(Usuario usuario) {
        listaUsuarios.remove(usuario);
    }

    public void removerDaily(Daily daily) {
        listaDaily.remove(daily);
    }


}
