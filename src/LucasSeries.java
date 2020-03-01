import javax.swing.text.html.parser.Parser;

public class LucasSeries implements ISubscriber {

    @Override
    public void notifySubscriber(String input) {
        int number = Integer.parseInt(input);
        System.out.println("Lucas series output is (" + lucasSeries(number) + ")" );
    }

    private Integer lucasSeries(Integer x) {
        if (x < 2)
            return 2 - x;
        return lucasSeries(x - 1) + lucasSeries(x - 2);
    }

}
