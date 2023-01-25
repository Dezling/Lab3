package mu.itmo.MyLab3.objects;

import mu.itmo.MyLab3.move.interfaces.IHeartFeels;

import java.util.Objects;

public class Heart implements IHeartFeels {
    String feel;
    String violation;

    public Heart(){
        this.feel = "Привольно";
        this.violation=" и Беззаботно";

    }
    @Override
    public void Feels(){
        System.out.println(feel + "" + violation);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Heart heart)) return false;
        return Objects.equals(feel, heart.feel) && Objects.equals(violation, heart.violation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feel, violation);
    }

}
