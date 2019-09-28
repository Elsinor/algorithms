import java.util.*;
public class BinaryTreeVisitPreOrder {

public static List preorder(BinaryTree t) {
        return rec_preorder(t.getRoot());
}

public static List preorder(BinaryTreeNode v) {
        return rec_preorder(v);
}

public static List rec_preorder(BinaryTreeNode v) {
        List visits = new LinkedList();
        visits.add(v.visit());
        if (v.hasLeft())
                visits.addAll(rec_preorder(v.getLeft()));
        if (v.hasRight())
                visits.addAll(rec_preorder(v.getRight()));
        return visits;
}

}
