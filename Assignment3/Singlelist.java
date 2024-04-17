package Assignment3;

public class Singlelist {
    Node head;
    public static class Node{
    	int data;
    	Node Next;
    	Node(int data){
    		this.data = data;
    		Next = null;
    	}
    	
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
        Singlelist l = new Singlelist();
        l.Insert(10);
        l.Insert(20);
        l.Insert(30);
        
        l.display();
	}

}
