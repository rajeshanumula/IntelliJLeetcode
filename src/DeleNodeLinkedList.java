public class DeleNodeLinkedList {
	public void deleteNode(ListNode node) {
		
	}

	public static void main(String[] args) {
		ListNode listNode6=new ListNode(6);
		ListNode listNode5=new ListNode(5,listNode6);
		ListNode listNode4=new ListNode(4,listNode5);
		ListNode listNode3=new ListNode(3,listNode4);
		ListNode listNode2=new ListNode(2,listNode3);
		ListNode listNode1=new ListNode(1,listNode2);
		DeleNodeLinkedList del=new DeleNodeLinkedList();
		del.deleteNode(listNode1);
	}

}
