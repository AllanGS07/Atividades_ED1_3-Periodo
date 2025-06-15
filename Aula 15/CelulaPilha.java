public class CelulaPilha {
    private char dado;
    private CelulaPilha anterior;

    public CelulaPilha() {}

    public CelulaPilha(char dado, CelulaPilha anterior) {
        this.dado = dado;
        this.anterior = anterior;
    }

    public char getDado() {
        return this.dado;
    }

    public void setDado(char dado) {
        this.dado = dado;
    }

    public CelulaPilha getAnterior() {
        return this.anterior;
    }

    public void setAnterior(CelulaPilha anterior) {
        this.anterior = anterior;
    }
}