TOPIC:-ACESS MODIFIER
--------
VIDEO NO=7
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-22-25(***** protected modifier)
**************************************************************************************
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============
 strictfp: strict floating point.
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
System.out.println(10.0/3);

for-16 bit processor we may get 3.3333 around 5-6 decimal places
for-32 bit processor we may get 3.333333333333333333 around 9-10 decimal places
 
EXPLANATION:-
============
Usually the result of floating point of arithmetic is varing from platform to
platform if we want platform independent results for floating point arithmetic then we should go for 
strictfp modifier.

If a method declared as strictfp wat wil happen.
All floating point calculation in that method will follow IEEE754 standards.
irrespective of 16,32,64 bit processor,it will follow IEEE754 standards.so that we will get 
platform independent results.

abstract modifier never talks about implementation
where as strictfp modifier always talks about implementation hence abstract and strictfp modifier is illegal
for method.
***************************-----END of--->2<--------***************************
Example=3                         strictfp class
=========
NOTE:-Page 91(Hand written notes)
-----
Here abstract modifier will take care of abstract methods present in class
strictfp modifier will take care of calculation in methods which has implementation.

PROGRAME=3
=========
 strictfp abstract class Test
{
	 abstract public void m1();
	 abstract public void m2();
	 abstract public void m3();
	 abstract public void m4();

       void m5(){/*do calculation in IEEE754 standard*/}
       void m6(){/*do calculation in IEEE754 standard*/}
       void m7(){/*do calculation in IEEE754 standard*/}
       void m8(){/*do calculation in IEEE754 standard*/}

}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>

EXPLANATION:-
============
If a class declared as strictfp then every floating point calculation present in CONCERETE METHOD
has to follow has to IEEE 754 statndard so that we will get platform independent result.
 
 
 class can be declared as -->abstract,strictfp combination for classes

 abstract strictfp class Test //valid
 {
 }

C:\Users\dell1\Desktop>javac Test.java
----------------------
 abstract and strictfp is illegal combination @ method level.

abstract strictfp class Test 
 {
	 abstract strictfp void m1(){}
 }


C:\Users\dell1\Desktop>javac Test.java
Test.java:3: error: illegal combination of modifiers: abstract and strictfp
         abstract strictfp void m1(){}
                                ^
1 error
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
abstract & strictfp illegal @ Method level
abstract & strictfp   legal @ class  level

 abstract & final is illegal @ both class and method level.

***************************-----END of--->4<--------***************************
Example=5  
=========
NOTE:-
-----
 Memeber modifier----->method ,variable level modifier.

PROGRAME=5
=========
EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
 Private members:
If a member declared as the private then we can access that member only with in
the current class.
 That is from outside of a class we can t acess.

PROGRAME=6 
=========
EXPLANATION:-
============
 private and abstract illlegal combination for methods.

 abstract methods should be avaliable to child classes to provide implementation.
 where as private methods are not avaliable to child classes,hence private abstract combination is illegal 
 for methods.

***************************-----END of--->6<--------***************************
Example=7                    Some programes on Private
=========
NOTE:-
-----
PROGRAME=7
=========
 class Parent
{
	void m1()
		{ 
		System.out.println("Parent m1 method");
		}
	private void m2()
		{
		System.out.println("Parent m2 private method");
		}
}

class Child extends Parent
{
    public static void main(String[] args)
	{
	   new Child().m1();
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Child
Parent m1 method

EXPLANATION:-
============
 If a method declared as private.
 that method  visibility is allowed within that class outside of class those methods cannot be acessed.
 child class also won t get Parent class private methods.


 If a class having  private methods we can apply inheritance for that class no problem.
 normal methods will be avaliable to inherited Child class,private methods won t be avaliable.

 we won t get CE for inheriting from a class having private methods (Wrong concept.)
 using final we can avoid inheritance.
 
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
 class Parent
{
	void m1()
		{ 
		System.out.println("Parent m1 method");
		}
	private void m2()
		{
		System.out.println("Parent m2 private method");
		}
}

class Child extends Parent
{
    public static void main(String[] args)
	{
	   new Child().m2();
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:17: error: cannot find symbol
           new Child().m2();
                      ^
  symbol:   method m2()
  location: class Child
1 error

EXPLANATION:-
============
 private methods acessing in another class, we ll get CE.
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
 class Parent
{
	void m1()
		{ 
		System.out.println("Parent m1 method");
		 m2();
		}
	private void m2()
		{
		System.out.println("Parent m2 private method");
		}
}

class Child extends Parent
{
    public static void main(String[] args)
	{
	   new Child().m1();
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Child
Parent m1 method
Parent m2 private method

C:\Users\dell1\Desktop>

EXPLANATION:-
============
 Acessing within the class is possible.
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
  abstract class Parent
{
	 abstract void m1();
   	private void m2()
		{
		System.out.println("Parent m2 private method");
		}
}

class Child extends Parent
{
	void m1()
		{ 
		System.out.println("Parent m1 method--in chils class");
		 
		}
    public static void main(String[] args)
	{
	   new Child().m1();
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Child
Parent m1 method--in chils class

EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
  abstract class Parent
{
	 abstract void m1();
   abstract	private void m2();
		
}

class Child extends Parent
{
	void m1()
		{ 
		System.out.println("Parent m1 method--in child class");
		 
		}

	private	void m2()
		{ 
		System.out.println("Parent m2 method--in child class");
		}
    public static void main(String[] args)
	{
	   new Child().m1();
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:4: error: illegal combination of modifiers: abstract and private
   abstract     private void m2();
                             ^
Test.java:8: error: Child is not abstract and does not override abstract method m2() in Par
class Child extends Parent
^
2 errors

EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
  abstract class Parent
{
	 abstract void m1();
   abstract	private void m2();
		
}

abstract class Child extends Parent
{
	
    public static void main(String[] args)
	{
	   
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:4: error: illegal combination of modifiers: abstract and private
   abstract     private void m2();
                             ^
1 error
EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
 abstract  class Parent
{
       void m1()
     {
	System.out.println("parent class m1 method");
     }
    static  private void m2(){}
      public static void main(String[] args)
      {
           System.out.println("vinay"); 
      }
}

class Test extends Parent
{
	
    public static void main(String[] args) 
    {
		new Test().m1();
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
parent class m1 method

EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14     
=========
NOTE:-
-----
PROGRAME=14
=========
 abstract  class Parent
{
	   void m1()
     {
	System.out.println("parent class m1 method");
     }
	  abstract  void m3();
      private abstract  void m2();
}

class Test extends Parent
{
        private void m2() //Belong to Test class not Parent class m2 see the  error.
     {
	System.out.println("Test class m2 method");
     }
	 void m3()
     {
	System.out.println("Test class m3 method");
     }
    public static void main(String[] args) 
    {
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:8: error: illegal combination of modifiers: abstract and private
      private abstract  void m2();
                             ^
Test.java:11: error: Test is not abstract and does not override abstract method m2() in Par
class Test extends Parent
^
2 errors

EXPLANATION:- 
============   
 
   coz private members are not avaliable outside class,even to child class.

 Test.java:11: error: Test is not abstract and does not override abstract method m2() in Par
class Test extends Parent
^
2 errors


***************************-----END of--->14<--------***************************
Example=15          protected-->applicable for variables and methods
=========               (The most misunderstood modifier in java)
NOTE:-
-----
 protected-->applicable for variables and methods
 
 1)protected members can be acessed any where within the current package.
 it may be child or any thing.
 But it should be within the package.

 2)outside package only in child classes,


  Protected=default+kids

PROGRAME=15
=========
EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
PROGRAME=16(within the same source file)
=========
 package pack1;
public class Test
{
	protected void m1()
	{
	 System.out.println("Protected method of Test class");
	}
}
class A extends Test
{
	public static void main(String[] args)
	{
	     Test t=new Test();
		 t.m1();


		 A a=new A();
		 a.m1();


		 Test t1=new Test();
		 t1.m1();


		  
	}
}

C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>java pack1.A
Protected method of Test class
Protected method of Test class
Protected method of Test class

EXPLANATION:-
============
 See how to acess a class in package having a mian method

C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>java pack1.A


conclusion :-2   Within the same package we can acess the protected members of a class,
--------------   with parent reference or child reference no problem.
  Test t=new Test();
		 t.m1();


		 A a=new A();
		 a.m1();


		 Test t1=new Test();
		 t1.m1();

***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-(within the same package)
----- NO need to import the class we can acess directly. 

PROGRAME=17
=========
 Programe:-1

package pack1;
public class Test
{
	protected void m1()
	{
	 System.out.println("Protected method of Test class");
	}
}

 Programe:-2     (within the same package no need to import the class which we using)
                  (package concept not protected concept,just observe.)
package pack1;
public class A extends Test
{
	public static void main(String[] args)
	{
	     Test t=new Test();
		 t.m1();
     }
}


C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>javac -d . A.java

C:\Users\dell1\Desktop>java pack1.A
Protected method of Test class

EXPLANATION:-
============
***************************-----END of--->17<--------***************************
Example=18 
=========
NOTE:-protected concept.
----- within the same package of another class.

PROGRAME=18
=========
Programe:-1
package pack1;
public class Test
{
	protected void m1()
	{
	 System.out.println("Protected method of Test class");
	}
}


Programe:-2
 package pack1;
public class A 
{
	public static void main(String[] args)
	{
	     Test t=new Test();
		 t.m1();
     }
}


C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>javac -d . A.java

C:\Users\dell1\Desktop>java pack1.A
Protected method of Test class
EXPLANATION:-
============
***************************-----END of--->18<--------***************************
Example=19
========= Within the different package acessing different class.
NOTE:-
-----
PROGRAME=19
=========
 Programe:-1

package pack1;
public class Test
{
	protected void m1()
	{
	 System.out.println("Protected method of Test class");
	}
}

 Programe:-2
 package pack2;
import pack1.Test;
public class A 
{
	public static void main(String[] args)
	{
	     Test t=new Test();
		 t.m1();
     }
}


C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>javac -d . A.java
A.java:8: error: m1() has protected access in Test
                 t.m1();
                  ^
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
  package pack1;
public class Test
{
	protected void m1()
	{
	 System.out.println("Protected method of Test class");
	}
}
class A extends Test
{
	public static void main(String[] args)
	{
	     Test t=new Test();
		 t.m1();


		 A a=new A();
		 a.m1();

		 Test t2=new A();
         t2.m1();   
	}
}


C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>java pack1.A
Protected method of Test class
Protected method of Test class
Protected method of Test class

EXPLANATION:-
============
 C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>java pack1.A    //-->acessing the main method see the 

 within the current package we can acess protected members eiether from parent reference or by using
 child reference.
***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
PROGRAME=21
=========
 Programe:-1

  package pack1;
public class Test
{
	protected void m1()
	{
	 System.out.println("Protected method of Test class");
	}
}

 Programe:-2
  
  package pack2;
import pack1.Test;
public class A extends Test
{
	public static void main(String[] args)
	{
         A a =new A();
		 a.m1();
	     
		 Test t=new Test();
		 t.m1();
		 
		 Test t1=new A();
		 t1.m1();
     }
}


C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>javac -d . A.java
A.java:11: error: m1() has protected access in Test
                 t.m1();
                  ^
A.java:14: error: m1() has protected access in Test
                 t1.m1();
                   ^
2 errors


EXPLANATION:-
============
 Test t=new Test();

Test t1=new A();

we can create object no problem but we can t acess protected members.

 A.java:11: error: m1() has protected access in Test
                 t.m1();
                  ^
A.java:14: error: m1() has protected access in Test
                 t1.m1();
***************************-----END of--->21<--------***************************
Example=22
=========
NOTE:-
-----
PROGRAME=22
=========
 Programe:-1

package pack1;
public class Test
{
	protected void m1()
	{
	 System.out.println("Protected method of Test class");
	}
}

Programe:-2

package pack2;
import pack1.Test;
public class A extends Test
{
	public static void main(String[] args)
	{
         System.out.println("hello world -A class");
		 A a =new A();
		 a.m1();
	     
		 /*Test t=new Test();
		 t.m1();
		 
		 Test t1=new A();
		 t1.m1();*/
     }
}



C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>javac -d . A.java

C:\Users\dell1\Desktop>java pack2.A
hello world -A class
Protected method of Test class

EXPLANATION:-
============
 outside package we can acess protected members only in child class that also compulsary  using 
 child reference only.

 If we are using any other reference we ll get CE.(Example:- 21)


 DP:-
 we can acesss protected members within the current package any where eiether by using parent reference
 or by using child reference.
 But we can acess protected members  outside package only in child classes and we should use
 child reference only.
 That is  parent reference cannot be used to acess protected members outside package.
***************************-----END of--->22<--------***************************
                         Most important see this
Example=23
=========
NOTE:-
-----
PROGRAME=23
=========
Programe:-1

package pack1;
public class Test
{
	protected void m1()
	{
	 System.out.println("Protected method of Test class");
	}
}

Programe:-2

package pack2;
import pack1.Test;
public class A extends Test
{
}
class B extends A
{
	public static void main(String[] args)
	{
         System.out.println("hello world -B class");
		
         Test t=new Test();
		 t.m1();

		 A a =new A();
		 a.m1();
	     
		 B b=new B();
		 b.m1();

		 Test t1=new A();
		 t1.m1();


		 A a2=new B();
		 a2.m1();

     }
}

C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>javac -d . A.java
A.java:13: error: m1() has protected access in Test
                 t.m1();
                  ^
A.java:16: error: m1() has protected access in Test
                 a.m1();
                  ^
A.java:22: error: m1() has protected access in Test
                 t1.m1();
                   ^
A.java:26: error: m1() has protected access in Test
                 a2.m1();
                   ^
4 errors

EXPLANATION:-
============
 Test t=new Test();
		 t.m1();
 A.java:13: error: m1() has protected access in Test
                 t.m1();
                  ^
 A a =new A();
		 a.m1();	     
A.java:16: error: m1() has protected access in Test
                 a.m1();
                  ^

 Test t1=new A();
		 t1.m1();
A.java:22: error: m1() has protected access in Test
                 t1.m1();
                   ^

A a2=new B();
a2.m1();
A.java:26: error: m1() has protected access in Test
                 a2.m1();
                   ^


 Not getting Error only in this case:-
 	 B b=new B();
		 b.m1();

 Note:-
 We can acess protected members outside package only in child classes that also(compulsary)
 using child reference of that particular child class..


 different child class or parent class reference we can t acess,
 we can create object no problem but we can t acess..

***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-
-----
PROGRAME=24
=========
 Programe:-1

package pack1;
public class Test
{
	protected void m1()
	{
	 System.out.println("Protected method of Test class");
	}
}

 Programe:-2

package pack2;
import pack1.Test;
public class A extends Test
{
}
class B extends A
{
	public static void main(String[] args)
	{
         System.out.println("hello world -B class");
		
         /*Test t=new Test();
		 t.m1();

		 A a =new A();
		 a.m1();
	     
		 Test t1=new A();
		 t1.m1();

		 A a2=new B();
		 a2.m1();*/

		 B b=new B();
		 b.m1();

     }
}
C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>javac -d . A.java

C:\Users\dell1\Desktop>java pack2.B
hello world -B class
Protected method of Test class

EXPLANATION:-
============
 DP:-
 We can acess protected members from outside package only in child classes,
 and we should use that child class reference only.

for Ex:-
from B class if we want to acess we should use B -class only.


VP:-
And we can acess from a child class which is having main method.(around the corner we havw to use the class 
having the main method only)
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
