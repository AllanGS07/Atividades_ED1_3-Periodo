public class No {
    Documento documento;
    No proximo;
    No anterior;

    public No(Documento documento) {
        this.documento = documento;
        this.proximo = null;
        this.anterior = null;
    }
}