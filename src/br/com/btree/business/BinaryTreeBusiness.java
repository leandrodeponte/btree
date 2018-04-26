package br.com.btree.business;

import br.com.btree.model.BinaryTree;

public class BinaryTreeBusiness {

    /*
     * Soma os valores de uma árvore
     */
    public static int sumBinaryTree(BinaryTree tree){

        int sum = 0;
        int left = 0;
        int right = 0;

        if(tree == null){
            return 0;
        }

        sum = tree.getValor();

        if(tree.getLeft() != null){
            left =  sumBinaryTree(tree.getLeft());
        }

        if(tree.getRight() != null){
            right =  sumBinaryTree(tree.getRight());
        }

        return sum + left + right;

    }
}
