package mu.itmo.MyLab3.move.myMove;

import mu.itmo.MyLab3.move.interfaces.IMoves;
import mu.itmo.MyLab3.move.interfaces.IRun;

public class Run implements IRun {
    public void Runed (IMoves run){
        System.out.println("побежал прямо на музыку," );
    }

    @Override
    public String toString() {
        return " бегущей";
    }
}


