//Example of Hierarchical Inheritance
class Animal2
{
    void makeSound()
    {
       System.out.println("Animals make sounds");
    }
}
class Dog extends Animal2
{
    void bark()
    {
       System.out.println("Dog barks");
    }
}
class Cat extends Animal2
{
    void meow()
    {
        System.out.println("Cat meows");
    }
}
class Test3
{
   public static void main(String[] args)
   {
      Dog myDog=new Dog();
      myDog.makeSound();
      myDog.bark();
 
      Cat myCat=new Cat();
      myCat.makeSound();
      myCat.meow();
   }
}
        