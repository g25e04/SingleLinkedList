public class SingleLinkedList {

	public SingleLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node=new Node();
		
		node.addHead(5);
		node.addHead(3);
		node.addTail(9);
		node.addTail(6);
		System.out.print("The Single Link List before delete node: ");
		node.printLink();		
		node.deleteHead();
		node.deleteTail();
		System.out.print("\nThe Single Link List after delete node: ");
		node.printLink();
	}
}