package aulaEstruturaDeDados.generics;


public class Main {
    public static void main(String[] args){
        No<String> no1 = new No<>("Primeiro No");


        No<String> no2 = new No<>("Segundo No");
        no1.setProximoNo(no2);
        No<String> no3 = new No<>("Terceiro No");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Quarto No");
        no3.setProximoNo(no4);


        // No1 -> No2 -> No3 -> No4 -> null
        // Apontar sempre o proximo valor, esse é o conceito de encadeamento e NO
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);
        System.out.println(no2.getProximoNo());
        System.out.println(no4.getProximoNo());
        System.out.println("-------------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
