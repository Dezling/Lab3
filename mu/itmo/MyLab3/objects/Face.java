package mu.itmo.MyLab3.objects;

import java.util.Objects;

public class Face {
    String object;


    public Face(){
        this.object = "прямо в лицо";
    }

    public void Face(){
        System.out.println(object);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Face face)) return false;
        return Objects.equals(object, face.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }
}
