TOPIC:-GENERICS
--------
VIDEO NO=5
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=Completed.
-----------------
03/06/18-->48:00
IMPORTANT EXAMPLES:-

05/07/18-->48:00
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============
Generics class, Template class, we have covered.
Template Method or Generics Methods we are covering in this Concept.


class Test<T>
{
	T --->Type Parameter. We declare Type Parameter at class Level.
	we can use T within this class based on our requirement.
    Declaring Type Parameter at class Level ,Parametrized class is called Generics class.
}

Sometimes i want type safest only at method level.
I don t want to declare at class Level How we can do...
I want type Parameter at method level..
How we can declare it...

We have to declare Just before return type.

class Test // Normal class..  
{
	public <t> void m1( T ob) // Method with type parameter is called  Parametrized method.
	{
           We can use this T anywhere within this method based on our requirement.
	 
	}
}

Doubt:-For Generics class also we can declare Type paramerter for methods also...?
like this below...

class <T> Test
{
	public <X> void (T obj)
	{}}
}

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
We can declare Type parameter eiether at class level or at method level..


Declaring Type parameter at class level.

class Test<T>
{
}

We can use T within this class based on our Requirement.

Declaring Type Parameter at method Level.

we have to declare Type parameter just before return type.
class Test
{
	public <T> void m1( X obj)
	{
	//We can use X anywhere within this method based on our requirement.
	}
}

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
We can define bounded type at class level,
Is it possible to define bouned type at method level...?(yes we can define bounded type at method level also.)


class Test
{

	public <T> void m1(T obj)
	{
	
	}
}


Requirement 1:- We want to can call this method by passing only Number Type or its child classes then

class Test
{

	public <T extends Number> void m1(T obj)
	{
	
	}
}

Requirement 2:- We want to can call this method by passing only Runnable or its child implemented class es
class Test
{

	public <T extends Runnable> void m1(T obj)
	{
	
	}
}


Summary:-We can define Bounded type even at method level also.
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
Summary:-We can define Bounded type even at method level also.
What ever we applied at class level concepts we are applying at method level same concept.

public <T>void m1(){}----->Valid
public <T extends Runnable>void m1(){}----->Valid
public <T extends Number>void m1(){}----->Valid
public <T extends Number & Runnable>void m1(){}----->Valid
public <T extends Comparable & Runnable>void m1(){}----->Valid
public <T extends Number & Comparable & Runnable>void m1(){}----->Valid


public <T extends Runnable & Number>void m1(){}----->InValid
Frist we have to take class Frist and then interface..

public <T extends Number & Thread >void m1(){}----->InValid
We can t extend more than one class.
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
EXPLANATION:-
============
Communication with non-generic code
-----------------------------------

I have a generic Object and i need send to non-generic Area.
I have a non-generic Object and i need to Generic Area.

The location where we are depending on that behaviour will take place..

1)I have a generic Object and i need send to non-generic Area.
Now the Generic Object is in non-generic area so the Object will start behaving like non-generic Object..

2)I have a non-generic Object and i need send to generic Area.
Now the non-generic Object is in generic area so the Object will start behaving like generic Object..


Best Example:-
Child behaviour in home, and with friends.
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
EXPLANATION:-
============
If we send generic Object to non-generic area then, It starts behaving like  non-generic Objects.
If we send non-generic Object to generic area then, It starts behaving like  generic Objects.


that is location in which Object is Present,based on that Behaviour will be defined.



***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		ArrayList<String> l=new ArrayList<String>();
		l.add("Ravi");
		l.add("Durga");
		l.add(10); // CE Bcoz l is of String Type But we are addding Integer so CE. we are getting.

	}
}



C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:10: error: no suitable method found for add(int)
                l.add(10);
                 ^
    method Collection.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
    method List.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
    method AbstractCollection.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
    method AbstractList.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
    method ArrayList.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		ArrayList<String> l=new ArrayList<String>(); // Here l is a generic Object and i am sending to non generic Area...that is m1();
		l.add("Ravi");
		l.add("Durga");
		//l.add(10);
		m1(l); // Here l is  generic object that i am sending to  non generic Area..see in m1 we can add any type of Objects..so l behaves like non generic objects.so that i can add type of Element.
			System.out.println(l);
			

	}


	public static void m1(ArrayList l) // Non Generic Area.
	{   

		//Here l is normal ArrayList 
		l.add(10);
		l.add(10.5);
		l.add(true);
       // Here Array List is non generic area we can add any type of Object.
          
	}
}


//Dont assume within the project total project developed by single person.some methods developed by one person and another methods developed by 
//another person.




C:\Users\vinay.ts\Desktop>javac Test.java
Note: Test.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

C:\Users\vinay.ts\Desktop>java Test
Hello World!
[Ravi, Durga, 10, 10.5, true]

C:\Users\vinay.ts\Desktop>
EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		ArrayList<String> l=new ArrayList<String>(); // Here l is a generic Object and i am sending to non generic Area...that is m1();
		l.add("Ravi");
		l.add("Durga");
		//l.add(10);
		m1(l);// Here l is  generic object that i am sending to  non generic Area..see in m1 we can add any type of Objects..so l behaves like non generic objects.so that i can add type of Element.
			System.out.println(l);
			l.add("comming back from m1"); //non generic Object comming back to generic area and behaving like Generic OBject.
			System.out.println(l);

	}


	public static void m1(ArrayList l) // Non Generic Area.
	{   
		//Here l is normal ArrayList 
		l.add(10);
		l.add(10.5);
		l.add(true);
       // Here Array List is non generic area we can add any type of Object.
          
	}
}


//Dont assume within the project total project developed by single person.some methods developed by one person and another methods developed by 
//another person.




C:\Users\vinay.ts\Desktop>javac Test.java
Note: Test.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

C:\Users\vinay.ts\Desktop>java Test
Hello World!
[Ravi, Durga, 10, 10.5, true]
[Ravi, Durga, 10, 10.5, true, comming back from m1]

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		ArrayList<String> l=new ArrayList<String>(); // Here l is a generic Object and i am sending to non generic Area...that is m1();
		l.add("Ravi");
		l.add("Durga");
		//l.add(10);
		m1(l);// Here l is  generic object that i am sending to  non generic Area..see in m1 we can add any type of Objects..so l behaves like non generic objects.so that i can add type of Element.
			System.out.println(l);
			l.add("comming back from m1"); //non generic Object comming back to generic area and behaving like Generic OBject.
			System.out.println(l);
            l.add(10);//l behaving like generic Object
	}


	public static void m1(ArrayList l) // Non Generic Area.
	{   
		//Here l is normal ArrayList 
		l.add(10);
		l.add(10.5);
		l.add(true);
       // Here Array List is non generic area we can add any type of Object.
          
	}
}


//Dont assume within the project total project developed by single person.some methods developed by one person and another methods developed by 
//another person.




C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:15: error: no suitable method found for add(int)
            l.add(10);//l behaving like generic Object
             ^
    method Collection.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
    method List.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
    method AbstractCollection.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
    method AbstractList.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
    method ArrayList.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
Note: Test.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error

C:\Users\vinay.ts\Desktop>java Test

EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
EXPLANATION:-
============

Conclusion:-The main Purpose of Generics is to provide Type safety.
            To resolve Type cassting problem.

			If i am not performing Type casting Problem compile time error we got.
			If are trying to add any other type immediately CE we will get.so that i can corect that mistake..



			If i am not performing Type casting Problem compile time error we got. to overcome that generics came..



Type Safety and Type casting is related to compiler.
If i am not performing Type casting Problem compile time error we got.
If are trying to add any other type immediately CE we will get.

Generics came to overcome to this .
Generics concept applicable only at compile time.At run time there is no such type of concept.

Generics is Template.
Template is applicable at compile time at run time we cannot use it..
Template is applicatble only at the Begining.
Ex:-
Plan is required at the begining of the constructuion of building.
not required after finishing the building.

Generics applicable at compile time and at run time not applicable ,how sun people developed this...?
At the time of compilation at the last step generic syntax by default will be removed..

ArrayList of String will become normal ArrayList to the JVM point of view.



Durga Point:-The main purpose of Generics is  to provide Type saffety and to resolve Type casting Problem.
Type safety and Type casting both are applicable at compile time. hence Generics concept also applicable only at compile time
but not run time.
At the time of compilation as last Step generic syntax will be removed.And hece for the JVM generic syntax won t be avalibale..(Important Point).


In oops concept we covered that compiler is  always checking reference type, JVM is going to chcek Runtime Object..

ArrayList l=new ArrayList<String>();
A non generic reference we can assign generic Object --->valid..Example=9
we are sending a non generic Object to generic Area.



ArrayList l=new ArrayList<String>();
l.add(10);
l.add(10.5);
l.add(true);
System.out.println(l); //valid see the  reason.

Reason:- compiler is going to check only reference type so the reference type is normal ArrayList.(43:50).
For the normal ArrayList we can add any type of Object.10,10.5,true.no problem at all.

Here once Doubt:-But at run time JVM is gonna check the Runtime Object.
The RunTime Object is ArrayList<String>(); so we have to get the exception..?

But just now we discussed that at the time of compilation generics syntax will be gone.It will be normal ArrayList only.
JVM point of view its normal ArrayList only(ArrayList l=new ArrayList();) we won t get any exception.

     ArrayList l    =      new ArrayList<String>();
       (Reference Type)               (Run time Object)


import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList<String>();
        l.add(10);
        l.add(10.5);
        l.add(true);
       System.out.println(l);
	}
	
}

C:\Users\vinay.ts\Desktop>javac Test.java
Note: Test.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

C:\Users\vinay.ts\Desktop>java Test
[10, 10.5, true]

C:\Users\vinay.ts\Desktop>



If really generics is there at Runtime then i have to get Runime Exception.
But i am not getting it.

so clear Proof that Generics concept is applicable at compile time only.
Run time generics concept is not there.
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		ArrayList<String> l=new ArrayList<String>(); // Here l is a generic Object and i am sending to non generic Area...that is m1();
		l.add("Ravi");
		l.add("Durga");
		//l.add(10);
		m1(l);// Here l is  generic object that i am sending to  non generic Area..see in m1 we can add any type of Objects..so l behaves like non generic objects.so that i can add type of Element.
			System.out.println(l);
			l.add("comming back from m1"); //non generic Object comming back to generic area and behaving like Generic OBject.
			System.out.println(l);
            l.add(10);//l behaving like generic Object
	}


	public static void m1(ArrayList l) // Non Generic Area.
	{   
		//Here l is normal ArrayList 
		l.add(10);
		l.add(10.5);
		l.add(true);
       // Here Array List is non generic area we can add any type of Object.
          
	}
}


//Dont assume within the project total project developed by single person.some methods developed by one person and another methods developed by 
//another person.




C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:15: error: no suitable method found for add(int)
            l.add(10);//l behaving like generic Object
             ^
    method Collection.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
    method List.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
    method AbstractCollection.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
    method AbstractList.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
    method ArrayList.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
Note: Test.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error

C:\Users\vinay.ts\Desktop>java Test
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
continuing from Example 11 concepts:-
ArrayList l=new ArrayList<String>();
ArrayList l=new ArrayList<Integer>();
ArrayList l=new ArrayList<Double>();
ArrayList l=new ArrayList();


Notes Page 59.

Here there is no difference in the functionality of all the above 4 expression.
Because at Run time wheather we are taking or not taking JVM never gonna worry.
Compliler is always going to check reference,all reference are same.

So all this declaration are equal..

At compiler last step these things wiill be removed and at Run time point of view all are 
ArrayList l=new ArrayList();
ArrayList l=new ArrayList();
ArrayList l=new ArrayList();
ArrayList l=new ArrayList();

Durga Point:-Hence the Following declaration are equal.
ArrayList l=new ArrayList<String>();
ArrayList l=new ArrayList<Integer>();
ArrayList l=new ArrayList<Double>();
ArrayList l=new ArrayList();
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
EXPLANATION:-
============
These 2 Declaration are equal or not..?

ArrayList<String> l=new ArrayList<String>();
ArrayList<String> l=new ArrayList();

At RHS we don t need to check it as it will be removed at the last line of compilation.
At LHS Both are same see 
ArrayList<String> l
ArrayList<String> l

the follwing declaration are equal.

For these ArrayList Object s we can add only String type of Object s.

***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
Generics concpets applicable only at compile time not at Run time..

PROGRAME=15
=========
EXPLANATION:-
============
class Test 
{
	public void m1(int i)  //m1(int i) ----->Signature.
	{
	}
	public int  m1(int i)  //m1(int i) ----->Signature.
	{
	
	       return 10;
	}
}


C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:6: error: method m1(int) is already defined in class Test
        public int  m1(int i)
                    ^
1 error

C:\Users\vinay.ts\Desktop>

In this class 2 methods are having same method signature.
m1(int i) ----->Signature.(method name and argument is part of the method signature.)
return type is not part of the method signature..

coz tomo if we are calling m1(10)...?
which method is going to execute is always a problem..?
so within a class 2 methods with the same signature is not allowed..



***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
Applying the same concepts of Example 15 to generics..

PROGRAME=16
=========

EXPLANATION:-
============
1)Compile code normally considering Generics syntax.
2)Remove Generics Syntax.
3)Compile once again Resulted code..


Procedure:-
1)Compile code normally considering Generics syntax.
2)Remove Generics Syntax.
class Test 
{
	public void m1(ArrayList l) 
	{
	}
	public int  m1(ArrayList l) 
	{
	
	       
	}
}



3)Compile once again Resulted code..

class Test 
{
	public void m1(ArrayList l) //Method signature is m1(ArrayList l)
	{
	}
	public int  m1(ArrayList l) ////Method signature is m1(ArrayList l)
	{
	
	       
	}
}

Here 2 method with same signature not allowed..


1)Clear Proof that generics syntax will be removed at compile time.
2)If generics syntax is not removed at the compile time then both are different methods.A
nd there will be no error at compile time.Bcoz both are different methods.
But there is a error at compile time.




***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
import java.util.*;

class Test 
{
	public void m1(ArrayList<String> l)
	{
	}
	public int  m1(ArrayList<Integer> l)
	{
	
	       
	}
}


C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:8: error: name clash: m1(ArrayList<Integer>) and m1(ArrayList<String>) have the same erasure
        public int  m1(ArrayList<Integer> l)
                    ^
1 error

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============

clear indication that Generics syntax will be removed at compile time and will be recompiled again.
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
