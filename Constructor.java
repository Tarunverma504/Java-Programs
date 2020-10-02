/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author TARUN VERMA
 */
class Student_{
    String studentid;
    String studentname;
    String studentbranch;
    int studentmarks;
    int studentfees;
    Student_()
    {
        System.out.println(studentname);
    }
    Student_(String name)
    {
        this.studentname=name;
        System.out.println(studentname);
    }
    Student_(String name,String id)
    {
        this.studentname=name;
        this.studentid=id;
        System.out.println(studentname+" "+studentid);
    }
    Student_(String name,String id,String branch)
    {
        this.studentname=name;
        this.studentid=id;
        this.studentbranch=branch;
        System.out.println(studentname+" "+studentid+" "+studentbranch);
    }
    Student_(String name,String id,String branch,int fee)
    {
        this.studentname=name;
        this.studentid=id;
        this.studentbranch=branch;
        this.studentfees=fee;
        System.out.println(studentname+" "+studentid+" "+studentbranch+" "+studentfees);
    }
    Student_(String name,String id,String branch,int fee,int mark)
    {
        this.studentname=name;
        this.studentid=id;
        this.studentbranch=branch;
        this.studentfees=fee;
        this.studentmarks=mark;
        System.out.println(studentname+" "+studentid+" "+studentbranch+" "+studentfees+" "+studentmarks);
    }
}
public class Constructor {
    public static void main(String []arg)
    {
        Student_ s0=new Student_();
        Student_ s1=new Student_("Tarun");
        Student_ s2=new Student_("Om","1910990498");
        Student_ s3=new Student_("Rahul","1910990496","CSE");
        Student_ s4=new Student_("vishesnnh","1910990504","CSE",80000);
        Student_ s6=new Student_("Shivam","1910990510","CSE",80000,98);
         Student_ s7=new Student_("Shiam","1914550990510","CSE",80000,9);
         Student_ s9=new Student_("Shivjnam","1910990990510","CSE",80,98);
    }
    
}
