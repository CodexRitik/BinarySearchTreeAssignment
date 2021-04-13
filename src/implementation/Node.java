package implementation;

public class Node<E extends Comparable<E>> implements myinterface.Node<E> {
    //complete node class
    private E data;
    private Node<E> left;
    private Node<E> right;

    public Node(E data){
        this.data = data;
        left = null;
        right = null;
    }

    public Node<E> getLeft() {
        return left;
    }

    public Node<E> getRight() {
        return right;
    }

    @Override
    public void setLeft(myInterface.Node<E> left) {
        this.left = (Node<E>) left;
    }
    @Override
    public void setRight(myInterface.Node<E> right) {
        this.right = (Node<E>) right;
    }
    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
