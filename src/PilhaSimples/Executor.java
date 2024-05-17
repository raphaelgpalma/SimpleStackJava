package PilhaSimples;

public class Executor {
    public static void main(String[] args){
        PilhaSimples pilhaSimples = new PilhaSimples(4);
        pilhaSimples.adicionarElemento(1);
        pilhaSimples.adicionarElemento(2);
        pilhaSimples.adicionarElemento(3);
        pilhaSimples.adicionarElemento(4);
        pilhaSimples.exibirElementos();
        System.out.println("---------------------------------------------");
        pilhaSimples.existeElemento(2);
        System.out.println("-----------------------------------------------");
        pilhaSimples.removerElemento();
        pilhaSimples.removerElemento();
        System.out.println("----------------------------------------------");
        pilhaSimples.exibirElementos();
        pilhaSimples.adicionarElemento(76);
        pilhaSimples.adicionarElemento(4000);

        System.out.println("----------------------------------------------------");
        pilhaSimples.exibirElementos();
        pilhaSimples.adicionarElemento(100);
    }
}
