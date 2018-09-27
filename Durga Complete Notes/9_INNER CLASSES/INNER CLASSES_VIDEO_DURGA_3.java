TOPIC:-INNER CLASSES(ANONYMOUS INNER CLASSES)
--------
VIDEO NO=3
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------

IMPORTANT EXAMPLES:-
Example=6
Example=9
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============
Annonymous Inner class.
Ex:-1-----------> Asking address for Stranger,not asking his email
Ex:-2-----------> Asking conductor his name and mail id...etc...

Common Things :-we are meeting him only once,



Just one time creating /instant use and using those are called annonymous arrays,classes..

There are 2 types of charcterstics Anonymous 
1)Annonymous arrays
2)Annonymous class es..



DP:-The main purpose of annonymous inner class es is just for instant use.(One time useage).

Based on declaration and behaviour 
There are 3 types of anonymous inner classes
1. Anonymous inner class that extends a class.
2. Anonymous inner class that implements an interface.
3. Anonymous inner class that defined inside method arguments.

All important points written in long book page:-112
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
Last video programe

PROGRAME=2
=========
class Test
{
	int i=10;
	static int j=20;
 
         public  void m1()
	    {
            int k=30;
			final int m=40;
	       
			
			class Inner
	    {
               static int j=20;
		     public void m2()
		   {
		      System.out.println(j);
		     System.out.println(k);
		     System.out.println(m);
		   }

	    }
            Inner i=new Inner();
     		i.m2();
	}
        public static void main(String [] args)
	    {
           new Test().m1();
	    }
}


EXPLANATION:-
============
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----

PROGRAME=3
=========


class Popcorn
{
	public void Taste()
	{
		System.out.println("Salty");
	}
}

class Subpopcorn extends Popcorn
{
    public void Taste()
	{
		System.out.println("Seweet");
	}
}

class Test
{
	public static void main(String[] args)
	{

	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test

C:\Users\DELL\Desktop>



EXPLANATION:-
============
Not recomended.
Sweet implementation is Only one time requirements so not recomemded to go for separate top level classes..

***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
Recomended Approach:-


Only one time requirement is there..so this is the best approach..
Anonymous class approach.

PROGRAME=4
=========
class Popcorn
{
	public void Taste()
	{
		System.out.println("Salty");
	}
}

class Test
{
	public static void main(String[] args)
	{
        Popcorn p=new Popcorn()
		{
          public void Taste()
	           {
		            System.out.println("Sweet");
	           }
		};
		p.Taste();
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Sweet

C:\Users\DELL\Desktop>

EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
Where ever one time requirement is there better to go for annonynous class.
Where ever permanent requirement is there better to go for top level classes..

PROGRAME=5
=========
class Popcorn
{
	public void Taste()
	{
		System.out.println("Salty");
	}
}

class Test
{
	public static void main(String[] args)
	{
        Popcorn p=new Popcorn()
		{
          public void Taste()
	           {
		            System.out.println("Sweet");
	           }
		};
	   p.Taste();

       Popcorn p1=new Popcorn();
	   p1.Taste();

            Popcorn p2=new Popcorn()
		{
            public void Taste()
	           {
		            System.out.println("Sour");
	           }
		};
           p2.Taste();
	}
}




C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Sweet
Salty
Sour

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
class Popcorn
{
	public void Taste()
	{
		System.out.println("Salty");
	}
}

class Test
{
	public static void main(String[] args)
	{
        Popcorn p=new Popcorn()
		{
          public void m1()
	           {
		            System.out.println("m1-method");
	           }
		};
	   
	   p.Taste();

       Popcorn p1=new Popcorn();
	   
	   p1.Taste();

            
	}
}




C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Salty
Salty

C:\Users\DELL\Desktop>


EXPLANATION:-
============

Here m1 method is also there But by using parent reference and Child class Object
we can call only Parent specific methods and overriding methods in child class..
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
class Popcorn
{
	public void Taste()
	{
		System.out.println("Salty");
	}
}

class Test
{
	public static void main(String[] args)
	{
        Popcorn p=new Popcorn()
		{
          public void m1()
	           {
		            System.out.println("m1-method");
	           }
		};
	   
	   p.m1();

            
	}
}

C:\Users\DELL\Desktop>javac Test.java
Test.java:21: error: cannot find symbol
           p.m1();
            ^
  symbol:   method m1()
  location: variable p of type Popcorn
1 error

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
.class file generation.
For anonymous inner class es also .class file will be generated..

PROGRAME=8
=========
class Popcorn
{
	public void Taste()
	{
		System.out.println("Salty");
	}
}

class Test
{
	public static void main(String[] args)
	{
        Popcorn p=new Popcorn() //.class file name --->Test$1.class
		{
          public void Taste()
	           {
		            System.out.println("Sweet");
	           }
		};
	   p.Taste();

       Popcorn p1=new Popcorn();
	   p1.Taste();

            Popcorn p2=new Popcorn() //.class file name --->Test$2.class
		{
            public void Taste()
	           {
		            System.out.println("Sour");
	           }
		};
           p2.Taste();
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Sweet
Salty
Sour

C:\Users\DELL\Desktop>
EXPLANATION:-
============

In this application they are 2 anonymous class es so 2 .(dot)class es files for this application will be generated..
along with normal .class files for normal class.

Test$1.class
Test$2.class
Test.class
Popcorn.class
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
Programatically to show that annonymous class holds child class Object.
not Parent Object...

Page 115 long book see for more explanation...


PROGRAME=9
=========
class Popcorn
{
	public void Taste()
	{
		System.out.println("Salty");
	}
}

class Test
{
	public static void main(String[] args)
	{
        Popcorn p=new Popcorn()
		{
          public void Taste()
	           {
		            System.out.println("Sweet");
	           }
		};
	   p.Taste();
       
       

	   Popcorn p1=new Popcorn();
	   p1.Taste();
       
			Popcorn p2=new Popcorn()
		{
            public void Taste()
	           {
		            System.out.println("Sour");
	           }
		};
           p2.Taste();
		   System.out.println("----------------------------");
		   System.out.println(p1.getClass().getName());
           System.out.println(p.getClass().getName());
           System.out.println(p2.getClass().getName());
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Sweet
Salty
Sour
----------------------------
Popcorn
Test$1
Test$2

C:\Users\DELL\Desktop>

EXPLANATION:-
============

Popcorn p=new Popcorn()
		{
          public void Taste()
	           {
		            System.out.println("Sweet");
	           }
		};
	   p.Taste();
   System.out.println(p.getClass().getName());

										   -------->Test$1
------------------------------------------------------------------------------------
 Popcorn p2=new Popcorn()
		{
          public void Taste()
	           {
		            System.out.println("Sweet");
	           }
		};
	   p2.Taste();
   System.out.println(p2.getClass().getName());
                                           -------->Test$2
-----------------------------------------------------------------------------------
  Popcorn p1=new Popcorn();
	   p1.Taste();	   

  System.out.println(p1.getClass().getName());
                                           
										   ---------->Popcorn
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========

Case 1:- Apply these concepts to Example 9 and try

class Test
{
	public static void main(String[] args)
	{
		Test t =new Test();
		System.out.println(t.getClass().getName());
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Test

C:\Users\DELL\Desktop>

Case 2:- Apply these concepts to Example 9 and try

class Test
{
	public static void main(String[] args)
	{
		Test t =new Test();
		System.out.println(t.getClass());
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
class Test

C:\Users\DELL\Desktop>

EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
General analysis-
Long Book Page :-115
Total 3 cases...

PROGRAME=11
=========
EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
MultiThreading and anonymous inner class very commom combination in SCJP exams..

PROGRAME=12
=========
Defining a Thread by extending a Thread class--->Normal class approach.

Page 117 long book.
See that and page in that book and go through remainin points..

Points:-
-------

Job of Thread is permanent job and several times required..
Multiple times necessary.

Several classes creating this MyThread object and calling run method then best suitable is to go for
normal class approach.



EXPLANATION:-
============
class Mythread extends Thread
{
	public void run()
		{
	      for (int i=0;i<10;i++)
	      {
			  System.out.println("Child Thread");
	      }
	    }
	
}

class Test
{
	public static void main(String[] args)
	{
		Mythread t=new Mythread();
		t.start();
		for (int i=0;i<10;i++)
	      {
			  System.out.println("main Thread");
	      }
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread

C:\Users\DELL\Desktop>
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
Defining a Thread by extending a Thread class--->Anonymous class approach.


Points:-
-------

My job is temporary only one time requirement.
No other class will use this run method other than MyThread class..

so best solution is going for anonymous class approach..


PROGRAME=13
=========

class Test
{
	public static void main(String [] args)
	{
          Steps to perform
          -----------------
			  1)Have to write a class that extends Thread class.
              2)override run method 
              3)for that class(i.e child class) have to creae an object..
	}
}

All the above steps have been Coverd
------------------------------------

class Test
{

	
	public static void main(String[] args)
	{
		Thread t=new Thread() //1 step  and 3 step
		{
		   public void run() //2 step
			{

			   for (int i=0;i<5;i++)
	           {
			      System.out.println("Child Thread");
	            }
            }
		
		};

       t.start();
		for (int i=0;i<5;i++)
	      {
			  System.out.println("main Thread");
	      }
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
main Thread
main Thread
main Thread
main Thread
main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
2nd category..

Annonymous inner class that implements an interface.
===================================================
Defining a Thread by  implementing Runnable interface.


Please refer page 119 long book have written some points.

PROGRAME=14
=========
Annonymous  class approach:-
-----------------------
 class Test
{
	public static void main(String[] args)
	{
	     Runnable r=new Runnable()
		{
          public void run()
			{
			    for (int i=0;i<10;i++)
			     {
				  System.out.println("Child Thread");
			     }
			}
         };

		 Thread t=new Thread(r);
		 t.start();
            for (int i=0;i<10;i++)
              {
               System.out.println("main Thread");
              }
     }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Refere page 119 on long Book..and important points.
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
Page 120 some points are there in long book see and read..

Annonmymous inner class that defines inside argument..

PROGRAME=15
=========
Approach 1:-
------------
class Test
{
	public static void main(String[] args)
	{
		Thread t=new Thread(new Runnable()
		                      {
			                     public void run()
								  {
									 for (int i=0;i<10;i++)
									 {
										 System.out.println("Child Thread");
									 }
								  }
							  });
           t.start();
           for (int i=0;i<10;i++)
             {
			        System.out.println("main Thread");
              }
							  
      }		

}

C:\Users\DELL\Desktop>java Test
main Thread
main Thread
main Thread
Child Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread

C:\Users\DELL\Desktop>


Approach 2:-
------------
class Test
{
	public static void main(String[] args)
	{
		new Thread(new Runnable()
		                      {
			                     public void run()
								  {
									 for (int i=0;i<10;i++)
									 {
										 System.out.println("Child Thread 1");
									 }
								  }
							  }).start();
           
					  for (int i=0;i<10;i++)
             {
			        System.out.println("main Thread-2");
              }
							  
      }		

}

C:\Users\DELL\Desktop>java Test
main Thread-2
main Thread-2
main Thread-2
main Thread-2
main Thread-2
main Thread-2
Child Thread 1
Child Thread 1
Child Thread 1
Child Thread 1
Child Thread 1
Child Thread 1
Child Thread 1
Child Thread 1
Child Thread 1
Child Thread 1
main Thread-2
main Thread-2
main Thread-2
main Thread-2

EXPLANATION:-
============

***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
PROGRAME=16
=========
EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
EXPLANATION:-
============
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
EXPLANATION:-
============
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
PROGRAME=19
=========
EXPLANATION:-
============
***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
PROGRAME=20
=========
EXPLANATION:-
============
***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
PROGRAME=21
=========
EXPLANATION:-
============
***************************-----END of--->21<--------***************************
Example=22
=========
NOTE:-
-----
PROGRAME=22
=========
EXPLANATION:-
============
***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:-
-----
PROGRAME=23
=========
EXPLANATION:-
============
***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-
-----
PROGRAME=24
=========
EXPLANATION:-
============
***************************-----END of--->24<--------***************************
Example=25
=========
NOTE:-
-----
PROGRAME=25
=========
EXPLANATION:-
============
***************************-----END of--->25<--------***************************
Example=26
=========
NOTE:-
-----
PROGRAME=26
=========
EXPLANATION:-
============
***************************-----END of--->26<--------***************************
Example=27
=========
NOTE:-
-----
PROGRAME=27
=========
EXPLANATION:-
============
***************************-----END of--->27<--------***************************
Example=28
=========
NOTE:-
-----
PROGRAME=28
=========
EXPLANATION:-
============
***************************-----END of--->28<--------***************************
Example=29
=========
NOTE:-
-----
PROGRAME=29
=========
EXPLANATION:-
============
***************************-----END of--->29<--------***************************
Example=30
=========
NOTE:-
-----
PROGRAME=30
=========
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
