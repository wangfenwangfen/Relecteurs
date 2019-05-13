import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RelecteurTest {

    private Developer developer1 = new Developer("Houssam");
    private Developer developer2 = new Developer("Boris");
    private Developer developer3 = new Developer("Sandy");
    private Developer developer4 = new Developer("Kevin");
    private Developer developer5 = new Developer("Tristan");
    private Developer developer6 = new Developer("Mathieu");
    private Developer developer7 = new Developer("Erwan");
    private Developer developer8 = new Developer("Haifa");
    private Developer developer9 = new Developer("Fen");
    private Developer developer10 = new Developer("Hadrien");


    @Test
    public void only_three_persons_in_list_should_return_the_rest_relecteurs_without_demandeur() {

        List<Developer> developers = new ArrayList<Developer>();
        developers.add(developer1);
        developers.add(developer2);
        developers.add(developer3);

        Selector selector = new Selector(developers);
        List<Developer> relecteurs = selector.selectRelecteurs("Houssam");

        List<Developer> relecteursExpected = new ArrayList<Developer>();
        relecteursExpected.add(developer2);
        relecteursExpected.add(developer3);

        Assertions.assertThat(relecteurs).isEqualTo(relecteursExpected);
    }

    @Test
    public void more_than_three_persons_in_list_should_return_two_relecteurs() {

        List<Developer> developers = new ArrayList<Developer>();
        developers.add(developer1);
        developers.add(developer2);
        developers.add(developer3);
        developers.add(developer4);
        developers.add(developer5);
        developers.add(developer6);
        developers.add(developer7);
        developers.add(developer8);
        developers.add(developer9);
        developers.add(developer10);

        Selector selector = new Selector(developers);
        List<Developer> relecteurs = selector.selectRelecteurs("Houssam");

        Assertions.assertThat(relecteurs.size()).isEqualTo(2);
    }

    @Test
    public void more_than_three_persons_in_list_should_return_two_relecteurs_without_demandeur() {

        List<Developer> developers = new ArrayList<Developer>();
        developers.add(developer1);
        developers.add(developer2);
        developers.add(developer3);
        developers.add(developer4);

        Selector selector = new Selector(developers);
        List<Developer> relecteurs = selector.selectRelecteurs("Houssam");

        Assertions.assertThat(relecteurs).doesNotContain(developer1);
    }

    @Test
    public void more_than_three_persons_in_list_should_return_two_different_relecteurs_without_demandeur() {

        List<Developer> developers = new ArrayList<Developer>();
        developers.add(developer1);
        developers.add(developer2);
        developers.add(developer3);
        developers.add(developer4);

        Selector selector = new Selector(developers);
        List<Developer> relecteurs = selector.selectRelecteurs("Houssam");

        Assertions.assertThat(relecteurs.get(0).equals(relecteurs.get(1))).isFalse();
    }

    @Test(expected=IllegalArgumentException.class)
    public void should_throw_illegal_argument_exception_if_have_less_than_three_devs_in_list() {
        List<Developer> developers = new ArrayList<Developer>();
        developers.add(developer1);
        developers.add(developer2);

        Selector selector = new Selector(developers);
    }
}
