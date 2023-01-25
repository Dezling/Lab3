package mu.itmo.MyLab3.move.myMove;

import mu.itmo.MyLab3.move.interfaces.*;

public class NameMoves implements IMoves {
    public void Runed(IMoves runer){
      IRun run = new Run();
      run.Runed(runer);

    }
    public void Looked(IMoves looker){
        ILook look = new Look();
        look.looked(looker);
    }
    public void Sited(IMoves siter){
        ISit sit = new Sit();
        sit.sited(siter);

    }
    public void ToWeared(IMoves toWearer){
        IToWear toWear = new ToWear();
        toWear.toWeared(toWearer);
    }

}
