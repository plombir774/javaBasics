package org.example;

public class CarTest {

  static  void carCompare(Car c1,Car c2){
      if(c1.brand.equals(c2.brand)&& c1.year==c2.year){
    System.out.println("Cars are equal");
      }
      else{System.out.println("Cars are not equal");}
  }
static void carCompareDetails(Car c1,Car c2){
      if(!c1.brand.equals(c2.brand)){
          System.out.println("Different brand");
    }
      else{
          if(c1.year !=c2.year){
              System.out.println("Different year");
          }

else{System.out.println("Cars are equal");}
      }
  }


public static void main(String[]args){
      Car c1 = new Car("BMW",2020);
      Car c2 = new Car("BMW",2020);
      CarTest.carCompare(c1,c2);
      CarTest.carCompareDetails(c1,c2);
}
}