package mu.itmo.MyLab3.objects;

public enum ObjectConditions {

    Old("Старую"),
    Runing("Бегущей"),
    Sparkling("Сверкающей");
    public String conditions;

    ObjectConditions(String type) { this.conditions = type;}

    @Override
    public String toString() {return conditions;}

}
