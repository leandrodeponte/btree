package br.com.btree;

import br.com.btree.business.BinaryTreeBusiness;
import br.com.btree.model.BinaryTree;
import br.com.btree.test.BinaryTreeTest;

public class Main {

    public static void main(String[] args) {

        int sum = 0;

	    BinaryTree btree = BinaryTreeTest.generateBinaryTree();
        sum = BinaryTreeBusiness.sumBinaryTree(btree);
        System.out.println("A soma é " + sum);

    }
}
