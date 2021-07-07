package notebook;

import java.util.ArrayList;

public class NoteBook {
	private ArrayList<String> notes = new ArrayList<String>();

	public void add(String s) {
		notes.add(s);
	}
	
	public void add(String s, int location) {
		notes.add(location,s);
	}
	
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
	
	public String removeNote(int index) {
		//为什么翁恺的removeNote返回类型是void？
		return notes.remove(index);
	}
	
	public String[] list() {
		String[] n = new String[notes.size()];
		String[] a = new String[notes.size()-1];
//		for (int i = 0; i < notes.size(); i++) {
//			n[i]=notes.get(i);
//		}
		notes.toArray(n); //阿这
		return n;
	}
	
	public static void main(String[] args) {
		NoteBook nb = new NoteBook();
		nb.add("First");
		nb.add("Second");
		nb.add("Third",1);
		System.out.println(nb.getSize());
		System.out.println(nb.getNote(0));
		String[] a = nb.list();
		for (String s : a) {
			System.out.println(s);
		}
	}
}
