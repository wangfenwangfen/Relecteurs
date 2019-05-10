import java.util.List;

public class Dev {

    private final String nom;

    Dev(String nom) {
        this.nom = nom;
    }

    List<Dev> selectRelecteurs(List<Dev> devs) {
        devs.remove(this);
        return devs;
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
}
