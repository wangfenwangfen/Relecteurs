import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RelecteurTest {

    private Dev dev1 = new Dev("Houssam");
    private Dev dev2 = new Dev("Boris");
    private Dev dev3 = new Dev("Sandy");

    @Test
    public void only_three_persons_in_list_should_return_two_relececteurs_without_demandeur() {

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
}
