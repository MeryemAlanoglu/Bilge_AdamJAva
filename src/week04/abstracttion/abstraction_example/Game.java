package week04.abstracttion.abstraction_example;

public class Game {
    public static void main(String[] args) {
        Enemy goblin=new Goblin(); //özlellikler soldan davranışlar sağdan tanımlanır
        Enemy zombie=new Zombie();
        goblin.attack();
        zombie.attack();

        zombie.takeDamage(20);
        zombie.takeDamage(30);
        zombie.takeDamage(60);

        //düşman türünde zombie ve goblin tanımlanır.
        
    }


}
