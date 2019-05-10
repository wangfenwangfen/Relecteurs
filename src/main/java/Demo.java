import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
         Dev dev1 = new Dev("Houssam");
         Dev dev2 = new Dev("Boris");
         Dev dev3 = new Dev("Sandy");
         Dev dev4 = new Dev("Kevin");
         Dev dev5 = new Dev("Tristan");
         Dev dev6 = new Dev("Mathieu");
         Dev dev7 = new Dev("Erwan");
         Dev dev8 = new Dev("Haifa");
         Dev dev9 = new Dev("Fen");
         Dev dev10 = new Dev("Hadrien");
        List<Dev> devs = new ArrayList<Dev>();
        devs.add( dev1);
        devs.add(dev2);
        devs.add(dev3);
        devs.add(dev4);
        devs.add(dev5);
        devs.add(dev6);
        devs.add(dev7);
        devs.add(dev8);
        devs.add(dev9);
        devs.add(dev10);
        Selector selector = new Selector(devs);
        List<Dev> relecteurs = selector.selectRelecteurs(dev1);

        System.out.println(relecteurs);
    }
}
