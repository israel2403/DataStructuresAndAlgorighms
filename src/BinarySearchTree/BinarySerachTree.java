package BinarySearchTree;

public class BinarySerachTree {

    Node root;

    class Node {
        int value;
        Node left;
        Node rigth;

        private Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) {
                return false;
            }
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.rigth == null) {
                    temp.rigth = newNode;
                    return true;
                }
                temp = temp.rigth;
            }
        }
    }

    public boolean contains(int value) {
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.rigth;
            } else {
                return true;
            }
        }
        return false;
    }
}
