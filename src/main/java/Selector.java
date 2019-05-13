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

        List<Developer> relecteurs;
        relecteurs = listWithoutTheDeveloper(this.developer,this.developers);

        if(developers.size()>3){
            List<Developer> relecteursFinal = new ArrayList<Developer>();

            Random random = new Random();
            int index1 = getRelecteurIndex(random, relecteurs);
            relecteursFinal.add(relecteurs.get(index1));

          relecteurs =  listWithoutTheDeveloper(relecteurs.get(index1),relecteurs);

            int index2 = getRelecteurIndex(random,relecteurs);
            relecteursFinal.add(relecteurs.get(index2));

            return relecteursFinal;
        }
        return relecteurs;
    }

    private List<Developer> listWithoutTheDeveloper(Developer developerParam, List<Developer>developers) {
        List<Developer> relecteurs = new ArrayList<Developer>();
        for(Developer developer : developers){
            if(!developer.equals(developerParam)){
                relecteurs.add(developer);
            }
        }
        return relecteurs;
    }

    private int getRelecteurIndex(Random random, List<Developer> relecteurs) {
        return random.nextInt(relecteurs.size());
    }
}
