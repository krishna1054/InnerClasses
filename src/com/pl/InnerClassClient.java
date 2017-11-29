package com.pl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import com.pl.InnerClassTest.NonStaticInnerClass;

public class InnerClassClient {

	public static void main(String[] args) {
		InnerClassTest.StaticInnerClass si=new InnerClassTest.StaticInnerClass();
		System.out.println(si.getB());
		NonStaticInnerClass nsi=new InnerClassTest().new NonStaticInnerClass();
		System.out.println(nsi.getA());
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(Math.min(Integer.MIN_VALUE, 0));
		Integer i=new Integer(10);
		Integer j=new Integer(10);
		System.out.println(i==10);
		
		
		long longWithL = 1000*60*60*24*365L;
		long longWithoutL = 1000*60*60*24*365;
		System.out.println(longWithL);
		System.out.println(longWithoutL);
		
		boolean x=false;
		if(x=true) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));
		
		HashSet shortSet = new HashSet();
		for (int z = 0; z < 100; z++) {
			shortSet.add(z);
			System.out.println("z-->"+z);
			System.out.println("z--->"+(shortSet.remove(z-1)));
		}
		System.out.println(shortSet.size());
		
		try {
			if (true) {
				//int k=0;
//				while (true) {
					//System.out.println(k++);
//				}
			} else {
				System.exit(1);
			}
		} finally {
			System.out.println("In Finally");
		}
		
		String str = null;
		String str1="abc";
		System.out.println(str1.equals("abc") || str.equals(null));
		X h=new X();
		
		ArrayList<Integer> a=new ArrayList<Integer>() {{
			add(8);
		}};
	}
}
class X{
	
	X x=new X();
	public void x() throws IOException{
		
	}
}
class Y extends X{
	public void x(){
		
	}
}
class Nested implements InnerClassTest.NestedInterface{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}