class Node{
    private Integer element;
    private Node nextNode;

    public Node(Integer element, Node nextNode ){
        this.element = element;
        this.nextNode = nextNode;
    }

    public Integer getElement(){
        return this.element;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public void setElement(Integer newElement){
        this.element = newElement;
    }
    public void setNextNode(Node newNext){
        this.nextNode = newNext;
    }

    @Override
    public String toString() {
        return "Node [element=" + element + ", nextNode=" + nextNode + "]";
    }


}