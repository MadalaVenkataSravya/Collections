package com.epam.Collections;
import java.util.Arrays;
public class Listcustom <H> {
	private int size=0;
    
	private static final int initialcapacity=10;
 
    private Object[] l;
  
    
    public Listcustom() {
 	   l=new Object[initialcapacity];
 	   
 	  
    }
    
    public void add(H value) {
 	   if(size==l.length) {
 		   increasecapacity();
 	   }
 	   l[size++]=value;
    }
    
    private void increasecapacity() {
		int newlen=l.length*2;
		l=Arrays.copyOf(l, newlen);
		
	}

	@SuppressWarnings("unchecked")
	public H get(int index) {
 	   if(index>=size ||index<0) {
 		  throw new IndexOutOfBoundsException("Index error");
 		  
 	   }
 	   return (H) l[index];
    }
	
public int size() {
	   return size;
}

@SuppressWarnings("unchecked")
public H remove(int index) {
	   if(index>=size ||index<0) {
		  throw new IndexOutOfBoundsException("Index error");
		  
	   }
	   Object item=l[index];
	   int num=l.length-(index+1);
	   System.arraycopy(l, index+1, l, index, num);
	   size--;
	   return (H) item;
	   
	   
}

public String toString() 
{
     StringBuilder sb = new StringBuilder();
     sb.append('[');
     for(int i = 0; i < size ;i++) {
         sb.append(l[i].toString());
         if(i<size-1){
             sb.append(",");
         }
     }
     sb.append(']');
     return sb.toString();
}
}
