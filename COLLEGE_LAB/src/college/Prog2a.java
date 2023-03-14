package college;
import java.util.*;

public class Prog2a {
String name,usn,age;
Prog2a(String name,String usn,String age){
this.name=name;
this.age=age;
this.usn=usn;
}
public void display(List<Prog2a> list) {
Iterator<Prog2a> itr=list.iterator();
while(itr.hasNext()) {
Prog2a ar=itr.next();
System.out.println("Name:"+ar.name+"Age:"+ar.age+"Usn:"+ar.usn);
}
}

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
List<Prog2a> list = new ArrayList<Prog2a>();

   Prog2a o= new Prog2a("Harshi","1rv31","21");
   while(true) {
    System.out.println("1.Add student details\n2.Update details\n3.remove the elements\n4.size of the list\n5.Display\nEnter your choice");
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
Prog2a ob= new Prog2a(name,usn,age);
list.add(ob);
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
Prog2a a1= new Prog2a(name,usn,age);
list.set(i, a1);
break;
case 3:
System.out.println("Enter the index you want to delete");
int a=s.nextInt();
list.remove(a);
System.out.println(a);
break;
case 4:
System.out.println(list.size());
break;
case 5:
o.display(list);
break;

default:
break;
   }
   }
}
}
