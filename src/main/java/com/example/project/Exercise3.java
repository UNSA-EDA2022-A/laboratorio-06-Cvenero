package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }


    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){

        if(binario(a.root)) {
			return true;
		}
		return false;
	}
	private <T extends Comparable<T>> boolean binario(Node<T> actual) {
	
		if(actual == null) {
			return true;
		}
		
		if((actual.left == null && actual.right == null) == (actual.left != null && actual.right != null) ){
			return false;
		}
		return binario(actual.left) && binario(actual.right);
		
	}	
}
