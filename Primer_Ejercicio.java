package Tolesco;

import java.util.*;

public class Primer_Ejercicio {

	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner objLD=new Scanner(System.in);
		
		System.out.println("Por favor ingrese la capacidad del arreglo:");
		int num=objLD.nextInt();
		
		int arr[]=new int[num], suma=0;
		Random objR=new Random();
		for(int i=0; i<arr.length; i++){
			arr[i]=objR.nextInt(101);
			suma+=arr[i];
		}
		
		System.out.println("El Arreglo de longitud: "+ num+ ", queda de la siguiente forma:");
		for(int i=0; i<num; i++)
			System.out.print(arr[i]+", ");
		System.out.println("\nLa suma del arrego es de: "+ suma);
	}
	
}
