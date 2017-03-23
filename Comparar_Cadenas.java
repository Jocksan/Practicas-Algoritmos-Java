package Tolesco;

import java.util.*;

public class Comparar_Cadenas {

	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Por favor ingrese la primer cadena:");
		String cad1=sc.nextLine();
		
		System.out.println("Por favor ingrese la segunda cadena:");
		String cad2=sc.nextLine();
		
		//validación 
		if(cad1.length()==cad2.length()){
			
			//creamos cadenas de caracteres
			char cad1let[]=new char[cad1.length()], cad2let[]=new char[cad2.length()];
			for(int i=0; i<cad1.length(); i++){
				cad1let[i]=cad1.charAt(i);
				cad2let[i]=cad2.charAt(i);
			}
			//Ordenamos Cadenas de caracteres
			Arrays.sort(cad1let);
			Arrays.sort(cad2let);
			
			boolean bandera=true;
			for(int i=0; i<cad1.length(); i++){
				if(cad1let[i]!=cad2let[i]){
					bandera=false;
					break;
				}
			}
			
			if(bandera)
				System.out.println("Si es un Anagrama");
			else
				System.out.println("No es un Anagrama");
			
		}else
			System.out.println("Las cadenas no coinciden en caracteres");
		
	}
	
}
