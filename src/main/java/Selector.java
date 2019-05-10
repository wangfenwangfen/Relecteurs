import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Selector {

    private  List<Dev> devs;
    private Dev dev;

    Selector(Dev dev, List<Dev> devs) {
        this.dev = dev;
        this.devs = devs;
    }

    List<Dev> selectRelecteurs() {
        removeDemandeur();

        List<Dev> relecteurs = new ArrayList<Dev>();

        if(devs.size()>=3){
            Random random = new Random();
            int index1 = getFistRelecteurIndex(random);
            addRelecteurSelected(relecteurs, index1);

            removeFirstRelecteurSelectedFromOriginListCandidat(index1);
            int index2 = getSecondRelecteurIndex(random);
            addRelecteurSelected(relecteurs, index2);

            return relecteurs;
        }
        return devs;
    }

    private void addRelecteurSelected(List<Dev> relecteurs, int index1) {
        relecteurs.add(devs.get(index1));
    }

    private  void removeDemandeur() {
        devs.remove(dev);
    }

    private int getFistRelecteurIndex(Random random) {
        return random.nextInt(devs.size());
    }

    private int getSecondRelecteurIndex(Random random) {
        return random.nextInt(devs.size()-1);
    }

    private  void removeFirstRelecteurSelectedFromOriginListCandidat(int index1) {
        devs.remove(devs.get(index1));
    }

}
