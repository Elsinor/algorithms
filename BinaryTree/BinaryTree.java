import java.util.*;


public class BinaryTree<T> {

private BinaryTreeNode<T> root;

public BinaryTree() {
}

public BinaryTreeNode<T> getRoot() {
        return root;
}

private BinaryTreeNode<T> recBuildFrom(ListIterator<Integer> it, List<Integer> inorder) {
        if (!it.hasNext())
                return null;

        Integer label = it.next();
        int inorderIdx = inorder.indexOf(label), inorderSize = inorder.size();

        BinaryTreeNode<T> node = new BinaryTreeNode(label);
        if (inorderIdx > 0)
                node.addLeft(recBuildFrom(it, inorder.subList(0, inorderIdx)));
        if (inorderSize > 1)
                node.addRight(recBuildFrom(it, inorder.subList( inorderIdx + 1, inorderSize)));
        return node;
}

public void buildFrom(LinkedList<Integer> preorder, LinkedList<Integer> inorder) {
        ListIterator<Integer> it = preorder.listIterator();
        root = recBuildFrom(it, inorder);
}

/*
   Unit test
 */
public static void main(String[] args) {
        LinkedList<Integer> preorder = new LinkedList<Integer>();
        preorder.addAll(Arrays.asList(4,6,7,1,2,3));

        LinkedList<Integer> inorder = new LinkedList<Integer>();
        inorder.addAll(Arrays.asList(7,6,1,4,2,3));

        BinaryTree<Integer> tree = new BinaryTree();
        tree.buildFrom(preorder, inorder);



        List<Integer> preOrderVisit =
                BinaryTreeVisitPreOrder.preorder(tree);


        System.out.println(preOrderVisit);

        //TO DO:
        // visita in postordine e in ordine


        if (preorder.equals(preOrderVisit)) {
                System.out.println("Test ok.");
        } else
                System.out.println("Test failed.");
}

}
