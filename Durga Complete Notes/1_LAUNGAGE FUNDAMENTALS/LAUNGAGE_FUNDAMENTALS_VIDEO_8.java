TOPIC:- LAUNGAGE FUNDAMENTALS
-------
VIDEO NO=8
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
creating arary in level 2 size.
How to create an array in level 2 size..
   
NOTE:-
-----
PROGRAME=1
=========

 class Test
{
public static void main(String[] args)
  {
    int [][] x=new int[2][];
    System.out.println(x[0]);
    
	x[0]=new int[4];
	x[0][3]=5;
    System.out.println(x[0][3]);
  }
}

C:\Users\dell1\Desktop>javac Test.java
C:\Users\dell1\Desktop>java Test
null
5

EXPLANATION:-
============
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:- int [][] x={{10,20,30,40},{20}}; 
-----              

PROGRAME=2
=========
 class Test
{
public static void main(String[] args)
  {
    int [][] x={{10,20,30,40},{20}};

  }
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

C:\Users\dell1\Desktop>

EXPLANATION:-
============
automatically size will be known to compiler,so we can create n-size
***************************-----END of--->2<--------***************************
Example=3
=========
Annonymous arrays.
Ex:-Test t=new Test();
    ---> new Test();    --->Name less object.
	
	int [] x=new int[3];
  
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-i guess we can create annonymous array inside the arguments only or in sop statements.
-----
PROGRAME=4
=========
Inside the sop statements

class Test
{
public static void main(String[] args)
  {
	int [] x=new int[3];// named array
	System.out.println(new int[]{10,20,30,40});//annonymous arrray or nameless array.
  }

}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
[I@2a139a55

EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
using some where else we ll get CE

class Test
{
public static void main(String[] args)
  {
	int [] x=new int[3];
	new int[]{10,20,30,40};
}

 
}
C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: not a statement
        new int[]{10,20,30,40};
        ^
1 error

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
class Test
{
 public static void main(String[] args)
  {
	 m1(new int[]{10,20,30});
  }
    static void m1(int [] x)
    {
	 for (int i : x) 
	 {
	      i =i+0;
	      System.out.println(i);
	 }
    }
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10
20
30

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
using inside the sop statements
 class Test
{
 public static void main(String[] args)
  {
   System.out.println(new int[]{10,20,30});
  }

}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
[I@2a139a55

EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:- General Point of increment or decrement operator
----- I guess its post increment.
      It means assign the value and then increment  the assigned value. 
	  assign the value is done but we cannot incremente the assign  value. coz we are not assinging to any variable.
	  
PROGRAME=8
=========
 class Test
{
 public static void main(String[] args)
  {
	 m1(new int[]{10,20,30});
  }
    static void m1(int [] x)
    {
	 for (int i : x) 
	 {
	      i =i+0;
	      System.out.println(i++);
	 }
    }
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10
20
30

C:\Users\dell1\Desktop>

 case 2:-
 --------
 class Test
{
 public static void main(String[] args)
  {
	 m1(new int[]{10,20,30});
  }
    static void m1(int [] x)
    {
	 for (int i : x) 
	 {
	      i =i+0;
	      System.out.println(++i);
	 }
    }
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
11
21
31

C:\Users\dell1\Desktop>

  
EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-

In the above program just to call sum() , we required an array but after completing
sum() call we are not using that array any more, ananimous array is best suitable.-----

PROGRAME=9
=========
class Test
{
    public static void main(String[] args)
  {
     System.out.println(sum(new int[]{10,20,30,40}));
	
	 //Not:-very very important
	 // we caanot use this array arguments anywhere if we want inside the main method
	 //coz its one time use only.
   }
     public static int sum(int[] x)
   {
     int total=0;
      for(int x1:x)
    {
		 total=total+x1;
    }
      return total;
}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
100

C:\Users\dell1\Desktop>


EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
class Test
{
 public static void main(String[] args)
  {
	 System.out.println(new int[3]{10,20,30});
  }
}
C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: ')' expected
         System.out.println(new int[3]{10,20,30});
                                      ^
Test.java:5: error: not a statement
         System.out.println(new int[3]{10,20,30});
                                       ^
Test.java:5: error: ';' expected
         System.out.println(new int[3]{10,20,30});
                                         ^
Test.java:5: error: illegal start of type
         System.out.println(new int[3]{10,20,30});
                                                ^
Test.java:7: error: class, interface, or enum expected
}
^
5 errors

EXPLANATION:-
============
 Invalid:- 
System.out.println(new int[3]{10,20,30});

Bcoz we cannot assign the size to an annoymous array.
same for inside the arguments also.
-------------------------------------------------
valid:-
 System.out.println(new int[]{10,20,30});
 same for inside the arguments also.

Programe:-
 class Test
{
 public static void main(String[] args)
  {
	 System.out.println(new int[]{10,20,30});
  }
}

[I@2a139a55
 ------------------------------------------
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-Annonymous array for 2-d array.
-----
same concept for 2-d array also

 As Example:- 10
 --------------
 new int [][]{{10,20,30},{40,50}}

PROGRAME=11
=========
class Test
{
 public static void main(String[] args)
  {
	 System.out.println( new int [][]{{10,20,30},{40,50}});
  }
}

[[I@2a139a55
EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
Page 28:-
PROGRAME=12
=========
For the int type arrays the allowed array element types are byte, short, char, int.
int[] a=new int[10];
a[0]=97;//(valid)
a[1]='a';//(valid)
byte b=10;
a[2]=b;//(valid)
short s=20;
a[3]=s;//(valid)
a[4]=10l;//

we can provide to any type which can be implicitly promoted to  declared type. 
EXPLANATION:-
============
try for byte -->char
        char-->byte
		char--->short
		short--->char
	class Test
{
 public static void main(String[] args)
  {
     byte [] b=new byte[3];
     char c='z';
     b[0]=c;
  }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: incompatible types: possible lossy conversion from char to byte
     b[0]=c;
          ^
1 error

C:\Users\dell1\Desktop>

***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
In the case of Object type arrays as array elements we can provide either declared type
objects or its child class objects.
Example 1:
 Object[] a=new Object[10];//---->declared type objects
 a[1]=new Object();//(valid)------------->declared type object
 declared type means see the meaning. 
 

a[0]=new Integer(10);//(valid)------------->child class objects.
a[2]=new String("bhaskar");//(valid)------------->child class objects.

Example 2:-
 Number page 28
 
C:\Users\dell1\Desktop>javap java.lang.Number
Compiled from "Number.java"
public abstract class java.lang.Number implements java.io.Serializable {
  public java.lang.Number();
  public abstract int intValue();
  public abstract long longValue();
  public abstract float floatValue();
  public abstract double doubleValue();
  public byte byteValue();
  public short shortValue();
}

EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
Runnable[] r=new Runnable[10]; 
NOte:- we cannot create an Object for an interface..
But in this code we not are creating runnable object,
we are creating runnable type array objects.

 
Runnable[] r=new Runnable();--->invalid 

EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:- Direct implementation of interface array class see
-----
PROGRAME=15
=========
class Test 
{
 public static void main(String[] args)
  {
	 vinay[] r=new vinay[10];
     r[0]=new Exam();

     r[0].vinay();
	
  }
}

interface vinay
{
	public void vinay();
}

class Exam implements vinay
{
	public void vinay()
	{
		System.out.println("vinay implemented");
	}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
vinay implemented

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:- Indirect array implementation of class in an interface.
-----
PROGRAME=16
=========
case:-1
-------
class Test 
{
 public static void main(String[] args)
  {
	 It[] r=new It[10];
     r[0]=new Child();
     r[1]=new Gchild(); //-->Indirect implementation of class..
	
  }
}

interface It
{
	public void m1();
}

class Child implements It
{
	public void m1()
	{
		System.out.println("It --> in Child");
	}
}

class Gchild extends Child
{
    void m2 ()
    {
    	System.out.println("It --> in GChild");   
    }	
} 

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>Java Test

C:\Users\dell1\Desktop>

EXPLANATION:-
============
class Gchild extends Child ---> Gchild indirectly implements interface class Child.

 interface(It)---->extends--->Child
                              --------> Gchild extends Child..
							   So indirectly Gchild is having parent child relationship with interface It.

 case 2:-
 --------
 It[] r=new It[10];
     r[0]=new Child();
     r[1]=new Gchild(); 

  r[0], and r[1] reference we can call only interface implemented method.
  we cannot call other methods.
 ===========================================================   
Note:-Trying to call interface implemented methdos.(valid)

   class Test 
{
 public static void main(String[] args)
  {
	 It[] r=new It[10];
     r[0]=new Child();
     r[0].m1();

     r[1]=new Gchild(); 
     r[1].m1();
  }
}

interface It
{
	public void m1();
}

class Child implements It
{
	public void m1()
	{
		System.out.println("It --> in Child");
	}
}

class Gchild extends Child
{
     public void m1()
    {
    	System.out.println("It --> in GChild");   
    }	
} 


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>Java Test
It --> in Child
It --> in GChild
===========================================================
case 3:-Trying to call other methdos.(Invalid)

class Test 
{
 public static void main(String[] args)
  {
	 It[] r=new It[10];
     r[0]=new Child();
     r[0].m2();
     
     r[1]=new Gchild(); 
     r[1].m2();
	 
	
  }
}

interface It
{
	public void m1();
}

class Child implements It
{
	public void m1()
	{
		System.out.println("It --> in Child");
	}

	public void m2()
	{
		System.out.println("normal Child method");
	}
}

class Gchild extends Child
{
     public void m1()
    {
    	System.out.println("It --> in GChild");   
    }	
     public void m2()
     {
     	System.out.println("normal Gchild method");   
     }	
} 


C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: cannot find symbol
     r[0].m2();
         ^
  symbol:   method m2()
  location: interface It
Test.java:10: error: cannot find symbol
     r[1].m2();
         ^
  symbol:   method m2()
  location: interface It
2 errors

C:\Users\dell1\Desktop>
========================================================
      VVV importnat observation:-See case 3 error u will get to know..
      	 
	 It[] r=new It[10];
 
	 r[0]=new Child();   
     r[0].m1();

     r[1]=new Gchild(); 
     r[1].m1();
	               ====> Equivalent code is 
				                              It x=new Child();
	                                          x.m1();
	 	                                      
											  It x1=new Gchild();
	 	                                      x.m1();
  	                                        }
 Programme:-
 class Test 
{
 public static void main(String[] args)
  {
  /* It[] r=new It[10];
     r[0]=new Child();
     r[0].m1();

     r[1]=new Gchild(); 
     r[1].m1();*/
	 
	 It x=new Child();
	 x.m1();
	 
	 It x1=new Gchild();
	 x1.m1();
  }
}

interface It
{
	public void m1();
}

class Child implements It
{
	public void m1()
	{
		System.out.println("It --> in Child");
	}
}

class Gchild extends Child
{
     public void m1()
    {
    	System.out.println("It --> in GChild");   
    }	
} 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
It --> in Child
It --> in GChild

C:\Users\dell1\Desktop>

				                   
========================================================



***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:- Just general see implementing class having main method and an interface having a method 
----- same as interface name..

PROGRAME=17
=========
  
 class Test extends Exam
{
 public static void main(String[] args)
  {
	 vinay[] r=new vinay[10];
     r[0]=new Exam();
     r[0].vinay();
     
     r[1]=new Test();
     r[1].m2();
  }
   public void m2()
     {
    	 System.out.println("TEST class");
     }
}

interface vinay
{
	public void vinay();
	public void m2();
}

class Exam implements vinay
{
	public void vinay()
	{
		System.out.println("vinay implemented");
	}
	public void m2()
	{
		System.out.println("m2 implemented");
	}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
vinay implemented
TEST class

C:\Users\dell1\Desktop>


EXPLANATION:-
============
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
  class Test extends Exam
{
 public static void main(String[] args)
  {
	 vinay[] r=new vinay[10];
     r[0]=new Exam();
     r[0].vinay();
     System.out.println("================");
     
	 r[1]=new Test();
     r[1].m2();
     r[1].vinay(); // see overriding rules applies same as parent reference child objects
     System.out.println("================");
	 
	 vinay x=new Test();
	 x.m2();
	 x.vinay();

  }
   public void m2()
     {
    	 System.out.println("TEST class");
     }
}

interface vinay
{
	public void vinay();
	public void m2();
}

class Exam implements vinay
{
	public void vinay()
	{
		System.out.println("vinay implemented in exam");
	}
	public void m2()
	{
		System.out.println("m2 implemented");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
vinay implemented in exam
================
TEST class
vinay implemented in exam
================
TEST class
vinay implemented in exam

C:\Users\dell1\Desktop>

EXPLANATION:-
============
vinay[] r=new vinay[10];
     r[0]=new Exam();
     r[0].vinay();
     System.out.println("================");
     
	 r[1]=new Test();
     r[1].m2();
     r[1].vinay(); // see overriding rules applies same as parent reference child objects
     System.out.println("================");
 
              	 ===============>Equivalent code is   

	                              vinay x=new Test();
                                  x.m2();
                                  x.vinay();

***************************-----END of--->18<--------***************************
Example=19
=========
 Paste in method concept

NOTE:-  We are trying to acess x from animal class which is not presrnt there using Animal refernce 
-----   i,e(Animal a =new Animal();)
PROGRAME=19
=========
class Test
{
public static void main(String[] args) 
    {
	  Dog d=new Dog();
	  Animal a =new Animal();
 	  d.m1(a);
 	  }
}

     class Dog
   {
     int x=10;
     void m1(Animal  a)
     {
	   a.x=5;
	   System.out.println(x);
       }
    }
     
    class Animal{}

C:\Users\dell1\Desktop>javac Test.java
Test.java:16: error: cannot find symbol
           a.x=5;
            ^
  symbol:   variable x
  location: variable a of type Animal
1 error

EXPLANATION:-
============
***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
PROGRAME=20
=========
class Test
{
public static void main(String[] args) 
    {
       	System.out.println("Apprpach 1");
	     Dog d=new Dog();
 	     d.m1(d);
 	  System.out.println("===============");
 	     System.out.println("Apprpach 2");
 	     Dog d2=new Dog();
 	     Dog d1=new Dog();
 	     d2.m1(d1);
 	    
 	  
 	  }
}

     class Dog
   {
     int x=10;
     void m1(Dog  d)
     {
	   d.x=5;
	   System.out.println(x);
       }
    }
     
    class Animal{}

	
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Apprpach 1
5
===============
Apprpach 2
10

C:\Users\dell1\Desktop>


EXPLANATION:-
============
 very very important case approach 1 and 2

System.out.println("Apprpach 1");	     
Dog d=new Dog();
d.m1(d);
    ------>same object reference,passing same object reference as parameter it will change
           and performs the internal operation.(if required by using that reference)	
	  
	  System.out.println("===============");
System.out.println("Apprpach 2");
Dog d2=new Dog();
Dog d1=new Dog();
d2.m1(d1);
   ------->Different object reference,passing different object reference as parameter it will not change
           and wont  performs the internal operation.(if required by using that reference)	 	    
***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
PROGRAME=21
=========
class Test
{
public static void main(String[] args) 
    {
       	System.out.println("Apprpach 1");
	     Dog d=new Dog();
	     Animal a=new Animal();
 	     d.m1(a);
     }
}

     class Dog
   {
     int x=10;
     void m1(Animal  d)
     {
	   d.x=5;
	   System.out.println(x);
       }
    }
     
    class Animal
    {
        int x=20;
    }

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Apprpach 1
10

EXPLANATION:-
============
          Dog d=new Dog();
	     Animal a=new Animal();
 	     d.m1(a);
        Using differnt Objects as reference and parameter it wont perform the internal operation


Generally may be while carrying two object it will get destroyed.
***************************-----END of--->21<--------***************************
Example=22
=========
NOTE:-
-----
PROGRAME=22
=========
class Test
{
public static void main(String[] args) 
    {
       	System.out.println("Apprpach 1");
	     Dog d=new Dog();
 	     d.m1(new Dog());
     }
}

     class Dog
   {
     int x=10;
     void m1(Dog  d)
     {
	   d.x=5;
	   System.out.println(x);
       }
    }
     
    class Animal
    {
    }

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Apprpach 1
10

C:\Users\dell1\Desktop>


EXPLANATION:-
============
         Dog d=new Dog();
  	     d.m1(new Dog());
 We have used 2 different Object reference one --->d 
                               (Anothetr nameless)--->new Dog(); 
***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:-
-----
PROGRAME=23
=========
 class Test
{
public static void main(String[] args) 
    {
       	System.out.println("Apprpach 1");
       	Dog d =new Dog();
       	d.m1(new Dog());
    }
}

     class Dog
   {
     int x=10;
     void m1(Dog  d)
     {
	   d.x=5;
	   System.out.println(x);
       }
    }
     
    class Animal
    {}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Apprpach 1
10

C:\Users\dell1\Desktop>
   
EXPLANATION:-
============

***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-
-----
PROGRAME=24
=========
class Test
{
public static void main(String[] args) 
    {
       	System.out.println("Apprpach 1");
       	Dog d =new Dog();
       	d.m1(new Dog());
       	System.out.println("===============");

       	System.out.println("Apprpach 2");
        new Dog().m1(d); // anonymous objects die instantly...
        System.out.println("===============");
        
        System.out.println("Apprpach 3");
        new Dog().m1(new Dog()); 
 
     }
}

     class Dog
   {
     int x=10;
     void m1(Dog  d)
     {
	   d.x=5;
	   System.out.println(x);
       }
    }
     
    class Animal
    {}

    
    
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Apprpach 1
10
===============
Apprpach 2
10
===============
Apprpach 3
10

C:\Users\dell1\Desktop>

EXPLANATION:- All the above cases different 2 different object reference we cannot perform internal
============  using the object refernce passes in parameter.

***************************-----END of--->24<--------***************************
Example=25
=========
NOTE:- Typical Object reference from 25-32
-----
PROGRAME=25
=========
 class Test
{
public static void main(String[] args) 
    {
	  Object[][] x={{10,20},{30,40,50},{new Test()}};
      Object o =x;
      x[0][0]=50;
      System.out.println(x[0]);
      System.out.println(x[0][0]);
    }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
[Ljava.lang.Object;@2a139a55
50

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->25<--------***************************
Example=26
=========
NOTE:-
-----
PROGRAME=26
=========
 class  Test
{
	public static void main(String[] args) 
	 {
       int [] x=new int[3];
       Object o =x;
       System.out.println(x[0]);
     } 
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
0

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->26<--------***************************
Example=27
=========
NOTE:-
-----
PROGRAME=27
=========
class  Test
{
	public static void main(String[] args) 
	 {
       int [] x=new int[3];
       Object o =x;
       System.out.println(o[0]);
     } 
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: array required, but Object found
       System.out.println(o[0]);
                           ^
1 error

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->27<--------***************************
Example=28
=========
NOTE:-
-----
PROGRAME=28
=========
 class Test
{
public static void main(String[] args) 
    {
	  Object[][] x={{10,20},{30,40,50},{new Test()}};
      Object o =x;
      x[0][0]=50;
      System.out.println(x[0]);
      System.out.println(x[0][0]);
    }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
[Ljava.lang.Object;@2a139a55
50

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->28<--------***************************
Example=29
=========
NOTE:- 3-d array giving reference to Object.
-----
PROGRAME=29
=========
class Test
{
public static void main(String[] args) 
    {
	    Dog[][][] x=new Dog [3][2][];
        Object o=x;
        System.out.println(o);
     
    }
}
class Dog{}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
[[[LDog;@2a139a55

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->29<--------***************************
Example=30
=========
NOTE:- 3d- aray reference to 3d Object.
-----
PROGRAME=30
=========
class Test
{
public static void main(String[] args) 
    {
	    Dog[][][] x=new Dog [3][2][];
        Object[][][] o=x;
        System.out.println(o);
     
    }
}
class Dog{}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
[[[LDog;@2a139a55

C:\Users\dell1\Desktop>


EXPLANATION:-
============
***************************-----END of--->30<--------***************************
Example=31
=========
NOTE:-3d to 4d not possible.
-----
PROGRAME=31
=========
 class Test
{
public static void main(String[] args) 
    {
	    Dog[][][] x=new Dog [3][2][];
        Object[][][][]o=x;
        System.out.println(o);
     
    }
}
class Dog{}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: incompatible types: Dog[][][] cannot be converted to Object[][][][]
        Object[][][][]o=x;
                        ^
1 error

EXPLANATION:-
============
***************************-----END of--->31<--------***************************
Example=32
=========
NOTE:-
-----
PROGRAME=32
=========
 class Test
{
public static void main(String[] args) 
    {
	   System.out.println("Approach 1");
	   
	       Dog[][][] x=new Dog [3][2][];
         for (int i = 0; i < x.length; i++) 
         {
		       System.out.println(x[i]);	
		 }
         System.out.println("===================");
         
         for (int i = 0; i < x.length; i++) {
			  Dog[][] xx = x[i];
			          xx.m1();
		}
         
         
    }
}
class Dog
{
  void m1()
 {
System.out.println("m1 method");	
 }	
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:16: error: cannot find symbol
                                  xx.m1();
                                    ^
  symbol:   method m1()
  location: variable xx of type Dog[][]
1 error

EXPLANATION:-
============
***************************-----END of--->32<--------***************************
Example=33
=========
NOTE:-
-----
PROGRAME=33
=========
 class Test
{
public static void main(String[] args) 
    {
	     System.out.println("Approach 1");
	   
	       Dog[][][] x=new Dog [3][2][];
       
	       for (int i = 0; i < x.length; i++)
         {
		       System.out.println(x[i]);	
		 }
         
	       System.out.println("===================");
  	       
	       
	       System.out.println("Approach 2"); 
            
	       for (int i = 0; i < x.length; i++) 
	       {
			  Dog[][] xx = x[i];
			        System.out.println(xx);
       	   }
           System.out.println("===================");  
  	       
           System.out.println("Approach 3"); 
  	       for (Dog[][] xx : x)
  	       {
			System.out.println(xx);
		    }
           System.out.println("===================");      
           
           System.out.println("Approach 4"); 
          /* 
              x[0][0][1].m1(); //Exception
              x[0][0][2].m1(); //Exception
              x[0][0][3].m1(); //Exception*/
           System.out.println("===================");      
           System.out.println("Approach 5");
           for (Dog[][] xx : x) 
           {
			   for (Dog[] xxx : xx) 
			   {
                    for (Dog x4 : xxx)
                    {
						//x4.m1(); //---->Exception in this line
						
						
					}				
			   }
		   }
    }
}
class Dog
{
  void m1()
 {
System.out.println("m1 method");	
 }	
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Approach 1
[[LDog;@2a139a55
[[LDog;@15db9742
[[LDog;@6d06d69c
===================
Approach 2
[[LDog;@2a139a55
[[LDog;@15db9742
[[LDog;@6d06d69c
===================
Approach 3
[[LDog;@2a139a55
[[LDog;@15db9742
[[LDog;@6d06d69c
===================
Approach 4
===================
Approach 5
Exception in thread "main" java.lang.NullPointerException
        at Test.main(Test.java:44)

EXPLANATION:-
============
***************************-----END of--->33<--------***************************
Example=34
=========
NOTE:-Same Example of 33 but intializing the value.
-----  Example of 33--->Dog[][][] x=new Dog [3][2][];
       Example 34---->Dog[][][] x=new Dog [3][2][1];

PROGRAME=34
=========
 class Test
{
public static void main(String[] args) 
    {
	     System.out.println("Approach 1");
	   
	       Dog[][][] x=new Dog [3][2][1];
       
	       for (int i = 0; i < x.length; i++)
         {
		       System.out.println(x[i]);	
		 }
         
	       System.out.println("===================");
  	       
	       
	       System.out.println("Approach 2"); 
            
	       for (int i = 0; i < x.length; i++) 
	       {
			  Dog[][] xx = x[i];
			        System.out.println(xx);
       	   }
           System.out.println("===================");  
  	       
           System.out.println("Approach 3"); 
  	       for (Dog[][] xx : x)
  	       {
			System.out.println(xx);
		    }
           System.out.println("===================");      
           
           System.out.println("Approach 4"); 
          /* 
              x[0][0][1].m1(); //Exception
              x[0][0][2].m1(); //Exception
              x[0][0][3].m1(); //Exception*/
           System.out.println("===================");      
           System.out.println("Approach 5");
           for (Dog[][] xx : x) 
           {
			   for (Dog[] xxx : xx) 
			   {
                   x[0][0][0]=new Dog();
                   x[0][0][0].m1();
			   }
		   }
    }
}
class Dog
{
  void m1()
 {
System.out.println("m1 method");	
 }	
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Approach 1
[[LDog;@2a139a55
[[LDog;@15db9742
[[LDog;@6d06d69c
===================
Approach 2
[[LDog;@2a139a55
[[LDog;@15db9742
[[LDog;@6d06d69c
===================
Approach 3
[[LDog;@2a139a55
[[LDog;@15db9742
[[LDog;@6d06d69c
===================
Approach 4
===================
Approach 5
m1 method
m1 method
m1 method
m1 method
m1 method
m1 method

EXPLANATION:-
============
***************************-----END of--->34<--------***************************
Example=35
=========
NOTE:-
-----
PROGRAME=35
=========
 class Test
{
public static void main(String[] args) 
    {
	     System.out.println("Approach 1");
	   
	       Dog[][][] x=new Dog [3][2][];
	        for (Dog[][] dogs : x) //--->compulsary we should iterate over 2D 
	        {                      //to get last element of array 
	 	       
			    
		    }
       

    }
}
class Dog
{
  void m1()
 {
System.out.println("m1 method");	
 }	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Approach 1

C:\Users\dell1\Desktop>



EXPLANATION:-
============
***************************-----END of--->35<--------***************************
Example=36
=========
NOTE:-Have to iterate over level on level to get into next level.
-----i guess we cannot jump directly into last element.
PROGRAME=36
=========
 class Test
{
public static void main(String[] args) 
    {
	  int [] x1={10,20};
      Object o =x1;
      x1[0]=50;
      System.out.println(x1[0]);
	
	Dog[][] x=new Dog[1][2];
	
	
   Object o1=x;
    for (Dog[] dogs : x) //-->have to iterate over level on level can t jump to last level.
      {
           System.out.println(dogs);
           for (Dog dogs2 : dogs) {
				
			}
	   }
      for (int i = 0; i < x.length; i++) //-->have to iterate over level on level can t jump to last l
      {
		Dog[] dogs = x[i];
      }
   
 }
}
  class Dog{}
  C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
50
[LDog;@2a139a55

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->36<--------***************************
Example=37
=========
NOTE:- Changing the value inside the scope also channges the orignal value also.
-----
Next example just a simple case
==============================
  class Test
{
public static void main(String[] args) 
    {
	int x=10;
	if (true)
	{
		x=20;
		
	    	if (true)
		   {
		     x=100;	
		   }
	}
	System.out.println(x);
    }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
100

C:\Users\dell1\Desktop>


PROGRAME=37
=========
 class Test
{
public static void main(String[] args)
{
System.out.println(sum(new int[]{10,20,30,40}));
}
      public static int sum(int[] x)
   {
       int total=0;
       for(int x1:x)
     {
	  total=total+x1;
     }
      return total;
   }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
100

C:\Users\dell1\Desktop>





EXPLANATION:-
============
Even though we want we cannot use that array in future.
just for one time use,after that we cannot use it,it wont be avaliable..

General Note:-
new int[]{10,20,30,40}---> while specifing annonymous array we cannot write the size
new int[]{10,20,30,40}--->valid

new int[][]{{10,20},{30,40}}--->We can create multidimensional annonymous arrays also.

 int x= new int[][]{{10,20},{30,40}} ---->valid
 Based on ur requirements we can give the name for annonymous array.
 
new int[3]{10,20,30,40}---> Invalid..already specified the size again specifying no need CE.
***************************-----END of--->37<--------***************************
Example=38
=========
NOTE:-
-----
PROGRAME=38
=========
In the case of primitive array as array element any type is allowed which can be
promoted to declared type.
Example 1:
For the int type arrays the allowed array element types are byte, short, char, int.
int[] a=new int[10];
a[0]=97;//(valid)
a[1]='a';//(valid)
byte b=10;
a[2]=b;//(valid)
short s=20;
a[3]=s;//(valid)
a[4]=10l;//C.E:possible loss of precision

EXPLANATION:-
============
case 1:- page 28
----------------
In case of primitive types arrays,as array elements we can provide any types which can be implicitly 
promoted to declared type.
***************************-----END of--->38<--------***************************
Example=39
=========
NOTE:-
-----
Example 14-18
            (interface type arrays assignment.) 
PROGRAME=39
=========
EXPLANATION:-
============

case 3:-
--------
For interface type arrays as array element its implementation type class objects are allowed.. 
  
  class Test
{
public static void main(String[] args) 
    {
	Runnable[] r=new Runnable[10];
	r[0]=new Thread();
	r[1]=new String("bhaskar");
    }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: incompatible types: String cannot be converted to Runnable
        r[1]=new String("bhaskar");
             ^
1 error

***************************-----END of--->39<--------***************************
Example=40
=========
NOTE:-
-----
PROGRAME=40
=========
4) Abstract class type arrays. --->4) Its child class objects are allowed.
Example Number class 
 See the diagram of that its child classes are allowed.

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
