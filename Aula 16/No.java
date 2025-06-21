public class No {
    Documento documento; // Alterado de valor para documento
    No proximo;
    No anterior;

    public No(Documento documento) { // Alterado o parâmetro do construtor
        this.documento = documento;
        this.proximo = null;
        this.anterior = null;
    }
}