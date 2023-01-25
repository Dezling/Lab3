package mu.itmo.MyLab3.move.myMove;

import mu.itmo.MyLab3.move.interfaces.IHeartFeels;

import java.util.Objects;

public class OnHeart implements IHeartFeels {
    String feel;
    String violation;



    public OnHeart(){
    this.feel = "";
    this.violation="и на сердце у них было";
}
    @Override
    public void Feels() {
        System.out.println(feel + violation);

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnHeart onHeart)) return false;
        return Objects.equals(feel, onHeart.feel) && Objects.equals(violation, onHeart.violation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feel, violation);
    }
}
