import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.*;

/**
 * Created by Zennard on 9/19/2015.
 */
public class TreeMain {

    public static void main (String [] args) {
        IntNode d = new IntNode(5);
        d.setLeftNode(new IntNode(2));
        d.setRightNode(new IntNode(4));

        IntNode e = new IntNode(7);
        e.setLeftNode(new IntNode(-2));

        IntNode f = new IntNode(9);
        IntNode g = new IntNode(10);

        IntNode b = new IntNode(-6);
        b.setLeftNode(d);
        b.setRightNode(e);

        IntNode c = new IntNode(-3);
        c.setLeftNode(f);
        c.setRightNode(g);

        IntNode a = new IntNode(1);
        a.setLeftNode(b);
        a.setRightNode(c);

        printSums(a, 2);
    }

    public static void printSums(IntNode root, int sum) {
        ArrayList<IntNode> path = Lists.newArrayList();
        Set<List<IntNode>> paths = Sets.newHashSet();
        getSum(root, sum, path, paths);
        printPath(paths);
    }

    private static void printPath(Set<List<IntNode>> paths) {
        for (List<IntNode> path : paths) {
            for (IntNode node : path) {
                System.out.print(node.getValue() + ",");
            }
            System.out.println();
        }
    }
    private static void getSum(IntNode root, int sum, List<IntNode> path, Set<List<IntNode>> paths) {
        if (root == null) {
            if (sum == 0) {
                paths.add(path);
            }
            return;
        }

        int newSum = sum - root.getValue();
//        System.out.println("Node:"+root.getValue()+" Sum:"+newSum);
        path.add(root);
        ArrayList<IntNode> pathCopy = Lists.newArrayList(path);
        getSum(root.getLeftNode(), newSum, path, paths);
        getSum(root.getRightNode(), newSum, pathCopy, paths);
    }

}
