/**
 * Created by Zennard on 9/19/2015.
 */
public class IntNode {
    private int value;
    private IntNode leftNode, rightNode;

    public IntNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(IntNode leftNode) {
        this.leftNode = leftNode;
    }

    public IntNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(IntNode rightNode) {
        this.rightNode = rightNode;
    }
}
