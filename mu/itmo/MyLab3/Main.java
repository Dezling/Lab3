package mu.itmo.MyLab3;

import mu.itmo.MyLab3.Persons.Person;
import mu.itmo.MyLab3.objects.Heart;
import mu.itmo.MyLab3.move.myMove.OnHeart;
import mu.itmo.MyLab3.move.myMove.NameMoves;
import mu.itmo.MyLab3.Persons.MymeyTroll;
import mu.itmo.MyLab3.Persons.Snusmumric;
import mu.itmo.MyLab3.move.myMove.PersonMoves;
import mu.itmo.MyLab3.move.myMove.Swinging;
import mu.itmo.MyLab3.objects.*;

public class Main {
    public static void main(String[] args) {
        MymeyTroll mymeyTroll = new MymeyTroll();
        Snusmumric snusmumric = new Snusmumric();
        PersonMoves runed = new PersonMoves("бег");
        PersonMoves looked = new PersonMoves("смотрит");
        PersonMoves sited = new PersonMoves("сидит");
        PersonMoves toWeared = new PersonMoves("надел или нахлобучил");
        Swinging swinged = new Swinging();
        NameMoves run = new NameMoves();
        NameMoves look = new NameMoves();
        NameMoves swinging = new NameMoves();
        NameMoves sit = new NameMoves();
        NameMoves toWear = new NameMoves();
        Bridge bridge = new Bridge();
        Forehead forehead = new Forehead();
        Wather wather = new Wather();
        Hat hat = new Hat();
        Person persons = new Person();
        Sun sun = new Sun();
        Face face = new Face();
        Heart heart = new Heart();
        OnHeart onHeart = new OnHeart();
        mymeyTroll.MymeyTroll();
        run.Runed(runed);
        look.Looked(looked);
        snusmumric.Snusmumric();
        sit.Sited(sited);
        bridge.Bridge();
        toWear.ToWeared(toWeared);
        forehead.Forehead();
        hat.Hat();
        swinged.Swinged(swinging);
        wather.Wather();
        sun.GetUp();
        face.Face();
        persons.Squinting();
        sun.RayHit();
        swinged.Swinged();
        wather.toString();
        onHeart.Feels();
        heart.Feels();











    }
}