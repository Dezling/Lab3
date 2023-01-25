package mu.itmo.MyLab3.objects;

import java.util.Objects;

public class Wather{
    String move;


    public Wather() {
        this.move = "Водой";

    }

    public void Wather(){
        System.out.println(move + " ногами");
    }

    @Override
    public String toString() {
        System.out.println("над " + ObjectConditions.Runing);
        System.out.println(ObjectConditions.Sparkling + " " + move);
        return "Wather{" +
                "move='" + move + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wather wather)) return false;
        return Objects.equals(move, wather.move);
    }

    @Override
    public int hashCode() {
        return Objects.hash(move);
    }

}

