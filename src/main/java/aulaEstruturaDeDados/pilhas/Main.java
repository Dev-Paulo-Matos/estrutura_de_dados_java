package aulaEstruturaDeDados.pilhas;

public class Main {
    public static void main(String[] args){
        Pillha minhaPilha = new Pillha();

        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));

        System.out.println(minhaPilha);
        System.out.println(minhaPilha.top().getRef());
        System.out.println(minhaPilha);
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);
    }
}
