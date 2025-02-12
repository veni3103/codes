package four;
enum Level{
	BIGINNER("B"),INTERMIDIATE("I"),ADVANCED("A");
	private String abbr;
	Level(String ab){
		abbr=ab;
	}
	 String getAbbr(){
		return abbr;
	
	}
}


public class EnumDemo {
	public static void main(String args[]) {
		Level l1=Level.ADVANCED;
		System.out.println(l1);
		System.out.println(l1.getAbbr());
		System.out.println(l1.ordinal());
		
	}

}
