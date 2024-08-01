public class Arvore {
    private No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void inserirNo(int dado){
        No novoNo = new No(dado);

        if(raiz == null){
            raiz = novoNo;
        } else {
            int primeiro = raiz.getDado();
            No descida = raiz;

            while (descida != null) {
                if(primeiro > dado){
                    if(descida.getEsquerda() != null){
                        descida = descida.getEsquerda();
                        primeiro = descida.getDado();
                    } else {
                        descida.setEsquerda(novoNo);
                        descida = null;
                    }
                } else {
                    if(descida.getDireita() != null){
                        descida = descida.getDireita();
                        primeiro = descida.getDado();
                    } else {
                        descida.setDireita(novoNo);
                        descida = null;
                    }
                }
            }

            


        }
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public void print(){
        System.out.println(raiz);
    }


}
