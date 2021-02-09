package com.demo.first;
import java.util.Scanner;

public class SecondSession {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        if (num == 0) {

            System.out.println("result is zero");
        } else if (num<0) {
            if (num<-5){
                System.out.println("result is less than -5");
            }else{
                System.out.println("result is more than -5");
            }


        }else if (num>0 && num<30) System.out.println("result is in range 1-30");
        else{
            System.out.println("result is more than 30");


            System.out.println("Added");
        }

    }

}

//    public void Person(){
//        int age=0;//local variable
//        age=age+7;
//        System.out.println(age);
//    }
//    public void Test(){
//        int age2=2;
//        age2=age+age2;



//    public static void main(String[] args) {
//        SecondSession obj=new SecondSession();
//        obj.Person();




//        Scanner obj= new Scanner(System.in);
//        System.out.println("Enter your username");
//        String name=obj.nextLine();
//        int age=obj.nextInt();
//        double salary = obj.nextDouble();
//        System.out.println(name+ "\n"+ "\n"+age+"\n"+salary);



//        int a=12;
//        int b=23;
//        System.out.println(a+b+"\n"+(a-b)+"\n"+(a/b)+"\n"+(a*b));
//        a=b++; //b=23 b=b+1 a=23
//
//
//        System.out.println(a);
//        a=++b;
//        System.out.println(a);






















