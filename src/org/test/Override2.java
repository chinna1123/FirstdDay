package org.test;

public class Override2 extends Override1{
@Override
	public void icic() {
		// TODO Auto-generated method stub
	System.out.println("it is a private bank");
	}
@Override
	public void hdfc() {
	System.out.println("iit is a bank");
	} 
public static void main(String[] args) {
	Override2 o=new Override2();
	o.icic();o.hdfc();
}
}
