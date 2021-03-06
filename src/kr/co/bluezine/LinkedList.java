package kr.co.bluezine;

public class LinkedList {
	LinkedList before;
	int data;
	LinkedList after;
	
	public LinkedList(int data) {
		this.data = data;
	}
	
	public void setBefore(LinkedList before) {
		this.before = before;
	}
	
	public void setAfter(LinkedList after) {
		this.after = after;
	}
	
	public void printData() {
		if (after != null) {
			System.out.print(this.data + " -> ");
			after.printData();
		}
		if (after == null) {
			System.out.print(this.data);
		}
	}
	
	public void printReverseData() {
		if (before != null) {
			System.out.print(this.data + " -> ");
			before.printReverseData();
		}
		if (before == null) {
			System.out.print(this.data);
		}
	}
	
	public void delete() {
		before.after = this.after;
		after.before = this.before;
	}
}
