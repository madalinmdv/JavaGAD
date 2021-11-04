package lab2_codechallange1;

public class Fighter {

    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter (String name, int health, int damagePerAttack){
        this.name=name;
        this.damagePerAttack=damagePerAttack;
        this.health=health;
    }

    public void attack(Fighter f){
        f.health=f.health - damagePerAttack;
    }
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

}