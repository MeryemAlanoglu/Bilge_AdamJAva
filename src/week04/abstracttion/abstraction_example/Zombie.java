package week04.abstracttion.abstraction_example;

public class Zombie extends Enemy{
    public Zombie(){
       this.health=100;
       this.damage=5;
    }

    @Override
    public void attack(){
        System.out.println("Zombie attack with"+damage+"damage");
    }
}
