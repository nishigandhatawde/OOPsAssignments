package com.oops8program;

public class GarbageFinalizeMethod {
	public static void main(String[] args)   
    {   
		GarbageFinalizeMethod obj = new GarbageFinalizeMethod();   
        System.out.println("Hashcode of object= "+obj.hashCode());   
        obj = null;   
        // calling garbage collector    
        System.gc();   
        System.out.println("end of garbage collection");   
  
    }   
	protected void finalize()   
    {   
        System.out.println("finalize method called");   
    }   
}


