import model.Battlefield;
import model.Captain;
import model.Pirate;
import module.Tortuga;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //System.out.println(Tortuga.recruit().getName());
       Captain Krumpli = Tortuga.loadShip(Tortuga.recruit("Feketegyöngy"));
       Captain GinTonic = Tortuga.loadShip(Tortuga.recruit("Bolygó Hollandi"));

       Battlefield battlefield = new Battlefield();
       battlefield.battle(Krumpli.getShip(), GinTonic.getShip());
    }
}
