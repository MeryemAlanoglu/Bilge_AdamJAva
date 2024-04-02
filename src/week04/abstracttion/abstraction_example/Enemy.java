package week04.abstracttion.abstraction_example;

public class Enemy {
    int health;
    int damage;

    public void attack() //abstract method çünkü her düşman atağı farklı
    {

    }

    public void takeDamage(int damage){
        health=health-damage;
        System.out.println("Enemy is damaged :"+damage);
        System.out.println("Enemy health is :"+health);

        if(health<=0){
            System.out.println("Enemy is defeated.-is kelled");
        }
    }
}
