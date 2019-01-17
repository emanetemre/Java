//Create: Emre EMANET
//Date: 1/17/2019
//Name: Array
package javaogrenme2;

public class Main {
	public static void main(String args[]) {
  //Diziler iki şekilde de tanımlanabilir
  int a [] = new int [5]; // a dizisine 5 tane değişken alabileceğini söyledik.
  int[] dizi = {10, 20, 30, 40};
  
  a[0] = 1;
  a[1] = 2;
  a[2] = 3;
  a[3] = 4;
  a[4] = 5;
		
  System.out.println(""+a[0]) //a dizisinin ilk değişkenini yaz dedik.
  System.out.println(dizi[0]+" "+dizi[1]+" "+dizi[2]+" "+dizi[3]); //Dizinin tüm değişkenlerini yazdırdık.
	}
}
