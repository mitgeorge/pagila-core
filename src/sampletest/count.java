package sampletest;



	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class count {

		public static void main(String a[]){
			
			List<String> sl = new ArrayList<String>();
			sl.add("apple");
			sl.add("java");
			sl.add("c++");
			sl.add("unix");
			sl.add("orange");
			sl.add("airtel");
			sl.add("");
			List<String> tl = new ArrayList<String>();
			tl.add("zsdfgsadfgjsdfjhsgfhahsdfg");
	tl.add("oracle");
	tl.add("jungle");
	tl.add("cricket");
	boolean isCommon = Collections.disjoint(sl,tl);
	System.out.println("does not have any common elements "+isCommon);
		
			
		}
	}

