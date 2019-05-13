import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
         Developer developer1 = new Developer("Houssam");
         Developer developer2 = new Developer("Boris");
         Developer developer3 = new Developer("Sandy");
         Developer developer4 = new Developer("Kevin");
         Developer developer5 = new Developer("Tristan");
         Developer developer6 = new Developer("Mathieu");
         Developer developer7 = new Developer("Erwan");
         Developer developer8 = new Developer("Haifa");
         Developer developer9 = new Developer("Fen");
         Developer developer10 = new Developer("Hadrien");
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

        DialoguePanelUtile dialoguePanelUtile = new DialoguePanelUtile();

        dialoguePanelUtile.dialoguePanel(selector);
    }
}


