import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Selector {

    private  List<Dev> devs;

    Selector(List<Dev> devs) {
        this.devs = devs;
    }

    List<Dev> selectRelecteurs(Dev dev) {
        removeDemandeur(dev);
        List<Dev> relecteurs = new ArrayList<Dev>();
        if(devs.size()>=3){
            Random random = new Random();
            int index1 = random.nextInt(devs.size());
            int index2 = random.nextInt(devs.size()-1);
            relecteurs.add(devs.get(index1));
            removeFirstRelecteurSelected(index1);
            relecteurs.add(devs.get(index2));
            return relecteurs;
        }
        return devs;
    }

    private  void removeFirstRelecteurSelected(int index1) {
        devs.remove(devs.get(index1));
    }

    private  void removeDemandeur(Dev dev) {
        devs.remove(dev);
    }
}
