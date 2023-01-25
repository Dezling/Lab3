package mu.itmo.MyLab3.objects;

import mu.itmo.MyLab3.move.interfaces.SunMoves;

import java.util.Objects;

public class Sun implements SunMoves {
    String move;
    String conditions;
    String rays;
    String lighting;
    String now;

    public Sun(){
        this.move = "над верхушками";
        this.conditions = " cолнце Поднялось";
        this.lighting = "и светило им";
        this.now = "Только что";
        this.rays = "От его лучей";
    }


    @Override
    public void GetUp() {
        System.out.println(now + conditions + " " + move + " деревьев" + " " + lighting);


    }
    @Override
    public void RayHit(){
        System.out.println(rays);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sun sun)) return false;
        return Objects.equals(move, sun.move) && Objects.equals(conditions, sun.conditions) && Objects.equals(rays, sun.rays) && Objects.equals(lighting, sun.lighting) && Objects.equals(now, sun.now);
    }

    @Override
    public int hashCode() {
        return Objects.hash(move, conditions, rays, lighting, now);
    }

}



