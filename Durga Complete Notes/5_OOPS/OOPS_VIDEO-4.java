TOPIC:-OOPS
--------
VIDEO NO=4
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-
**************************************************************************************
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-Last video programe.
-----
PROGRAME=1
=========

 class Parent
{
	public void m1()
	{
	System.out.println("No -arg parameter");
	}
}

class Child extends Parent
{
	public void m1(int x)
	{
	System.out.println("int-arg parameter");
	}

	public void m1(double x)
	{
	System.out.println("double-arg parameter");
	}

public static void main(String[] args)
		{
	       Parent p =new Child();
	       p.m1();
	    }

}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Child
No -arg parameter

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-When there is no relationship between parent and child..see it s ambigious
-----
PROGRAME=2
=========
class Test
{
	public void m1( Parent p)
	{
	System.out.println("int-arg parameter");
	}

	public void m1(Child c)
	{
	System.out.println("double-arg parameter");
	}

public static void main(String[] args)
		{
             new Test().m1(null);
	    }
}

class Parent
{
}
class Child
{
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:15: error: reference to m1 is ambiguous
             new Test().m1(null);
                       ^
  both method m1(Parent) in Test and method m1(Child) in Test match
1 error

 
EXPLANATION:-
============
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
See more preference is going for Child class only..


PROGRAME=3
=========
 class Test
{
	public void m1( Parent p)
	{
	System.out.println("Parent-arg parameter");
	}

	public void m1(Child c)
	{
	System.out.println("child-arg parameter");
	}

public static void main(String[] args)
		{
             new Test().m1(null);
	    }
}

class Parent
{
}
class Child extends Parent
{
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
child-arg parameter
EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
 Mixing of programmer/userdefined primitive and Predifeined primitive then also its 
 ambigious..

PROGRAME=4
=========
 class Test
{
	public void m1( Parent p)
	{
	System.out.println("Parent-arg parameter");
	}
     
	 public void m1( String s)
	{
	System.out.println("String-arg parameter");
	}

public static void main(String[] args)
		{
             new Test().m1(null);
	    }
}

class Parent
{
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:18: error: reference to m1 is ambiguous
             new Test().m1(null);
                       ^
  both method m1(Parent) in Test and method m1(String) in Test match
1 error

EXPLANATION:-
============
Object-->Parent
|
|
String & StringBuffer both are child for Object..

so compiler will not know to whom we should give chance..
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
 We can call reference type methods will null values also..

PROGRAME=5
=========
 class Test
{
	public void m1( Parent p)
	{
	System.out.println("Parent-arg parameter");
	}

public static void main(String[] args)
		{
             new Test().m1(null);
	    }
}

class Parent
{
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Parent-arg parameter

EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
 See we cannot  use null for primitive type while calling 

PROGRAME=7
=========
 class Test
{
	public void m1( int  x)
	{
	System.out.println("Parent-arg parameter");
	}

public static void main(String[] args)
		{
             new Test().m1(null);
	    }
}
C:\Users\dell1\Desktop>javac Test.java
Test.java:10: error: incompatible types: <null> cannot be converted to int
             new Test().m1(null);
                           ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error


EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
 class Test
{
	public void m1(Parent p,Child c)
	{
		System.out.println("int float argument");
	}
	public void m1(Child  p,Parent x)
	{
		System.out.println("float -int  argument");
	}
	
public static void main(String[] args) 
    {
         Test t=new Test();
         t.m1(new Child(),new Child());
    }
}

class Parent{}
class Child extends Parent{}

C:\Users\dell1\Desktop>javac Test.java
Test.java:15: error: reference to m1 is ambiguous
         t.m1(new Child(),new Child());
          ^
  both method m1(Parent,Child) in Test and method m1(Child,Parent) in Test match
1 error

EXPLANATION:-
============
 
 	public void m1(Parent p,Child c)           	public void m1(Child  p,Parent x)
            
			A -->Party                                  B-->Party

                           t.m1(new Child(),new Child());

						   Both party will get the chance so its compiler is confused..




***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----

PROGRAME=9
=========
 class Test
{
	public void m1(int i,float f)
	{
		System.out.println("int float argument");
	}
	public void m1(float f,int i)
	{
		System.out.println("float -int  argument");
	}
	
public static void main(String[] args) 
    {
         Test t=new Test();
         t.m1(10,10.5f);  //exact match getting the chance-->int float argument.
		 t.m1(10.5f,10);  //exact match getting the chance-->float int argument.
    }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
int float argument
float -int  argument
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
	public void m1(int i,float f)
	{
		System.out.println("int float argument");
	}
	public void m1(float f,int i)
	{
		System.out.println("float -int  argument");
	}
	
public static void main(String[] args) 
    {
         Test t=new Test();
         t.m1(10,10); 
    }
}
 
 C:\Users\dell1\Desktop>javac Test.java
Test.java:15: error: reference to m1 is ambiguous
         t.m1(10,10);
          ^
  both method m1(int,float) in Test and method m1(float,int) in Test match
1 error
EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----

PROGRAME=11
=========
 class Test
{
	public void m1(int i,float f)
	{
		System.out.println("int float argument");
	}
	public void m1(float f,int i)
	{
		System.out.println("float -int  argument");
	}
	
public static void main(String[] args) 
    {
         Test t=new Test();
         t.m1(10.5f,10.9f); 
    }
}
 
 
C:\Users\dell1\Desktop>javac Test.java
Test.java:15: error: no suitable method found for m1(float,float)
         t.m1(10.5f,10.9f);
          ^
    method Test.m1(int,float) is not applicable
      (argument mismatch; possible lossy conversion from float to int)
    method Test.m1(float,int) is not applicable
      (argument mismatch; possible lossy conversion from float to int)
1 error


EXPLANATION:-
============
When we ll get ambuigty problem 
when we ll get this problem see carefully..
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
  class Test
{
	public void m1(Parent p,Child c)
	{
		System.out.println("int float argument");
	}
	public void m1(Child  p,Parent x)
	{
		System.out.println("float -int  argument");
	}
	
public static void main(String[] args) 
    {
         Test t=new Test();
         t.m1(null,null);
    }
}

class Parent{}
class Child extends Parent{}

C:\Users\dell1\Desktop>javac Test.java
Test.java:15: error: reference to m1 is ambiguous
         t.m1(null,null);
          ^
  both method m1(Parent,Child) in Test and method m1(Child,Parent) in Test match
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
  class Test
{
	public void m1(Parent p,Child c)
	{
		System.out.println("m1 method");
	}
	
public static void main(String[] args) 
    {
         Test t=new Test();
         t.m1(null,null);
    }
}

class Parent{}
class Child {}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
m1 method
EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
 class Test
{
	public void m1(Parent p,Child c)
	{
		System.out.println("Parent p,Child c");
	}
	
		public void m1(Child C,Parent P)
	{
		System.out.println("Child C,Parent P");
	}
	
public static void main(String[] args) 
    {
         Test t=new Test();
         t.m1(new Child(),new Parent());
    }
}

class Parent{}
class Child {}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Child C,Parent P

EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
 See exact method is going to get the chance..
 If it did nt get the chance then it will promote..

 Exact method is getting the chance then  wat s the need of going to the next level.

PROGRAME=15
=========
  class Test
{
	public void m1(Parent p)
	{
		System.out.println("Parent p");
	}
	
		public void m1(Child C)
	{
		System.out.println("Child C");
	}
	
public static void main(String[] args) 
    {
         Test t=new Test();
         t.m1(new Child());
    }
}

class Parent{}
class Child extends Parent {}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Child C
      
EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
 In general var-arg method will get least priority,
 If no other methods match then var-arg method will get chance.
 If other method get chance then var-arg method will not get the chance..

 It s exactly same as default case inside switch.

PROGRAME=16
=========
  class Test
{
	public void m1(int x)
	{
		System.out.println("general method");
	}
	
		public void m1(int ...x)
	{
		System.out.println("var-arg method");
	}
	
public static void main(String[] args) 
    {
         Test t=new Test();
         t.m1();
		 t.m1(10,20);
     }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
var-arg method
var-arg method

EXPLANATION:-
============
 t.m1();
t.m1(10,20);

         -->no other method match so var-arg method getting the chance..
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
 General method getting the exact match so general method will be executed.

PROGRAME=17
=========
  class Test
{
	public void m1(int x)
	{
		System.out.println("general method");
	}
	
		public void m1(int ...x)
	{
		System.out.println("var-arg method");
	}
	
public static void main(String[] args) 
    {
         Test t=new Test();
         t.m1(10);
    }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
general method

EXPLANATION:-
============

t.m1(10);
       // --->Exact match.

***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
 VVVVVVV important case....

 Do some reserach..
PROGRAME=18
=========
 class Animal
{
}

class Monkey extends Animal
{
}

class Test
{
	
         	public void m1(Monkey m)
		{
         	System.out.println("monkey method");
	    }

            public void m1(Animal A)
		{
	System.out.println("Animal  method");
	    }

        public static void main(String[] args)
 	     { 
	        Test t=new Test();
	        Animal a =new Animal();
			t.m1(a);

			Monkey m=new Monkey();
			t.m1(m);

            Animal a1=new Monkey();
            t.m1(a1);
	     }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Animal  method
monkey method
Animal  method


EXPLANATION:-
============
 Durga told in method overloading,method resolution always takes care by compiler based on 
 reference type.
 In overloading runtime object won t play any role..

 But i guess it s nothing to do with this point.
---------------------------------------------------------------
No i guess wat durga told is correct coz see

  Animal a1=new Monkey();
            t.m1(a1);

coz its overloading and method resolution is taken care by compiler based on reference type.

--------------------------------------------------------------------------------------------------------
 see here:-

  public void m1(Animal A)
		{
	System.out.println("Animal  method");
	    }

             Test t=new Test()
			Animal a1=new Monkey();
            t.m1(a1);

			m1 is expecting animal reference so we just passing it aste..
			Animal a1=new Monkey();
            
			 Animal reference -->a1
			 monkey Object..

			 so m1 () is expecting animal reference so its getting the chance


***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
PROGRAME=19
=========
 class Parent
{

}
class Child extends Parent
{
	
}

class A
{
	
public void m1(Parent p)
	{
	   System.out.println("Parent method");
	}

	public void m1(Child c)
	{
	   System.out.println("Child method");
	}

}
class B extends A
{

}


class Test
{
	public static void main(String [] args)
	{
	    Parent p=new Child();
		A a =new B();
		a.m1(p);
       

	    Child c =new Child();
		a.m1(c);
	
    }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Parent method
Child method

EXPLANATION:-
============
***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
PROGRAME=20
=========
 class Parent
{

}
class Child extends Parent
{
	
}

class A
{
	
public void m1(Parent p,Child c)
	{
	   System.out.println("Parent method");
	}

	public void m1(Child c,Parent p)
	{
	   System.out.println("Child method");
	}

}
class B extends A
{

}


class Test
{
	public static void main(String [] args)
	{
	    Parent p=new Child();
		Child c =new Child();
		A a =new B();
		
        a.m1(p,c);
		a.m1(c,p);
    }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Parent method
Child method
EXPLANATION:-
============
***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
 Important observation see how s it working..

PROGRAME=21
=========
 class Parent
{

}
class Child extends Parent
{
	
}

class A
{
	
public void m1(Parent p,Child c)
	{
	   System.out.println("Parent method");
	}

	public void m1(Child c,Parent p)
	{
	   System.out.println("Child method");
	}

}
class B extends A
{

}


class Test
{
	public static void main(String [] args)
	{
	    Parent p=new Child();
		Child c =new Child();
		A a =new B();
		
        a.m1(c,c);
		
    }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:38: error: reference to m1 is ambiguous
        a.m1(c,c);
         ^
  both method m1(Parent,Child) in A and method m1(Child,Parent) in A match
1 error

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
	public void m1(String s)
	{
		System.out.println("String version");
	}
		public void m1(StringBuffer s)
	{
		System.out.println("StringBuffer version");
	}
	public static void main(String[] args)
	{
	   Test t=new Test();
	   t.m1("vinay");
	   t.m1(new String("James")); //Its String only not StringBuffer..
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
String version
String version


EXPLANATION:-
============
 Both are String only.
***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:-
-----
PROGRAME=23
=========
 class Test
{
	public void m1(String s)
	{
		System.out.println("String version");
	}
		public void m1(StringBuffer s)
	{
		System.out.println("StringBuffer version");
	}
	public static void main(String[] args)
	{
	   Test t=new Test();
	   t.m1("vinay");
	   t.m1(new StringBuffer("James")); 
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
String version
StringBuffer version

EXPLANATION:-
============

t.m1("vinay");  //--->String will get the exact chance
t.m1(new StringBuffer("James")); //--->StringBuffer will get the exact chance..
***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-
-----
PROGRAME=24
=========
 class Test
{
	public void m1(String s)
	{
		System.out.println("String version");
	}
		public void m1(StringBuffer s)
	{
		System.out.println("StringBuffer version");
	}
	public static void main(String[] args)
	{
	   Test t=new Test();
	   t.m1(null);
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:14: error: reference to m1 is ambiguous
           t.m1(null);
            ^
  both method m1(String) in Test and method m1(StringBuffer) in Test match
1 error

EXPLANATION:-
============
    t.m1(null);//--->It s a valid method call to both String and StringBuffer so compiler 
                  //	is getting confused..
***************************-----END of--->24<--------***************************
Example=25
=========
NOTE:-
-----
Compare 21 and 22 with this Example..
PROGRAME=25
=========
  class Parent
{

}
class Child extends Parent
{
	
}

class A
{
	

}
class B extends A
{
	public void m1(Parent p)
	{
	   System.out.println("Parent method");
	}

	public void m1(Child c)
	{
	   System.out.println("Child method");
	}

}


class Test
{
	public static void main(String [] args)
	{
	    Parent p=new Child();
		A a =new B();
		a.m1(p);
       

	    Child c =new Child();
		a.m1(c);
	
    }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:36: error: cannot find symbol
                a.m1(p);
                 ^
  symbol:   method m1(Parent)
  location: variable a of type A
Test.java:40: error: cannot find symbol
                a.m1(c);
                 ^
  symbol:   method m1(Child)
  location: variable a of type A
2 errors
EXPLANATION:-
============
***************************-----END of--->25<--------***************************
Example=26
=========
NOTE:-
-----
PROGRAME=26
=========
 class Foo
{
     public void m1(int x, long l)
   {
	System.out.println(" m1 method Foo");
   }
     
     public void m1(Parent p)
  {
	System.out.println("Parent");
  }
    
    public void m1(Child p)
    {
    	System.out.println("Child");
    }
}

class Bar extends Foo
{
	public void m1(int x,byte b)
	   {
		System.out.println(" m1 method Bar");
	   }
}

class Test
{
  public static void main(String[] args) 
   {    
	    
		Foo f=new Bar();
	  
		Parent p=new Child();
		f.m1(p);
	    
	    Child c=new Child();
	    f.m1(c);
	    
	    
   }	

}

class Parent{}
class Child extends Parent{}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Parent
Child
EXPLANATION:-
============
***************************-----END of--->26<--------***************************
Example=27
=========
NOTE:-
-----
 overriding i guess..

PROGRAME=27
=========
 class Foo
{
     public void m1(int x, long l)
   {
	System.out.println(" m1 method Foo");
   }
     
     public void m1(Parent p)
  {
	System.out.println("Parent");
  }
    
    public void m1(Child p)
    {
    	System.out.println("Child");
    }
}

class Bar extends Foo
{
	public void m1(int x,long b)
	   {
		System.out.println(" m1 method Bar");
	   }
}

class Test
{
  public static void main(String[] args) 
   {    Parent p=new Child();
	    Foo f=new Bar();
	    f.m1(10,10);
   }	

}

class Parent{}
class Child extends Parent{}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
 m1 method Bar

EXPLANATION:-
============
***************************-----END of--->27<--------***************************
Example=28
=========
NOTE:-
-----
PROGRAME=28
=========
 class Foo
{
     public void m1(int x, long l)
   {
	System.out.println(" m1 method Foo");
   }
     
     public void m1(Parent p)
  {
	System.out.println("Parent");
  }
    
    public void m1(Child p)
    {
    	System.out.println("Child");
    }
}

class Bar extends Foo
{
	public void m1(int x,long b)
	   {
		System.out.println(" m1 method Bar");
	   }
}

class Test
{
  public static void main(String[] args) 
   {    Parent p=new Child();
	    Foo f=new Bar();
	    f.m1(10,10);
   }	

}

class Parent{}
class Child extends Parent{}
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
