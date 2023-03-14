package college;

import java.util.*;

public class Prog2b {
String name,usn,age;
Prog2b(String name,String usn,String age){
this.name=name;
this.age=age;
this.usn=usn;
}
public void display(List<Prog2b> list) {
Iterator<Prog2b> itr=list.iterator();
while(itr.hasNext()) {
Prog2b ar=itr.next();
System.out.println("Name:"+ar.name+"Age:"+ar.age+"Usn:"+ar.usn);
}
}

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
List<Prog2b> list = new LinkedList<Prog2b>();
LinkedList<Prog2b> list1 = new LinkedList<Prog2b>(list);

Prog2b o= new Prog2b("Harshitha","1RV31","21");
   while(true) {
    System.out.println("1.Add student details\n2.Update details\n3.remove the elements\n4.size of the list\n5.Display\n6.clearing elements\n7.Adding at First\n8.Adding at Last\n9.Remove at last\nEnter your choice");
    int ch=s.nextInt();
switch(ch) {
case 1:
Scanner ss=new Scanner(System.in);
System.out.println("Enter the no of student details you want to add");
int n=ss.nextInt();
for(int i=0;i<n;i++) {
System.out.println("Enter your name");
   String name=ss.next();
System.out.println("Enter your usn");
String usn=ss.next();
System.out.println("Enter your age");
String age=ss.next();
Prog2b ob= new Prog2b(name,usn,age);
list1.add(ob);
}
break;
case 2:
System.out.println("Enter the index you want to update");
int i=s.nextInt();
System.out.println("Enter your name");
String name=s.next();
System.out.println("Enter your usn");
String usn=s.next();
System.out.println("Enter your age");
String age=s.next();
Prog2b a1= new Prog2b(name,usn,age);
list1.set(i, a1);
break;
case 3:
System.out.println("Enter the index you want to delete");
int a=s.nextInt();
list1.remove(a);
break;
case 4:
//list.size();
int size = list1.size();
System.out.println("Size of list = "+ size);
break;
case 5:
o.display(list1);
break;
case 6:
list1.clear();
break;
case 7:
	System.out.println("Enter your Name");
	String name1=s.next();
	System.out.println("Enter your usn");
	String usn1=s.next();
	System.out.println("Enter your age");
	String age1=s.next();
	Prog2b ob1= new Prog2b(name1,usn1,age1);
	list1.addFirst(ob1);
break;
case 8:
	
	System.out.println("Enter your Name");
	String name2=s.next();
	System.out.println("Enter your usn");
	String usn2=s.next();
	System.out.println("Enter your age");
	String age2=s.next();
	Prog2b ob2= new Prog2b(name2,usn2,age2);
	list1.addLast(ob2);
break;
case 9:
	list1.removeFirst();
break;
case 10:
	list1.removeLast();
break;
default:
break;
   }
   }
}
}
