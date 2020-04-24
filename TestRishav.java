package com.amit;

import java.util.HashSet;
import java.util.Set;

public class TestRishav {

	public static void main(String[] args) {
		 Rishav rA = new Rishav("rishav");
         Rishav rB = new Rishav("rishav");
         System.out.println(rA.equals(rB));
         System.out.println("-----------------------------------");

         Set<Rishav> hashed = new HashSet<>();
         hashed.add(rA);
         System.out.println(hashed.contains(rB));
         System.out.println("-----------------------------------");

         hashed.add(rB);
         System.out.println(hashed.size());

	}

}
