package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	   
		LinkedList<Integer> l = new LinkedList<>();
		l.add(3);
		l.add(5);
		l.add(8);
		l.add(5);
		l.add(10);
		l.add(2);
		l.add(1);
		/*System.out.println(l);
		swap(l,0,6);
		System.out.println(l);*/
		partition(l,5);
		System.out.println(l);
	
		
	}
		
    private static void swap(LinkedList<Integer> l,int i,int j){
    	
    	int a = l.get(i);
    	System.out.println("--"+a);
    	int b = l.get(j);
    	System.out.println("--"+b);
    	l.add(j, a);
    	l.remove(j+1);
    	l.add(i,b);
    	l.remove(i+1);
    	
    	
    	
    	
    }
	
    private static LinkedList<Integer> partition(LinkedList<Integer> l,int x){
    	
    	//
    	
    	int i = 0;
    	int j = l.size()-1;
    	
    	while(i != j) {
    		if(l.get(i) >= x && l.get(j) < x) {
    			swap(l,i,j);
    			i++;
    			j--;
    			continue;
    		}
    		if(l.get(i) < x) {
    			i++;
    			continue;
    		}
    		if(l.get(j) >= x) {
    			j--;
    		}
    		
    		
    		
    		
    	}
    	
    	return l;
    }
	
		
	}
	
	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

