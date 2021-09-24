package com.rays.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Arraytest {

	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList(); 
		a.add(21);
		a.add(43);
		a.add("one");
		a.add("31");
		
		Iterator it = a.iterator() ;
		while (it.hasNext()) {
			Object o = (Object) it.next();
			System.out.println(o);
			}
		
			System.out.println("--------------------------");
			
		Iterator it2 =a.iterator();
		Collections.reverse(a);
		while (it2.hasNext())
		{
			Object o2 = (Object) it2.next();
			System.out.println(o2);
		}
			
		}
		}

 
	


