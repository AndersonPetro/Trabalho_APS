package ProjetoYoutube;

import org.testng.mustache.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        List<Video> videoList = List.of(new Video("Aula 1 de POO "),
                new Video("Aula 12 de PHP "),
                new Video("Aula 10 de HTML5 ")
        );

        Stream<String> stringStream = videoList.stream().map(Video::getTitulo);

        List<String> collect = videoList.stream().map(Video::getTitulo).collect(Collectors.toList());

        videoList.forEach(System.out::println);
        videoList.stream().map(Video::getTitulo).forEach(System.out::println);

        Usuario e1 = new Usuario("Julia 25", 25, "F", "juju");
        Usuario e12 = new Usuario("Julia 25", 25, "F", "juju");
        List<Usuario> usuarios = List.of(
                e1,
                new Usuario("Julia 22", 22, "F", "jaja"),
                new Usuario("Julia 21", 21, "F", "jeje"),
                new Usuario("Julia 15", 15, "F", "jiji"),
                new Usuario("Julia 18", 18, "F", "jojo"),
                new Usuario("Julia 29", 29, "F", "jpjp"),
                new Usuario("Julia 30", 30, "F", "jeji"),
                new Usuario("Julia 23", 23, "F", "jajo"),
                new Usuario("Julia 49", 49, "F", "juja")
        );

        boolean contains = usuarios.contains(e1);
        boolean contains2 = usuarios.contains(e12);

        usuarios.forEach( u -> System.out.println(u.equals(e12)));


        System.out.println(" EXEMPLO 1");

        List<Usuario> usuarios1 = new ArrayList<>();
        for (int i=0; i <= usuarios.size()-1; i++) {
            if(usuarios.get(i).getIdade() >= 25){
                usuarios1.add(usuarios.get(i));
            }
        }
        usuarios1.stream().map(Pessoa::getIdade).forEach(System.out::println);

        System.out.println(" EXEMPLO 2");

        List<Usuario> usuarios2 = new ArrayList<>();
        for (Usuario user: usuarios) {
            if(user.getIdade() >= 25){
                usuarios2.add(user);
            }
        }
        usuarios2.stream().map(Pessoa::getIdade).forEach(System.out::println);

        System.out.println(" EXEMPLO 3");

        List<Usuario> usuarios3 = new ArrayList<>();
        usuarios.forEach(u -> {
            if(u.getIdade() >= 25){
                usuarios3.add(u);
            }
        } );

        usuarios3.stream().map(Pessoa::getIdade).forEach(System.out::println);

        System.out.println(" EXEMPLO 4");
        usuarios.stream().map(Pessoa::getIdade).filter(idade -> idade >= 25 ).forEach(System.out::println);

        // v[0] = new Video("Aula 1 de POO ");
       // v[1] = new Video("Aula 12 de PHP ");
       // v[2] = new Video("Aula 10 de HTML5 ");

//        Usuario g[] = new Usuario[2];
//        g[0] = new Usuario("Pedro", 22, "M","Pedrinho");
//        g[1] = new Usuario("Ana", 12, "F","Aninha");
//
//        System.out.println(v[0].toString());
//        System.out.println(g[0].toString());
//
//        System.out.println(v[2].toString());
//        System.out.println(g[1].toString());

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