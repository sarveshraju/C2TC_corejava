package edu.atria.b94java.secondpackage;
import edu.atria.b94java.firstpackage.Base;
public class Executertwo extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base btwo=new Base();
		//privaye members are not accessible outside the first package
		//System.out.println(btwo.variableprivate);
		//default members are not accessible outside the first package
		//System.out.println(btwo.variabledefault);
		Executertwo ex=new Executertwo();
		System.out.println(ex.variableprotected);

	}

}
