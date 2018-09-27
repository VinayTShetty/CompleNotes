TOPIC:-JAVA LANG PACKAGE (equals () method Part 1)
--------
VIDEO NO=3
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=NO(56:21)
-----------------
Later will complete..

IMPORTANT EXAMPLES:-

See long book pages for all notes of this video form page 142 upto ending....
Example=4
---------

----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============
we can use .equals method to check equality of two objects.

If our class doesnt contain equlas method Object class .equlas() method will be executed..

If we are not overriding .equlas method in our class, then object class .equals() method
will be executed

Ex:- obj1.equals(obj2)

DP:-
---
== operator meant for reference comparison(See where this topic has been discussed in video,== operator)

.equals meant for content comparison.(If we override only)
But .equals () method of Object class is implemented to perform REFERENCE COMPARISON
but not content comparison

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
class Student
  {
    String name;
    int rollno;
  Student(String name,int rollno)
    {
     this.name=name;
     this.rollno=rollno;
    }
    public static void main(String[] args)
		{
    Student s1=new Student("Durga",101);
    Student s2=new Student("Ravi",102);
    Student s3=new Student("Durga",101);
    Student s4=s1;
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));
       }
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Student
false
false
true

C:\Users\DELL\Desktop>

EXPLANATION:-
============
.equals meant for content comparison. 

But .equals () method of Object class is implemented to perform REFERENCE COMPARISON
but not content comparison


If our class does nt contain .equals() method then Object class .equals() method will be executed..
In Example (2) Object class .equals() method is executed,which is meant For reference comparison.
so it performs REFERENCE COMPARISON.(i.e Address comparison).,but not CONTENT COMPARISON.

Address Comparison:-If 2 reference s are pointing to the same Object then only .equlas() method return
true..

By default Obejct class is meant up for REFERENCE COMPARISON.

If both  Object reference are pointing to same Object then only .equals() method  return s true..(s1.equals(s4));

Even though both Object are different even though content is same .equlas() method return false..//(s1.equals(s3));


VP:-If both address of Object s are pointing to same Object then .equaLS()  return true..
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
Recomended for .equals() method is Content Comparison but not Reference comparison.
BCoz == operator is already there for Reference comparison again using .equals() method is not good parctice..

Base on our requirement we can override .equals() method for Content comparison.

But default .equals() method  implementation is  Reference comparison.


PROGRAME=3
=========
overriding .equals () method to perform Content comparison..


Step 1:-
------
public boolean equals(Object obj)
{

}



EXPLANATION:-
============
To override .equals () method frist we have to know the Meaning of content equality i.e., 

whether we have to check the 
names are equal,  roll numbers then both are equal.
names are equal, roll numbers,father s name then  are equal.
names are equal  roll numbers ,father s name, motheres name, then both  are equal.
...etc depending on properties and requirements.
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----


PROGRAME=4
=========

Case 1:-
--------
While overriding .equals() method  make sure that we can change the argument or not..
that is If we change the argument is it valid overriding or overloading check once please..

public boolean equals(Object obj)
{


}
---------------------------------------------------------------------------
Case 2:-.equals() method Exact method is going to get the chance frist..
--------
class Student
  {
    String name;
    int rollno;
	
	public boolean equals(Student s)
	  {
	  
	     return true;
	  }
	  public boolean equals(Object obj)
	  {
	  
	     return false;
	  }


	    Student(String name,int rollno)
    {
     this.name=name;
     this.rollno=rollno;
    }
    public static void main(String[] args)
		{
		System.out.println("Main method 123");
    Student s1=new Student("Durga",101);
    Student s2=new Student("Ravi",102);
    Student s3=new Student("Durga",101);
    Student s4=s1;
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));
       }
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Student
Main method 123
true
true
true

C:\Users\DELL\Desktop>
---------------------------------------------------------------------------
Case 3:- Student class .equals() method is getting the chace...
--------
class Student
  {
    String name;
    int rollno;

	  public boolean equals(Object obj)
	  {
	  
	     return false;
	  }


	    Student(String name,int rollno)
    {
     this.name=name;
     this.rollno=rollno;
    }
    public static void main(String[] args)
		{
		System.out.println("Main method 123");
    Student s1=new Student("Durga",101);
    Student s2=new Student("Ravi",102);
    Student s3=new Student("Durga",101);
    Student s4=s1;
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));
       }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Student
Main method 123
false
false
false

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

Page--->148 and 147 point 3..

class X //-------->String class
{
	void m1()  //.equals () method
		{
	System.out.println("X");
	    }
}

class Y //-------->Student class
{
	void m1()  //.equals () method
	{
		System.out.println("Y");
	}
	public static void main(String[] args)
	{
	    X x=new X();
		x.m1();333333333333333333
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Y
X

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
class Student
  {
    String name;
    int rollno;
Student(String name,int rollno)
     {
      this.name=name;
      this.rollno=rollno;
    }
	      public boolean equals(Object obj)
	  {
       String name1=this.name;
       int rollno1 =this.rollno;
	   Student s=(Student)obj;
	   String name2=s.name;
	   int rollno2=s.rollno;
	   if (name1.equals(name2)&&rollno1==rollno2)
	    {
		   return true;
	    }
		else 
		  {
		    return false;
		  }
	  }
	  public static void main(String[] args)
		{
	System.out.println("Our class equals method");
    Student s1=new Student("Durga",101);
    Student s2=new Student("Ravi",102);
    Student s3=new Student("Durga",101);
    Student s4=s1;
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));
       }
}




 //If we commenting .equals method.
C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Student

Object class .equlas() method   // reference comparison
false
false
true


 
C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Student

Our class equals method  //content comparison
false
true
true

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----

Our class .equlas() method..

PROGRAME=7
=========
class Student
  {
    String name;
    int rollno;
Student(String name,int rollno)
     {
      this.name=name;
      this.rollno=rollno;
    }
	      public boolean equals(Object obj)
	  {
       String name1=this.name;
       int rollno1 =this.rollno;
	   Student s=(Student)obj;
	   String name2=s.name;
	   int rollno2=s.rollno;
	   if (name1.equals(name2)&&rollno1==rollno2)
	    {
		   return true;
	    }
		else 
		  {
		    return false;
		  }
	  }
	  public static void main(String[] args)
		{
	System.out.println("Our class equals method");
    Student s1=new Student("Durga",101);
    Student s2=new Student("Ravi",102);
    Student s3=new Student("Durga",101);
    Student s4=s1;
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));


    System.out.println(s1.equals("Durga"));

       }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Student
Our class equals method
false
true
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to Student
        at Student.equals(Test.java:14)
        at Student.main(Test.java:37)

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
Object class .equlas() method.

PROGRAME=8
=========

class Student
  {
    String name;
    int rollno;
Student(String name,int rollno)
     {
      this.name=name;
      this.rollno=rollno;
    }
	  public static void main(String[] args)
		{
	System.out.println("Object class equals method");
    Student s1=new Student("Durga",101);
    Student s2=new Student("Ravi",102);
    Student s3=new Student("Durga",101);
    Student s4=s1;



    System.out.println(s1.equals("Durga"));

       }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Student
Object class equals method
false

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
Overcomming problems in  Example 7 by using try-catch block..

PROGRAME=9
=========
class Student
  {
    String name;
    int rollno;
Student(String name,int rollno)
     {
      this.name=name;
      this.rollno=rollno;
    }
	      public boolean equals(Object obj)
	  {
			
			  try
		{
       
	   
	   String name1=this.name;
       int rollno1 =this.rollno;
	   Student s=(Student)obj;
	   String name2=s.name;
	   int rollno2=s.rollno;
	         
			 if (name1.equals(name2)&&rollno1==rollno2)
	          { return true; }

		    else 
		      { return false; }
		}
			  
			  catch(ClassCastException cce){return false;}
	  }
	    
		public static void main(String[] args)
		{
	System.out.println("Our class equals method");
    Student s1=new Student("Durga",101);
    Student s2=new Student("Ravi",102);
    Student s3=new Student("Durga",101);
    Student s4=s1;
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));


    System.out.println(s1.equals("Durga"));

       }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Student
Our class equals method
false
true
false

C:\Users\DELL\Desktop>

EXPLANATION:-
============
If we are passing different class Object our class .equals() method should not rise ClassCastException.
It should return false...
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
When we are passing null.

PROGRAME=10
=========
class Student
  {
    String name;
    int rollno;
Student(String name,int rollno)
     {
      this.name=name;
      this.rollno=rollno;
    }
	      public boolean equals(Object obj)
	  {
			
			  try
		{
       
	   
	   String name1=this.name;
       int rollno1 =this.rollno;
	   Student s=(Student)obj;
	   String name2=s.name;
	   int rollno2=s.rollno;
	         
			 if (name1.equals(name2)&&rollno1==rollno2)
	          { return true; }

		    else 
		      { return false; }
		}
			  
			  catch(ClassCastException cce){return false;}
	  }
	    
		public static void main(String[] args)
		{
	System.out.println("Our class equals method");
    Student s1=new Student("Durga",101);
    Student s2=new Student("Ravi",102);
    Student s3=new Student("Durga",101);
    Student s4=s1;
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals("Durga"));



    System.out.println(s1.equals(null));

       }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Student
Our class equals method
false
true
false
Exception in thread "main" java.lang.NullPointerException
        at Student.equals(Test.java:20)
        at Student.main(Test.java:46)

C:\Users\DELL\Desktop>
----------------------------------------------------------------------------------------------
Over Comming the above problem..
-------------------------------
class Student
  {
    String name;
    int rollno;
Student(String name,int rollno)
     {
      this.name=name;
      this.rollno=rollno;
    }
	      public boolean equals(Object obj)
	  {
			
			  try
		{
       
	   
	   String name1=this.name;
       int rollno1 =this.rollno;
	   Student s=(Student)obj;
	   String name2=s.name;
	   int rollno2=s.rollno;
	         
			 if (name1.equals(name2)&&rollno1==rollno2)
	          { return true; }

		    else 
		      { return false; }
		}
			  
			  catch(ClassCastException cce){return false;}
			  catch(NullPointerException npe){return false;}
	  }
	    
		public static void main(String[] args)
		{
	System.out.println("Our class equals method");
    Student s1=new Student("Durga",101);
    Student s2=new Student("Ravi",102);
    Student s3=new Student("Durga",101);
    Student s4=s1;
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals("Durga"));



    System.out.println(s1.equals(null));

       }
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Student
Our class equals method
false
true
false
false

C:\Users\DELL\Desktop>

EXPLANATION:-
============

***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
Object class .equals() method behaviour..

PROGRAME=11
=========
class Student
  {
    String name;
    int rollno;
Student(String name,int rollno)
     {
      this.name=name;
      this.rollno=rollno;
    }
	   public static void main(String[] args)
		{
	System.out.println("Object class equals method");
    Student s1=new Student("Durga",101);
    Student s2=new Student("Ravi",102);
    Student s3=new Student("Durga",101);
    Student s4=s1;
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    
	System.out.println(s1.equals("Durga"));
    
	System.out.println(s1.equals(null));

       }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Student
Object class equals method
false
false
false
false

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
We can overrride .equals () method for content comparison..

So While overriding .equals() method for content comparison..
While overriding .equlas() method for Content comparison we have to take care about the following.
1)wat is the meaning of equality...?
    Wheather we have to check only names,or only rollno or both..

2)If we are passing different types of Object our .equals() method should not rise ClassCastException that is we 
have to handle ClassCastException to return false..

3)If we are passing null argument our .equlals() method should not rise null pointer Exception.
that is we have to handle NullPointerException to return false..

The following is the proper way of overriding equlas() method of Student class for content comparison...

ex:-
public boolean equlas(Object obj)
{
   try{
    String name1=this.name; //constructor concept using this.no in right side make a note...
	int rollno1=this.rollno;
	Student s=(Student)Obj;
	String name2=s.name;
	int rolln2=s.rollno;
	if(name1.equlas(name2)&&rollno1==rollno2
	   {
		return true;
	   }
	   else{
	       return false;
	      }
   }
   catch(ClassCastException cce){return false}
   catch(NullPointerException npe){return false}
}
-----------
    Student s1=new Student("Durga",101);
    Student s2=new Student("Ravi",102);
    Student s3=new Student("Durga",101);
    Student s4=s1;
    System.out.println(s1.equals(s2));//false
    System.out.println(s1.equals(s3));//true
    
	System.out.println(s1.equals("Durga"));//false
    
	System.out.println(s1.equals(null));//false
------------------------------------------------
we have to understand the meaning of equality..

we have understand our programe requirement 
name should be same
name and rollno should be same 
name rollno and father s name should be same..
etc..
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
Acessing the instance variables directly..So Code will be small...

PROGRAME=13
=========
class Student
  {
    String name;
    int rollno;
Student(String name,int rollno)
     {
      this.name=name;
      this.rollno=rollno;
    }
	      public boolean equals(Object obj)
	  {
			
			  try
		{
       
	   Student s=(Student)obj;
	   String name2=s.name;
	   int rollno2=s.rollno;
	         
			 if (name.equals(s.name)&&rollno==s.rollno)
	          { return true; }

		    else 
		      { return false; }
		}
			  
			  catch(ClassCastException cce){return false;}
			  catch(NullPointerException npe){return false;}
	  }
	    
		public static void main(String[] args)
		{
	System.out.println("Our class equals method");
    Student s1=new Student("Durga",101);
    Student s2=new Student("Ravi",102);
    Student s3=new Student("Durga",101);
    Student s4=s1;
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));
    System.out.println(s1.equals("Durga"));



    System.out.println(s1.equals(null));

       }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Student
Our class equals method
false
true
true
false
false

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----

PROGRAME=14
=========

EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
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
