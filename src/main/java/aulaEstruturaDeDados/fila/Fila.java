package aulaEstruturaDeDados.fila;

public class Fila {
    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;

    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;

    }
    public No first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    primeiroNo.toString();
                    break;
                }
            }
        }
        return null;
    }

    public No dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No auxiliarNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    auxiliarNo = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    auxiliarNo.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;

    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No auxiliarNo = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto =" + auxiliarNo.getObject() + "} ] --------->\n";
                if(auxiliarNo.getRefNo() != null){
                    auxiliarNo = auxiliarNo.getRefNo();

                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
