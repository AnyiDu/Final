
public class Problem2 {

	static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		// Use two pointers, slow and fast
		ListNode slow = head;
		ListNode fast = head;

		// Move the fast pointer n steps ahead of the slow pointer
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}

		// If the fast pointer is null, the first node needs to be removed
		if (fast == null) {
			assert head != null;
			return head.next;
		}

		// Move both pointers until the fast pointer reaches the end of the list
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}

		// The slow pointer is now pointing to the node before the one to be removed
		slow.next = slow.next.next;

		return head;
	}
}
