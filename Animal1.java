class Animal1
{
    public void makeSound()
    {
        System.out.println("Animals make sounds");
    }
}
class Dog extends Animal1
{
    public void bark()
    {
        System.out.println ("Dog barks");
    }
}
class Test1
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.bark();
    }
}