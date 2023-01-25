package mu.itmo.MyLab3.move.myMove;

import mu.itmo.MyLab3.move.interfaces.IMoves;
import mu.itmo.MyLab3.move.interfaces.ISwinging;


public class Swinging implements ISwinging {
        public void Swinged (IMoves swinging){
            System.out.println("и болтал над" );
        }
        @Override
        public void Swinged(){
            System.out.println("болтали ногами" );
        }
}

