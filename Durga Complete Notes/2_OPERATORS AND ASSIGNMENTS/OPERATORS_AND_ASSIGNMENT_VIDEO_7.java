TOPIC:-OPERATOR AND ASSIGNMENTS
--------
VIDEO NO=7
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=NO
-----------------

IMPORTANT EXAMPLES:-

Frist read  Example:-21

----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========

EXPLANATION:-
============
 If we know the class name @ the begining then only we can create the object using new keyword.
i.e Test t=new Test();
It s impossible to create Obejct @ Run time using new opertor.

If the class name  is dynamically avaliable @ run time,  
Then we cannot create Object using new operator.

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-General case of using Predefined class. 
-----
PROGRAME=2
=========
 class Test
{
	public static void main(String[] args)
     {
	System.out.println("hello world");
	 }
}
class String
{
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Error: Main method not found in class Test, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

EXPLANATION:-
============
 The default package in java is java.lang.packge
 All class present in this package are by default avaliable in Test class.

So compiler will not check wheather the predefined class is there or userdefined class is there
it will jsut check wheather the syntax is correct that s it.(eiether predefined or userdefined).

Note:-*****
 When ever we are using any predefined class name as  

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
 class Test
{
	public static void main(String[] args)
     {
	System.out.println("hello world");
	 }
}
class System
{
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: cannot find symbol
        System.out.println("hello world");
              ^
  symbol:   variable out
  location: class System
1 error
EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-  
-----
 Differentiate between 

 predefined String    vs    user defined String
  java.lang.String            String

PROGRAME=4
=========
 class Test
{
	public static void main(java.lang.String[] args)
     {
	System.out.println("hello world");
	 }
}
class String
{
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello world

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
  Differentiate between 

 predefined String    vs    user defined String

PROGRAME=5
=========
 class Test
{
	public static void main(java.lang.String[] args)
     {
     java.lang.String s ="vinay";
    System.out.println(s);
	System.out.println("hello world");
	 }
}
class String
{
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
vinay
hello world

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
EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-Hard coded java programe
-----
PROGRAME=9
=========
class Test extends Exam
{
	public static void main(String[] args)
     {
        System.out.println("vinay");
     }
}

class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
static blocks Exam
vinay

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-Dynamically allocating the class name @ run time and executing the static elements 
-----
PROGRAME=10
=========
 class Test 
{
	public static void main(String[] args) throws Exception
      {   
        System.out.println("Test class");
		Class.forName(args[0]);
     }
}

class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
}


 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test Exam
Test class
static blocks Exam

C:\Users\dell1\Desktop>java Test Phone
Test class
static blocks phone
EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-We cannot execute the static method find out the reason
-----May be static blocks are executed during.class time loading.
     static methods no idea so error.
PROGRAME=11
=========
 class Test 
{
	public static void main(String[] args) throws Exception
      {   
        System.out.println("Test class");
		Class.forName(args[0]);

		//using this also after loading the class dynamically @ run time we ll get error.
		Class.forName(args[0]).m1();
     }
}

class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
		static void m1()
		{
    System.out.println("static blocks phone");
		}
}
 
C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: cannot find symbol
                Class.forName(args[0]).m1();
                                      ^
  symbol:   method m1()
  location: class Class<CAP#1>
  where CAP#1 is a fresh type-variable:
    CAP#1 extends Object from capture of ?
1 error
EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
 class Test 
 {
	public static void main(String[] args) throws Exception
      {   
        System.out.println("Test class");
        Class c=Class.forName(args[0]);
        System.out.println(c);

     }
}

class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
		static void m1()
		{
    System.out.println("static blocks phone");
		}
}
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test Exam
Test class
static blocks Exam
class Exam

EXPLANATION:-
============
 Observe the output
  
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test Exam
Test class
static blocks Exam
class Exam      -----------------> Run time definition of a class (vinay Point)


Do some research how to get run time definition of a class which method we should use
getClass() something like that.
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
 class Test 
 {
	public static void main(String[] args) throws Exception
      {   
        System.out.println("Test class 123 ");
     //  Approach :-1
     //  Object c=Class.forName(args[0]).newInstance();
       
	//  Approach :-2(Type casting)	
		Exam c=(Exam)Class.forName(args[0]).newInstance();
        System.out.println(c);
                
     }
}

class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
		static void m1()
		{
    System.out.println("static blocks phone");
		}
}
 
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test Exam
Test class 123
static blocks Exam
Exam@2a139a55
EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-Observe the error CFS  m1 () in class Object
-----
PROGRAME=14
=========
 class Test 
 {
	public static void main(String[] args) throws Exception
      {   
        System.out.println("Test class 123 ");
        Class.forName(args[0]).newInstance().m1();
	  }
}

class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
		static void m1()
		{
    System.out.println("static blocks phone");
		}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: cannot find symbol
        Class.forName(args[0]).newInstance().m1();
                                            ^
  symbol:   method m1()
  location: class Object
1 error

EXPLANATION:-
============

 Class is a class which is present in a default package called java.lang.package
 So we can use all the methods which are present in the Class class.

 public static Class<?> forName(String className)

  it s a static method so i can call it using for class name
         Class.forname("abc");

 See the forname return type is Class,so we can acess all the methods 
 which are present in class Class..
 
Ex:- Emp m1()
      {
	  
	  return new Emp();
	  }
 
	  
 case 2:-
 -------
 Class.forName(args[0]).newInstance().m1();

 Method present in Class class 

 public T newInstance() --->method present in class Class.

        Class.forName(args[0]).newInstance().m1();
        <--------------------------------->

    new instance return type is Object i.e----->T
    so after newInstance we can call only Object class methods
   but am calling m1() method which is not present in Object class so error programe:-14
   
 
 ---------------------------------------------------------------------------------------------
 case :- Vvvvvvvvvvv important case check in eclipse by using o.
 -------

 Note:-  Object o =(Exam)Class.forName(args[0]).newInstance();
         o.getClass();
        o.hashCode();


 Even though we are type casting to Exam 
 and using Object reference o to hold it.
 By using o we can call only Object class methods..

 Reson:-If @ run time some other class name 
          java Test Phone
   we gave means it cannot type cast to so its calling Object class methods only.
 
    class Test 
 {
	public static void main(String[] args) throws Exception
      {   
	  
	  System.out.println("Test class 123 ");
      Object o =(Exam)Class.forName(args[0]).newInstance();
      o.getClass();
      o.hashCode();
      }
}

class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
		static void m1()
		{
    System.out.println("static blocks phone");
		}
}

 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test Exam
Test class 123
static blocks Exam

C:\Users\dell1\Desktop>
 



 ----------------------------------------------------------------------------------------------
case :-See am calling only Object class method no error..toString();
-------
 class Test 
 {
	public static void main(String[] args) throws Exception
      {   
        System.out.println("Test class 123 ");
        Class.forName(args[0]).newInstance().toString();
     }
}

class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
		static void m1()
		{
    System.out.println("static blocks phone");
		}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test Exam
Test class 123
static blocks Exam

 
 
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
 class Test 
 {
	public static void main(String[] args) throws Exception
      {   
        System.out.println("Test class 123 ");
        (Exam)(Class.forName(args[0]).newInstance().m1());
      }
}

class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
		static void m1()
		{
    System.out.println("static blocks phone");
		}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: not a statement
        (Exam)(Class.forName(args[0]).newInstance().m1());
        ^
1 error

EXPLANATION:-
============
 Observe this chaining the methods to call is allowed 
 but type casting without reference is not allowed.
 Do some research on this.
case :-1
--------
C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: not a statement
        (Exam)(Class.forName(args[0]).newInstance()).m1();
        ^
1 error

case 2:-
--------
C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: not a statement
        (Exam)Class.forName(args[0]).newInstance().m1();
        ^
1 error

case 3:-
--------
 C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: cannot find symbol
        Object(Class.forName(args[0]).newInstance().toString());
        ^
  symbol:   method Object(String)
  location: class Test
1 error

***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:- type casting is not allowed during chaining of methods call
-----
 Very imporatnt point i guess:-
 When type casting compulsary we should provide reference i guess to hold it.

 class Test 
 {
	public static void main(String[] args) throws Exception
      {   
        System.out.println("Test class 123 ");
       (Exam)Class.forName(args[0]).newInstance();
     }
}

class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
		static void m1()
		{
    System.out.println("static blocks phone");
		}
}

 
C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: not a statement
       (Exam)Class.forName(args[0]).newInstance();
       ^
1 error
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
 class Test 
 {
	public static void main(String[] args) throws Exception
      {   
	  
	  System.out.println("Test class");
   	  Exam e =(Exam)Class.forName("Exam").newInstance();
      e.m1(); 
      }
 }
class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static method Exam");
		}
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
		static void m1()
		{
    System.out.println("static blocks phone");
		}
}

 
  
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Test class
static blocks Exam
static method Exam

EXPLANATION:-
============
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
 Object o =(Exam)Class.forName("Exam").newInstance();

 The return type of newInstance() is Object type so we should catch it using any type of Object reference

 case 1:-
 ------ hard coded into exam only.
 Object o =(Exam)Class.forName("Exam").newInstance();
       o.(object class methods)

 case 2:-
-------
  Object o =(Exam)Class.forName(args[0]).newInstance();
   	  o.(object class methods)

 Very important read it
 The return type of newInstance() is Object type.
 so we should catch it using any type of Object reference
 It does nt matter if we type casting or hard coding.
 
  newInstance()---->return type is T so it might be by default object type so it s calling Object
  class only i guess.

 Which reference we are using to catch(Object,Exam...etc)that,
 by using that reference we can call that specific class methods

 using  ---->can call
 Object o---->Object class methods
 Exam e ---->Exam class methods
 Phone---->Phone class methods
PROGRAME=18
=========
 class Test 
 {
	public static void main(String[] args) throws Exception
      {   
	  
	  System.out.println("Test class");
      Object o =(Exam)Class.forName("Exam").newInstance();
      o.toString();
      o.getClass();
      }
 }
class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
		static void m1()
		{
    System.out.println("static blocks phone");
		}
}

 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Test class
static blocks Exam

EXPLANATION:-
============
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
 we cannot call directly m1 method Bcoz the return type of newInstance() is Object.
 We dont know which Object

 
 Class.forName("Exam").newInstance().(Object class methods )
directly m1() method of exam we cannot call,even though we are hard coding the value to Exam

Reason may be class.forname is to load the class dynamically @ run time.
so it won t belive i guess which class we are giving or so some research.(MY point)

PROGRAME=19
=========
 class Test 
 {
	public static void main(String[] args) throws Exception
      {   
	  
	  System.out.println("Test class");
	  Class.forName("Exam").newInstance();


	  }
 }
class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
		static void m1()
		{
    System.out.println("static blocks phone");
		}
}

 
EXPLANATION:-
============
***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
	  Class.forName("Exam").newInstance();


	  We cannot call directly m1 method of Exam class even though hardcoding
	  reason is 

     newInstance(); ---->return type is T

    T ---->may represent an Object or don t know in java so by default its taking object only.

PROGRAME=20
=========
 class Test 
 {
	public static void main(String[] args) throws Exception
      {   
	  
	  System.out.println("Test class");
	  Class.forName("Exam").newInstance();


	  }
 }
class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
		static void m1()
		{
    System.out.println("static blocks phone");
		}
}

EXPLANATION:-
============
***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
PROGRAME=21
=========
 class Test 
 {
	public static void main(String[] args) throws Exception
      {   
	  
	  System.out.println("Test class");
	 Exam e= Class.forName("Exam").newInstance();
	 
	  }
 }
class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
		static void m1()
		{
    System.out.println("static blocks phone");
		}
}

 
 
C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: incompatible types: CAP#1 cannot be converted to Exam
         Exam e= Class.forName("Exam").newInstance();
                                                  ^
  where CAP#1 is a fresh type-variable:
    CAP#1 extends Object from capture of ?
1 error

EXPLANATION:-
============
    public T newInstance()

	i guess in generics xome concept

	T--->  ? dO SOME RESEARCH
-----------------------------------------------------------
vvvvvvvvvvvvvvvvvv 

 From all above research If return type is T,
 
    public T newInstance()
	{
	
	 return  ---------
	}

	If i call this method compulsary i should catch it using

	1)object o=
	2)Exam e=(Exam)


***************************-----END of--->21<--------***************************
Example=22
=========
NOTE:- Checked Excepation
-----
------------------------------------------------------------------------------------------
 Shiva point:-
ClassNotFoundException is a checked exception, it is rised
i. when we try to create an object using newInstance() method.
ii. and the corresponding .class file is not available(e.g if ABC.class is not available)
ex:
put below line in main method of any java class/program, and if ABC.class file is not available at runtime then its ClassNotFoundExceptio
Object o=Class.forName("ABC").newInstance();
------------------------------------------------------------------------------------------


PROGRAME=22
=========
 class Test 
 {
	public static void main(String[] args) 
      {   
	System.out.println("Test class");
   	Object o= Class.forName(args[0]).newInstance();
	 }
 }
class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
		static void m1()
		{
    System.out.println("static blocks phone");
		}
}
C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: unreported exception ClassNotFoundException; must be caught or declared
        Object o= Class.forName(args[0]).newInstance();
                               ^
Test.java:6: error: unreported exception InstantiationException; must be caught or declared
        Object o= Class.forName(args[0]).newInstance();
                                                    ^
2 errors


EXPLANATION:- Handling that Exception see using throws keyword
============
 class Test 
 {
	public static void main(String[] args) throws Exception
      {   
	System.out.println("Test class");
   	Object o= Class.forName(args[0]).newInstance();
	 }
 }
class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

class Phone 
{
	static 
		{
    System.out.println("static blocks phone");
	    }
		static void m1()
		{
    System.out.println("static blocks phone");
		}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test Exam
Test class
static blocks Exam
***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:- Deleting the .class file after compilation will not result in this
----- NoClassDefFoundError
    coz we are not using that deleted .class file any where in the class which is having
	main method.

PROGRAME=23
=========
 class Test 
 {
	public static void main(String[] args) 
     {   
	System.out.println("Test class");
	 }
 }
class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Test class

C:\Users\dell1\Desktop> 

EXPLANATION:-
============
***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-deleting the .class file which is used in the main method class will result in this error.
-----
PROGRAME=24
=========
 class Test 
 {
	public static void main(String[] args) 
     {   
	System.out.println("Test class");
	new Exam();
	 }
 }
class Exam 
{
	static 
		{
    System.out.println("static blocks Exam");
	    }
	static void m1()
		{
    System.out.println("static blocks phone");
		}
}

 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Test class
Exception in thread "main" java.lang.NoClassDefFoundError: Exam
        at Test.main(Test.java:6)
Caused by: java.lang.ClassNotFoundException: Exam
        at java.net.URLClassLoader.findClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        ... 1 more

EXPLANATION:-
============
-------------------------------------------------------------------------------
 Shiva s point:-

 NoClassDefFoundError is subclass of Error, and because errors are unchecked and hence it is uncheked
ex: write below classes in Test.java program, after compilation we will get Test.class and ABC.class, after that delete ABC.class file and run Test.class file, you will get NoClassDefFoundError

class Test
{
public static void main(String[] args)
{
ABC   abc=new ABC();
}
}
class ABC
{
}
-------------------------------------------------------------------------------
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
