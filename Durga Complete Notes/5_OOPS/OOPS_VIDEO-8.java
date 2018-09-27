TOPIC:-OOPS
--------
VIDEO NO=8
-----------
NUMBER OF PICTURES=
------------------
1-->()

VIDEO COMPLETED=YES(BUT FULL OF DOUBTS)
-----------------
GO THROUGH ALL THESE CONCEPTS ONCE AGAIN.
**************************************************************************************
IMPORTANT EXAMPLES:-
 EXAMPLES :-12(Case 3)
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
Adavanced oops features
coupling
cohesion

coupling:-The degree of dependency between the component is called coupling.
If dependency is more then it is considered as tightly coupling.
and Depedency is less then it is considered as loosely coupling.

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
Tightly coupling.

class A
{
	static int i=B.j;
}

class B
{
	static int j=C.k;
}

class C
{
	static int k=D.m1();
}

class D
{
	public static int m1()
	{
	   return 0;
	}
}


EXPLANATION:-
============
The above components are tightly coupled with each other because 
depedency  between the component is more.

Tightly coupling is not a good programming practice because it has several disadvantaages.
without effecting remaining components we can t modify any component
1)Dependency is the worst programming pratice.

2)Enhancement will become difficult(Modification)
coz if we change the class D return value all value will be changed..

3)If we want to use A class,then compulsary we neded use B-class so dependency is more..
It supresses re-usability.
It reduces maintainability of the application.

4)Maintain ability of the application will be difficult.

Hence we have to maintain dependency between the component as less as possible.
that is loosely coupling is a good programming practice.
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
								Cohesion
                                --------
For every component a clear well defined functionality is defined then that component is said to be
follow high cohesion.

Ex:-
1) A -->componnent is meant for data base operation.
2)B --->componnent is meant for login operation.
3)c--->componennt is meant for presentation operation.

 All the aboove 3 are components follow high cohesion.
High cohesion is a good programmimng practice,It has several advantages

1)without effecting remaining components we can modify any component.
hence enhancement will become easy.
2)It promotes re-usability of the code.
(Where ever validation is required we can re-use the same validate servlet without re-writing.)
3)It improves maintainability of the application.

Note:-loosely coupling and high cohesion are good programming practice..


 Low cohesion:-
 --------------
Diagram--->(I:\JAVA NOTES\DURGA JAVA NOTES\OOPS\OOPS DURGA VIDEO 8)



PROGRAME=3
=========
EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============

								 
								 Object Type Casting
 We can use Parent reference to hold Child Objects.

Object o=new String("vinay");
Parent -->Object
child--->String

We can use interface reference to hold implemented class objects.
interface reference can be used to hold it s implemented classes.
Runnable r=new Thread();
Runnable--->Is an interface
Thread--->It s implemented classes.
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
EXPLANATION:-
============
Just go through wat the difference between incompatible types vs incoonvertable types 
compile time error in java.
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
Hand written notes Page:-101

A b  =  (C)   d;

A ---->class/interface name 
b----> reference variable
C---->class/interface name
d---->reference variable

Compiler is going to check 2 condition:-

MANTRAS
=======
1)The type of --> d and 
                      -->C must have some relation eiether parent to child 
					                                       or Child to parent or 
														   same type..

If not found any relation between Child and parent compiler will give
error as 
Even though sibling relationship will incompatible type.(Example:-12)

CE: incompatible type
found:d
require:c

2)
Example:-

Object o=new String("vinay");
StringBuffer sb=(StringBuffer)o;
 
 Object reference o and StringBuffer have Parent and Child relationShip.

 Parent -->o(Object refernce)
 Child--->StringBuffer
 


Mantras:-
compile time checking 
1)The type of 'd' and 'c' must have some realtion eiether child to parent or
parent to Chid or same type.

otherewise we ll get CE:- inconvertible type
found:d 
require:c

Example:- 1

Object o=new String("vinay");
StringBuffer sb=(StringBuffer)o;
 
 Object reference o and StringBuffer have Parent and Child relationShip.

 Parent -->o(Object refernce)
 Child--->StringBuffer

PROGRAME=7
=========
EXPLANATION:-
============
Object o=new String("vinay");
StringBuffer sb=(StringBuffer)o;


 


***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
 class Test
{
	public static void main(String[] args)
	{
	Object o=new String("Vinay");
	StringBuffer sb=(StringBuffer)o;
	}
}



C:\Users\dell1\Desktop>javac Test.java   // no compiletime error.

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to
        at Test.main(Test.java:6)


 StringBuffer sb=(StringBuffer)o;


  Object (Parent)
       ---->String(child of Object)
	   ---->StringBuffer(child of Object)


	   String and StringBuffer are siblings.

	   

 StringBuffer sb=(StringBuffer)        o            ;
 (child)           (Child)     (Another child)                    
So sibling relationship its class-cast exception.


Note:- Compiler is going to check wheather its in the same inheritance relationship tree.
If its in the same inheritance tree we won t get CE.
EXPLANATION:-
============

***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
 Lact video programe:-

PROGRAME=9
=========
 interface Parent
{
public void m1();
public void m2();
public void m3();
}

class Child implements Parent
{
	public void m1()
	{
		System.out.println("m1-method");
	}
	public void m2()
	{
		System.out.println("m2-method");
	}
	public void m3()
	{
		System.out.println("m3-method");
	}
}

class Test
{
  public static void main(String[] args) 
   {
	        Parent p=new Child();
	        p.m1();p.m2();p.m3();
   }	
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
m1-method
m2-method
m3-method

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
         String s="Vinay";
		 StringBuffer sb=(StringBuffer)s;
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: incompatible types: String cannot be converted to StringBuffer
                 StringBuffer sb=(StringBuffer)s;
                                               ^
1 error

EXPLANATION:-
============
String s="Vinay";
StringBuffer sb=(StringBuffer)s;

StringBuffer sb=  (StringBuffer)           s             ;
                  (Child)           ( another child)

				  After = ()_ _ _


				  compiler is always looking for (Child)_Parent  ; //vice-versa also ok

 But these are siblings,so incompatible types.

 

***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----

PROGRAME=11
=========
class Test
{
	public static void main(String[] args)
	{
         String s=new String("Vinay");
		 StringBuffer sb=(StringBuffer)s;
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: incompatible types: String cannot be converted to StringBuffer
                 StringBuffer sb=(StringBuffer)s;
                                               ^
1 error

EXPLANATION:-
============
 String s="Vinay";   vs   String s=new String("Vinay");
 may be both are same do some R & D.

 same error see..

 Note:-

See in Durga video 1:02:54 he told that inconvertible type CE for the same programe.
may be old version.

But i am getting incompatible type problem..may be old and new version we are getting same problem..
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
 So i have one doubt that String and StringBuffer are indirectly child class of Object.
 Every class is a Child class of Object if we don t extend that class.

PROGRAME=12
=========
Case 1:-
--------
class Parent
{
}

class A_Child extends Parent
{
}
class B_Child extends Parent
{
}
class Test
{
	public static void main(String[] args)
	{
	    Parent p=new A_Child();
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>

Case 2:-
--------
 class Parent extends Object
{
}

class A_Child extends Parent
{
}
class B_Child extends Parent
{
}
class Test
{
	public static void main(String[] args)
	{
	    Parent p=new Parent();
		A_Child a=(A_Child)p;
	}
}

class Neighbour extends Object
{
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ClassCastException: Parent cannot be cast to A_Child
        at Test.main(Test.java:16)


Case 3:-
--------
See the sibling relation ship also some CE
But different class. 
But in String and StringBuffer it won t work like this it s working fine find out wat s the reason.
even though we have sibling relation ship.
See Example:-10 wat i have written is wrong.


See Example:-10
its same as example 10.
sibling relation generally we ll get CE. don t get confused..
If its in same inheritance tree doesn t mean siblings relation ship works.
It should have Parent and child relationship, In inheritance tree,..

 class Parent extends Object
{
}

class A_Child extends Parent
{
}
class B_Child extends Parent
{
}
class Test
{
	public static void main(String[] args)
	{
	    Parent p=new Parent();
		A_Child a=(Neighbour)p;
	}
}

class Neighbour extends Object
{
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:16: error: incompatible types: Parent cannot be converted to Neighbour
                A_Child a=(Neighbour)p;
                                     ^
1 error

Case:-4
---------
 class Parent extends Object
{
}

class A_Child extends Parent
{
}
class B_Child extends Parent
{
}
class Test
{
	public static void main(String[] args)
	{
	    Parent p=new Parent();
		A_Child a=(Neighbour)p;
	}
}

class Neighbour 
{
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:16: error: incompatible types: Parent cannot be converted to Neighbour
                A_Child a=(Neighbour)p;
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
 
EXPLANATION:-
============
Mantras:-
--------
A b  =  (C)   d;

compile time checking 

1)The type of 'd' and 'c' must have some realtion eiether child to parent or
parent to Chid or same type.
(Sibling also we ll get CE)

2)After checking the above relation of 'd' & 'C' as above parent & child,vice versa ,same type.
     same type(It means parent and parent  or child and child)
After conversion we are assigining 'C' to 'A' type reference variable.
1)compulsary 'A' should be same as 'C'
2)or 'A' should be Parent of 'C'.

another definition

1)'C' must be same as 'A'
2) or 'C' must be derived type of 'A'.

derived type means child of 'C'.

if the above condition is not satisfied we ll get CE
CE:-incompatible types
   found:C
   require:A

Durga Point:-

Mantra 2:-Compile time checking 2
'C' must be eiether same or derived type of 'A'
otherwise we will get CE saying 
CE:-incompatible types
   found:C
   require:A

Example 1:-// very important. (Do this programe)

Object o=new String("Vinay");
StringBuffer sb=(String)o;

javac Test.java // ok
java Test 
Incompatible type coz 

StringBuffer sb=(String)o;
StringBuffer and String  does nt have a relationship,They are siblings of object.

Mantra checking 

3)
Run time type Object type of 'D' must be eiether same or Derived type of 'C'.
other wise we ll get RE:
class cast Exception.

***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
class Parent 
{
}

class Neighbour 
{
}

class Test
{
	public static void main(String[] args)
	{
	    Parent p=new Neighbour();
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:13: error: incompatible types: Neighbour cannot be converted to Parent
            Parent p=new Neighbour();
                     ^
1 error

EXPLANATION:-
============
We won t get inconvertible type error as durga told we ll get incompatible only.
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
class Test
{
	public static void main(String[] args)
	{
	   Object o=new String("Vinay");
      StringBuffer sb=(StringBuffer)o;
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.StringBuffer
        at Test.main(Test.java:6)

      
EXPLANATION:-
============
 I think String and StringBuffer are somehow indirectly have parent and child relationship.
 i think they are not siblings.
 If siblings means we ll get CE...

Case 1:-
--------
class Test
{
	public static void main(String[] args)
	{
	   Object o=new String("Vinay");
      StringBuffer sb=(StringBuffer)o;
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.StringBuffer
        at Test.main(Test.java:6)
 
 Case 2:-
 --------
 class Test
{
	public static void main(String[] args)
	{
	   Object o=new String("Vinay");
      StringBuffer sb=(String)o;
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: incompatible types: String cannot be converted to StringBuffer
      StringBuffer sb=(String)o;
                      ^
1 error

Case 3:-
--------
 class Parent
{

}
class Child extends Parent
{

}

class Test
{
	public static void main(String[] args)
	{
	   Object o=new Parent();
	   Test p  =(Child)o;
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:15: error: incompatible types: Child cannot be converted to Test
           Test p  =(Child)o;
                    ^
1 error
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
PROGRAME=16
=========
 class Test
{
	public static void main(String[] args)
	{
	   Object o=new String("Vinay");
      StringBuffer sb=(String)o;
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: incompatible types: String cannot be converted to StringBuffer
      StringBuffer sb=(String)o;
                      ^
1 error

EXPLANATION:-
============
check using different version.
wat will happen.
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
EXPLANATION:-
============
class Parent
{

}
class Ramu extends Parent
{

}
class Shamu extends Parent
{

}

class Test
{
	public static void main(String[] args)
	{
	   Object o=new Parent();
	   Shamu r=(Ramu)o;
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:19: error: incompatible types: Ramu cannot be converted to Shamu
           Shamu r=(Ramu)o;
                   ^
1 error

Note:-

Shamu r=(Ramu)o;

Before evaluating  right hand side,
   =(Ramu)o

 Generally compiler will see like this.

 Shamu r  =  (Ramu)     o;
 (Child)             (Parent)

so its incompatible. 
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
