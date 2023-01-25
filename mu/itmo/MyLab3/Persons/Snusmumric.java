package mu.itmo.MyLab3.Persons;

import java.util.Objects;

public class Snusmumric {
    String name;


    public Snusmumric() {
        this.name = "Снусмумрика";
    }
    public void Snusmumric(){
        System.out.println(name);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Snusmumric that)) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}

