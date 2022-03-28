package com.company;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        algorithms();
    }

       static void task1() {
        //a
        int var1 = 20;
        int var2 = 10;
        //b

        short shortSum = (short) (var1 + var2);//
        //c
        System.out.println(shortSum);

        //d (incrementation)
        System.out.println(shortSum++); //

        //e
        byte byteSum = (byte) (var1 + var2);
        //f
        System.out.println(byteSum);
        //g
        System.out.println(++byteSum);

    }
        static void task2() {

            float number = 13.43f;
            int b = (int) number;

            System.out.println(Math.round(number));
            //value rounded up
            double roundUp = Math.ceil(number);
            System.out.println(Math.ceil(number));

            //value rounded down

            System.out.println(Math.floor(number));
        }

        static void task3() {
            //Task 3 prints the value of  right angle 45
            float rightAngle = 45;
            System.out.println("Sinus 45: " + Math.sin(rightAngle));
            System.out.println("Cosinus 45: " + Math.cos(rightAngle));
            System.out.println("Tang 45:" + Math.tan(rightAngle));
            System.out.println("Arcsine 45: " + Math.asin(rightAngle));
            System.out.println("Arcosine 45: " + Math.acos(rightAngle));
            System.out.println("Arctangent 45: " + Math.atan(rightAngle));
            System.out.println("Atan 45:" + Math.atan2(45, 55)); // 55 any point of choice
        }

        static void task4(){
          int value = 10;
          System.out.println("Initial result of value:" + value); //10

            //increment operator
            ++value;
            System.out.println("++value:" +  +value); //11 value after increment

            //decrement operator
            --value;
            System.out.println("-- value: " + --value); //9 value after decrement

            int a = 4;
            int b = 10;

            //Bitwise Complement Operator

            System.out.println("Bitwise complement of " + a + " : " + ~a);



            //Arithmetic operator
            System.out.println("a*b :=" + a*b);
            System.out.println("b-a:=" +( b-a));

            //Relation Operator
            System.out.println( a == b); // == Equal to // false
            System.out.println( a<b); // less than // true

            //Bitwise operator
            System.out.println("a & b =:" + (a & b)); //bitwise AND
            System.out.println("a | b =:" + (a | b)); //bitwise OR

            //Conditional operator
            float x =3, y=8;
            System.out.println( x<y &&  x<=y);//true logical AND && = returns true if boths sides are true
            System.out.println(x>=y && x>y);//false logical AND && = returns false if one side or both sides are false
        }
        static void task5(){

System.out.println("");


        }
             static void algorithms() {
            //Algorithms Examples
            //problem: Print out the numbers from 1 to 5

            //algorithm
            //N = 1
            //for n<= 5 print n
            //n++

            //For loop

            //Loop that prints the value of 1 to 5
            for (int i = 0; i <= 5; i++) {
                System.out.println(i);
            }
        }
  // Write a method that counts down to 0 from any number passed into it
        static void countDown(int number) {
            //Base case
        if (number == 0) {
            return;
        }
        System.out.println(number --);
            // recursive method
        countDown(number);
        }

    }
