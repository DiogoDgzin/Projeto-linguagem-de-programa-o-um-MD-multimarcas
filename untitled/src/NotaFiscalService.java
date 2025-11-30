import java.util.List;
import java.util.ArrayList;

public class NotaFiscalService {

    private final List<NotaFiscal> notas = new ArrayList<>();

    public NotaFiscal emitirNota(Venda venda) {
        NotaFiscal nota = new NotaFiscal((long) (notas.size() + 1), venda);
        notas.add(nota);
        return nota;
    }

    public List<NotaFiscal> listarNotas() {
        return notas;
    }
}
