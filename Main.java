public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.inserirNo(2);
        arvore.inserirNo(5);
        arvore.inserirNo(3);
        arvore.inserirNo(20);
        arvore.inserirNo(19);
        arvore.inserirNo(4);
        arvore.inserirNo(21);

        arvore.print();
        // System.out.println(arvore.getRaiz().getEsquerda());
        // System.out.println(arvore.getRaiz().getEsquerda().getEsquerda());
        // System.out.println(arvore.getRaiz().getEsquerda().getEsquerda().getDireita());
        System.out.println(arvore.getRaiz().getDireita());
        System.out.println(arvore.getRaiz().getDireita().getEsquerda());

        System.out.println(arvore.getRaiz().getDireita().getDireita());

        System.out.println("---------------------------------------");

        arvore.removeMenor();
        arvore.print();
        // System.out.println(arvore.getRaiz().getEsquerda());
        // System.out.println(arvore.getRaiz().getEsquerda().getEsquerda());
        // System.out.println(arvore.getRaiz().getEsquerda().getEsquerda().getDireita());
        System.out.println(arvore.getRaiz().getDireita());
        System.out.println(arvore.getRaiz().getDireita().getDireita());
        System.out.println(arvore.getRaiz().getDireita().getEsquerda());




    }
}
