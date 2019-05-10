import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dev {

    private final String nom;

    Dev(String nom) {
        this.nom = nom;
    }

    List<Dev> selectRelecteurs(List<Dev> devs) {
        removeDemandeur(devs);
        List<Dev> relecteurs = new ArrayList<Dev>();
        if(devs.size()>=3){
            Random random = new Random();
            int index1 = random.nextInt(devs.size());
            int index2 = random.nextInt(devs.size()-1);
            relecteurs.add(devs.get(index1));
            removeFirstRelecteurSelected(devs, index1);
            relecteurs.add(devs.get(index2));
            return relecteurs;
        }
        return devs;
    }

    private void removeFirstRelecteurSelected(List<Dev> devs, int index1) {
        devs.remove(devs.get(index1));
    }

    private void removeDemandeur(List<Dev> devs) {
        devs.remove(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dev dev = (Dev) o;

        return nom != null ? nom.equals(dev.nom) : dev.nom == null;
    }

    @Override
    public int hashCode() {
        return nom != null ? nom.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
