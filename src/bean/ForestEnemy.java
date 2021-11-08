package bean;

public class ForestEnemy extends Enemy{
    //子弹
    private Bullet bullet;

    public void setBullet(Bullet bullet){
        this.bullet = bullet;
    }

    public Bullet getBullet(){
        return bullet;
    }

    public void attack(User user){

    }
}
