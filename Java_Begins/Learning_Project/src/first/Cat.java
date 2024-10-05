package first;

public class Cat extends Animal {
    int age;
    void meow() {
        super.makeSound();
    }
    Cat(String name, String sound, int age) {
        super(name, sound);
        this.age = age;
    }
    void clawsofa(){
        System.out.println(this.name+" just clawed the sofa");
    }
    Cat(Cat x){
        super(x);
        super.copy(x);
        this.age = x.age;
    }

}
