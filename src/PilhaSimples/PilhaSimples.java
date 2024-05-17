package PilhaSimples;

public class PilhaSimples {
    private int tamanho;
    private Integer lista[];
    private int topo;


    // 1- Validação do atributo tamanho
    public PilhaSimples(int tamanho) {
        this.tamanho = tamanho;
        this.lista = new Integer[this.tamanho];
        this.topo = -1;
        System.out.println("A pilha simples foi criada.");
    }

    public boolean vazio() {
        return topo == -1;
    }

    public boolean cheio() {
        return topo == lista.length - 1;
    }

    public void exibirElementos() {
        for (int i = 0; i < this.tamanho ; i++) {
            System.out.println(lista[i]);
        }
    }

    public void adicionarElemento(int elemento) {
        if (cheio()) {
            System.out.println("A pilha está cheia!");
            return;
        }
        topo = topo + 1;
        lista[topo] = elemento;

    }

    public void removerElemento(){
        if(vazio()){
            System.out.println("Nao ha nanhum elemento para a remocao.");
        }else{
            lista[topo] = null;
            topo = topo - 1;
        }

    };



    public boolean existeElemento(Integer elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if(lista[i] == elemento) {
                System.out.println("O elemento " + elemento + " está presente na lista.");
                return true;
            }
        }
        System.out.println("O elemento " + elemento + " não está presente na lista.");
        return false;
    }


}

