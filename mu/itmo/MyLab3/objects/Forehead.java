package mu.itmo.MyLab3.objects;

import java.util.Objects;

public class Forehead {
    String name;



    public Forehead(){
        this.name = "на лоб";
    }
    public void Forehead(){
        System.out.println(name);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Forehead forehead)) return false;
        return Objects.equals(name, forehead.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
