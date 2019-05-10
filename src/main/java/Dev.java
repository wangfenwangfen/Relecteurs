public class Dev {

    private final String nom;

    Dev(String nom) {
        this.nom = nom;
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
