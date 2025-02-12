package string2;

import java.util.Arrays;

public class Operation {
	public static void main(String[] args) {
		
		/* Scanner Scanner = new scanner (System.in;)
		 
	    System.out.println(a&1);*/
		 String s=" venipoinyga1 ";
			String v="veni";
			String v1="  ";
			//String w="veni";
			//s="dats";
			String s1=new String("vEni");
			String s2=new String("veni");
			String a="ZA";
			String b="BB";
			//s1="dara";
			System.out.println(s.hashCode());
			System.out.println("s.length: "+s.length());
			System.out.println("s.indexOf(char,int): "+s.indexOf('i',4));//4 means 4th index after  find i index
			System.out.println("s.indexOf(string,int): "+s.indexOf("i",4));
			System.out.println("s.indexOf(char): "+s.indexOf('n'));
			System.out.println("s.indexOf(String): "+s.indexOf("n"));
	        System.out.println("s.indexOf(String): "+s.indexOf("n"));
			System.out.println("charAt : "+ s2.charAt(2));
			System.out.println("substring : "+ s.substring(2));//return all  values after the input index
			System.out.println("substring : "+ s.substring(2,5));//return all  values after the input index and before the second input index
			System.out.println("split : "+Arrays.toString (s.split("n",3)));//3 means how many split we split the data 
			System.out.println("compareTo : "+ a.compareTo(b));//compare Assci value the 1st char of each String  it is eruals then chech next char it is not Equal then return the diff of eacj char 
			System.out.println("eqals : "+ s1.equals("veni"));//check equlas
			System.out.println("getByte : "+Arrays.toString( s.getBytes()));//given the binary value of  eack char in a given String
			System.out.println("uppercase : "+ s.toUpperCase());
			System.out.println("lowercase : "+ s.toLowerCase());
			System.out.println("contains : "+ s.contains(v));//check the given string is there in another String
			System.out.println("equalsignore : "+ s1.equalsIgnoreCase(v));//check the given 2 string equals with the case ignore
			System.out.println("concat : "+ s.concat(v));//add the given 2 string
			System.out.println("trim : "+ s.trim());//remove front and back space
			System.out.println("isEmpty : "+ v1.isEmpty());//it means the given String empty then return true
			System.out.println("is blank : "+ v1.isBlank());//  it return true if   no char present but space given
		
		}

	}


}
