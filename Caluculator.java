public class Caluculator {
    
    private int num1;
    private int num2;
    private Operator op;
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public Operator getOp() {
        return op;
    }
    public void setOp(Operator op) {
        this.op = op;
    }

    public int getResult() {
        return this.op.execute(num1, num2);
    }

    
}
