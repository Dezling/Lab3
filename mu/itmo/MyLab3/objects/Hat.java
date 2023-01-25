package mu.itmo.MyLab3.objects;

import java.util.Objects;

public class Hat {


    String name;
    public Hat(){
        this.name = "Шляпу";

    }
    public void Hat(){
        System.out.println("свою " + ObjectConditions.Old + " " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hat hat)) return false;
        return Objects.equals(name, hat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
