package com.rathinam;

import java.util.*;

enum Days {
	MONDAY(4), SUNDAY(3), TUESDAY(2)

	;

	Days(int d) {
		this.d = d;
		System.out.println("CONSTRUCTOR");
	}

	int d;
}

enum Month {
	JAN(1), FEB(2), MAR(3);

	int i;

	Month(int i) {
		this.i = i;
	}
}

public class Enum_Treeset {
	public static void main(String[] args) {
		TreeSet<Days> s = new TreeSet<Days>();
		s.add(Days.SUNDAY);
		s.add(Days.TUESDAY);
		s.add(Days.MONDAY);
		TreeSet<String> str = new TreeSet<String>();
		str.add("Thomas");
		str.add("David");
		str.add("Mary");
		System.out.println(str);
	}
}
