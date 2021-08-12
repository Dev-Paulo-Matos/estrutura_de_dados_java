package aulaEstruturaDeDados.referencia_e_memoria;

public class MeuObj {
    Integer num;

    public MeuObj(int i) {
        this.num = i;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }

    public void setNum(Integer num){
        this.num = num;
    }
}
