package com.example.project;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstSimilares(tree1, tree2));
        
    }


    public <T extends Comparable<T>> boolean bstSimilares(BST<T> a1, BST<T> a2){
		
		if(a1.isEmpty()&&a2.isEmpty() || bstSimilares(a1.root,a2.root) ) {
			return true;
		}	
		return false; 

	}
	
	public <T extends Comparable<T>> boolean bstSimilares(Node<T> nodo1, Node<T> nodo2) {
		
		if(nodo1 == null &&nodo2 == null) {
			return true;
		}
		
		if(nodo1 == null && nodo2 !=null || nodo1 != null && nodo2 ==null) {
			
			return false;
		}
		
		return bstSimilares(nodo1.left, nodo2.left) && bstSimilares(nodo1.right, nodo2.right);
	}
}
