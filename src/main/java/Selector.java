import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Selector {

    private  List<Developer> developers;
    private Developer developer;

    Selector(Developer developer, List<Developer> developers) {
        this.developer = developer;
        this.developers = developers;
        if(developers.size()<3){
            throw new IllegalArgumentException("There's not enough devs (< 3) in list candidate");
        }
    }

    List<Developer> selectRelecteurs() {
        removeDemandeur();

        List<Developer> relecteurs = new ArrayList<Developer>();

        if(developers.size()>3){
            Random random = new Random();
            int index1 = getFistRelecteurIndex(random);
            addRelecteurSelected(relecteurs, index1);

            removeFirstRelecteurSelectedFromOriginListCandidat(index1);
            int index2 = getSecondRelecteurIndex(random);
            addRelecteurSelected(relecteurs, index2);

            return relecteurs;
        }
        return developers;
    }

    private void addRelecteurSelected(List<Developer> relecteurs, int index1) {
        relecteurs.add(developers.get(index1));
    }

    private  void removeDemandeur() {
        developers.remove(developer);
    }

    private int getFistRelecteurIndex(Random random) {
        return random.nextInt(developers.size());
    }

    private int getSecondRelecteurIndex(Random random) {
        return random.nextInt(developers.size()-1);
    }

    private  void removeFirstRelecteurSelectedFromOriginListCandidat(int index1) {
        developers.remove(developers.get(index1));
    }

}
