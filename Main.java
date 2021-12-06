public class Main {
    public static void main(String[] args) {
        // Sample sample = new SampleImpl();
        // sample.test();

        // -------------------------------
        Caluculator calc = new Caluculator();
        //電卓できた
        calc.setNum1(10);
        calc.setOp(new Add());
        calc.setNum2(20);
        int result = calc.getResult();
        System.out.println(result);
    }
}
