package com.demo.first;

import java.util.*;

public class FivthSession {
    public static void main(String[] args) {
        String st="hello my name is yashika";
        String st1=new String("hello");
        String st2="hello";
        System.out.println(st + st1);

        if(st2.equals(st1))
            System.out.println("Same");
        if (st==st2){
            System.out.println(st +"is similar to" + st2);

        }else {
            System.out.println("not same");
        }

        System.out.println(st.charAt(2));
        char [] a=st.toCharArray(); //converts string to array
        for(int i=0;i<a.length;i++){
            if(a[i]=='a' || a[i]== 'e' || a[i]=='i' || a[i]=='o'){
                a[i]='@';
            }
        }
        System.out.println(String.valueOf(a));

       String [] newstr=st.split(" ");
       System.out.println(newstr);
       String [] strarr={"welcome","to","training"};
       String s= String.join("#",strarr);
       System.out.println(s + "\n" + s.substring(0,9));
       System.out.println(s.replace('#',' ').substring(0,13));

        //reverse a string first way
       StringBuilder stb= new StringBuilder("Hlllo I m yashika");
       System.out.println(stb.reverse());

    //second way
        String word="My name is yashika";
        StringBuilder nes= new StringBuilder("");
        char [] reverse= word.toCharArray();
        for(int i =reverse.length-1;i>=0;i--){
             nes.append(reverse[i]);
        }
        System.out.println(nes);
        int n=5;
        ArrayList <Integer> al = new ArrayList<Integer>(Arrays.asList(22,11,22,33,11));
//        al.addAll(Arrays.asList(1,2,3,22,45,2,88,33));
//        Collections.sort(al);
        System.out.println(al);

//        for (int i=1;i<=n;i++){
//            al.add(i);
//        }
//        System.out.println(al);
////        al.add(21);
////        al.add(32);
////        al.add(10);
//        Collections.sort(al);
//        System.out.println(al);

//task - reverse using swapping

//string - everytime we have to make new objects
        //stringbuilder is efficient

    }
}
