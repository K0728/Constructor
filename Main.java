                                         // Non-parametrized constructor
/*
import java.util.*;
class Student
{
   Student()  // this is constructor (non-parametrized).Esme koi return type nahi hota hai.
   {
       System.out.println("I'm Constructor");
   }

}
class School
{
   public static void main(String[] args)
   {
       Student s1=new Student();  // object banate hi constructor call ho jata hai alag se call karne ki jarurat nahi hai

   }
}
*/

                                         //parametrized constructor

/*
import java.util.*;
class Student
{
   String name;
   int age;
   Student(String name,int age)
   {
       this.name=name; // this.name jo declare kiye h name usko refer karta hai aur equal to ke bad jo name h wo constructor wale name ke liye hai
       this.age=age;
       System.out.println(this.name);
       System.out.println(this.age);
   }

}
class School
{
   public static void main(String[] args)
   {
       Student s1=new Student("Kunal",22);

   }
}
*/


                                        // Copy Constructor

import java.util.*;
class Student
{
    String name;

    Student()
    {
        // esko empty chhod diye h agar chahe to kucch likh v sakte hai
    }
    Student(Student s2)     // ye dusra constructor banaye hai aur yahi pe eska object s2 bana liye hai
    {
        this.name=s2.name;
        System.out.println(this.name);
    }
}
class School
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.name="Kunal";

        Student s2=new Student(s1); //2nd constructor me kucch nahi likhe hai but 1st constructor ka object ko pass kar
                                   // diya hai jisse jo v 1st constructor me hoga wo 2nd constructor me aa jayega

    }
}
