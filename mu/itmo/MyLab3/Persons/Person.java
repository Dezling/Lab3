package mu.itmo.MyLab3.Persons;


import mu.itmo.MyLab3.move.interfaces.IGenMove;
import mu.itmo.MyLab3.move.interfaces.IMoves;
import mu.itmo.MyLab3.move.interfaces.ISwinging;

import java.util.Objects;

public class Person implements ISwinging, IGenMove {

    String name;
    String moved;
    String squint;
    String feels;


public Person(){
    this.squint = "А они жмурились";
    this.moved = "Болтали Ногами";
    this.feels = "Они чувтсвовали себя";

}
    @Override
    public void Swinged(IMoves swinging) {

    }

    @Override
    public void Swinged() {


    }

    @Override
    public void Squinting(){
        System.out.println(squint);
    }


    public void Moved(){
        System.out.println(moved);
    }
    @Override
    public void Feels(){
        System.out.println(feels);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(name, person.name) && Objects.equals(moved, person.moved) && Objects.equals(squint, person.squint) && Objects.equals(feels, person.feels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, moved, squint, feels);
    }


}