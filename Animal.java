// Example of Multi level Inheritance
class Animal
{
   void eat()
   {
       System.out.println("Animals eat food");
   }
}
class Dog extends Animal
{
   void bark()
   {
      System.out.println("Dog barks");
   }
}
class Puppy extends Dog
{
   void weep()
   {
      System.out.println("Puppy weeps");
   }
}
class Test2
{
     public static void main(String[] args)
     {
         Puppy myPuppy=new Puppy();
         myPuppy.eat();
         myPuppy.bark();
         myPuppy.weep();
     }
}