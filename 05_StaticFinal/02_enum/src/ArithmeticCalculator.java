public class ArithmeticCalculator {
    public int x,y;
    public int type;

    public ArithmeticCalculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int calculate(Operation type) {
        if (type == Operation.ADD) {
            return x + y;
        } else if (type == Operation.SUBTRACT) {
            return x - y;
        } else if (type == Operation.MULTIPLY) {
            return x * y;
        } else return 0;
    }

}
