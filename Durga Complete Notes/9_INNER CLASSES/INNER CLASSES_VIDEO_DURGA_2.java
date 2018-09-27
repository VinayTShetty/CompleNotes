TOPIC:- INNER CLASS 
--------
VIDEO NO=2
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------

IMPORTANT EXAMPLES:-
Example=6(Different approach)
Example=15
Example=19
Example=22(Explanation last Point)
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
Last video..

PROGRAME=1
=========
class Outer 
{
	class Inner
	{
		public void m1()
			{
		      System.out.println("Inner class m1 method");
		    }
	}
}

class Test
{
	public static void main(java.lang.String args[])
	  {
          Outer o =new Outer();
		  Outer.Inner i=o.new Inner();
		  i.m1();
      }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Inner class m1 method

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
From normal or regular inner class,
we can acess both static and non-static members of outer class directly.

PROGRAME=2
=========
class Outer 
{
	int x =10;
	static int  y=20;
	class Inner
	{
		public void m1()
			{
		      System.out.println("Inner class m1 method");
		      System.out.println(x);
		      System.out.println(y);
		    }
	}

	public static void main(java.lang.String args[])
	  {
		new Outer().new Inner().m1();
      }
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Outer
Inner class m1 method
10
20

C:\Users\DELL\Desktop>
EXPLANATION:-
============

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
Preference is always going for local variables..

PROGRAME=3
=========
class Outer 
{
	int x =10;
	
	   class Inner
	{
		   int x =100;
		public void m1()
			{
			   int x =1000;
		       System.out.println("Inner class m1 method");
		       System.out.println(x);
			}
	}

	public static void main(java.lang.String args[])
	  {
		new Outer().new Inner().m1();
      }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Outer
Inner class m1 method
1000

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
Within the inner class this always refer to current inner class Object.

If we want to refer current outer class name.this.

PROGRAME=4
=========
class Outer 
{
	int x =10;
	
	   class Inner
	{
		   int x =100;
		public void m1()
			{
			   int x =1000;
		       System.out.println("Inner class m1 method");
		       System.out.println(this.x);
			}
	}

	public static void main(java.lang.String args[])
	  {
		new Outer().new Inner().m1();
      }
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Outer
Inner class m1 method
100

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
class Outer 
{
	int x =10;
	
	   class Inner
	{
		   int x =100;
		public void m1()
			{
			   int x =1000;
		       System.out.println("Inner class m1 method");
		       System.out.println(Outer.this.x);
			}
	}

	public static void main(java.lang.String args[])
	  {
		new Outer().new Inner().m1();
      }
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Outer
Inner class m1 method
10

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
class Outer 
{
	int x =111;
	
	   class Inner
	{
		   int x =222;
		public void m1()
			{
			   int x =333;
		       System.out.println("Inner class m1 method");
              
			    System.out.println("-------------------");
				
				System.out.println(x); //Approach 1 (local variables)
		      
				System.out.println("-------------------");
                
				System.out.println(this.x);//Approach 1
		       System.out.println(Inner.this.x);//Approach 2

			   System.out.println("-------------------");

		       System.out.println(Outer.this.x);
		       System.out.println(new Outer().x);

               System.out.println("-------------------");
		       
			}
	}

	public static void main(java.lang.String args[])
	  {
		new Outer().new Inner().m1();
      }
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Outer
Inner class m1 method
-------------------
333
-------------------
222
222
-------------------
111
111
-------------------

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
See and compare 7 and 8 
PROGRAME=7
=========
class Outer 
{
	int x =111;
	
	   class Inner
	{
		   int x =222;
		public void m1()
			{
			   int x =333;
		       System.out.println("Inner class m1 method");
              
			    System.out.println("-------------------");
				
				System.out.println(x); //Approach 1 (local variables)
		      
				System.out.println("-------------------");
                
				System.out.println(this.x);//Approach 1
		       System.out.println(Inner.this.x);//Approach 2

			   System.out.println("-------------------");

		       System.out.println(Outer.this.x);
		       System.out.println(new Outer().x);

               System.out.println("-------------------");
		       
			}
	}

	public static void main(java.lang.String args[])
	  {
		
      }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Outer

C:\Users\DELL\Desktop>

EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
class Outer 
{
	int x =111;
	
	   class Inner
	{
		   int x =222;
		public void m1()
			{
			   int x =333;
		       System.out.println(new Inner().x);
			}
	}

	public static void main(String args[])
	  {
		System.out.println("hi vinay");
      }
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Outer
hi vinay

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Without creating Outer class Object we cannot create inner class Object this rule is break see
in inner class m1() method.
We have created a Inner class Object without Outer class Object creation..
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
EXPLANATION:-
============
For Outer class the following modifier are applicable..
public
<default>
final
abstract
strictfp

For Inner class the following modifier are applicable..
private
protected
static
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
Nesting of inner classes..
Inside inner class we can declare another inner class that is nesting of inner class is possible.

PROGRAME=10
=========
EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
class A
{
	class B
	{
		class C
		{
			public void m1()
			{
				System.out.println("Inner most m1 method");
			}
		}
	}
   
}

class Test
{
	  public static void main(String [] args)
	{
		  System.out.println("main method");
		  
		  A a =new A();
		  A.B b=a.new B();
		  A.B.C c=b.new C();
		  c.m1();
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
main method
Inner most m1 method

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
EXPLANATION:-
============
2 nd category of inner class..

      2)Mehtod local inner class

 Y inner classes concept is required...
 Video(28:00)
Page 108 Long Book,
Big Book Page 108 




Need of method local inner class:-
-------------------------------------
1)The main purpose of method local inner class es is to define method specific repeatedly
required functionality.
2)Method local inner class es are best suitable to meet nested method requirements.

***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
EXPLANATION:-
============

case 1:-Scope of method local inner class.

public void m1()
{
  int x=10;
}

x is a local variable of m1() method.
so the scope is always within the m1() method..


The same concept is applicable for method local inner class es..

Assume we have declared a class inside a method m1().

public void m1()
{
  class Method_local_Inner_class
  {
  }

}

1)so the scope of Method_local_Inner_class class is within m1() method.
2)so the scope of Method_local_Inner_class class is ver less...



3)Method local Inner class are very rarely used.(Due to less scope)
4)The most commonly used inner class is anoonymous inner class..
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
EXPLANATION:-
============

SCOPE OF METHOD LOCAL INNER CLASS:-
-----------------------------------
We can acess method local inner class es only within a method where we declared it,
outside of method we can t acess..
Bcoz of its less scope method local innner class es are rarely used type of inner class es..

***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
We can declare mehtod local inner class es inside both instance and static method..

PROGRAME=15
=========
Case:-1
---------
class Test
{
	public void m1()
	{
	   class Inner
	   {
		   public void Sum(int x ,int y)
		   {
		     System.out.println("Sum="+(x+y));
		   }

	    }
            Inner i=new Inner();
     		i.Sum(10,100);
		    i.Sum(11,111);
		    i.Sum(22,222);
	}
        public static void main(String [] args)
	    {
           new Test().m1();
	    }
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Sum=110
Sum=122
Sum=244

C:\Users\DELL\Desktop>

EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
Case 2:-
---------
We can declare mehtod local inner class es inside both instance and static method..

PROGRAME=16
=========
class Test
{
	public static void m1()
	{
	   class Inner
	   {
		   public void Sum(int x ,int y)
		   {
		     System.out.println("Sum="+(x+y));
		   }

	    }
            Inner i=new Inner();
     		i.Sum(11,111);
		    i.Sum(22,222);
		    i.Sum(33,333);
	}
        public static void main(String [] args)
	    {
           new Test().m1();
	    }
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Sum=122
Sum=244
Sum=366

C:\Users\DELL\Desktop>

EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
We can declare method local inner class in static methods also but some important observation is required..
Regarding aceesing Outer class instance and static variables..

PROGRAME=17
=========
class Test
{
    int x=10;
	static int y=20;
 	public void m1()
	{
	   class Inner
	   {
		   public void m2()
		   {
		     System.out.println(x);
		     System.out.println(y);
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

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
10
20

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Durga Point:-
------------
 If a we declare a inner class, inside an instance method.
 Then from that method local inner class we can acess both static and non-static(instance) members of outer
 class directly.

 Vinay Point:-
 --------------

 Outer class instance and static members can be acesses directly to outer class instance method and to its 
 corresponding method local inner class instance method.
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
55:00(Time session)

class Test
{
    int x=10;
	static int y=20;
 	public static void m1() 
	{
	   class Inner
	   {
		   public void m2()
		   {
		     System.out.println(x); // line 1
		     System.out.println(y);
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

C:\Users\DELL\Desktop>javac Test.java
Test.java:11: error: non-static variable x cannot be referenced from a static context
                     System.out.println(x);
                                        ^
1 error

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Durga Point:-
------------
 If a we declare a inner class, inside an static method.
 Then we can acess only static member s of outer class directly from that method local inner class....


If we declare m1() method as static then @ line 1 we ll get CE saying 
non-static variable x cannot be referenced from a static context


 Vinay Point:-
 --------------
we can acess static memebers of outer class directly into static method of outer class,
and its corresponding,method local inner class..
But if we are trying to acess instance members we ll get CE.
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
Important conclusion:-1:01:00
----------------------
From method local inner class, we can t acess local variables of methods in which we declared inner class.
If  local variable is declared as final we can acess..

PROGRAME=19
===========
In Durga video session we are getting errror for this 1:07:00 may be he s using older version i guess..

Acessing local variables inside method local inner class is invalid in durga video.
But am not getting that error its valid...

class Test
{
  public  void m1()
	{
        int x=1111;
	     class Inner
	    {
		   public void m2()
		   {
		     System.out.println(x); //line:-1
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


at line 1
CE:-local variable x is acessed from within inner class :needs to be declared final...

But am not getting this error..

EXPLANATION:-
============
The main internal reason for this is discussed in long book see for 
Example 19
page 110.
***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
PROGRAME=20
=========
1:09:25

class Test
{
  public  void m1()
	{
      final  int x=6666; // *******
	     class Inner
	    {
		   public void m2()
		   {
		     System.out.println(x);
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


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
6666

C:\Users\DELL\Desktop>

EXPLANATION:-
============
If we declare x as final we won t get any CE.

***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
Example 19 and 20 actual output compared to Durga:-
---------------------------------------------------

PROGRAME=21
=========
Case 1:-
--------
class Test
{
  public  void m1()
	{
        int x=9999;
	     class Inner
	    {
		   public void m2()
		   {
		     System.out.println(x);
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


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
9999

C:\Users\DELL\Desktop>

Case 2:-
--------
class Test
{
  public  void m1()
	{
        final int x=8888;
	     class Inner
	    {
		   public void m2()
		   {
		     System.out.println(x);
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


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
8888

C:\Users\DELL\Desktop>
EXPLANATION:-
============

***************************-----END of--->21<--------***************************
Example=22
=========
NOTE:-
-----
PROGRAME=22
=========
class Test
{
  public  void m1()
	{
        int x=8888;
	     class Inner
	    {
		   public void m2()
		   {
		     System.out.println(x);
		   }

	    }
            Inner i=new Inner(); //Point:-1
     		i.m2();
	}
        public static void main(String [] args)
	    {
           new Test().m1();
	    }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
8888

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Point:-1

I think objects created inside inside method m1() that is local objects(Inner i=new Inner();)
are stored in stack so we are overcomming these problems..(new version i guess )


But in Example 19 and 20 according to durga point and his example local objects are created in heap so we are getting
these kind of problems..(Old version of Durga 1.6 i feel)


So compile using 1.6 version Example=19 and Example=20
***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:-
-----
PROGRAME=23
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
		   public void m2()
		   {
		     System.out.println(i);
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


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
10
20
30
40

C:\Users\DELL\Desktop>


EXPLANATION:-
============
Inside method local inner class which of the following variable we can acess..?

int k=30;
In Durga video we cannot acess 
***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-
-----
PROGRAME=24
=========
class Test
{
	int i=10;
	static int j=20;
 
         public static void m1()
	    {
            int k=30;
			final int m=40;
	        class Inner
	    {
		   public void m2()
		   {
		     System.out.println(i);
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


C:\Users\DELL\Desktop>javac Test.java
Test.java:14: error: non-static variable i cannot be referenced from a static context
                     System.out.println(i);
                                        ^
1 error

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
class Test
{
	int i=10;
	static int j=20;
 
         public static void m1()
	    {
            int k=30;
			final int m=40;
	        class Inner
	    {
		   public void m2()
		   {
		    // System.out.println(i);    // commmenting this see which variables i have acessed..
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


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
20
30
40

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->25<--------***************************
Example=26
=========
NOTE:-
-----
PROGRAME=26
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
		   public static void m2()
		   {
		     System.out.println(i);
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



C:\Users\DELL\Desktop>javac Test.java
Test.java:14: error: non-static variable i cannot be referenced from a static context
                     System.out.println(i);
                                        ^
Test.java:12: error: Illegal static declaration in inner class Inner
                   public static void m2()
                                      ^
  modifier 'static' is only allowed in constant variable declarations
2 errors

C:\Users\DELL\Desktop>
EXPLANATION:-
============

Inside method local inner class Frist we can t declare static method.
Leave about acessing other variables matter but we cannot declare static method in method local inner class.
***************************-----END of--->26<--------***************************
Example=27
=========

NOTE:-
-----

PROGRAME=27
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
		   public static void m2()
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


C:\Users\DELL\Desktop>javac Test.java
Test.java:12: error: Illegal static declaration in inner class Inner
                   public static void m2()
                                      ^
  modifier 'static' is only allowed in constant variable declarations
1 error

C:\Users\DELL\Desktop>

EXPLANATION:-
============
We ll get CE coz we can t declare static members inside inner class es.(Durga Point)

Inside method local inner class we can t declare static methods.

***************************-----END of--->27<--------***************************
Example=28
=========
NOTE:-
-----
PROGRAME=28
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


C:\Users\DELL\Desktop>javac Test.java
Test.java:12: error: Illegal static declaration in inner class Inner
               static int j=20;
                          ^
  modifier 'static' is only allowed in constant variable declarations
1 error

C:\Users\DELL\Desktop>
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
Important conclusion:-
----------------------



Ex:- The only applicable modifier for local variables is final..
----
void m1()
{
  final int x=10;
}


The only applicable modifiers for method local inner class are

1)abstract
2)final
3)strictfp

final and abstract we cannot apply both together..

I guess durga left <default> modifier to the list.
coz all previous examples we have used default modifier only.

***************************-----END of--->29<--------***************************
Example=30
=========
NOTE:-
-----
PROGRAME=30
=========
EXPLANATION:-
============
Dangerous Conclusion:- 
----------------------
From method local inner class we can t acess local variables of the method in which 
we declared method local inner class.


But this conclusion is wrong have proved in examples 22 see there 
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
