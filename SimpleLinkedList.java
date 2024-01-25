public class SimpleLinkedList {
    protected Node inicio;
    protected Node fim;
    protected long size;

    public SimpleLinkedList(){
        this.inicio = null;
        this.fim = null;
        this.size = 0;
    }

    public void adicionar(Integer element){
        Node newNode = new Node(element, null); //cria um novo Node
        if (size == 0) {  //verifica se o tamanho da lista é igual á zero (vazia)
            this.inicio = newNode; //adiciona o novo nó como nó incial
        }
        else{ //se a lista não for vazia
            this.fim.setNextNode(newNode); //direciona o proximo node do fim para o novoNode
        }
        this.fim = newNode; //adiciona o novo Node como o ultimo Node
        this.size++; //aumenta o tamanho da lista
    }



    public void percorrer(){

        if (this.size == 0) {
            System.out.println("lista vazia");
        }
        Node atual = this.inicio; //cria uma variavel atual do tipo node que aramzenará o Node inicial da lista

        for (int i = 0; i < this.size ; i++){ //faz um loop até o tamanho da lista
            System.out.println(atual.getElement()); //escreve o nó atual da lista
            atual = atual.getNextNode(); //sobescreve a variavel atual com o proximo nó da lista
            //repete todo o processo
        }
    }

    public void limpar(){
        for(Node atual = this.inicio; atual != null; ){ //cria uma variavel atual do tipo node que aramzenará o Node inicial da lista e faz um loop 
            Node proximo = atual.getNextNode(); // armazena o valor do proximo nó do atual
            atual.setElement(null); //transforma o elemento em null
            atual.setNextNode(null); //transforma oproximo elemento em null
            this.size  = this.size -1; //diminui o tamanho da lista
            atual = proximo; //e direciona o atual para o proximo nó armazenado na variavel proximo
            //repete todo processo enquanto não chegar no ultimo nó e o Node atual não for null
        }
    }

    @Override
    public String toString() {
        return "SimpleLinkedList [inicio=" + inicio + ", fim=" + fim + ", size=" + size + "]";
    }

    

    
}
