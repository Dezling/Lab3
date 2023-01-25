package mu.itmo.MyLab3.move.myMove;

import mu.itmo.MyLab3.move.interfaces.IMoves;
import mu.itmo.MyLab3.move.interfaces.ISit;

public class Sit implements ISit {
    public void sited(IMoves sit){
        System.out.println("тот сидел");
    }
}
