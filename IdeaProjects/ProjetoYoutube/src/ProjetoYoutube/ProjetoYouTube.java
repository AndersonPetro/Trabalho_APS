package ProjetoYoutube;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO ");
        v[1] = new Video("Aula 12 de PHP ");
        v[2] = new Video("Aula 10 de HTML5 ");

        Usuario g[] = new Usuario[2];
        g[0] = new Usuario("Pedro", 22, "M","Pedrinho");
        g[1] = new Usuario("Ana", 12, "F","Aninha");

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());

        System.out.println(v[2].toString());
        System.out.println(g[1].toString());

       // Visualizacao vis [] = new Visualizacao[5];
       // vis[0] = new Visualizacao(g[0], v[2]); //pedro assisti html5
       // System.out.println(vis.toString());

       // vis[1] = new Visualizacao(g[0], v[1]); //pedro assiste php
       // vis[0].avaliar(87.0f);
        //System.out.println(vis[0].toString());

       // System.out.println("Videos\n-----------------------");
      // System.out.println(v[0].toString());
       //System.out.println(v[1].toString());
       // System.out.println(v[2].toString());
       // System.out.println("\nEspectador\n-----------------------");
        //System.out.println(g[0].toString());
        //System.out.println(g[1].toString());
    }
}