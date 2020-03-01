
public class MultiplicationSeriesSubscriber
{
    public int calcMultiplicationSeries(int number) {
        int res = 1;
        for (int i = 0; i < number; i++) {
            res = res * number;
        }
        return res;
    }

    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
        System.out.println("Hello, I am really a simple subscriber and I am notified with "
                + input + " and the result of multiplication series of input is: " + calcMultiplicationSeries((int)input));
    }
}