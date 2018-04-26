package br.com.btree.test;

import br.com.btree.model.BinaryTree;

public class BinaryTreeTest {

    public static BinaryTree generateBinaryTree(){

        BinaryTree b1 = new BinaryTree();
        b1.setValor(4);

        BinaryTree b2 = new BinaryTree();
        b2.setValor(3);

        BinaryTree b3 = new BinaryTree();
        b3.setValor(1);
        b3.setLeft(b1);

        BinaryTree b4 = new BinaryTree();
        b4.setValor(6);
        b4.setLeft(b2);
        b4.setRight(b3);

        BinaryTree b5 = new BinaryTree();
        b5.setValor(2);
        b5.setRight(b4);

        BinaryTree b6 = new BinaryTree();
        b6.setValor(5);

        BinaryTree b7 = new BinaryTree();
        b7.setValor(1);
        b7.setLeft(b5);
        b7.setRight(b6);

        return b7;
    }
}
