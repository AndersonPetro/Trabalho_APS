package ProjetoPessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Anderson");
        p2.setNome("Julia");
        p3.setNome("Claudio");
        p4.setNome("Tais");

        p1.setSexo("M");
        p3.setSexo("M");
        p2.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);

        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        //Atributos errados nas classes
        //p1.receberAumento(550.20f);
        //p2.mudarTrabalho();
        //p4.cancelarMatr();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
