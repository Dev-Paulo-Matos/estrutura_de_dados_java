package aulaEstruturaDeDados.referencia_e_memoria;

public class Main {
    public static void main(String[] args){

        int a = 1;
        int b = a;

        System.out.println("int A = " + a + " int b = " + b);
        a = 2;
        System.out.println("int A = " + a + " int b = " + b);

        MeuObj objA = new MeuObj(2);
        MeuObj objB = objA;
        System.out.println("int objA = " + objA + " int objB = " + objB);

        objA.setNum(1);

        System.out.println("int objA = " + objA + " int objB = " + objB);
    }
}
