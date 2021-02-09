package com.demo.first;

public class Constructors {


    public static int minFunc(int n1, int n2){
        int min;
        if(n1>n2)
            min=n2;
        else
            min=n1;
        return min;
    }
    public static double minFunc(double n1, double n2){


        return n1*n2;
    }
//    int age;
//    int empid;
//    int salary;
////Default constructor
////    Constructors(){
////        age=4;
////    }
//    //Parameterized
//    Constructors(int i, int j) {
//        age = i;
//        empid = j;
//
//    }
//
//    Constructors(int i, int j, int k){
//
//        age = i;
//        empid = j;
//        salary=k;
//    }
//        public void display () {
//            System.out.println(age + "\n" + empid +"\n" + "salary is"+salary);
//            int result=age*empid;
//            System.out.println("result is:"+ result);
//        }



    public static void main(String[] args) {

        Constructors obj1=new Constructors();

        System.out.println(obj1.minFunc(3.0,8.0));
//        Constructors obj1=new Constructors(3,2);
//        Constructors obj2=new Constructors(33,11,22211);
//
//        obj1.display();
//        obj2.display();
    }
}
