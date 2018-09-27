TOPIC:-ACESS MODIFIER
--------
VIDEO NO=5
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
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============
  public class Test
 {

 }

 We can acess this class from anywhere.
 if the class is having default then with the package
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
 final class Test
 {

 }

 child class creation is not possible if we use final
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
 abstract class Test
 {

 }
 we cannot create object for this class.
 if the class is abstract.
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
12 Modifiers are there in java

public,private,<default>,protected

final,abstract,static,synchronized,

native,strictfp,transient,volatile.



***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
 private class Test
 {

 }
 
C:\Users\dell1\Desktop>javac Test.java
Test.java:1: error: modifier private not allowed here
private class Test
        ^
1 error

EXPLANATION:-
============
 private is not applicable to top level classes.
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
        private class A
       {
          
		}
        static class B
           {
 
            }

 
   public static void main(String[] args)
{
   System.out.println("hello world");
}

EXPLANATION:-
============
 Here A and B class are not top level classes.
 Here A and B class are inner class.
 coz main method written outside of both class see carefully so it s valid.

 when compiled we ll get CE.
 but logically valid.

 In exam we can find it using line number.
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
 private class Test
 {

 }
 
C:\Users\dell1\Desktop>javac Test.java
Test.java:1: error: modifier private not allowed here
private class Test
        ^
1 error

EXPLANATION:-
============
 In java there is no rule as acess specifier.
 here is the proof.

 C:\Users\dell1\Desktop>javac Test.java
Test.java:1: error: modifier private not allowed here
private class Test

***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
 case 1:-

Programe 1:-

 package pack1;
class A
{
	public void m1()
	{
	System.out.println("hello");
	}

	public static void main(String[] args)
		{
	System.out.println("hello world");
	   }
}	


C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>java pack1.A
hello world

Programe 2:-
 package pack2;
class Test
{
	public void m1()
	{
	System.out.println("hello");
	}

	public static void main(String[] args)
		{
		A a =new A();
	System.out.println("hello world");
	   }
}	



C:\Users\dell1\Desktop>javac -d . Test.java
Test.java:11: error: cannot find symbol
                A a =new A();
                ^
  symbol:   class A
  location: class Test
Test.java:11: error: cannot find symbol
                A a =new A();
                         ^
  symbol:   class A
  location: class Test
2 errors

EXPLANATION:-
============
 Reason is A class is not public so we ll get CE
 and we are not importing class-A in class Test.

***************************-----END of--->8<--------***************************
Example=9(After  Example 10 study this)
=========
NOTE:-
-----
PROGRAME=9
=========
case 2:- Make sure u save both Programe 1 and Programe 2 in same CWD.
 
save both in desktop

Programe 1:-
 
 package pack1;
 public class Test
{
	public void m1()
	{
	System.out.println("M1 Test class method");
	}

	public static void main(String[] args)
		{
			    System.out.println("hello world");
	   }
}	


Programe 2:-

package pack2;
import pack1.Test;
 class A
{
	public void m1()
	{
	System.out.println("hello");
	}

	public static void main(String[] args)
		{             
		        Test t=new Test();
				t.m1();
			    System.out.println("hello world");
	   }
}	

 

EXPLANATION:-
============
 
C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>javac -d . A.java

C:\Users\dell1\Desktop>java pack2.A
M1 Test class method
hello world
***************************-----END of--->9<--------***************************
Example=10(While explaining use this example frist)
=========
NOTE:-saving in cwd and not using public modifier  for one class
-----
PROGRAME=10
=========
 Programe 1:-

package pack1;
class Test
{
	public void m1()
	{
	System.out.println("M1 Test class method");
	}

	public static void main(String[] args)
		{
			    System.out.println("hello world");
	   }
}	
 
 Programe 2:-
 
package pack2;
import pack1.Test;
 class A
{
	public void m1()
	{
	System.out.println("hello");
	}

	public static void main(String[] args)
		{             
		        Test t=new Test();
				t.m1();
			    System.out.println("hello world");
	   }
}	



C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>javac -d . A.java
A.java:2: error: Test is not public in pack1; cannot be accessed from outside package
import pack1.Test;
            ^
A.java:12: error: cannot find symbol
                        Test t=new Test();
                        ^
  symbol:   class Test
  location: class A
A.java:12: error: cannot find symbol
                        Test t=new Test();
                                   ^
  symbol:   class Test
  location: class A
3 errors

EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
 Test class is public but saved in another drive(I:drive)
 A class is non-public but saved in another drive(desktop)

PROGRAME=11
=========
 NOte:-
  Package magic works when both programes are stored in same CWD.

Programe:-1
 
 package pack1;
public class Test
{
	public void m1()
	{
	System.out.println("M1 Test class method");
	}

	public static void main(String[] args)
		{
			    System.out.println("hello world");
	   }
}	


Programe:-2

package pack2;
import pack1.Test;
 class A
{
	public void m1()
	{
	System.out.println("hello");
	}

	public static void main(String[] args)
		{             
		        Test t=new Test();
				t.m1();
			    System.out.println("hello world");
	   }
}	


EXPLANATION:-
============
 
C:\Users\dell1\Desktop>i:

I:\J>javac -d . Test.java

I:\J>java pack1.Test
hello world

I:\J>c:

C:\Users\dell1\Desktop>javac -d . A.java
A.java:2: error: package pack1 does not exist
import pack1.Test;
            ^
A.java:12: error: cannot find symbol
                        Test t=new Test();
                        ^
  symbol:   class Test
  location: class A
A.java:12: error: cannot find symbol
                        Test t=new Test();
                                   ^
  symbol:   class Test
  location: class A
3 errors

***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
Default modifier means within the package
outside the package we cannot acess.

Do some work on default acess modifier,durga not Explained any Examples.

PROGRAME=12
=========
EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13                      Default Acess Modifier.
=========
NOTE:- class must be public to acess 
-----
PROGRAME=13
=========
Programe:-1

 package pack1;
 class Test
{
	public void m1()
	{
	System.out.println("M1 Test class method");
	}

	public static void main(String[] args)
		{
			    System.out.println("hello world");
	   }
}	




Programe:-2

 package pack2;
import pack1.Test;
 class A 
{
	public void m2()
	{
	System.out.println("hello");
	}

	public static void main(String[] args)
		{       
		        
		        A a=new A();
				System.out.println("hello world");
	   }
}	

C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>javac -d . A.java
A.java:2: error: Test is not public in pack1; cannot be accessed from outside package
import pack1.Test;
            ^
1 error 


EXPLANATION:-
============
Both are default
***************************-----END of--->13<--------***************************
Example=14                        Both are public
=========
NOTE:-
-----
PROGRAME=14
=========
 Programe 1:-
   package pack1;
 public class Test
{
	public void m1()
	{
	System.out.println("M1 Test class method");
	}

	public static void main(String[] args)
		{
			    System.out.println("hello world");
	   }
}	


 
 Programe 2:-
 package pack2;
import pack1.Test;
 public class A 
{
	public void m2()
	{
	System.out.println("hello");
	}

	public static void main(String[] args)
		{       
				 new Test();
				System.out.println("hello world");
	   }
}	


C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>javac -d . A.java

C:\Users\dell1\Desktop>java pack2.A
hello world

EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15     Compiling the source file with an import statement of a class which has not    
=========       been compiled before.

NOTE:-
-----

PROGRAME=15
=========
 Programe 1:-

package pack1;
import pack1.A; // using this import statement but have not compiled that class
class Test
{
	public void m1()
	{
	System.out.println("M1 Test class method");
	}

	public static void main(String[] args)
		{        
		         new A().m2();
			    System.out.println("hello world Test class");
	   }
}	

C:\Users\dell1\Desktop>javac -d . Test.java
Test.java:2: error: cannot find symbol
import pack1.A;
            ^
  symbol:   class A
  location: package pack1
Test.java:12: error: cannot find symbol
                         new A().m2();
                             ^
  symbol:   class A
  location: class Test
2 errors

====>(Viany Point)
See this error it clearly shows that CFS error it means compiler unable to find A.class file
 Bcoz its comming @ compile time only know.

                 C:\Users\dell1\Desktop>javac -d . Test.java
                 Test.java:2: error: cannot find symbol
                  import pack1.A;



Programe 2:-(Not compiled just written)

 package pack2;
 public class A 
{
	public void m2()
	{
	System.out.println("M2 Method A class");
	}

	public static void main(String[] args)
		{       
             new Test().m1();  
		     System.out.println("hello world A class");
	   }
}	



EXPLANATION:-
============


***************************-----END of--->15<--------***************************
Example=16    In this Example i am going to compile frist the using source file(i.e A-class)
=========     so compiler will easily get the required source file when any class is importing
              A- class

NOTE:-
-----   
PROGRAME=16
=========
 Programe:- 1
 
 package pack2;
 public class A 
{
	public void m2()
	{
	System.out.println("M2 Method A class");
	}

	public static void main(String[] args)
		{       
            System.out.println("hello world A class");
	   }
}	


Programe 2:-

package pack1;
import pack2.A;
class Test
{
	public void m1()
	{
	System.out.println("M1 Test class method");
	}

	public static void main(String[] args)
		{        
		         new A().m2();
			    System.out.println("hello world Test class");
	   }
}	


 
C:\Users\dell1\Desktop>javac -d . A.java    //---->Observe this

C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>java pack1.Test
M2 Method A class
hello world Test class
 
  
EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17               Using A-class But not Compiled it before 
=========
NOTE:-
-----
PROGRAME=17
=========
 Programe:-1

package pack1;
import pack2.A;
class Test
{
	public void m1()
	{
	System.out.println("M1 Test class method");
	}

	public static void main(String[] args)
		{        
		         new A().m2();
			    System.out.println("hello world Test class");
	   }
}	

 
C:\Users\dell1\Desktop>javac -d . Test.java
Test.java:2: error: package pack2 does not exist // not compiled but using so 2 errors
import pack2.A;
            ^
Test.java:12: error: cannot find symbol
                         new A().m2();
                             ^
  symbol:   class A
  location: class Test
2 errors
 
 Programe:-2

 package pack2;
 public class A 
{
	public void m2()
	{
	System.out.println("M2 Method A class");
	}

	public static void main(String[] args)
		{       
            System.out.println("hello world A class");
	   }
}	



EXPLANATION:-
============
***************************-----END of--->17<--------***************************
Example=18          Using A-class But already Compiled it before 
=========
NOTE:-
-----
PROGRAME=18
=========
Programe:-1
 
 package pack2;   // using it in future so already compiled frist only.
 public class A 
{
	public void m2()
	{
	System.out.println("M2 Method A class");
	}

	public static void main(String[] args)
		{       
            System.out.println("hello world A class");
	   }
}
 
Programe:-2	

 package pack1;
import pack2.A;   // using here so compiled frist only
class Test
{
	public void m1()
	{
	System.out.println("M1 Test class method");
	}

	public static void main(String[] args)
		{        
		         new A().m2(); // using here so compiled frist only
			    System.out.println("hello world Test class");
	   }
}	

 
C:\Users\dell1\Desktop>javac -d . A.java // see here have already compiled frist only 
                                           //coz am using in Test class

C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>java pack1.Test
M2 Method A class
hello world Test class

C:\Users\dell1\Desktop>


EXPLANATION:-
============
***************************-----END of--->18<--------***************************
Example=19      Even though we are not using A-class in the Test-class
=========       just using in the Test class-import statement it will give error.
                Conclusion is wat ever you use in the source file
				wheather import statemet or inside class frist compile it.
NOTE:-
-----
PROGRAME=19
=========
 Programe :-1
 
 package pack1;
import pack2.A;
class Test
{
	public void m1()
	{
	System.out.println("M1 Test class method");
	}

	public static void main(String[] args)
		{        
		        
			    System.out.println("hello world Test class");
	   }
}	

 
C:\Users\dell1\Desktop>javac -d . Test.java // not compiled A-class before using it.
Test.java:2: error: package pack2 does not exist
import pack2.A;
            ^
1 error
 
 Programe :-2

  package pack2;
 public class A 
{
	public void m2()
	{
	System.out.println("M2 Method A class");
	}

	public static void main(String[] args)
		{       
            System.out.println("hello world A class");
	   }
}	



EXPLANATION:-
============
***************************-----END of--->19<--------***************************
Example=20    Within the same package also all above few cases are having same magic tricks
=========
NOTE:- Within the same package if we are using then have to compile before using
-----
PROGRAME=20
=========
 Programe:-1
 
package pack1;
import pack1.A;
class Test
{
	public void m1()
	{
	System.out.println("M1 Test class method");
	}

	public static void main(String[] args)
		{        
		        new A().m2();
			    System.out.println("hello world Test class");
	   }
}	

C:\Users\dell1\Desktop>javac -d . Test.java //not compiled A-class but using,so error like this
Test.java:2: error: cannot find symbol
import pack1.A;
            ^
  symbol:   class A
  location: package pack1
Test.java:12: error: cannot find symbol
                        new A().m2();
                            ^
  symbol:   class A
  location: class Test
2 errors  
 
 Programe:-2    //not compiled A-class

 package pack1;   
 public class A  //not compiled A-class
{
	public void m2()
	{
	System.out.println("M2 Method A class");
	}

	public static void main(String[] args)
		{       
            System.out.println("hello world A class");
	   }
}	



EXPLANATION:-
============
***************************-----END of--->20<--------***************************
Example=21                 When both files are using one another
=========                  we can t do anything.
NOTE:-
-----
PROGRAME=21
=========
Programe:-1
package pack1;
import pack1.A;
class Test
{
	public void m1()
	{
	System.out.println("M1 Test class method");
	}

	public static void main(String[] args)
		{        
		        new A().m2();
			    System.out.println("hello world Test class");
	   }
}	


C:\Users\dell1\Desktop>javac -d . Test.java
Test.java:2: error: cannot find symbol
import pack1.A;
            ^
  symbol:   class A
  location: package pack1
Test.java:12: error: cannot find symbol
                        new A().m2();
                            ^
  symbol:   class A
  location: class Test
2 errors

C:\Users\dell1\Desktop>javac -d . A.java
A.java:2: error: cannot find symbol
import pack1.Test;
            ^
  symbol:   class Test
  location: package pack1
1 error

Programe:-2

 package pack1;
import pack1.Test;
 public class A 
{
	public void m2()
	{
	System.out.println("M2 Method A class");
	}

	public static void main(String[] args)
		{       
            System.out.println("hello world A class");
	   }
}	


EXPLANATION:-
============
 
***************************-----END of--->21<--------***************************
Example=22 From 132 continue PDF, 18th page
=========      
Default Classes:
If a class declared as the default then we can access that class only within the current
package,outside package we cannot acess.
hence default access is also known as "package level access".
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
