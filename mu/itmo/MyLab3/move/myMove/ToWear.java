package mu.itmo.MyLab3.move.myMove;

import mu.itmo.MyLab3.move.interfaces.IMoves;
import mu.itmo.MyLab3.move.interfaces.IToWear;

public class ToWear implements IToWear {
    public void toWeared(IMoves toWear){
        System.out.println("Нахлобучив");
    }
}
