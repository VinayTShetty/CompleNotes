TOPIC:-SERIALIZATION 
--------
VIDEO NO=3
---------

Customized Serialization(Part -1)(1:24:54)

NUMBER OF PICTURES=NULL
------------------

VIDEO COMPLETED=YES
-----------------
(Just check it once)

IMPORTANT EXAMPLES:-

----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============
Page 298

Page 298 


class  Account implements Serializable
{
	String Username="Vinay";
    transient String Password="Gosling";//Here password is secure,so declare with transient
}


Creating one Account name

Account a1=new Account();
Sopln(a1.username);
Sopln(a1.password);

o/p:-
-----
Vinay
Gosling.

Assume we want to seriliaze this account object.

Account a1=new Account();
FileOutputStream fos=new FileOutputStream ("abc.ser");
ObjectOutputStream oos=new FileOutputStream (oos);
oos.WritObject(a1);


Here JVM is ignore transient variable value and save the default value to file.
here password variable is transient so it saves password as null to "abc.ser" during serialization.


De-serialize


FileInputStream fos=new FileInputStream ("abc.ser");
ObjectInputStream oos=new FileInputStream (oos);
Account a2=(Account)oos.readObject(a1);
Sopln(a2.username+""+a2.password);

o/p:-
---
Vinay
null


Here password is null after de-serilaization.
so there is loss of information.
due to declaring password variable as transient..



If we want to obtain the loss of information happened during
de-serilization then we need to go for Customized de-serilization.

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
import java.io.*;
class Test implements Serializable {
	String userName = "Vinay";
	transient String pwd = "Gosling";
}

class CustomizedSerializeDemo {
	public static void main(String[] args) throws Exception {
		Test a1 = new Test();
		System.out.println(a1.userName + "........." + a1.pwd);
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Test a2 = (Test) ois.readObject();
		System.out.println(a2.userName + "........." + a2.pwd);
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java CustomizedSerializeDemo
Vinay.........Gosling
Vinay.........null

C:\Users\DELL\Desktop>


EXPLANATION:-
============

During default Serilization there may be a chance of loss of informatio 
Bcoz of transient keyword.

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
customized Serilization


Durga sending money from senu,hiding money  under mango and sending to his father.. 
here sender side i.e durga did some extra work by hiding money and placing money..

At reciever side his dad did nt got money directly he got by removing mangos and
wrapping off plastic covers..
Later he got money..receiever also did some eztra work.


Doing Extra work both at sender side and receiever side.
we can acheive customized serilization..
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========


EXPLANATION:-
============


Page 299:-
---------


We can implement customized serilization by using the following 2 methods.

1)private void WriteObject(ObjectOutputStream os) throws Exception

This method will be executed automatically at the time serialization.
hence at the time of serilization.If we want to perform any activity ,we have to define that 
in inside method only.



2)private void ReadObject(ObjectInputStream is) throws Exception

This method will be executed automatically at the time De-serialization.
hence at the time of De-serilization.If we want to perform any activity ,we have to define that 
in inside method only.





Important Point:-
1) Point

The above methods are callback methods bcoz these are executed automatically by the
JVM.

Here 2 mehtods 
1)private void WriteObject(ObjectOutputStream os) throws Exception
2)private void ReadObject(ObjectInputStream is) throws Exception

will be executed automatiacally by the JVM..
Programmer cannot call this method..

These types of methods are called call-back methods.

Ex:-
main method-->JVM responsible to call mmain method.
lifecyclemethod or servlet method----> unit method is responsible.

destryoy method,service method()...etc




2)Point(** important point)


While performing which object serialization,we have to do extra work.in the corresponding class
we have to define below 2 methods
EX:-
While performing Account object serialization,if we require to do extra work.
we have to write these below 2 methods in Account class.

If we write in some other class.It might not work

1)private void WriteObject(ObjectOutputStream os) throws Exception
2)private void ReadObject(ObjectInputStream is) throws Exception

***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
In the below programe Account Object can provide proper username and pwd..

PROGRAME=5
=========

import java.io.*;
class Account implements Serializable {
	String userName = "Bhaskar";
	transient String pwd = "kajal";


     //Point:-1
	private void writeObject(ObjectOutputStream os) throws Exception
	{
		os.defaultWriteObject();    //do default serialization frist.
		String epwd = "123" + pwd;  //prepare encrypted password 
		os.writeObject(epwd);       //write encrypted passwrd manually to file.
	}


//Point:-2
	private void readObject(ObjectInputStream is) throws Exception 
	{
		is.defaultReadObject();                 //do default De-serialization frist.
		String epwd = (String) is.readObject(); // Read encrypted password 
		pwd = epwd.substring(3);                //assign  decripted epwd to pwd.
		                                        //remove 3 Strings from String using SubString
							                    //and assign to pwd.
	}
}

class Test {
	public static void main(String[] args) throws Exception {
		
		Account a1 = new Account();
		System.out.println(a1.userName + "........." + a1.pwd);
                           //durga                      //anushka


		//Before Serialization. //Point 1
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);



		//After Serialization.  //Point 2
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		System.out.println(a2.userName + "........." + a2.pwd);
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Bhaskar.........kajal
Bhaskar.........kajal

C:\Users\DELL\Desktop>

EXPLANATION:-
============

Point:-1
Whenever we are trying to serialize an Account Object JVM is gonna check
wheather there is a writeObject () method is there in class..If its there then 
JVM gonna Execute that method..

Point 2:-
When ever we are De-serializing an Account Object JVM is gonna check wheather there is 
readObject() method is there in Acoount class.
If its there JVM is gonna Execute readObject() method automatically.




Here Account.class file should be avaliable at in the begining only.

Coz at sendr side writeObject() method will Execute.
Coz at receiever side ReadObject() method will Execute.


Account.class file should should be avaliable at senser and reciever
in the begining only.





Outside of class Programmer cannot call private methods.
But JVM can call private methods outside of class,that flexibity/ability is there for JVM.

1)private void WriteObject(ObjectOutputStream os) throws Exception
2)private void ReadObject(ObjectInputStream is) throws Exception


***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----

No customized Serialization coz we have commented the methods..

PROGRAME=6
=========
import java.io.*;
class Account implements Serializable {
	String userName = "Bhaskar";
	transient String pwd = "kajal";


//commenting customized serilization methods



	/*private void writeObject(ObjectOutputStream os) throws Exception
	{
		os.defaultWriteObject();
		String epwd = "123" + pwd;
		os.writeObject(epwd);
	}

	private void readObject(ObjectInputStream is) throws Exception 
	{
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		pwd = epwd.substring(3);
	}*/
}

class Test {
	public static void main(String[] args) throws Exception {
		Account a1 = new Account();
		System.out.println(a1.userName + "........." + a1.pwd);



		//Before Serialization.
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		//After Serialization.
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		System.out.println(a2.userName + "........." + a2.pwd);
	}
}




C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Bhaskar.........kajal
Bhaskar.........null

C:\Users\DELL\Desktop>

EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
import java.io.*;
class Account implements Serializable {
	String userName = "Bhaskar";
	transient String pwd = "kajal";



}

class Test {
	public static void main(String[] args) throws Exception {
		Account a1 = new Account();
		System.out.println(a1.userName + "........." + a1.pwd);



		//Before Serialization.
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		//After Serialization.
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		System.out.println(a2.userName + "........." + a2.pwd);
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Bhaskar.........kajal
Bhaskar.........null

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
import java.io.*;
class Account implements Serializable {
	String userName = "Bhaskar";
	transient String pwd = "kajal";

	//commenting customized serilization method


/*
	private void writeObject(ObjectOutputStream os) throws Exception
	{
		os.defaultWriteObject();
		String epwd = "123" + pwd;
		os.writeObject(epwd);
	}*/


   
	private void readObject(ObjectInputStream is) throws Exception 
	{
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		pwd = epwd.substring(3);
	}



}

class Test {
	public static void main(String[] args) throws Exception {
		Account a1 = new Account();
		System.out.println(a1.userName + "........." + a1.pwd);



		//Before Serialization.
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		//After Serialization.
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		System.out.println(a2.userName + "........." + a2.pwd);
	}
}





C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Bhaskar.........kajal
Exception in thread "main" java.io.OptionalDataException
        at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1496)
        at java.io.ObjectInputStream.readObject(ObjectInputStream.java:422)
        at Account.readObject(Test.java:22)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at java.io.ObjectStreamClass.invokeReadObject(ObjectStreamClass.java:1058)
        at java.io.ObjectInputStream.readSerialData(ObjectInputStream.java:2122)
        at java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2013)
        at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1535)
        at java.io.ObjectInputStream.readObject(ObjectInputStream.java:422)
        at Test.main(Test.java:45)

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========

import java.io.*;
class Account implements Serializable {
	String userName = "Bhaskar";
	transient String pwd = "kajal";

	//commenting customized serilization method



	private void writeObject(ObjectOutputStream os) throws Exception
	{
		os.defaultWriteObject();
		String epwd = "123" + pwd;
		os.writeObject(epwd);
	}


  /* 
	private void readObject(ObjectInputStream is) throws Exception 
	{
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		pwd = epwd.substring(3);
	}*/



}

class Test {
	public static void main(String[] args) throws Exception {
		Account a1 = new Account();
		System.out.println(a1.userName + "........." + a1.pwd);



		//Before Serialization.
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		//After Serialization.
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		System.out.println(a2.userName + "........." + a2.pwd);
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Bhaskar.........kajal
Bhaskar.........null

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
Instead of private modifier if we are using any other modifier these 2 methods 
won t work..
public void writeObject(ObjectOutputStream os) throws Exception
public void readObject(ObjectInputStream is) throws Exception 

Coz JVM undesrtable form is private.

private void writeObject(ObjectOutputStream os) throws Exception
private void readObject(ObjectInputStream is) throws Exception 


PROGRAME=10
=========
import java.io.*;
class Account implements Serializable {
	String userName = "Bhaskar";
	transient String pwd = "kajal";

	//commenting customized serilization method



	public void writeObject(ObjectOutputStream os) throws Exception
	{
		os.defaultWriteObject();
		String epwd = "123" + pwd;
		os.writeObject(epwd);
	}


   
	public void readObject(ObjectInputStream is) throws Exception 
	{
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		pwd = epwd.substring(3);
	}



}

class Test 
	{
	public static void main(String[] args) throws Exception {
		Account a1 = new Account();
		System.out.println(a1.userName + "........." + a1.pwd);



		//Before Serialization.
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		//After Serialization.
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		System.out.println(a2.userName + "........." + a2.pwd);
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Bhaskar.........kajal
Bhaskar.........null

C:\Users\DELL\Desktop>

EXPLANATION:-
============

***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----


PROGRAME=11
=========
import java.io.*;
class Account implements Serializable {
	String userName = "Bhaskar";
	transient String pwd = "kajal";

	//commenting customized serilization method



	public void writeObject(ObjectOutputStream os) throws Exception
	{
		os.defaultWriteObject();
		String epwd = "123" + pwd;
		os.writeObject(epwd);
	}


   
	public void readObject(ObjectInputStream is) throws Exception 
	{
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		pwd = epwd.substring(3);
	}



}

class Test 
	{
	public static void main(String[] args) throws Exception {
		Account a1 = new Account();
		System.out.println(a1.userName + "........." + a1.pwd);



		//Before Serialization.
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		//After Serialization.
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		System.out.println(a2.userName + "........." + a2.pwd);
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Bhaskar.........kajal
Bhaskar.........null

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

Here once delete Account.class file after compiling and run it..
See wats the output.. did nt check it..check once..


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
