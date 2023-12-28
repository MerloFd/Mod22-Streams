import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestListM {
    @Test
    public void TestMList(){
        // limpa pra garantir que ta vazia
        App.getListM().clear();

        App.getListM().add(new Pessoa("nome","m"));

        assertTrue(App.getListM().stream()
                .allMatch(pessoa-> pessoa.getGenero().equals("m")));
    }
}