import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestListF {
    @Test
    public void TestFList(){
        //simulação de como deveria ser o processo de adição/validação na list, contando com a regra do App

        // limpa pra garantir que ta vazia
        App.getListF().clear();

        App.getListF().add(new Pessoa("nome","f"));

        assertTrue(App.getListF().stream()
                .allMatch(pessoa-> pessoa.getGenero().equals("f")));
    }
}