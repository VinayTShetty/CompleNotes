TOPIC:-File I/O
--------
VIDEO NO=1
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=NO
-----------------


Partially Completed and some points such as txt file we handle,wat about other files..?
(57:01)
IMPORTANT EXAMPLES:-

Example=6


Example=15 //Not Understood
Example=16// Not Understood


Example=17// See where its pointing...
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========

1 st Run
---------
import java.io.*;
class Test 
{
	public static void main(String[] args) throws IOException
	{
		File f =new File("abc.txt");
		System.out.println(f.exists());
		System.out.println("Hello World!");
		f.createNewFile();
		System.out.println(f.exists());
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
false
Hello World!
true

C:\Users\DELL\Desktop>


2nd Run
---------
import java.io.*;
class Test 
{
	public static void main(String[] args) throws IOException
	{
		File f =new File("abc.txt");
		System.out.println(f.exists());
		System.out.println("Hello World!");
		f.createNewFile();// creating physical file at this line.
		System.out.println(f.exists());
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
true
Hello World!
true

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Just to check the directory see the command
See the timings also in the cmd when the file is getting created.

C:\Users\DELL\Desktop>dir


 Volume in drive C has no label.
 Volume Serial Number is C4E8-D4B7

 Directory of C:\Users\DELL\Desktop

09/10/2017  07:31 PM    <DIR>          .
09/10/2017  07:31 PM    <DIR>          ..
09/10/2017  07:31 PM                 0 abc.txt
08/28/2017  01:28 PM    <DIR>          DEEPAK BILLS
08/15/2017  05:18 AM           688,439 Deepak DENT TECH bill.pdf
08/29/2017  12:19 AM           304,377 Deepak invitation.pdf
08/28/2017  04:38 AM    <DIR>          ExpandableListView
08/23/2017  12:31 AM    <DIR>          Experement
08/23/2017  02:14 AM    <DIR>          LibraryManagement
08/28/2017  05:09 AM        24,346,728 LibraryManagement.rar
09/04/2017  09:52 PM           502,792 M.tech Resume pdf.pdf
08/17/2017  01:27 PM    <DIR>          malaysia deepak
08/29/2017  11:21 PM    <DIR>          MyApplication
08/29/2017  11:54 AM           386,662 Namkaran.pdf
08/29/2017  11:54 AM           140,473 Namkaran.pptx
08/26/2017  12:07 AM        23,222,323 NEW LEAVE MANAGEMENT PROJECT.rar
08/02/2017  10:10 AM             1,365 RATAN JAVA NOTES - Shortcut.lnk
07/09/2017  03:00 AM    <DIR>          SHORT CUT
09/10/2017  07:32 PM               622 Test.class
09/10/2017  07:31 PM               269 Test.java
08/21/2017  05:39 AM    <DIR>          VINAY FINISHED PROJECTS
08/21/2017  05:39 AM       113,273,939 VINAY FINISHED PROJECTS.rar
              12 File(s)    162,867,989 bytes
              10 Dir(s)  57,158,504,448 bytes free

C:\Users\DELL\Desktop>
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============

	File f =new File("abc.txt");
This line won t create any physical file.
Frist it wiill check is there any physical file named abc.txt is avaliable in the current working directory or not.If it is avaliable then
'f' simply refers that file.If its not avaliable then we are just creating java file object to represent the name 
abc.txt.

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
In unix everything is considered as a file,
Even directory is treated as file 
java file io concept is implemented based on unix operating system.



java file object can be used to  represented directory also.


File f=new File("durga123"); // Assume durga123 is a directory name 
System.out.println(f.exits());//it s false
f.mkdir();// Automatically one directory will be created named with name  durga123 and f is the reference variable for it..
System.out.println(f.exits());//it s true




We can use java file Object to represent directory also.

Note:-In unix everything is treated as a file,java file I/O concept is implemented using unix operating system.
Hence java file Object can be used to represent Both files and directory.


***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============

File f=new File("demo.txt");
f.createNewFile();


A new file will be created in the current working directory.
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
import java.io.*;
    class Test
{
      public static void main(String[] args)throws IOException
    {
        File f1=new File("SaiCharan123");
        //f1.mkdir();
        File f2=new File("SaiCharan123","abc.txt");
        f2.createNewFile();
     }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Exception in thread "main" java.io.IOException: The system cannot find the path specified
        at java.io.WinNTFileSystem.createFileExclusively(Native Method)
        at java.io.File.createNewFile(File.java:1012)
        at Test.main(Test.java:9)

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Important Point :-

If we are not creating the directory and we are executing the command to create a new file in that directory
JVM is unable to find that directory.so its giving that error.


See it s run time error
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========

import java.io.*;
    class Test
  {
      public static void main(String[] args)throws IOException
    {
        File f1=new File("SaiCharan123");
        f1.mkdir();
        File f2=new File("SaiCharan123","abc.txt");
        //f2.createNewFile();
     }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test

C:\Users\DELL\Desktop>dir
 Volume in drive C has no label.
 Volume Serial Number is C4E8-D4B7

 Directory of C:\Users\DELL\Desktop

09/16/2017  04:15 AM    <DIR>          .
09/16/2017  04:15 AM    <DIR>          ..
09/10/2017  07:31 PM                 0 abc.txt
09/10/2017  11:19 PM         2,873,344 ANDROID.ppt
09/11/2017  10:31 PM         1,327,338 ANDROID.pptx
08/28/2017  01:28 PM    <DIR>          DEEPAK BILLS
08/15/2017  05:18 AM           688,439 Deepak DENT TECH bill.pdf
08/29/2017  12:19 AM           304,377 Deepak invitation.pdf
09/11/2017  09:29 PM            23,945 Dr.Deepak shetty resume new.docx
08/28/2017  04:38 AM    <DIR>          ExpandableListView
08/23/2017  12:31 AM    <DIR>          Experement
09/12/2017  10:45 PM    <DIR>          FREE INTERNSHIP
09/12/2017  09:49 PM    <DIR>          freeinternship
09/12/2017  11:45 PM               225 free_shape.xml
09/15/2017  08:41 PM            13,699 IMG_20150810_143635-1.jpg
09/14/2017  01:11 PM        23,045,565 Internship.zip
09/15/2017  08:53 PM         1,140,100 Java Webservices by MVR Naidu.pdf
08/23/2017  02:14 AM    <DIR>          LibraryManagement
08/28/2017  05:09 AM        24,346,728 LibraryManagement.rar
09/04/2017  09:52 PM           502,792 M.tech Resume pdf.pdf
08/17/2017  01:27 PM    <DIR>          malaysia deepak
08/29/2017  11:21 PM    <DIR>          MyApplication
08/29/2017  11:54 AM           386,662 Namkaran.pdf
08/29/2017  11:54 AM           140,473 Namkaran.pptx
08/26/2017  12:07 AM        23,222,323 NEW LEAVE MANAGEMENT PROJECT.rar
08/02/2017  10:10 AM             1,365 RATAN JAVA NOTES - Shortcut.lnk
09/16/2017  04:15 AM    <DIR>          SaiCharan123
07/09/2017  03:00 AM    <DIR>          SHORT CUT
09/16/2017  04:19 AM               499 Test.class
09/16/2017  04:15 AM               272 Test.java
08/21/2017  05:39 AM    <DIR>          VINAY FINISHED PROJECTS
08/21/2017  05:39 AM       113,273,939 VINAY FINISHED PROJECTS.rar
              19 File(s)    191,292,085 bytes
              13 Dir(s)  58,845,454,336 bytes free

C:\Users\DELL\Desktop>



EXPLANATION:-
============


In this Example we are creating a Directory but not file then no error is comming see it..


But in Example 5 it s different some observation has been made.
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
class FileDemo
{
public static void main(String[] args)throws IOException
{
File f=new File("c:\\saiCharan","demo.txt");
f.createNewFile();
}
}

Assume that c drive must be there compulsary in our system to Run this example.If not we ll get File not Found Exception.

Run and check it once..



EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
class FileDemo
 {
		public static void main(String[] args)throws IOException
		{
			File f=new File("c:\saiCharan","demo.txt");
			f.createNewFile();
		}
}


C:\Users\DELL\Desktop>javac Test.java
Test.java:5: error: illegal escape character
File f=new File("c:\saiCharan","demo.txt");
                    ^
1 error

C:\Users\DELL\Desktop>


Do Some Research on this..y // ....?
double backslash.
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
class Test
{
public static void main(String[] args)throws IOException
{ int count=0;
File f=new File("C:\\Users\\DELL\\Desktop\\DEEPAK BILLS");
String[] s=f.list();
for(String s1 : s) {
count++;
System.out.println(s1);
}
System.out.println("total number : "+count);
}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
confident lab .docx
confident lab .pdf
Deepak DENT TECH bill 4.pdf
Deepak DENT TECH bill.docx
Deepak DENT TECH bill.pdf
Deepak MMC bill new.pdf
Deepak MMC bill.docx
Deepak MMC bill.pdf
desktop.ini
esi 2.pdf
esi 4.pdf
esi.pdf
esi3.pdf
Namkaran 12.pdf
Namkaran 2.pdf
Namkaran 2.pptx
Namkaran 4.pdf
Namkaran 4.pptx
Namkaran. 3.pdf
Namkaran. 3.pptx
Namkaran.1.pdf
Namkaran.1.pptx
Namkaran.pptx
~$epak DENT TECH bill.docx
~WRL0005.tmp
total number : 25

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========

import java.io.*;
class Test
	{
		public static void main(String[] args)throws IOException
			{
			int count=0;
			File f=new File("C:\\durga_class");
			String[] s=f.list();
			for(String s1 : s) 
				{
					count++;
					System.out.println(s1);
				}
			System.out.println("total number : "+count);
	}
}




C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Exception in thread "main" java.lang.NullPointerException
        at Test.main(Test.java:9)

C:\Users\DELL\Desktop>

EXPLANATION:-
============

			File f=new File("C:\\durga_class");  --->If we are pointing to a directory which does not exists.
			It will give NullPointerException.
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
import java.io.*;
class Test
	{
		public static void main(String[] args)throws IOException
			{
			int count=0;
			File f=new File("C:\\Users\\DELL\\Desktop\\DEEPAK BILLS");
			String[] s=f.list();
			for(String s1 : s) 
				{
				    if(f.isFile())
					{
          					count++;
		        			System.out.println(s1);
					}
				}
			System.out.println("total number files =  "+count);
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
total number files =  0

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Page 264.
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========

import java.io.*;
class Test
	{
		public static void main(String[] args)throws IOException
			{
			int count=0;
			File f=new File("C:\\Users\\DELL\\Desktop\\DEEPAK BILLS");
			String[] s=f.list();
			for(String s1 : s) 
				{
				    if(f.isDirectory())
					{
          					count++;
		        			System.out.println(s1);
					}
				}
			System.out.println("total number files =  "+count);
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
confident lab .docx
confident lab .pdf
Deepak DENT TECH bill 4.pdf
Deepak DENT TECH bill.docx
Deepak DENT TECH bill.pdf
Deepak MMC bill new.pdf
Deepak MMC bill.docx
Deepak MMC bill.pdf
desktop.ini
esi 2.pdf
esi 4.pdf
esi.pdf
esi3.pdf
Namkaran 12.pdf
Namkaran 2.pdf
Namkaran 2.pptx
Namkaran 4.pdf
Namkaran 4.pptx
Namkaran. 3.pdf
Namkaran. 3.pptx
Namkaran.1.pdf
Namkaran.1.pptx
Namkaran.pptx
~$epak DENT TECH bill.docx
~WRL0005.tmp
total number files =  25

C:\Users\DELL\Desktop>
EXPLANATION:-
============
Page 265
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
import java.io.*;
class Test
	{
		public static void main(String[] args)throws IOException
			{
			int count=0;
			File f=new File("C:\\Users\\DELL\\Desktop\\DEEPAK BILLS");
			String[] s=f.list();
			for(String s1 : s) 
				{
				    if(s1.isDirectory())
					{
          					count++;
		        			System.out.println(s1);
					}
				}
			System.out.println("total number files =  "+count);
	}
}



C:\Users\DELL\Desktop>javac Test.java
Test.java:11: error: cannot find symbol
                                    if(s1.isDirectory())
                                         ^
  symbol:   method isDirectory()
  location: variable s1 of type String
1 error

C:\Users\DELL\Desktop>

EXPLANATION:-
============


Here if(s1.isDirectory())
isDirectory() method is belongs to File class.
But we are calling on String so it s telling CFS error..

In String class 
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


Not understood this Example
	
	File f1=new File(f,s1);
	if(f1.isFile())



PROGRAME=15
=========
import java.io.*;
class Test
	{
		public static void main(String[] args)throws IOException
			{
			int count=0;
			File f=new File("C:\\Users\\DELL\\Desktop\\DEEPAK BILLS");
			String[] s=f.list();
			for(String s1 : s) 
				{

				File f1=new File(f,s1);
				    if(f1.isFile())
					{
          					count++;
		        			System.out.println(s1);
					}
				}
			System.out.println("total number files =  "+count);
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
confident lab .docx
confident lab .pdf
Deepak DENT TECH bill 4.pdf
Deepak DENT TECH bill.docx
Deepak DENT TECH bill.pdf
Deepak MMC bill new.pdf
Deepak MMC bill.docx
Deepak MMC bill.pdf
desktop.ini
esi 2.pdf
esi 4.pdf
esi.pdf
esi3.pdf
Namkaran 12.pdf
Namkaran 2.pdf
Namkaran 2.pptx
Namkaran 4.pdf
Namkaran 4.pptx
Namkaran. 3.pdf
Namkaran. 3.pptx
Namkaran.1.pdf
Namkaran.1.pptx
Namkaran.pptx
~$epak DENT TECH bill.docx
~WRL0005.tmp
total number files =  25

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----

Not understood this Example
	
	File f1=new File(f,s1);
	if(f1.isFile())



PROGRAME=16
=========

import java.io.*;
class Test
	{
		public static void main(String[] args)throws IOException
			{
			int count=0;
			File f=new File("C:\\Users\\DELL\\Desktop\\DEEPAK BILLS");
			String[] s=f.list();
			for(String s1 : s) 
				{

				File f1=new File(f,s1);
				    if(f1.isDirectory())
					{
          					count++;
		        			System.out.println(s1);
					}
				}
			System.out.println("total number files ==  "+count);
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
total number files ==  0

C:\Users\DELL\Desktop>

EXPLANATION:-
============


File(File parent, String child)	
It creates a new File instance from a parent abstract pathname and a child pathname string.

***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
Try in elcipse for all combination.
PROGRAME=17
=========
import java.io.*;
class Test
	{
		public static void main(String[] args)throws IOException
			{
			int count=0;
			File f=new File("C:\\Users\\DELL\\Desktop\\DEEPAK BILLS");
			System.out.println("======"+f);
			String[] s=f.list();
			for(String s1 : s) 
				{
					File f1=new File("C:\\Users\\DELL\\Desktop\\DEEPAK BILLS",s1);
					
					System.out.println("--------"+f1);
					
				    if(f1.isDirectory())
					{
          					count++;
		        			System.out.println(s1);
					}
				}
			System.out.println("total number files =  "+count);
	}
}




C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
======C:\Users\DELL\Desktop\DEEPAK BILLS
--------C:\Users\DELL\Desktop\DEEPAK BILLS\confident lab .docx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\confident lab .pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Deepak DENT TECH bill 4.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Deepak DENT TECH bill.docx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Deepak DENT TECH bill.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Deepak MMC bill new.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Deepak MMC bill.docx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Deepak MMC bill.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\desktop.ini
--------C:\Users\DELL\Desktop\DEEPAK BILLS\esi 2.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\esi 4.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\esi.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\esi3.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran 12.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran 2.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran 2.pptx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran 4.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran 4.pptx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran. 3.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran. 3.pptx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran.1.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran.1.pptx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran.pptx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\~$epak DENT TECH bill.docx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\~WRL0005.tmp
total number files =  0

C:\Users\DELL\Desktop>


EXPLANATION:-
============



***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
import java.io.*;
class Test
	{
		public static void main(String[] args)throws IOException
			{
			int count=0;
			File f=new File("C:\\Users\\DELL\\Desktop\\DEEPAK BILLS");
			System.out.println("======"+f);
			String[] s=f.list();
			for(String s1 : s) 
				{
					File f1=new File(f,s1); // Oserve Example 17 here we are goving String Directory Path name.
					                        //But here we are passing File class f
					System.out.println("--------"+f1);
					
				    if(f1.isDirectory())
					{
          					count++;
		        			System.out.println(s1);
					}
				}
			System.out.println("total number files =  "+count);
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
======C:\Users\DELL\Desktop\DEEPAK BILLS
--------C:\Users\DELL\Desktop\DEEPAK BILLS\confident lab .docx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\confident lab .pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Deepak DENT TECH bill 4.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Deepak DENT TECH bill.docx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Deepak DENT TECH bill.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Deepak MMC bill new.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Deepak MMC bill.docx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Deepak MMC bill.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\desktop.ini
--------C:\Users\DELL\Desktop\DEEPAK BILLS\esi 2.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\esi 4.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\esi.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\esi3.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran 12.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran 2.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran 2.pptx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran 4.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran 4.pptx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran. 3.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran. 3.pptx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran.1.pdf
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran.1.pptx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\Namkaran.pptx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\~$epak DENT TECH bill.docx
--------C:\Users\DELL\Desktop\DEEPAK BILLS\~WRL0005.tmp
total number files =  0

C:\Users\DELL\Desktop>
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
