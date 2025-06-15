public class PilhaDinamica {
    private CelulaPilha topo;

    public void push(char agrupadores) {
        CelulaPilha novaCelula = new CelulaPilha();
        novaCelula.setDado(agrupadores);
        novaCelula.setAnterior(this.topo);
        this.topo = novaCelula;
    }

    public char pop() {
        if (!isEmpty()) {
            char dado = this.topo.getDado();
            this.topo = this.topo.getAnterior();
            return dado;
        } else {
            return '\0';
        }
    }

    public boolean isEmpty() {
        return this.topo == null;
    }

    public char topo() {
        if (!isEmpty()) {
            return this.topo.getDado();
        }
        else{
            return '\0';
        }
    }
}