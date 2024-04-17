package Assignment3;

public class Doublelinklist {
	Node head;
   static class Node{
	   int data;
	   Node Next;
	   Node Prev;
	   
	   Node(int data){
		   this.data = data;
		   Next=Prev=null;
	   }
   }
   void Insert(int NewData) {
	   Node NewNode =new Node(NewData);
	   Node n = head;
	   NewNode.Next = n;
	   NewNode.Prev = null;
	   if(n!=null) {
		   n.Prev = NewNode;
		   n = NewNode;
	   }
	   
	   
   }
   void display(Node n) {
	   
	   Node p = null;
	   System.out.println("Forward Direction");
	   while(n!=null) {
		   System.out.println(n.data);
		   p=n;
		   n = n.Next;
	   }
	   System.out.println("------------------");
	   System.out.println();
	   System.out.println("Backward Direction");
	   while(p!=null) {
		   System.out.println(p.data);
		   p = p.Prev;
	   }
	   
   }
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Doublelinklist dl = new Doublelinklist ();
	   dl.Insert(10);
	   dl.Insert(22);
	   dl.Insert(55);
	   dl.display(dl.head);
	}

}
