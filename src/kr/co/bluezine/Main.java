package kr.co.bluezine;

import java.util.ArrayList;

public class Main {
	private static Long time = System.nanoTime();
	private static int dataLength = 50;
	
	public static void main(String args[]) {
		new Main().go();
	}
	
	public void go() {
		System.out.println("===========================================");
		System.out.println("=            Linked List Data             =");
		System.out.println("===========================================");
		ArrayList<LinkedList> list = new ArrayList<LinkedList>();
		for (int i=0;i<dataLength;i++) {
			list.add(new LinkedList(i));
		}
		for (int i=0;i<dataLength;i++) {
			if (i == 0) {
				list.get(i).setBefore(null);
				list.get(i).setAfter(list.get(i+1));
			} else if (i == dataLength-1) {
				list.get(i).setBefore(list.get(i-1));
				list.get(i).setAfter(null);
			} else {
				list.get(i).setBefore(list.get(i-1));
				list.get(i).setAfter(list.get(i+1));
			}
		}
		System.out.print("        Data List : ");
		list.get(0).printData();
		System.out.println();
		System.out.print("Reverse Data List : ");
		list.get(list.size()-1).printReverseData();
		System.out.println();
		System.out.println("===========================================");
		System.out.println("delete data 3");
		list.get(2).delete();
		System.out.println("===========================================");
		System.out.print("        Data List : ");
		list.get(0).printData();
		System.out.println();
		System.out.print("Reverse Data List : ");
		list.get(list.size()-1).printReverseData();
		System.out.println();
		System.out.println("===========================================");
		System.out.println("delete data 1");
		list.get(1).delete();
		System.out.println("===========================================");
		System.out.print("        Data List : ");
		list.get(0).printData();
		System.out.println();
		System.out.print("Reverse Data List : ");
		list.get(list.size()-1).printReverseData();
		System.out.println();
		System.out.println("===========================================");
		double executeTime = (System.nanoTime() - time) / 1000000000.0;
		System.out.println("Execute Time : " + executeTime + " s");
	}
}
