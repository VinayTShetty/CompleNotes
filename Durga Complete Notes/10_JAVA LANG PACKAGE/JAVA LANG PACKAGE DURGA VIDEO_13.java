TOPIC:-JAVA LANG PACKAGE (clone)
--------		
VIDEO NO=13
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=1:2:54
-----------------
(46:58)
IMPORTANT EXAMPLES:-
Example=9(d1.c.j)
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============
clone() method is present in Object class.

The process exactly duplicate object is called cloning.
The main purpose of cloning is to maintain back up copy and to preserve the original state of an Object..

We can perform cloning by using clone() method of Object class.
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
Previous Ratatn video:-

PROGRAME=2
=========
class Test
{ 
    
public static void main(String[] args)
      {
	     System.out.println(10+20);
	     System.out.println("Ratan"+"Durga");
	     System.out.println(10+20+"Durga"+"Ratan"+100+200);
	     
		 int a=10;
		 int b=20;
		 int c=30;
		 System.out.println(a);
		 System.out.println(a+"---------");
	     System.out.println(a+"---------"+b);
	     System.out.println(a+"---------"+b+"-------------");
	     System.out.println(a+"---------"+b+"-------------"+c);
      } 
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
30
RatanDurga
30DurgaRatan100200
10
10---------
10---------20
10---------20-------------
10---------20-------------30

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
class Test
{ 
	int x=10;
	int y=20;
    
public static void main(String[] args)
      {
	     Test t =new Test();
		 Test t2=t1;//Point:-1
	  } 
}

EXPLANATION:-
============
Point:-1
This assignment is not called as cloning.
We are creating another reference variable for Test object.

Using t2 if we are performing any changes to the Test Object,(i.e x=1111)
and we are trying to acess x using t then,
changes performed by t2 will be reflected to t.

As t and t2 both are pointing to same Object..

Diagram:-

Changed value:-
---------------
class Test
{ 
	int x=10;
	int y=20;
    
public static void main(String[] args)
      {
	     Test t =new Test();
		 Test t2=t;//Point 1
		 t2.x=111;
		 System.out.println("t-->"+t.x);
		 System.out.println("t2-->"+t2.x);
	  } 
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
t-->111
t2-->111

C:\Users\DELL\Desktop>

Point 1:-We are creating duplicate reference variable but not duplicate Object.
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
Where ever throws keyword is there for predefined methods its checked Exception.

Durga sir told so verify once(20:22)
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
Page 244 progames 

PROGRAME=5
=========
Case 1:-
-------
class Test
{ 
	int x=10;
	int y=20;
    
public static void main(String[] args)
      {
	     Test t1 =new Test();
		 Test t2=t1.clone();
         t2.x=999;
         t2.y=111;
		 System.out.println(t1.x+"------"+t1.y);
		 System.out.println(t2.x+"------"+t2.y);
     } 
}


C:\Users\DELL\Desktop>javac Test.java
Test.java:9: error: incompatible types: Object cannot be converted to Test
                 Test t2=t1.clone();
                                 ^
1 error

C:\Users\DELL\Desktop>


Case 2:-
--------
class Test
{ 
	int x=10;
	int y=20;
    
public static void main(String[] args)
      {
	     Test t1 =new Test();
		 Test t2=(Test)t1.clone();
         t2.x=999;
         t2.y=111;
		 System.out.println(t1.x+"------"+t1.y);
		 System.out.println(t2.x+"------"+t2.y);
     } 
}


C:\Users\DELL\Desktop>javac Test.java
Test.java:9: error: unreported exception CloneNotSupportedException; must be caught or declared to be thrown
                 Test t2=(Test)t1.clone();
                                       ^
1 error

C:\Users\DELL\Desktop>

Case 3:-(No compile time errror,its run time exception seee it some imporatant case)
-------
class Test
{ 
	int x=10;
	int y=20;
    
public static void main(String[] args) throws CloneNotSupportedException
      {
	     Test t1 =new Test();
		 Test t2=(Test)t1.clone();
         t2.x=999;
         t2.y=111;
		 System.out.println(t1.x+"------"+t1.y);
		 System.out.println(t2.x+"------"+t2.y);
     } 
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Exception in thread "main" java.lang.CloneNotSupportedException: Test
        at java.lang.Object.clone(Native Method)
        at Test.main(Test.java:9)

C:\Users\DELL\Desktop>

Case 4:-
-------
class Test implements Cloneable
{ 
	int x=10;
	int y=20;
    
public static void main(String[] args) throws CloneNotSupportedException
      {
	     Test t1 =new Test();
		 Test t2=(Test)t1.clone();
         t2.x=999;
         t2.y=111;
		 System.out.println(t1.x+"------"+t1.y);
		 System.out.println(t2.x+"------"+t2.y);
     } 
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
10------20
999------111

C:\Users\DELL\Desktop>

EXPLANATION:-
============
We can perform cloning opertion only on cloneable objects.
An object is said to be cloneable only if the corresponding class implements Cloneable interface.
Cloneable is present in java.lang package.
Cloneable interface  does nt contain any methods,so its a marker interface.

If we are trying to perform cloning for non cloneable Objects then we ll get RE saying CloneNotSupportedException

Serializable present in Io package.

***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
EXPLANATION:-
============
Page 15 shallow cloning 3 rd Point:-

Read this..(Notes Ignore)

If the main object contain any reference variable then the corresponding object
won't' be created just duplicate reference variable will be created by pointing to old
contained object..

object class is meant for shallow cloning.
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
EXPLANATION:-
============
In page 15 shallow cloniong programe 
we are cloning Dog Object so Dog class must implements cloneable..

and we are not performing any cloning on Cat Object so cat class don t need to implement cloneable interface..


***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
EXPLANATION:-
============
Doubt:-Vinay


cloneable is marker interface that is it s not having any abstract methods so how we can implement it.
its an empty interface
how its possible to implement an empty interface..
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
some changes as compared to notes in Durga sir coz its  not compiling...
Page 15.

Diagram notes 254


Object class is meant up for Shallow cloning.
PROGRAME=9
=========
 class Cat {
    int j ;
  Cat(int j)
	  {
	  this.j=j ;                                                    
     }                                                             
}                                                             
                                                              
class Dog implements Cloneable {                               
     Cat c ;                                                       
     int i ;                                                       
    Dog(Cat c , int i) 
		{                                          
       this.c=c ;                                                    
      this.i=i ;                                                    
      }                                                             
   public Object clone( ) throws CloneNotSupportedException
	   {    
      return super.clone( );                                        
       }                                                             
}                                                             
                                                              
class Test	
{                                          
  public static void main(String[ ] ar) throws CloneNotSupportedException
	  {                       
     Cat c=new Cat(20) ;                                           
     Dog d1=new Dog(c , 10) ;					                     
     System.out.println(d1.i +"......"+d1.c.j); // 10......20 //Point :-1          
                                                              
     Dog d2=(Dog)d1.clone() ;            //Point a                         
                    
				//try this statement also (d2.i=888; according to schematic in 254 page no)										 
     d2.c.j=999;    //Point :-2         
     System.out.println(d2.i +"......"+d2.c.j); // 10......999      //Point :-3           
}                                                             
}                                                             
                                                              


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
10......20
10......999

C:\Users\DELL\Desktop>

EXPLANATION:-
============

DP:-In shallow cloninng by using cloned object reference (i.e d2) If we perform any change to the contained object
then those changes will be reflected to the main object.to overcome this problem we should go for Deep cloning.

(Deep cloning programmer is responsible to implement ,In Deep cloning even for the contained object duplicate copy will
be created)

//Point a:-We are creating a Dog Object by using clone method,



Point:-1,2,3 all are same terminology.


d1.c.j:-Dog class contain cat instance c,Which is an instatnce variable.
to acess instance variable of Dog class we need to create an Dog Object so we are creating d1,using that we are 
acessing c.c is a cat object so by using cat Object we can acess instance variable of cat class.

d2.c.j:-(Important concept calling like chaining reference..)




Create an Example like this for tutions sake..

Case 1)
class  x
{
Y y;

//create x object and acess y and using Y object referennce acess Y class instance values .i e int x..
}
class Y
{
	int x;
}


Case 2)

 public Object clone( ) throws CloneNotSupportedException
	   {    
      return super.clone( );   

	  In this type of example see the return type is super some kind of valid cases so try these in some basic examples.

***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============
Deep cloning:-
The process of exactly duplicate independent copy including contained object is called Deep cloning.
In Deep cloning if the main Object contains any primitive variables then in the cloned object duplicate copies wiil
be created.If the main Object conatins any reference variable then the corresponding contained object will be created in 
the cloned copy.
By defalut object class clone method is meant for shallow cloning,But we can implemet Deep cloining explicitly 
by overriding Clone () method  in our class.


***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
	 class Cat {
    int j ;
  Cat(int j)
	  {
	  this.j=j ;                                                    
     }                                                             
}                                                             
                                                              
class Dog implements Cloneable {                               
     Cat c ;                                                       
     int i ;                                                       
    Dog(Cat c , int i) 
		{                                          
       this.c=c ;                                                    
      this.i=i ;                                                    
      }                                                             
   public Object clone( ) throws CloneNotSupportedException
	   {    
          return super.clone( );   
       }                                                             
}                                                             
                                                              
class Test	
{                                          
  public static void main(String[ ] ar) throws CloneNotSupportedException
	  {                       
     Cat c=new Cat(20);                                           
     Dog d1=new Dog(c,10);		//Diagram 1			                     
     System.out.println(d1.i +"......"+d1.c.j); 
	 }                                                             
}                                                             



C:\Users\DELL\Desktop>javac TEst.java

C:\Users\DELL\Desktop>java Test
10......20

C:\Users\DELL\Desktop>

EXPLANATION:-
============
	Diagram 1:-

	Page 255 upto that line object will be formed in that style.

***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
	 class Cat {
    int j ;
  Cat(int j)
	  {
	  this.j=j ;                                                    
     }                                                             
}                                                             
                                                              
class Dog implements Cloneable {                               
     Cat c ;                                                       
     int i ;                                                       
    Dog(Cat c , int i) 
		{                                          
       this.c=c ;                                                    
      this.i=i ;                                                    
      }                                                             
   public Object clone( ) throws CloneNotSupportedException
	   {    
         Cat c1 =new Cat(c.j);
		 Dog d2=new Dog(c1,i);
		 return d2;
       }                                                             
}                                                             
                                                              
class Test	
{                                          
  public static void main(String[ ] ar) throws CloneNotSupportedException
	  {                       
     Cat c=new Cat(20) ;                                           
     Dog d1=new Dog(c , 10) ;					                     
     System.out.println("Before Cloning d1-->"+d1.i +"......"+d1.c.j); 
                                                              
     Dog d2=(Dog)d1.clone() ;                                     
     d2.i=888;                                                  
     d2.c.j=999;                                                  
     System.out.println("After cloning d2-->"+d2.i +"......"+d2.c.j); 
	 System.out.println("After Cloning d1-->"+d1.i +"......"+d1.c.j); 
}                                                             
}                                                             



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Before Cloning d1-->10......20
After cloning d2-->888......999
After Cloning d1-->10......20

C:\Users\DELL\Desktop>

EXPLANATION:-
============


***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----

	Some slight changes see here ,
		Point 1:-See here some slight change..
PROGRAME=13
=========

	 class Cat {
    int j ;
  Cat(int j)
	  {
	  this.j=j ;                                                    
     }                                                             
}                                                             
                                                              
class Dog implements Cloneable {                               
     Cat c ;                                                       
     int i ;                                                       
    Dog(Cat c , int i) 
		{                                          
       this.c=c ;                                                    
      this.i=i ;                                                    
      }                                                             
   public Object clone( ) throws CloneNotSupportedException
	   {    
         Cat c1 =new Cat(c.j);
		 Dog d2=new Dog(c,i);//some change see using c	//Point:-1 //diagram page 255
		 return d2;
       }                                                             
}                                                             
                                                              
class Test	
{                                          
  public static void main(String[ ] ar) throws CloneNotSupportedException
	  {                       
     Cat c=new Cat(20) ;                                           
     Dog d1=new Dog(c , 10) ;					                     
     System.out.println("Before Cloning d1-->"+d1.i +"......"+d1.c.j); 
                                                              
     Dog d2=(Dog)d1.clone() ;                                     
     d2.i=888;                                                  
     d2.c.j=999;                                                  
     System.out.println("After cloning d2-->"+d2.i +"......"+d2.c.j); 
	 System.out.println("After Cloning d1-->"+d1.i +"......"+d1.c.j); 
}                                                             
}                                                             


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Before Cloning d1-->10......20
After cloning d2-->888......999
After Cloning d1-->10......999

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
	Some error see..

PROGRAME=14
=========
 class Cat {
    int j ;
  Cat(int j)
	  {
	  this.j=j ;                                                    
     }                                                             
}                                                             
                                                              
class Dog implements Cloneable {                               
     Cat c ;                                                       
     int i ;                                                       
    Dog(Cat c , int i) 
		{                                          
       this.c=c ;                                                    
      this.i=i ;                                                    
      }                                                             
   public Object clone( ) throws CloneNotSupportedException
	   {    
         Cat c =new Cat(c.j);// Here preference is going for local variables see..
		 Dog d2=new Dog(c,i);
		 return d2;
       }                                                             
}                                                             
                                                              
class Test	
{                                          
  public static void main(String[ ] ar) throws CloneNotSupportedException
	  {                       
     Cat c=new Cat(20) ;                                           
     Dog d1=new Dog(c , 10) ;					                     
     System.out.println("Before Cloning d1-->"+d1.i +"......"+d1.c.j); 
                                                              
     Dog d2=(Dog)d1.clone() ;                                     
     d2.i=888;                                                  
     d2.c.j=999;                                                  
     System.out.println("After cloning d2-->"+d2.i +"......"+d2.c.j); 
	 System.out.println("After Cloning d1-->"+d1.i +"......"+d1.c.j); 
}                                                             
}                                                             


C:\Users\DELL\Desktop>javac Test.java
Test.java:19: error: variable c might not have been initialized
         Cat c =new Cat(c.j);
                        ^
1 error

C:\Users\DELL\Desktop>


Coz assignment operation is always from right to left,so inside the arguments its showing 
CFS.. i guess so use this might be a reason..

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
