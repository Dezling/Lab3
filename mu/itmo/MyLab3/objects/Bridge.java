package mu.itmo.MyLab3.objects;

import java.util.Objects;

public class Bridge {
    String railing;



    public Bridge(){
        this.railing = "на перилах моста";
    }
    public void Bridge(){
        System.out.println(railing);

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bridge bridge)) return false;
        return Objects.equals(railing, bridge.railing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(railing);
    }
}
