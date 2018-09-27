TOPIC:-OOPS 
--------
VIDEO NO=5
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
Hand Written notes avaliable..
**************************************************************************************
IMPORTANT EXAMPLES:-
15
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
In overriding explain the concepts by using 
table...

Parent p=new Child();
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
last video Parograme..

PROGRAME=2
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
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
 Parent p =new Parent();
       ===>we can call only parent specific methods
	   Child class methods won t get any Chance..

PROGRAME=3
=========
 class Parent
{
	public void property()
	{
	   System.out.println("Gold +silver");
	}
	
	public void marry()
	{
	   System.out.println("Subbalakshmi");
	}
}

class Child extends Parent
{   
	public void marry()
	{
	   System.out.println("Aishwarya");
	}
}

class Test
{
	public static void main(String[] args)
	{ 
	   Parent p =new Parent();
       p.marry();
	   p.property();
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Subbalakshmi
Gold +silver

EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
 Child c =new Child();
    ==> We can call only Child specific methods.
	other class(i.e Parent) methods won t get a chance.

PROGRAME=4
=========
 class Parent
{
	public void property()
	{
	   System.out.println("Gold +silver");
	}
	
	public void marry()
	{
	   System.out.println("Subbalakshmi");
	}
}

class Child extends Parent
{   
	public void marry()
	{
	   System.out.println("Aishwarya");
	}
}

class Test
{
	public static void main(String[] args)
	{ 
	   Child c =new Child();
       c.marry();
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Aishwarya
EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-Important..
-----
See one methods is overriding method so overriding method will get the chance.
old data gone new data is avaliable so use new data...
see marry method implementation has been changed..


PROGRAME=5
=========
 class Parent
{
	public void property()
	{
	   System.out.println("Gold +silver");
	}
	
	public void marry()
	{
	   System.out.println("Subbalakshmi");
	}
}

class Child extends Parent
{   
	public void marry()
	{
	   System.out.println("Aishwarya");
	}
}

class Test
{
	public static void main(String[] args)
	{ 
	   Child c =new Child();
       c.marry();
	   c.property();
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Aishwarya
Gold +silver


EXPLANATION:-
============

  Child c =new Child();
       c.marry();
	   c.property();

 c.marry(); --->See marry method is overriden(old data) to 
                                          new data(over riding)
										   so overriding data is going to get the chance..

***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
 class Parent
{
	public void property()
	{
	   System.out.println("Gold +silver");
	}
	
	public void marry()
	{
	   System.out.println("Subbalakshmi");
	}
}

class Child extends Parent
{   
	public void marry()
	{
	   System.out.println("Aishwarya");
	}
}

class Test
{
	public static void main(String[] args)
	{ 
	   Parent p =new Child();
       p.marry();
	   p.property();
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

Aishwarya
Gold +silver
EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
 class Parent
{
	public void property()
	{
	   System.out.println("Gold +silver");
	}
	
	public void marry()
	{
	   System.out.println("Subbalakshmi");
	}
}

class Child extends Parent
{   
	public void marry()
	{
	   System.out.println("Aishwarya");
	}

	public void property()
	{
	   System.out.println("Share market");
	}
}

class Test
{
	public static void main(String[] args)
	{ 
	   Parent p =new Child();
       p.marry();
	   p.property();
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Aishwarya
Share market

EXPLANATION:-
============

***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----

PROGRAME=9
=========
 class Parent
{
	public void marry()
	{
	   System.out.println("Subbalakshmi");
	}
}

class Child extends Parent
{   
	public void marry()
	{
	   System.out.println("Aishwarya");
	}

	public void property()
	{
	   System.out.println("Share market");
	}
}

class Test
{
	public static void main(String[] args)
	{ 
	   Parent p =new Child();
       p.marry();
	   p.property();
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:28: error: cannot find symbol
           p.property();
            ^
  symbol:   method property()
  location: variable p of type Parent
1 error


EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
 class Parent
{
	public void property()
	{
	   System.out.println("Gold +silver");
	}
	
	public void marry()
	{
	   System.out.println("Subbalakshmi");
	}
}

class Child extends Parent
{   
	
}

class Test
{
	public static void main(String[] args)
	{ 
	   Parent p =new Child();
       p.marry();
	   p.property();
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Subbalakshmi
Gold +silver

EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
use Table to explain all the cases from 10-1 for teaching purpose.

PROGRAME=11
=========

EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
In overloading method resolution always takes care by compiler based on reference types.
Run time object never gonna play any role.

overloading also known as compile time polymorphism,early binding,static polymorphism
PROGRAME=12
=========

EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
 Co-variant return type allowed from 1.8 versions onwards.

PROGRAME=13
=========


class Parent
{
	public Object property()
	{
	   System.out.println("Gold +silver");
	   return null;
	}
}

class Child extends Parent
{   
	public String property()
	{
	   System.out.println("Share market");
	   return null;
	}
	
}

class Test
{
	public static void main(String[] args)
	{ 
	   Parent p =new Child();
	   p.property();
	}
}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Share market

EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
But Till  1.4 version it was not allowed.
so to compile using 1.4 version
see the syantax:-

PROGRAME=14
=========
 class Parent
{
	public Object property()
	{
	   System.out.println("Gold +silver");
	   return null;
	}
}

class Child extends Parent
{   
	public String property()
	{
	   System.out.println("Share market");
	   return null;
	}
	
}

class Test
{
	public static void main(String[] args)
	{ 
	   Parent p =new Child();
	   p.property();
	}
}


C:\Users\dell1\Desktop>javac -source 1.4 Test.java
warning: [options] bootstrap class path not set in conjunction with -source 1.4
warning: [options] source value 1.4 is obsolete and will be removed in a future release
warning: [options] target value 1.4 is obsolete and will be removed in a future release
warning: [options] To suppress warnings about obsolete options, use -Xlint:-options.
Test.java:12: error: property() in Child cannot override property() in Parent
        public String property()
                      ^
  return type String is not compatible with Object
1 error
4 warnings

C:\Users\dell1\Desktop>javac -source 1.5 Test.java
warning: [options] bootstrap class path not set in conjunction with -source 1.5
warning: [options] source value 1.5 is obsolete and will be removed in a future release
warning: [options] To suppress warnings about obsolete options, use -Xlint:-options.
3 warnings

C:\Users\dell1\Desktop>java Test
Share market

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Share market

EXPLANATION:-
============
1.4 version:-

C:\Users\dell1\Desktop>javac -source 1.4 Test.java
warning: [options] bootstrap class path not set in conjunction with -source 1.4
warning: [options] source value 1.4 is obsolete and will be removed in a future release
warning: [options] target value 1.4 is obsolete and will be removed in a future release
warning: [options] To suppress warnings about obsolete options, use -Xlint:-options.
Test.java:12: error: property() in Child cannot override property() in Parent
        public String property()
                      ^
  return type String is not compatible with Object
1 error
4 warnings


 1.5 version:-

 C:\Users\dell1\Desktop>javac -source 1.5 Test.java
warning: [options] bootstrap class path not set in conjunction with -source 1.5
warning: [options] source value 1.5 is obsolete and will be removed in a future release
warning: [options] To suppress warnings about obsolete options, use -Xlint:-options.
3 warnings

C:\Users\dell1\Desktop>java Test
Share market


current version:-

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Share market




***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
The covariant type return type concept

valid:-
Parent return type--->Object
Child return type--->Object

valid:-
Parent return type--->Object
Child return type--->String



invalid:-Example 16 see.

Parent return type--->Child type(In reference type)-->String
Child return type--->Parent type(In reference type)-->Object




PROGRAME=15
=========
 class Parent
{
	public Object property()
	{
	   System.out.println("Gold +silver");
	   return null;
	}
}

class Child extends Parent
{   
	public Object property()
	{
	   System.out.println("Share market");
	   return null;
	}
	
}

class Test
{
	public static void main(String[] args)
	{ 
	   Parent p =new Child();
	   p.property();
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Share market
      
EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
Parent return type--->Child type(In reference type)---> String
Child return type--->Parent type(In reference type)--->Object
PROGRAME=16
=========
 class Parent
{
	public String property()
	{
	   System.out.println("Gold +silver");
	   return null;
	}
}

class Child extends Parent
{   
	public Object property()
	{
	   System.out.println("Share market");
	   return null;
	}
	
}

class Test
{
	public static void main(String[] args)
	{ 
	   Parent p =new Child();
	   p.property();
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:12: error: property() in Child cannot override property() in Parent
        public Object property()
                      ^
  return type Object is not compatible with String
1 error

EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
Valid overrriding only

PROGRAME=17
=========
 class Parent
{
	public void m1()
	{
	
	}
}
class Child extends Parent
{
	public void m1()
	{
	
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop> 

EXPLANATION:-
============
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-valid overriding..
-----
PROGRAME=18
=========
 class Parent
{
	public void m1()
	{
	   System.out.println("Parent m1");
	}
}
class Child extends Parent
{
	public final void m1()
	{
	   System.out.println("Child m1 as final");
	}
}

class Test
{
	public static void main(String[] args)
	{
	   Parent p=new Child();
	   p.m1();
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Child m1 as final

EXPLANATION:-
============
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
PROGRAME=19
=========
 class Parent
{
	public void m1()
	{
	   System.out.println("Parent m1");
	}
}
class Child extends Parent
{
	public final void m1()
	{
	   System.out.println("Child m1 as final");
	}
}

class Gchild extends Child
{
		public  void m1()
	{
	   System.out.println("Gchild m1 in Gkchild");
	}
}

class Test
{
	public static void main(String[] args)
	{
	   Child c=new Gchild();
	   c.m1();
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:18: error: m1() in Gchild cannot override m1() in Child
                public  void m1()
                             ^
  overridden method is final
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
 class Parent
{
	public void m1()
	{
	   System.out.println("Parent m1");
	}
}
class Child extends Parent
{
	public final void m1()
	{
	   System.out.println("Child m1 as final");
	}
}

class Gchild extends Child
{
		public final void m1() // Point :-1
	{
	   System.out.println("Gchild m1 in Gkchild");
	}
}

class Test
{
	public static void main(String[] args)
	{
	   Child c=new Gchild();
	   c.m1();
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:18: error: m1() in Gchild cannot override m1() in Child
                public final void m1()
                                  ^
  overridden method is final
1 error

EXPLANATION:-
============
 Point :-1 See the difference in example 20 and 19

 using 
 
 public void m1()    and     public final void m1() in Gchild class
   (Example:=19)               (Example:=20)   


   Both are same error i guess so see it..
   final keyword and other things u can discover..
***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
PROGRAME=21
=========
 class Parent
{
	public final void m1()
	{
	   System.out.println("Parent m1");
	}
}
class Child extends Parent
{
	public  void m1()
	{
	   System.out.println("Child m1 as final");
	}
}

class Test
{
	public static void main(String[] args)
	{
       Parent p=new Child();
	   p.m1();
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:10: error: m1() in Child cannot override m1() in Parent
        public  void m1()
                     ^
  overridden method is final
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
 abstract class Parent
{
	 public abstract void m1();
}
class Child extends Parent
{
       public void m1()
	   {
	     System.out.println("Child class ");
	   }
}
class Test
{
	public static void main(String[] args)
	{
	  Parent p=new Child();
	  p.m1();
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Child class

EXPLANATION:-
============
 Parent class abstract methods we can override in Child class..

 Parent class abstract methods we should override in child class to provide 
 implementation.

***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:-General pograme.
-----

For abstract class we can create just reference no problem at all see..


PROGRAME=23
=========
 abstract class Parent
{
	 public abstract void m1();
}
class Child extends Parent
{
       public void m1()
	   {
	     System.out.println("Child class ");
	   }
}
class Test
{   
	 Parent p1;   
	public static void main(String[] args)
	{
	   Parent p;
     System.out.println(new Test().p1);

	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
null

EXPLANATION:-
============
***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-
-----
 General Programe..
For abstract class we can create just reference no problem at all see..
PROGRAME=24
=========
 abstract class Parent
{
	 public abstract void m1();
}
class Child extends Parent
{
       public void m1()
	   {
	     System.out.println("Child class ");
	   }
}
class Test
{   
	 Parent p1;
	public static void main(String[] args)
	{
	 
	 Parent p=null;
     System.out.println(new Test().p1);
     System.out.println(p);

	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
null
null
EXPLANATION:-
============
***************************-----END of--->24<--------***************************
Example=25
=========
NOTE:-
-----
I don t want Parent class implementation,
but i don t know wat to implement in child class so keep it as abstract.

ex:-create ur own example.

PROGRAME=25
=========
 class Parent
{
          public void m1()
	   {
	     System.out.println("Parent class ");
	   }
}
 abstract class Child extends Parent
{
       public abstract void m1();
}
class Test
{   
	
	public static void main(String[] args)
	{
	          Parent p=new Parent();
			  p.m1();
	}
}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Parent class

EXPLANATION:-
============
Durga Point:-we can override non abstract method as abstract,...

The main advantage of this approach is we can stop the avaliability of Parent method
implementation to the next level child classes.
***************************-----END of--->25<--------***************************
Example=26
=========
NOTE:-
-----
PROGRAME=26
=========
 class Parent
{
          public void m1()
	   {
	     System.out.println("Parent class ");
	   }
}
 abstract class Child extends Parent
{
       public abstract void m1();
}

class Gchild extends Child
{
     /*Gchild should compulsary provide implementation
	 Child class method.If not ,it cannot use  */
}




C:\Users\dell1\Desktop>javac Test.java
Test.java:13: error: Gchild is not abstract and does not override abstract method m1() in Child
class Gchild extends Child
^
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
static modifier not discussed in overriding..
separately discussed durga sir told so check those topics also..
***************************-----END of--->27<--------***************************
Example=28
=========
NOTE:-
-----
While overriding we can t reduce the scope of acess modifier,
but we can increase the scope.

increase the scope 
ex:-
Parent(<default>)
Chid(<public/Protected/>)

PROGRAME=28
=========
 class Parent
{
	public void m1()
	{
		System.out.println("public parent");
	}
}
class Child extends Parent
{
	void m1()
	{
	   System.out.println("child non public ");
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:10: error: m1() in Child cannot override m1() in Parent
        void m1()
             ^
  attempting to assign weaker access privileges; was public
1 error

EXPLANATION:-
============
***************************-----END of--->28<--------***************************
Example=29
=========
NOTE:-
-----
Incerease the scope

PROGRAME=29
=========
 class Parent
{
	 void m1()
	{
		System.out.println("public parent");
	}
}
class Child extends Parent
{
	public void m1()
	{
	   System.out.println("child non public ");
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>




EXPLANATION:-
============
***************************-----END of--->29<--------***************************
Example=30
=========
NOTE:-
-----
Same level modifier

PROGRAME=30
=========
 class Parent
{
	 public void m1()
	{
		System.out.println("public parent");
	}
}
class Child extends Parent
{
	public void m1()
	{
	   System.out.println("child non public ");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->30<--------***************************
Example=31
=========
NOTE:-
-----
 increase the scope:-

 default(within the package)
 Protected(within the package and outside package child classes.)
PROGRAME=31
=========
class Parent
{
         void m1()
	{
		System.out.println("public parent");
	}
}
class Child extends Parent
{
	protected void m1()
	{
	   System.out.println("child non public ");
	}
}

 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->31<--------***************************
Example=32
=========
NOTE:-
-----
PROGRAME=32
=========
 class Parent
{
        protected void m1()
	{
		System.out.println("public parent");
	}
}
class Child extends Parent
{
	public void m1()
	{
	   System.out.println("child non public ");
	}
}

 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>

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
