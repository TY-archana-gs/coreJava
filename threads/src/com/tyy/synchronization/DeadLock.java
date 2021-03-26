package com.tyy.synchronization;

public class DeadLock {
	public static void main(String[] args) {  
	     String resource1 = "ratan jaiswal";  
	     String resource2 = "vimal jaiswal";  
	    // t1 tries to lock resource1 then resource2  
	    
	     Thread t1 = new Thread() {  
	      public void run() {  
	          synchronized (resource1) {  
	           System.out.println("Thread 1: locked resource 1");  
	  
	           try { Thread.sleep(100);} catch (Exception e) {
	               //System.out.println("Thread 1: Waiting for lock 2...");

	           }  
	  
	           synchronized (resource2) {  
	            System.out.println("Thread 1: locked resource 2");  
	           }  
	         }  
	      }  
	    };  
	  
	    // t2 tries to lock resource2 then resource1  
	    Thread t2 = new Thread() {  
	      public void run() {  
	        synchronized (resource2) {  
	          System.out.println("Thread 2: locked resource 2");  
	  
	          try { Thread.sleep(100);} catch (Exception e) {
	             //  System.out.println("Thread 2: Waiting for lock 1...");

	          }  
	  
	          synchronized (resource1) {  
	            System.out.println("Thread 2: locked resource 1");  
	          }  
	        }  
	      }  
	    };  
	  
	      
	    t1.start();  
	    t2.start();  
	  } 

}
