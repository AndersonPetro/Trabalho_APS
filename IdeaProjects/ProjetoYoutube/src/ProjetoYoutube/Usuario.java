package ProjetoYoutube;

public class Usuario extends Pessoa{
    //Atributos Animal
    private String login;
    private int totAssistindo;

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
