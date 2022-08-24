/*
 * Q6. Anagram
 */
package com.bridgelabz.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", " ");
		String s2 = str2.replaceAll("\\s", " ");
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] array1 = s1.toLowerCase().toCharArray();
			char[] array2 = s2.toLowerCase().toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			status = Arrays.equals(array1, array2);
		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams ");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = sc.next();
		System.out.println("Enter second String");
		String s2 = sc.next();
		isAnagram(s1, s2);
	}

}
