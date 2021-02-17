package ProjetoYoutube;

import java.util.Objects;

public class Usuario extends Pessoa{
    //Atributos Animal
    private String login;
    private int totAssistindo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return nome.equals(usuario.getNome()) && idade == usuario.getIdade();
    }


    @Override
    public int hashCode() {
        return Objects.hash(login, totAssistindo);
    }

    public Usuario(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistindo = 0;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "Usuario{" + super.toString() +
                "\nlogin=" + login +
                ", totAssistindo=" + totAssistindo +
                '}';
    }
}
