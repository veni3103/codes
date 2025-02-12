package four;
class outer{
	int m;
	void outerdisplay() {
		System.out.println("outer display");
	}
	class inner{
		int n;
		void innerdisplay() {
			System.out.println("inner display");
			
		}
	}
}

public class InnerClass {
	public static void main(String args[]) {
		outer o=new outer();
		o.m=10;
		o.outerdisplay();
		outer.inner i=o.new inner();
		i.innerdisplay();
	}

}
