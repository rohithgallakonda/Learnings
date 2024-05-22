package jscripts;

public class Example1 {

	public static void main(String[] args) {
		//store integer type into array collection
				int x[]= new int [5];
				x[0]=100;
				x[1]=200;
				x[2]=400;
				x[3]=600;
				x[4]=900;
				//print length of array
				System.out.println(x.length);
				//print specific element position in arraycollection
				System.out.println(x[4]);
				//print each position vlue in
				for (int each : x) {
					System.out.println(each);
				}

	}

}
