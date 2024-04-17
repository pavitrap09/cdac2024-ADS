package Assignment3;

import Assignment3.Singlelist.Node;

public class ReverseLink {

	
		// TODO Auto-generated method stub
		 
		    Node head;
		    public static class Node{
		    	int data;
		    	Node Next;
		    	Node(int data){
		    		this.data = data;
		    		Next = null;
		    	}
		    	
		    }
		    public Node Reverse() {
		    	
		    	Node prev = null;
		    	Node next = null;
		    	Node curr = head;
		    	while(curr!=null) {
		    		next = curr.Next;
		    		curr.Next = prev;
		    		prev = curr;
		    		curr = next;
		    		
		    	}
		    	prev = head;
				return head;
		    }
		    void Insert(int NewData) {
		    	Node NewNode = new Node(NewData);
		    	NewNode.Next = head;
		    	head = NewNode;
		    }
		    void display() {
		    	Node n = head;
		    	while(n!=null) {
		    		
		    		System.out.println(n.data);
		    		n = n.Next;
		    	}
		    }
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ReverseLink  l = new ReverseLink();
		        l.Insert(10);
		        l.Insert(20);
		        l.Insert(30);
		        l.display();
		        System.out.println("Reverse linked list is");
		        l.Reverse();
		        l.display();
			}

		

	}


