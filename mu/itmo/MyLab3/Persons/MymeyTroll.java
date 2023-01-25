package mu.itmo.MyLab3.Persons;

import java.util.Objects;

public class MymeyTroll {
    String name;



    public MymeyTroll() {
        this.name = "Мумитроль";

    }
    public void MymeyTroll(){
        System.out.println(name);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MymeyTroll that)) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

