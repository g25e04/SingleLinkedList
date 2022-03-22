public class Node {

	int num;
	public Node next;
	public Node head,tail;
	public Node() {
		// TODO Auto-generated constructor stub
		head=tail=null;
	}

	public Node(int number) {
		num=number;
		next=null;
	}
	
	public Node(int number,Node n) {
		num=number;
		next=n;
	}
	
	
	public boolean empty() {
		return head==null;
	}
	
	public void addHead(int el) {
		head = new Node(el,head);
		if(tail==null)
			tail=head;
	}
	
	public void addTail(int el) {
		if(!empty()) {
			tail.next = new Node(el,null);
			tail=tail.next;
		}
		else {
			head=tail=new Node(el,null);
		}
	}
	
	public int deleteHead() {
		int el=head.num;
		if(head==tail)
			head=tail=null;
		else
			head=head.next;
		return el;
	}
	
	public int deleteTail() {
		int el=tail.num;
		if(head==tail)
			head=tail=null;
		else {
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next=null;
		}
		return el;
	}
	
	public void delete(int el) {
		if(!empty()) {
			if(head==tail && head.num==el)
				head=tail=null;
			else if(el==head.num)
				head=head.next;
			else {
				Node prev,temp;
				for(prev=head,temp=head.next;temp!=null&&temp.num!=el;prev=prev.next,temp=temp.next);
				if(temp!=null) 
					prev.next=tail.next;
				if(temp==tail)	
					tail=prev;	
			}
		}
	}
	
	public boolean isInList(int el) {
		Node temp;
		for(temp=head;temp!=null&&temp.num!=el;temp=temp.next);
		return temp!=null;
	}
	
	public void printLink() {
		if(!empty()) {
			Node temp;
			for(temp=head;temp!=null;temp=temp.next)
			System.out.print(temp.num+" ");
		}
	}
}
