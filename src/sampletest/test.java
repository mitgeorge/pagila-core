package sampletest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
	public static void main(String[] args) {
		ArrayList<class2> al = new ArrayList<class2>();
		ArrayList<class1> a2 = new ArrayList<class1>();
		for (int i = 1; i <= 10; i++) {

			class2 s1 = new class2(1, "abc");
			class2 s2 = new class2(2, "abd");
			class1 c = new class1(1, 500);

			al.add(s1);
			al.add(s2);
			a2.add(c);
			Iterator itr1 = a2.iterator();

			// traverse elements of ArrayList object
	
			while (itr1.hasNext()) {
				class1 st2 = (class1) itr1.next();

		
			Iterator itr = al.iterator();

			// traverse elements of ArrayList object
			while (itr.hasNext()) {
				class2 st = (class2) itr.next();

				System.out.println(st.id + " " + st.name + " " +""+st2.salary+"");
			
			}

			// traverse elements of ArrayList object
		
			
		}
	}
	}
}
