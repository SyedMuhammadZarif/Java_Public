package first;

public class Animal {
    String name;
    String sound;

    void makeSound() {
        System.out.println(this.sound);
    }

    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    Animal(Animal x){
        this.copy(x);
    }
    public void copy(Animal x){
        this.name= x.name;
        this.sound = x.sound;

    }
    public void set_animal_name(String a){
        this.name = a;
    }
}

