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

    public void remove(){
        No descida = raiz;
        No descida2 = raiz;
        int count = 0;

        while(descida != null){
            if(descida.getEsquerda() != null){
                descida = descida.getEsquerda();
                count ++;
            }
            descida = null;
        }
        
        if(count == 1){
            descida2.setEsquerda(null);
            return;
        }

        for(int i = 0; i < count; i++){
            descida2 = descida2.getEsquerda();
        }

        No ultimo = descida2.getEsquerda();
        if(ultimo.getDireita() != null){
            descida2.setEsquerda(ultimo.getDireita());
            return;
        }
        descida2.setEsquerda(null);
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
