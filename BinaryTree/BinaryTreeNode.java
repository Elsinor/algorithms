public class BinaryTreeNode<T> {
private T label;
private BinaryTreeNode<T> parent, leftChild, rightChild;

public BinaryTreeNode(T label) {
        this.label = label;
        this.leftChild = null;
        this.rightChild = null;
}
/**
 * aggiunge il figlio sinistro a un nodo
 */
public void addLeft(T label) {
        this.leftChild = new BinaryTreeNode(label);
        this.leftChild.parent = this;
}

/**
 * aggiunge il figlio destro a un nodo
 */
public void addRight(T label) {
        this.rightChild = new BinaryTreeNode(label);
        this.rightChild.parent = this;
}
/**
 * aggiunge il figlio sinistro a un nodo
 */
public void addLeft(BinaryTreeNode<T> node) {
        this.leftChild = node;
        if (null != node)
                this.leftChild.parent = this;
}

/**
 * aggiunge il figlio destro a un nodo
 */
public void addRight(BinaryTreeNode<T> node) {
        this.rightChild = node;
        if (null != node)
                this.rightChild.parent = this;
}

/**
 * restituisce true se il nodo ha un figlio sinistro
 * @return {@code true} se il nodo ha un figlio sinistro
 *         {@code false} altrimenti
 */
public boolean hasLeft() {
        return null != this.leftChild;
}
/**
 * restituisce true se il nodo ha un figlio destro
 * @return {@code true} se il nodo ha un figlio destro
 *         {@code false} altrimenti
 */
public boolean hasRight() {
        return null != this.rightChild;
}
//////////////
//////////////
public BinaryTreeNode<T> getLeft() {
        return this.leftChild;
}

public BinaryTreeNode<T> getRight() {
        return this.rightChild;
}

/**
 *  rimuove il figlio sinistro
 */
public void removeLeft() {
        this.leftChild = null;
}

/**
 *  rimuove il figlio destro
 */
public void removeRight() {
        this.rightChild = null;
}

public T visit() {
        return label;
}

public static void main(String[] args) {
}

}
