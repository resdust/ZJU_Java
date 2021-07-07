package dome;

import java.util.ArrayList;

public class DataBase {
//	private ArrayList<CD> listCD = new ArrayList<CD>();
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	private ArrayList<Item> listItem = new ArrayList<Item>();
	
//	public void add(CD cd) {
//		listCD.add(cd);
//	}
//	
//	public void add(DVD dvd) {
//		listDVD.add(dvd);
//	}
	public void add(Item item) {
		listItem.add(item);
	}
	
	public void list() {
//		for (CD cd : listCD) {
//			cd.print();
//		}
//		for (DVD dvd : listDVD) {
//			dvd.print();
//		}
		for (Item item : listItem) {
			item.print();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		DataBase db = new DataBase();
		db.add(new CD("ABC",60,false,"Good","aaa",4));
		db.add(new CD("DEF",60,false,"Bad","bbb",4));		
		db.add(new DVD("FILM",60,true,"...","aaa"));
		db.add(new VedioGame("ddd",10,true,"...",4));
		db.add(new MP3("music",200,true,"...", "mm", "ll", 10));
		db.list();
	}

}
