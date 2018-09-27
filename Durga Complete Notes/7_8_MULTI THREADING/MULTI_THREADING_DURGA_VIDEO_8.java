TOPIC:-MULTI THREADING 
--------
VIDEO NO=8
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
---------------

IMPORTANT EXAMPLES:-
Example=23
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
Continuation is there from Programe 3 
See just see Programe 3 to see how i get Thread name.
PROGRAME=1
=========
class Display extends Thread
{
static synchronized void A(Display D)
   {
	  for (int i = 0; i < 3; i++) 
	  {
		try {
		       Thread.sleep(1000);
		       System.out.println("static method A "+Thread.currentThread().getName());
		       D.B();
		       
            } catch (Exception e) {}
		  
	  }
   } 	
synchronized  void B()
{

		try {
		       Thread.sleep(1000);
		       System.out.println("instance method B "+Thread.currentThread().getName());
		       
	     	} catch (Exception e) {}
	  
} 	
}

class MyThread1 extends Thread
{
	Display D;
	MyThread1(Display D)
	{
		this.D=D;
	}
        public void run()
        {
        	D.A(D);
        }	
}
class MyThread2 extends Thread
{
	Display D;
	MyThread2(Display D)
	{
		this.D=D;
	}
        public void run()
        {
        	D.A(D);
        }	
}
class Test
{
	
public static void main(String[] args) 
    {
      
       Display D=new Display();
         MyThread1 t1=new MyThread1(D);	
         t1.start();
        
    }	
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
static method A Thread-1
instance method B Thread-1
static method A Thread-1
instance method B Thread-1
static method A Thread-1
instance method B Thread-1

C:\Users\DELL\Desktop>
EXPLANATION:-
============
Here one Thread calling multiple methods see...

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
Last video programe

PROGRAME=2
=========
class Display
         {
                public  void wish(String name)
                    {
                      for(int i=0;i<5;i++)
                         {
                           System.out.print("good morning:");
                            try
                              {
                                 Thread.sleep(1000);
                              }
                            catch (InterruptedException e){}
                           System.out.println(name);
                         }
                     }
               }
            class MyThread extends Thread
            {
                Display d;
                String name;
                   MyThread(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                       d.wish(name);
                     }
             }

           class Test
          {
             public static void main(String[] args)
                {
                  Display d1=new Display();
                  MyThread t1=new MyThread(d1,"dhoni");
                  MyThread t2=new MyThread(d1,"yuvaraj");
                   t1.start();
                   t2.start();
                 }
            }




C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
good morning:good morning:yuvaraj
good morning:dhoni
good morning:yuvaraj
good morning:dhoni
good morning:yuvaraj
good morning:dhoni
good morning:yuvaraj
good morning:dhoni
good morning:yuvaraj
dhoni

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
class Display extends Thread
{
static synchronized void A(Display D)
   {
	  for (int i = 0; i < 3; i++) 
	  {
		try {
		       Thread.sleep(1000);
		       System.out.println("static method A "+Thread.currentThread().getName());
		       D.B();
		       
            } catch (Exception e) {}
		  
	  }
   } 	
synchronized  void B()
{

		try {
		       Thread.sleep(1000);
		       System.out.println("instance method B "+Thread.currentThread().getName());
		       
	     	} catch (Exception e) {}
	  
} 	
}

class MyThread1 extends Thread
{
	Display D;
	MyThread1(Display D)
	{
		this.D=D;
	}
        public void run()
        {
        	D.A(D);
        }	
}
class MyThread2 extends Thread
{
	Display D;
	MyThread2(Display D)
	{
		this.D=D;
	}
        public void run()
        {
        	D.A(D);
        }	
}
class Test
{
	
public static void main(String[] args) 
    {
      
         Display D=new Display();
         System.out.println(D.getName());
      
         MyThread1 t1=new MyThread1(D);	
         System.out.println(t1.getName());
         
         MyThread2 t2=new MyThread2(D);
         System.out.println(t2.getName());

    }	
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Thread-0
Thread-1
Thread-2

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Just getting the Thread name so u can see which Thread is calling run method..
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
To show u one Thread can call all synchronized instance method/static methods and normal methods also..

PROGRAME=4
=========
class Display extends Thread
{
static synchronized void A(Display D)
   {
	  for (int i = 0; i < 3; i++) 
	  {
		try {
		       Thread.sleep(1000);
		       System.out.println("static synchronized method A "+Thread.currentThread().getName());
		      } catch (Exception e) {}
      } // End of for loop
	  
  	  D.B();//Only one  Thread  calling synchronized static method.
      D.D();//Only one  Thread  calling synchronized instance method.
      D.E();//Only one  Thread  calling normal instance  method.
      D.F();//Only one  Thread  calling normal static  method.

   } 	
synchronized static  void B()
{            try {
		       Thread.sleep(1000);
		       System.out.println("static synchronized method B "+Thread.currentThread().getName());
                 } catch (Exception e) {}
}

  synchronized void D()
{            try {
		       Thread.sleep(1000);
		       System.out.println("synchronized instance method D "+Thread.currentThread().getName());
                 } catch (Exception e) {}
}

  void E()
{            try {
		       Thread.sleep(1000);
		       System.out.println("normal instance method E "+Thread.currentThread().getName());
                 } catch (Exception e) {}
}
 static void F()
  {            try {
  		       Thread.sleep(1000);
  		       System.out.println("normal static method F "+Thread.currentThread().getName());
                   } catch (Exception e) {}
  }
}

class MyThread1 extends Thread
{
	Display D;
	MyThread1(Display D)
	{
		this.D=D;
	}
        public void run()
        {
        	D.A(D);
        }	
}
class MyThread2 extends Thread
{
	Display D;
	MyThread2(Display D)
	{
		this.D=D;
	}
        public void run()
        {
        	D.A(D);
        }	
}
class Test
{

public static void main(String[] args) 
    {
      
       Display D=new Display();
         MyThread1 t1=new MyThread1(D);	
         t1.start();
    }	
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
static synchronized method A Thread-1
static synchronized method A Thread-1
static synchronized method A Thread-1
static synchronized method B Thread-1
synchronized instance method D Thread-1
normal instance method E Thread-1
normal static method F Thread-1

C:\Users\DELL\Desktop>

EXPLANATION:-
============

***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
only one Thread(T1) should get the chance of calling synchronized method..
But that Thread(T1) can call all types of method..

PROGRAME=5
=========
class Display extends Thread
{
static synchronized void A(Display D)
   {
	  for (int i = 0; i < 3; i++) 
	  {
		try {
		       Thread.sleep(1000);
		       System.out.println("static synchronized method A "+Thread.currentThread().getName());
		      } catch (Exception e) {}
      } // End of for loop
	  
  	  D.B();//Only one  Thread  calling synchronized static method.
      D.D();//Only one  Thread  calling synchronized instance method.
      D.E();//Only one  Thread  calling normal instance  method.
      D.F();//Only one  Thread  calling normal static  method.

   } 	
synchronized static  void B()
{            try {
		       Thread.sleep(1000);
		       System.out.println("static synchronized method B "+Thread.currentThread().getName());
                 } catch (Exception e) {}
}

  synchronized void D()
{            try {
		       Thread.sleep(1000);
		       System.out.println("synchronized instance method D "+Thread.currentThread().getName());
                 } catch (Exception e) {}
}

  void E()
{            try {
		       Thread.sleep(1000);
		       System.out.println("normal instance method E "+Thread.currentThread().getName());
                 } catch (Exception e) {}
}
 static void F()
  {            try {
  		       Thread.sleep(1000);
  		       System.out.println("normal static method F "+Thread.currentThread().getName());
                   } catch (Exception e) {}
  }
}

class MyThread1 extends Thread
{
	Display D;
	MyThread1(Display D)
	{
		this.D=D;
	}
        public void run()
        {
        	D.A(D);
        }	
}
class MyThread2 extends Thread
{
	Display D;
	MyThread2(Display D)
	{
		this.D=D;
	}
        public void run()
        {
        	D.A(D);
        }	
}
class Test
{

public static void main(String[] args) 
    {
      
       Display D=new Display();
         MyThread1 t1=new MyThread1(D);	
         MyThread1 t2=new MyThread1(D);	
         t1.start();
         t2.start();
    }	
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
static synchronized method A Thread-1
static synchronized method A Thread-1
static synchronized method A Thread-1
static synchronized method B Thread-1
synchronized instance method D Thread-1
normal instance method E Thread-1
normal static method F Thread-1
static synchronized method A Thread-2
static synchronized method A Thread-2
static synchronized method A Thread-2
static synchronized method B Thread-2
synchronized instance method D Thread-2
normal instance method E Thread-2
normal static method F Thread-2

C:\Users\DELL\Desktop>

EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
example 4 and 5 see some minor change which doesn t effect 
 There is no need of extending Thread class for Display class..

 The same magic output works for Example 4 and 5.

PROGRAME=6
=========
class Display 
{
static synchronized void A(Display D)
   {
	  for (int i = 0; i < 3; i++) 
	  {
		try {
		       Thread.sleep(1000);
		       System.out.println("static synchronized method A "+Thread.currentThread().getName());
		      } catch (Exception e) {}
      } // End of for loop
	  
  	  D.B();//Only one  Thread  calling synchronized static method.
      D.D();//Only one  Thread  calling synchronized instance method.
      D.E();//Only one  Thread  calling normal instance  method.
      D.F();//Only one  Thread  calling normal static  method.

   } 	
synchronized static  void B()
{            try {
		       Thread.sleep(1000);
		       System.out.println("static synchronized method B "+Thread.currentThread().getName());
                 } catch (Exception e) {}
}

  synchronized void D()
{            try {
		       Thread.sleep(1000);
		       System.out.println("synchronized instance method D "+Thread.currentThread().getName());
                 } catch (Exception e) {}
}

  void E()
{            try {
		       Thread.sleep(1000);
		       System.out.println("normal instance method E "+Thread.currentThread().getName());
                 } catch (Exception e) {}
}
 static void F()
  {            try {
  		       Thread.sleep(1000);
  		       System.out.println("normal static method F "+Thread.currentThread().getName());
                   } catch (Exception e) {}
  }
}

class MyThread1 extends Thread
{
	Display D;
	MyThread1(Display D)
	{
		this.D=D;
	}
        public void run()
        {
        	D.A(D);
        }	
}
class MyThread2 extends Thread
{
	Display D;
	MyThread2(Display D)
	{
		this.D=D;
	}
        public void run()
        {
        	D.A(D);
        }	
}
class Test
{

public static void main(String[] args) 
    {
      
       Display D=new Display();
         MyThread1 t1=new MyThread1(D);	
         MyThread1 t2=new MyThread1(D);	
         t1.start();
         t2.start();
    }	
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
static synchronized method A Thread-0
static synchronized method A Thread-0
static synchronized method A Thread-0
static synchronized method B Thread-0
synchronized instance method D Thread-0
normal instance method E Thread-0
normal static method F Thread-0
static synchronized method A Thread-1
static synchronized method A Thread-1
static synchronized method A Thread-1
static synchronized method B Thread-1
synchronized instance method D Thread-1
normal instance method E Thread-1
normal static method F Thread-1

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
Topic -->Thread.currentThread() Topic.

PROGRAME=7
=========
class MyThread1 extends Thread
 {
	public void run()
	   {
	    } 
	}

class Test
{
public static void main(String[] args) 
    {
       System.out.println(Thread.currentThread());
    }	
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Thread[main,5,main]

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
The only way we can catch a Thread Object

PROGRAME=8
=========
class MyThread1 extends Thread
 {
	public void run()
	   {
		 
	   } 
	}

class Test
{
public static void main(String[] args) 
    {
       Thread t=Thread.currentThread();
       System.out.println(t);
       Object x=Thread.currentThread();
       System.out.println(x);
    }	
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Thread[main,5,main]
Thread[main,5,main]

EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
class MyThread1 extends Thread
 {
	public void run()
	   {
		 
	   } 
	}

class Test
{
public static void main(String[] args) 
    {
      Thread.currentThread();
    }	
}
---------------------------------------------------------------
/*
comment:- Eclipse information.
Returns a reference to the currently executing thread object.
Returns:the currently executing thread.
---------------------------------------------------------------------------
source folder information:-

     * Returns a reference to the currently executing thread object.
     *
     * @return  the currently executing thread.
     
    public static native Thread currentThread();
---------------------------------------------------------------------------
*/


EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----

PROGRAME=10
=========
class MyThread1 extends Thread
 {
	public void run()
	   {
		 
	   } 
	}

class Test
{
public static void main(String[] args) 
    {
    Thread t=Thread.currentThread();
    t._____();
   }	
}

EXPLANATION:-
============
Case :-1
--------
t._____();
 We can call all Thread class methods.

Case :-2
--------
 Object t=Thread.currentThread();
    t._____();
we can call only Object class methods..

In both cases there is equal to
same concept as 

Parent reference =Child Object();
 Using Parent refernce we can call only Child specific methods..
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
===========
class MyThread1 extends Thread
 {
	public void run()
	   {} 
}

class Test 
{
public static void main(String[] args) 
    {
    Thread t=Thread.currentThread();
     Test t2=(Test)t;
   }	
}

C:\Users\DELL\Desktop>javac Test.java
Test.java:14: error: incompatible types: Thread cannot be converted to Test
     Test t2=(Test)t;
                   ^
1 error

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Thread t=Thread.currentThread();
     Test t2=(Test)t;
        

Hand Written notes(small):- Page:-8

Test t2=  (Test)     t;
            a        b
			
compiler is gonna check is there any relationship between 
a and b 
eiether child to parent and vice versa...
If no relationShip then it will give incompatible type error..

***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
class MyThread1 extends Thread
 {
	public void run()
	   {
		 
	   } 
	}

class Test extends Thread
{
public static void main(String[] args) 
    {
    Thread t=Thread.currentThread();
     Test t2=(Test)t;
   }	
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Exception in thread "main" java.lang.ClassCastException: java.lang.Thread cannot be cast to Test
        at Test.main(Test.java:14)

C:\Users\DELL\Desktop>

EXPLANATION:-
============
class Test extends Thread----------->Observe this..

Hand Written notes(small):- Page:-8 and 9

Thread t=Thread.currentThread();
     Test t2=(Test)t;
        

Test t2=  (Test)     t;
            a        b
			
compiler is gonna check is there any relationship between 
a and b 
eiether child to parent and vice versa...
If  relationShip is there then it will not give any CE.
coz compiler responsibility is to check that relationship only..

after that JVM is gonna come into picture..

***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
class MyThread1 extends Thread
 {
	public void run()
	   {
		 
	   } 
	}

class Test extends Thread
{
public static void main(String[] args) 
    {
    Thread t=Thread.currentThread();
     Test t2=(Test)t;
   }	
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Exception in thread "main" java.lang.ClassCastException: java.lang.Thread cannot be cast to Test
        at Test.main(Test.java:14)

C:\Users\DELL\Desktop>

EXPLANATION:-
============

***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
class MyThread1 extends Thread
 {
	public void run()
	   {
		 
	   } 
	}

class Test 
{
public static void main(String[] args) 
    {
    Test t=Thread.currentThread();
    
   }	
}

C:\Users\DELL\Desktop>javac Test.java
Test.java:13: error: incompatible types: Thread cannot be converted to Test
    Test t=Thread.currentThread();
                               ^
1 error

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
class MyThread1 extends Thread
 {
	public void run()
	   {
		 
	   } 
	}

class Test extends Thread
{
public static void main(String[] args) 
    {
    Test t=Thread.currentThread();
    
   }	
}

C:\Users\DELL\Desktop>javac Test.java
Test.java:13: error: incompatible types: Thread cannot be converted to Test
    Test t=Thread.currentThread();
                               ^
1 error

C:\Users\DELL\Desktop>cls
EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
MULTITHREADING VIDEO 8 TOPICS STARTTED..
(synchronization part 2)
   From Example 8:-(video 7)

PROGRAME=16
===========

EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
class Display
         {
                public synchronized void wish(String name)
                    {
                      for(int i=0;i<5;i++)
                         {
                           System.out.print("good morning:");
                            try
                              {
                                 Thread.sleep(1000);
                              }
                            catch (InterruptedException e){}
                           System.out.println(name);
                         }
                     }
               }
            class MyThread extends Thread
            {
                Display d;
                String name;
                   MyThread(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                       d.wish(name);
                     }
             }

           class Test
          {
             public static void main(String[] args)
                {
                  Display d1=new Display();
                  MyThread t1=new MyThread(d1,"dhoni");
                  MyThread t2=new MyThread(d1,"yuvaraj");
                   t1.start();
                   t2.start();
                 }
            }


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
good morning:dhoni
good morning:dhoni
good morning:dhoni
good morning:dhoni
good morning:dhoni
good morning:yuvaraj
good morning:yuvaraj                  
good morning:yuvaraj
good morning:yuvaraj
good morning:yuvaraj

C:\Users\DELL\Desktop>
EXPLANATION:-
============
If multiple Thread s are trying to opereate simultaneously on the same display() Object then synchronized keyword is
necessary.
so @ a time only one Thread will operate on the display Object..
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
class Display
         {
                public synchronized void wish(String name)
                    {
                      for(int i=0;i<5;i++)
                         {
                           System.out.print("good morning:");
                            try
                              {
                                 Thread.sleep(1000);
                              }
                            catch (InterruptedException e){}
                           System.out.println(name);
                         }
                     }
               }
            class MyThread extends Thread
            {
                Display d;
                String name;
                   MyThread(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                       d.wish(name);
                     }
             }

           class Test
          {
             public static void main(String[] args)
                {
                  Display d1=new Display();
                  Display d2=new Display();
                  MyThread t1=new MyThread(d1,"dhoni");
                  MyThread t2=new MyThread(d2,"yuvaraj");
                   t1.start();
                   t2.start();
                 }
            }



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
good morning:good morning:yuvaraj
good morning:dhoni
good morning:yuvaraj
good morning:dhoni
good morning:yuvaraj
good morning:dhoni
good morning:dhoni
good morning:yuvaraj
good morning:yuvaraj
dhoni

C:\Users\DELL\Desktop>

EXPLANATION:-
============
For the Thread -0 different Display Object d1
For the Thread -1 different Display Object d2


even though wish method is synchronized we get irregular output wat s the reason...?
see the diagram...
short notes:- Page 9

Case study:-
Important conclusion:-
Even though wish method is synchronized we ll get irregular output..Bcoz Thread s are operating on 
different java object.

1)If multiple Thread s are operating on the same java Object,then synchronization concept
is required.
(Ex:-5 dogs single plate biryani )
(Ex:- If wife and husband performing operation on same account then synchronization is required)..

2)If If multiple Thread s are operating on multiple java Object,then synchronization concept is not
required..(Ex:-5 dogs multiple plates biryani )
Ex:- "A" person is performing account operation on his object,
      another person "B" performing some operation on his account object..
	  synchronization concept is not required..
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
PROGRAME=19
=========
class Display
         {
                public static synchronized void wish(String name)
                    {
                      for(int i=0;i<5;i++)
                         {
                           System.out.print("good morning:");
                            try
                              {
                                 Thread.sleep(1000);
                              }
                            catch (InterruptedException e){}
                           System.out.println(name);
                         }
                     }

					 public void m1(String name)
					{
						 for(int i=0;i<5;i++)
                         {
                           System.out.print("good evening:");
                            try
                              {
                                 Thread.sleep(1000);
                              }
                            catch (InterruptedException e){}
                            System.out.println(name);
                          }
						  
					}
               }
            class MyThread extends Thread
            {
                Display d;
                String name;
                   MyThread(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                       d.wish(name);
                     }
             }

			 class MyThread2 extends Thread
            {
                Display d;
                String name;
                   MyThread2(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                       d.m1(name);
                     }
             }

           class Test
          {
             public static void main(String[] args)
                {
                  Display d1=new Display();
                  MyThread t1=new MyThread (d1,"dhoni");
                  MyThread2 t2=new MyThread2 (d1,"yuvraj");
                   t1.start();
                   t2.start();
                 }
            }


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
good morning:good evening:dhoni
good morning:yuvraj
good evening:dhoni
good morning:yuvraj
good evening:dhoni
good morning:yuvraj
good evening:dhoni
good morning:yuvraj
good evening:dhoni
yuvraj

C:\Users\DELL\Desktop>

EXPLANATION:-
============
One Thread is operating on a synchronized method() on object(-->a) of a class Display.
But another Thread is able to acess non synchronized method on the same object(-->a) of the Display class..
***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
If a method or block declared as the synchronized then at a time only one
Thread is allow to execute that method or block on the given object

PROGRAME=20
=========
 class Display
{
 public  synchronized void wish(String name)
    {
       for(int i=0;i<10;i++)
         {
    	   try
    	     {
                Thread.sleep(1000);
                System.out.print("good morning: "+Thread.currentThread().getName());   
             }catch (InterruptedException e){}
              System.out.println("   "+name +"  "+ Thread.currentThread().getName());
          }
     }

public  synchronized  void m1(String name)
    {
	     for(int i=0;i<10;i++)
           {
	    	
	    	  try
	    	   { 
	    		 Thread.sleep(1000);
	    		 System.out.print("good evening: "+Thread.currentThread().getName());
                 }catch (InterruptedException e){}
              System.out.println("   "+name+"  "+ Thread.currentThread().getName());
           }
						  
      }
}
            class MyThread extends Thread
            {
                Display d;
                String name;
                   MyThread(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                       d.wish(name);
                       System.out.println("MyThread.....>"+d.hashCode()+" "+Thread.currentThread().getName());
                     }
             }

			 class MyThread2 extends Thread
            {
                Display d;
                String name;
                   MyThread2(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                       d.m1(name);
                       System.out.println("MyThread2.....>"+d.hashCode()+" "+Thread.currentThread().getName());
                     }
             }

           class Test
          {
             public static void main(String[] args)
                {
                  Display d1=new Display();
                  
                  MyThread t1=new MyThread (d1,"dhoni");
                 
                  MyThread2 t2=new MyThread2 (d1,"yuvraj");
                  
                   t1.start();
                   t2.start();
            
                   System.out.println("main method____>"+d1.hashCode());
                 }
            }


			C:\Users\DELL\Desktop>java Test
main method____>366712642
good morning: Thread-0   dhoni  Thread-0
good morning: Thread-0   dhoni  Thread-0
good morning: Thread-0   dhoni  Thread-0
good morning: Thread-0   dhoni  Thread-0
good morning: Thread-0   dhoni  Thread-0
good morning: Thread-0   dhoni  Thread-0
good morning: Thread-0   dhoni  Thread-0
good morning: Thread-0   dhoni  Thread-0
good morning: Thread-0   dhoni  Thread-0
good morning: Thread-0   dhoni  Thread-0
MyThread.....>366712642 Thread-0
good evening: Thread-1   yuvraj  Thread-1
good evening: Thread-1   yuvraj  Thread-1
good evening: Thread-1   yuvraj  Thread-1
good evening: Thread-1   yuvraj  Thread-1
good evening: Thread-1   yuvraj  Thread-1
good evening: Thread-1   yuvraj  Thread-1
good evening: Thread-1   yuvraj  Thread-1
good evening: Thread-1   yuvraj  Thread-1
good evening: Thread-1   yuvraj  Thread-1
good evening: Thread-1   yuvraj  Thread-1
MyThread2.....>366712642 Thread-1

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
PROGRAME=21
=========
class Display
{
 public  synchronized void wish(String name)
    {
       for(int i=0;i<3;i++)
         {
		    System.out.print("good morning: "+Thread.currentThread().getName()); 
    	   try
    	     {
                Thread.sleep(1000);
                 
             }catch (InterruptedException e){}
              System.out.println("   "+name +"  "+ Thread.currentThread().getName());
          }
     }

public  synchronized  void m1(String name)
    {
	     for(int i=0;i<3;i++)
           {
	    	System.out.print("good evening: "+Thread.currentThread().getName());
	    	  try
	    	   { 
	    		 Thread.sleep(1000);
	    		 
                 }catch (InterruptedException e){}
              System.out.println("   "+name+"  "+ Thread.currentThread().getName());
           }
						  
      }
}
            class MyThread extends Thread
            {
                Display d;
                String name;
                   MyThread(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                       d.wish(name);
                       System.out.println("MyThread.....>"+d.hashCode()+" "+Thread.currentThread().getName());
                     }
             }

			 class MyThread2 extends Thread
            {
                Display d;
                String name;
                   MyThread2(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                       d.m1(name);
                       System.out.println("MyThread2.....>"+d.hashCode()+" "+Thread.currentThread().getName());
                     }
             }

           class Test
          {
             public static void main(String[] args)
                {
                  Display d1=new Display();
                  
                  MyThread t1=new MyThread (d1,"dhoni");
                 
                  MyThread2 t2=new MyThread2 (d1,"yuvraj");
                  
                   t1.start();
                   t2.start();
            
                   System.out.println("main method____>"+d1.hashCode());
                 }
            }


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
good morning: Thread-0main method____>366712642
   dhoni  Thread-0
good morning: Thread-0   dhoni  Thread-0
good morning: Thread-0   dhoni  Thread-0
good evening: Thread-1MyThread.....>366712642 Thread-0
   yuvraj  Thread-1
good evening: Thread-1   yuvraj  Thread-1
good evening: Thread-1   yuvraj  Thread-1
MyThread2.....>366712642 Thread-1

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Here we are getting irregular output 

synchronized method is acessed by only one Thread-0.


make some R & D on 21 and 22..
***************************-----END of--->21<--------***************************
Example=22
=========
NOTE:-
-----
PROGRAME=22
=========
class Display
{
 public  synchronized void wish(String name)
    {
       for(int i=0;i<5;i++)
         {  System.out.print("good morning: "+Thread.currentThread().getName());   
    	   try
    	     {
                Thread.sleep(1000);
              
             }catch (InterruptedException e){}
              System.out.println("   "+name +"  "+ Thread.currentThread().getName());
          }
     }

public  synchronized  void m1(String name)
    {
	     for(int i=0;i<5;i++)
           {
	    	 System.out.print("good evening: "+Thread.currentThread().getName());
	    	  try
	    	   { 
	    		 Thread.sleep(1000);
	    		
                 }catch (InterruptedException e){}
              System.out.println("   "+name+"  "+ Thread.currentThread().getName());
           }
						  
      }
}
            class MyThread extends Thread
            {
                Display d;
                String name;
                   MyThread(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                       d.wish(name);
                       System.out.println("MyThread.....>"+d.hashCode()+" "+Thread.currentThread().getName());
                     }
             }

			 class MyThread2 extends Thread
            {
                Display d;
                String name;
                   MyThread2(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                       d.m1(name);
                       System.out.println("MyThread2.....>"+d.hashCode()+" "+Thread.currentThread().getName());
                     }
             }

           class Test
          {
             public static void main(String[] args)
                {
                  Display d1=new Display();
                  
                  MyThread t1=new MyThread (d1,"dhoni");
                 
                  MyThread2 t2=new MyThread2 (d1,"yuvraj");
                  
                   t1.start();
                   t2.start();
            
                   System.out.println("main method____>"+d1.hashCode());
                 }
            }

           main method____>366712642
           good morning: Thread-0   dhoni  Thread-0
           good morning: Thread-0   dhoni  Thread-0
           good morning: Thread-0   dhoni  Thread-0
           good morning: Thread-0   dhoni  Thread-0
           good morning: Thread-0   dhoni  Thread-0
           good evening: Thread-1MyThread.....>366712642 Thread-0
              yuvraj  Thread-1
           good evening: Thread-1   yuvraj  Thread-1
           good evening: Thread-1   yuvraj  Thread-1
           good evening: Thread-1   yuvraj  Thread-1
           good evening: Thread-1   yuvraj  Thread-1
           MyThread2.....>366712642 Thread-1        
           
EXPLANATION:-
============

***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:-
-----

PROGRAME=23
=========
class Display
         {
                public static  synchronized void wish(String name)
                    {
                      for(int i=0;i<5;i++)
                         {
                           System.out.print("good morning:");
                            try
                              {
                                 Thread.sleep(1000);
                              }
                            catch (InterruptedException e){}
                           System.out.println(name);
                         }
                     }

               }
            class MyThread extends Thread
            {
                Display d;
                String name;
                   MyThread(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                        	 d.wish(name);
                     }
             }

			 class MyThread2 extends Thread
            {
                Display d;
                String name;
                   MyThread2(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                        	 d.wish(name);
                     }
             }

           class Test
          {
             public static void main(String[] args)
                {
                  Display d1=new Display();
                  Display d2=new Display();
                  MyThread t1=new MyThread (d1,"dhoni");
                  MyThread2 t2=new MyThread2 (d2,"yuvraj");
                   t1.start();
                   t2.start();
                 }
            }


good morning:dhoni
good morning:dhoni
good morning:dhoni
good morning:dhoni
good morning:dhoni
good morning:yuvraj
good morning:yuvraj
good morning:yuvraj
good morning:yuvraj
good morning:yuvraj

EXPLANATION:-
============
If a Thread  wants to execute static synchronized method then the Thread requires class level lock..
Every class in java has a unique lock which is a class level lock..

If a Thread  wants to execute static synchronized method then it requires class level lock...

Assume Frist Thread came to execute static synchronized method m1() and it got class level lock.
again next Thread came it also wants to execute static synchronized method m1() but it doesent have lock..
untill frist Thread releases the class level lock next Thread cannot acess that static synchronized method m1()..


In java we have only 2 locks 
object level lock--->synchronized method.
class level lock--->static synchronized method.

(19:50)
class level lock internally Object level lock only ,Bcoz for  every class,
Class class Object will be created internally.
That Class class Object  lock we needed..


class level lock:-(Durga Point )
Every class in java has a unique lock which is nothing but class level lock..
when a Thread requires class level lock...?
If a Thread wants to execute a static synchronized method then Thread requires class level lock..

Once Thread got class level lock,then it is allowed to execute any static synchronized method of that class..
once method execution completes automatically Thread releases the lock.


important diagram see short hand written notes:-
page:-11



conclusion:-While a Thread executing static synchronized method,
The remaining Thread s are not allowed to execute static synchronized methods of that class simultaneously..
But remaining Thread s are allowed to execute the following methods simultaneously..
1)normal static methods
2)synchronized instance methods
3)normal instance methods...
***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-
-----
To make sure only one Object has been created..
Observe the hashcode remains the same..

PROGRAME=24
===========
class Display
{
 public  synchronized void wish(String name)
    {

    }
}

class MyThread extends Thread
            {
                Display d;
                String name;
                   MyThread(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                   System.out.println("MyThread constructor "+d.hashCode());
                }
                        public void run()
                     {
                           d.wish(name);
                     }
             }

			 class MyThread2 extends Thread
            {
                Display d;
                String name;
                   MyThread2(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
				   System.out.println("MyThread 2 constructor "+d.hashCode());
                }
                        public void run()
                     {
                         d.wish(name);
					 }
             }

           class Test
          {
             public static void main(String[] args)
                {
                  Display d=new Display();
                  
                  MyThread t1=new MyThread (d,"dhoni");
                 
                  MyThread2 t2=new MyThread2 (d,"yuvraj");
                  
                   t1.start();
                   t2.start();
            
                   System.out.println("main method "+d.hashCode());
                 }
            }



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
MyThread constructor 366712642
MyThread 2 constructor 366712642
main method 366712642

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->24<--------***************************
Example=25
=========
NOTE:-
-----
PROGRAME=25
=========
class Display
         {
                public  synchronized void wish(String name) // not static
                    {
                      for(int i=0;i<5;i++)
                         {
                           System.out.print("good morning:");
                            try
                              {
                                 Thread.sleep(1000);
                              }
                            catch (InterruptedException e){}
                           System.out.println(name);
                         }
                     }

               }
            class MyThread extends Thread
            {
                Display d;
                String name;
                   MyThread(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                        	 d.wish(name);
                     }
             }

			 class MyThread2 extends Thread
            {
                Display d;
                String name;
                   MyThread2(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                        	 d.wish(name);
                     }
             }

           class Test
          {
             public static void main(String[] args)
                {
                  Display d1=new Display();
                  Display d2=new Display();
                  MyThread t1=new MyThread (d1,"dhoni");
                  MyThread2 t2=new MyThread2 (d2,"yuvraj");
                   t1.start();
                   t2.start();
                 }
            }


good morning:good morning:yuvraj
good morning:dhoni
good morning:dhoni
good morning:yuvraj
good morning:yuvraj
good morning:dhoni
good morning:yuvraj
good morning:dhoni
good morning:dhoni
yuvraj

EXPLANATION:-
============
***************************-----END of--->25<--------***************************
Example=26
=========
NOTE:-
-----
PROGRAME=26
=========
class Display
{
 public  synchronized void wish(String name)
    {
       for(int i=0;i<3;i++)
         {
		    System.out.print("good morning: "); 
    	   try
    	     {
                Thread.sleep(1000);
                 
             }catch (InterruptedException e){}
              System.out.println(name);
          }
     }


}
            class MyThread extends Thread
            {
                Display d;
                String name;
                   MyThread(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                           d.wish(name);
                     }
             }

			 class MyThread2 extends Thread
            {
                Display d;
                String name;
                   MyThread2(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                         d.wish(name);
					 }
             }

           class Test
          {
             public static void main(String[] args)
                {
                  Display d1=new Display();
                  
                  MyThread t1=new MyThread (d1,"dhoni");
                 
                  MyThread2 t2=new MyThread2 (d1,"yuvraj");
                  
                   t1.start();
                   t2.start();
            
                   System.out.println("main method____>"+d1.hashCode());
                 }
            }


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
main method____>366712642
good morning: dhoni
good morning: dhoni
good morning: dhoni
good morning: yuvraj
good morning: yuvraj
good morning: yuvraj

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->26<--------***************************
Example=27
=========
NOTE:-
-----
PROGRAME=27
=========
class Display
{
 public  void displayn()
    {
       for(int i=0;i<10;i++)
         {
		    System.out.print(i); 
    	   try
    	     {
                Thread.sleep(1000);
             }catch (InterruptedException e){}
            
          }
     }

	 public void displayc()
    {
       for(int i=65;i<75;i++)
         {
		    System.out.print((char)i); 
    	   try
    	     {
                Thread.sleep(1000);
             }catch (InterruptedException e){}
            
          }
     }


}
            class MyThread1 extends Thread
            {
                Display d;
                String name;
                   MyThread1(Display d)
                  {
                    this.d=d;
					}
                        public void run()
                     {
                           d.displayn();
                     }
             }

			 class MyThread2 extends Thread
            {
                Display d;
                String name;
                   MyThread2(Display d)
                  {
                    this.d=d;
                }
                        public void run()
                     {
                         d.displayc();
					 }
             }

class Test
          {
            public static void main(String[] args)
                {
                  Display d=new Display();
                  
                  MyThread1 t1=new MyThread1 (d);
                 
                  MyThread2 t2=new MyThread2 (d);
                  
                   t1.start();
                   t2.start();
                }
            }



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
A0B1C23D4EF5G67HI8J9
C:\Users\DELL\Desktop>

EXPLANATION:-
============
Both are normal methods which so both Thread s will execute both methods simlutaneously.
***************************-----END of--->27<--------***************************
Example=28
=========
NOTE:- See page 14 for diagrams..
-----
PROGRAME=28
=========
class Display
{
 public synchronized   void displayn()
    {
       for(int i=0;i<10;i++)
         {
		    System.out.print(i); 
    	   try
    	     {
                Thread.sleep(1000);
             }catch (InterruptedException e){}
            
          }
     }

	 public void displayc()
    {
       for(int i=65;i<75;i++)
         {
		    System.out.print((char)i); 
    	   try
    	     {
                Thread.sleep(1000);
             }catch (InterruptedException e){}
            
          }
     }


}
            class MyThread1 extends Thread
            {
                Display d;
                String name;
                   MyThread1(Display d)
                  {
                    this.d=d;
					}
                        public void run()
                     {
                           d.displayn();
                     }
             }

			 class MyThread2 extends Thread
            {
                Display d;
                String name;
                   MyThread2(Display d)
                  {
                    this.d=d;
                }
                        public void run()
                     {
                         d.displayc();
					 }
             }

class Test
          {
            public static void main(String[] args)
                {
                  Display d=new Display();
                  
                  MyThread1 t1=new MyThread1 (d);
                 
                  MyThread2 t2=new MyThread2 (d);
                  
                   t1.start();
                   t2.start();
                }
            }



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
A0B1C23D4EF56G7HI8J9
C:\Users\DELL\Desktop>

EXPLANATION:-
============
Page -14(Small hand written notes).

Here one Thread gets the object lock of synchronized method displayn,
But another Thread trying to execute normal method which does nt require any lock so both Threads will execute 
simultaneously..mixed output.

***************************-----END of--->28<--------***************************
Example=29
=========
NOTE:-
-----
PROGRAME=29
=========
class Display
{
 public synchronized   void displayn()
    {
       for(int i=0;i<10;i++)
         {
		    System.out.print(i); 
    	   try
    	     {
                Thread.sleep(1000);
             }catch (InterruptedException e){}
            
          }
     }

	 public synchronized void displayc()
    {
       for(int i=65;i<75;i++)
         {
		    System.out.print((char)i); 
    	   try
    	     {
                Thread.sleep(1000);
             }catch (InterruptedException e){}
            
          }
     }


}
            class MyThread1 extends Thread
            {
                Display d;
                String name;
                   MyThread1(Display d)
                  {
                    this.d=d;
					}
                        public void run()
                     {
                           d.displayn();
                     }
             }

			 class MyThread2 extends Thread
            {
                Display d;
                String name;
                   MyThread2(Display d)
                  {
                    this.d=d;
                }
                        public void run()
                     {
                         d.displayc();
					 }
             }

class Test
          {
            public static void main(String[] args)
                {
                  Display d=new Display();
                  
                  MyThread1 t1=new MyThread1 (d);
                 
                  MyThread2 t2=new MyThread2 (d);
                  
                   t1.start();
                   t2.start();
                }
            }



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
0123456789ABCDEFGHIJ
C:\Users\DELL\Desktop>

EXPLANATION:-
============
Here both Thread are trying to execute synchronized methods on the same Object.
so utill one Thread finishes the its execution another Thread has to wait...

Here T1 Thread gets the lock of Display object and start executing 
synchronized method displayn().
now T2 wil come to execute displayc() but lock already occupied by Thread 1,so untill Thread -1 
finishes the execution Thread -2 has to wait..
***************************-----END of--->29<--------***************************
Example=30
=========
NOTE:-
-----
PROGRAME=30
=========
class Display
         {
                public static  synchronized void wish(String name)
                    {
                      for(int i=0;i<5;i++)
                         {
                           System.out.print("good morning:");
                            try
                              {
                                 Thread.sleep(1000);
                              }
                            catch (InterruptedException e){}
                           System.out.println(name);
                         }
                     }

               }
            class MyThread1 extends Thread
            {
                Display d;
                String name;
                   MyThread1(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                }
                        public void run()
                     {
                        	 d.wish(name);
                        	 System.out.println(""+d.hashCode());
                     }
             }

			 class MyThread2 extends Thread
            {
                Display d;
                String name;
                   MyThread2(Display d,String name)
                  {
                    this.d=d;
                   this.name=name;
                  }
                        public void run()
                     {
                        	 d.wish(name);
                        	 System.out.println(""+d.hashCode());
                     }
             }

           class Test
          {
             public static void main(String[] args)
                {
                  Display d1=new Display();
             	 System.out.println("Inside main method "+d1.hashCode());
                  MyThread1 t1=new MyThread1 (d1,"dhoni");
                  MyThread2 t2=new MyThread2 (d1,"yuvraj");
                   t1.start();
                   t2.start();
                 }
            }


Inside main method 366712642
good morning:dhoni
good morning:dhoni
good morning:dhoni
good morning:dhoni
good morning:dhoni
good morning:366712642
yuvraj
good morning:yuvraj
good morning:yuvraj
good morning:yuvraj
good morning:yuvraj
366712642

EXPLANATION:-
============

***************************-----END of--->30<--------***************************
Example=31
=========
NOTE:-
-----
PROGRAME=31
=========
EXPLANATION:-
============
***************************-----END of--->31<--------***************************
Example=32
=========
NOTE:-
-----
PROGRAME=32
=========
EXPLANATION:-
============
***************************-----END of--->32<--------***************************
Example=33
=========
NOTE:-
-----
PROGRAME=33
=========
EXPLANATION:-
============
***************************-----END of--->33<--------***************************
Example=34
=========
NOTE:-
-----
PROGRAME=34
=========
EXPLANATION:-
============
***************************-----END of--->34<--------***************************
Example=35
=========
NOTE:-
-----
PROGRAME=35
=========
EXPLANATION:-
============
***************************-----END of--->35<--------***************************
Example=36
=========
NOTE:-
-----
PROGRAME=36
=========
EXPLANATION:-
============
***************************-----END of--->36<--------***************************
Example=37
=========
NOTE:-
-----
PROGRAME=37
=========
EXPLANATION:-
============
***************************-----END of--->37<--------***************************
Example=38
=========
NOTE:-
-----
PROGRAME=38
=========
EXPLANATION:-
============
***************************-----END of--->38<--------***************************
Example=39
=========
NOTE:-
-----
PROGRAME=39
=========
EXPLANATION:-
============
***************************-----END of--->39<--------***************************
Example=40
=========
NOTE:-
-----
PROGRAME=40
=========
EXPLANATION:-
============
***************************-----END of--->40<--------***************************
Example=41
=========
NOTE:-
-----
PROGRAME=41
=========
EXPLANATION:-
============
***************************-----END of--->41<--------***************************
Example=42
=========
NOTE:-
-----
PROGRAME=42
=========
EXPLANATION:-
============
***************************-----END of--->42<--------***************************
Example=43
=========
NOTE:-
-----
PROGRAME=43
=========
EXPLANATION:-
============
***************************-----END of--->43<--------***************************
Example=44
=========
NOTE:-
-----
PROGRAME=44
=========
EXPLANATION:-
============
***************************-----END of--->44<--------***************************
Example=45
=========
NOTE:-
-----
PROGRAME=45
=========
EXPLANATION:-
============
***************************-----END of--->45<--------***************************
Example=46
=========
NOTE:-
-----
PROGRAME=46
=========
EXPLANATION:-
============
***************************-----END of--->46<--------***************************
Example=47
=========
NOTE:-
-----
PROGRAME=47
=========
EXPLANATION:-
============
***************************-----END of--->47<--------***************************
Example=48
=========
NOTE:-
-----
PROGRAME=48
=========
EXPLANATION:-
============
***************************-----END of--->48<--------***************************
Example=49
=========
NOTE:-
-----
PROGRAME=49
=========
EXPLANATION:-
============
***************************-----END of--->49<--------***************************
Example=50
=========
NOTE:-
-----
PROGRAME=50
=========
EXPLANATION:-
============
***************************-----END of--->50<--------***************************
Example=51
=========
NOTE:-
-----
PROGRAME=51
=========
EXPLANATION:-
============
***************************-----END of--->51<--------***************************
Example=52
=========
NOTE:-
-----
PROGRAME=52
=========
EXPLANATION:-
============
***************************-----END of--->52<--------***************************
Example=53
=========
NOTE:-
-----
PROGRAME=53
=========
EXPLANATION:-
============
***************************-----END of--->53<--------***************************
Example=54
=========
NOTE:-
-----
PROGRAME=54
=========
EXPLANATION:-
============
***************************-----END of--->54<--------***************************
Example=55
=========
NOTE:-
-----
PROGRAME=55
=========
EXPLANATION:-
============
***************************-----END of--->55<--------***************************
Example=56
=========
NOTE:-
-----
PROGRAME=56
=========
EXPLANATION:-
============
***************************-----END of--->56<--------***************************
Example=57
=========
NOTE:-
-----
PROGRAME=57
=========
EXPLANATION:-
============
***************************-----END of--->57<--------***************************
Example=58
=========
NOTE:-
-----
PROGRAME=58
=========
EXPLANATION:-
============
***************************-----END of--->58<--------***************************
Example=59
=========
NOTE:-
-----
PROGRAME=59
=========
EXPLANATION:-
============
***************************-----END of--->59<--------***************************
Example=60
=========
NOTE:-
-----
PROGRAME=60
=========
EXPLANATION:-
============
***************************-----END of--->60<--------***************************
Example=61
=========
NOTE:-
-----
PROGRAME=61
=========
EXPLANATION:-
============
***************************-----END of--->61<--------***************************
Example=62
=========
NOTE:-
-----
PROGRAME=62
=========
EXPLANATION:-
============
***************************-----END of--->62<--------***************************
Example=63
=========
NOTE:-
-----
PROGRAME=63
=========
EXPLANATION:-
============
***************************-----END of--->63<--------***************************
Example=64
=========
NOTE:-
-----
PROGRAME=64
=========
EXPLANATION:-
============
***************************-----END of--->64<--------***************************
Example=65
=========
NOTE:-
-----
PROGRAME=65
=========
EXPLANATION:-
============
***************************-----END of--->65<--------***************************
Example=66
=========
NOTE:-
-----
PROGRAME=66
=========
EXPLANATION:-
============
***************************-----END of--->66<--------***************************
Example=67
=========
NOTE:-
-----
PROGRAME=67
=========
EXPLANATION:-
============
***************************-----END of--->67<--------***************************
Example=68
=========
NOTE:-
-----
PROGRAME=68
=========
EXPLANATION:-
============
***************************-----END of--->68<--------***************************
Example=69
=========
NOTE:-
-----
PROGRAME=69
=========
EXPLANATION:-
============
***************************-----END of--->69<--------***************************
Example=70
=========
NOTE:-
-----
PROGRAME=70
=========
EXPLANATION:-
============
***************************-----END of--->70<--------***************************
Example=71
=========
NOTE:-
-----
PROGRAME=71
=========
EXPLANATION:-
============
***************************-----END of--->71<--------***************************
Example=72
=========
NOTE:-
-----
PROGRAME=72
=========
EXPLANATION:-
============
***************************-----END of--->72<--------***************************
Example=73
=========
NOTE:-
-----
PROGRAME=73
=========
EXPLANATION:-
============
***************************-----END of--->73<--------***************************
Example=74
=========
NOTE:-
-----
PROGRAME=74
=========
EXPLANATION:-
============
***************************-----END of--->74<--------***************************
Example=75
=========
NOTE:-
-----
PROGRAME=75
=========
EXPLANATION:-
============
***************************-----END of--->75<--------***************************
Example=76
=========
NOTE:-
-----
PROGRAME=76
=========
EXPLANATION:-
============
***************************-----END of--->76<--------***************************
Example=77
=========
NOTE:-
-----
PROGRAME=77
=========
EXPLANATION:-
============
***************************-----END of--->77<--------***************************
Example=78
=========
NOTE:-
-----
PROGRAME=78
=========
EXPLANATION:-
============
***************************-----END of--->78<--------***************************
Example=79
=========
NOTE:-
-----
PROGRAME=79
=========
EXPLANATION:-
============
***************************-----END of--->79<--------***************************
Example=80
=========
NOTE:-
-----
PROGRAME=80
=========
EXPLANATION:-
============
***************************-----END of--->80<--------***************************
Example=81
=========
NOTE:-
-----
PROGRAME=81
=========
EXPLANATION:-
============
***************************-----END of--->81<--------***************************
Example=82
=========
NOTE:-
-----
PROGRAME=82
=========
EXPLANATION:-
============
***************************-----END of--->82<--------***************************
Example=83
=========
NOTE:-
-----
PROGRAME=83
=========
EXPLANATION:-
============
***************************-----END of--->83<--------***************************
Example=84
=========
NOTE:-
-----
PROGRAME=84
=========
EXPLANATION:-
============
***************************-----END of--->84<--------***************************
Example=85
=========
NOTE:-
-----
PROGRAME=85
=========
EXPLANATION:-
============
***************************-----END of--->85<--------***************************
Example=86
=========
NOTE:-
-----
PROGRAME=86
=========
EXPLANATION:-
============
***************************-----END of--->86<--------***************************
Example=87
=========
NOTE:-
-----
PROGRAME=87
=========
EXPLANATION:-
============
***************************-----END of--->87<--------***************************
Example=88
=========
NOTE:-
-----
PROGRAME=88
=========
EXPLANATION:-
============
***************************-----END of--->88<--------***************************
Example=89
=========
NOTE:-
-----
PROGRAME=89
=========
EXPLANATION:-
============
***************************-----END of--->89<--------***************************
Example=90
=========
NOTE:-
-----
PROGRAME=90
=========
EXPLANATION:-
============
***************************-----END of--->90<--------***************************
Example=91
=========
NOTE:-
-----
PROGRAME=91
=========
EXPLANATION:-
============
***************************-----END of--->91<--------***************************
Example=92
=========
NOTE:-
-----
PROGRAME=92
=========
EXPLANATION:-
============
***************************-----END of--->92<--------***************************
Example=93
=========
NOTE:-
-----
PROGRAME=93
=========
EXPLANATION:-
============
***************************-----END of--->93<--------***************************
Example=94
=========
NOTE:-
-----
PROGRAME=94
=========
EXPLANATION:-
============
***************************-----END of--->94<--------***************************
Example=95
=========
NOTE:-
-----
PROGRAME=95
=========
EXPLANATION:-
============
***************************-----END of--->95<--------***************************
Example=96
=========
NOTE:-
-----
PROGRAME=96
=========
EXPLANATION:-
============
***************************-----END of--->96<--------***************************
Example=97
=========
NOTE:-
-----
PROGRAME=97
=========
EXPLANATION:-
============
***************************-----END of--->97<--------***************************
Example=98
=========
NOTE:-
-----
PROGRAME=98
=========
EXPLANATION:-
============
***************************-----END of--->98<--------***************************
Example=99
=========
NOTE:-
-----
PROGRAME=99
=========
EXPLANATION:-
============
***************************-----END of--->99<--------***************************
Example=100
=========
NOTE:-
-----
PROGRAME=100
=========
EXPLANATION:-
============
***************************-----END of--->100<--------***************************
