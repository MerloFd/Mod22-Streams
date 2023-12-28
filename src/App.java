import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class App {

    private static List<Pessoa> listagem = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Listagem de pessoa por sexo masculino ou feminino usando Stream");

        String opcao = JOptionPane.showInputDialog(null,
                "Digite seu nome e genêro separados por virgula, da seguinte forma: nome-m ou f, ...",
                "Digite seu nome e genêro", JOptionPane.INFORMATION_MESSAGE);

        validar(opcao);

        System.out.println("---Listagem de nomes---");
        listagem.forEach(System.out::println);

        System.out.println("---Listagem de nomes masculinos---");
        getListM().forEach(i->System.out.println(i));

        System.out.println("---Listagem de nomes femininos---");
        getListF().forEach(i->System.out.println(i));

    }

    public static List<Pessoa> getListF (){
        return listagem.stream()
                .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("f"))
                .collect(toList());
    }

    public static List<Pessoa> getListM (){
        return listagem.stream()
                .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("m"))
                .collect(toList());
    }

    private static void validar(String dados) {
        // separa os dados por virgula
        String [] separaDados = dados.split(",");

        //separa novamente, mas agora entre nome - genero
        for (String dado : separaDados) {
            String [] nomeGenero = dado.split("-");
            listagem.add(new Pessoa(nomeGenero[0],nomeGenero[1]));
        };

        JOptionPane.showMessageDialog(null,
                "Pessoas cadastradas com sucesso!",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
    }
}