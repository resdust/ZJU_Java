package notebook;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.Iterator;
/*
Hagzou	Hugzou	Jigxng    ###

0	1108	708
1108	0	994
708	994	0

Hagzou    Jigxng
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("input:");
		
		// read city names
		ArrayList<String> cities = new ArrayList<String>();
		ArrayList<ArrayList<Integer>> distances = 
				new ArrayList<ArrayList<Integer>>();
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		while(true) {
			String name = in.next();
			if (name.equals("###")) 
				break;
			else {
				cities.add(name);
			}
		}
		
		// read distance list
		HashMap<String, HashMap<String, Integer>> city = 
				new HashMap<String, HashMap<String, Integer>>();

		for(String c : cities) {
			ArrayList<Integer> dis_city = new ArrayList<Integer>();
			for (String city_ : cities) {
				int dis = in.nextInt();
				dis_city.add(dis);
			}
			distances.add(dis_city);
		}
		
		// read requested cities
		for (int i=0; i<2; i++) {
			String city1 = in.next();
			String city2 = in.next();
			int index1 = cities.indexOf(city1);
			int index2 = cities.indexOf(city2);

			System.out.println(distances.get(index1).get(index2));
		}
	}
}
