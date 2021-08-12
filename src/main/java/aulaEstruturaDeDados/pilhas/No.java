package aulaEstruturaDeDados.pilhas;

public class No {
    private int dado;
    private No ref = null;
    public No() {

    }

    public int getDado() {
        return dado;
    }

    public No getRef() {
        return ref;
    }

    public No(int dado) {
        this.dado = dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public void setRef(No ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
