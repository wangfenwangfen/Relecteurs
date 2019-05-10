import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RelecteurTest {

    private Dev dev1 = new Dev("Houssam");
    private Dev dev2 = new Dev("Boris");
    private Dev dev3 = new Dev("Sandy");
    private Dev dev4 = new Dev("Kevin");
    private Dev dev5 = new Dev("Tristan");
    private Dev dev6 = new Dev("Mathieu");
    private Dev dev7 = new Dev("Erwan");
    private Dev dev8 = new Dev("Haifa");
    private Dev dev9 = new Dev("Fen");
    private Dev dev10 = new Dev("Hadrien");


    @Test
    public void only_three_persons_in_list_should_return_the_rest_relecteurs_without_demandeur() {

        List<Dev> devs = new ArrayList<Dev>();
        devs.add( dev1);
        devs.add(dev2);
        devs.add(dev3);

        List<Dev> relecteurs = dev1.selectRelecteurs(devs);

        List<Dev> relecteursExpected = new ArrayList<Dev>();
        relecteursExpected.add(dev2);
        relecteursExpected.add(dev3);

        Assertions.assertThat(relecteurs).isEqualTo(relecteursExpected);
    }

    @Test
    public void more_than_three_persons_in_list_should_return_two_relecteurs() {

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

        List<Dev> relecteurs = dev1.selectRelecteurs(devs);

        Assertions.assertThat(relecteurs.size()).isEqualTo(2);
    }

    @Test
    public void more_than_three_persons_in_list_should_return_two_relecteurs_without_demandeur() {

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

        List<Dev> relecteurs = dev1.selectRelecteurs(devs);

        Assertions.assertThat(relecteurs).doesNotContain(dev1);
    }

    @Test
    public void more_than_three_persons_in_list_should_return_two_different_relecteurs_without_demandeur() {

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

        List<Dev> relecteurs = dev1.selectRelecteurs(devs);

        Assertions.assertThat(relecteurs.get(0).equals(relecteurs.get(1))).isFalse();
    }
}
