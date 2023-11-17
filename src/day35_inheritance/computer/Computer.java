package day35_inheritance.computer;

public class Computer {

   String os;
   int memory;
   public Computer (String os, int memory){
       this.os = os;
       this.memory = memory;
   }

   @Override
   public String toString() {
      return "Computer" +
              "\n\tOperating System: "+ os +
              "\n\tMemory: " + memory;
   }
}//instance variables and methods can inherit from parent to the child
