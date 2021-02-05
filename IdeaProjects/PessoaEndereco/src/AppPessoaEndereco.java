import java.util.Scanner;

public class AppPessoaEndereco {
    public static  void main (String [] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        char resp ;
        //Objeto Pessoa e Endereco
        Pessoa p = new Pessoa();
        Endereco end = new Endereco();

        //dados da pessoa
        System.out.println("Digite o nome:");
        p.setNome(entradaString.nextLine());
        System.out.println("Digite o Idade:");
        p.setIdade(entrada.nextInt());
        System.out.println("Digite o sexo (f/m): ");
        p.setSexo(entrada.next().charAt(0));

        //dados do endereco
        System.out.println("Digite seu endereco:");
        end.setLogradouro(entradaString.nextLine());
        System.out.println("Digite o numero:");
        end.setNumero(entrada.nextInt());

        System.out.println("tem complemento:");
        resp = entrada.next().charAt(0);

        if (resp == 's'){
          System.out.println("Digite o complemento: ");
          end.setComplemento(entradaString.nextLine());
          }else {
            end.setComplemento("");
        }
        System.out.println("Digite o CEP:");
        end.setCep(entradaString.nextLine());

        //associação entre pessoa e endereco
        p.setEnd(end);

        System.out.println("Dados da Pessoa: " + p.imprimir());



    }
}
