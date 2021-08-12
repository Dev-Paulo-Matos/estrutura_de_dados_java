package aulaEstruturaDeDados.pilhas;

public class Pillha {
    private No refNoEntradaPilha;

    public Pillha() {
        this.refNoEntradaPilha = null;
    }
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRef(refAuxiliar);
    }
    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRef();
            return noPoped;

        }
        return null;
    }
    public No top(){
        return refNoEntradaPilha;
    }
    public Boolean isEmpty() {
//        if(refNoEntradaPilha == null){
//            return true;
//        }
//        return false;
        return refNoEntradaPilha == null ? true : false;
    }
    @Override
    public String toString(){
        String stringRetorno ="-------------\n";
        stringRetorno += "   Pilha \n";
        stringRetorno += "------------- \n" ;
        No noAuxiliar = refNoEntradaPilha;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{ dado= " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRef();
            }else{
                break;
            }
        }
        stringRetorno += "===========\n";
        return stringRetorno;
    }
}
