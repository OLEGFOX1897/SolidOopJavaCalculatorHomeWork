import operation.OperationResolver;

/**
 * Класс с конструктором, получения арифметических вычислений, заданных в классе Present
 */
public class Calculator implements I_Model {

    private final OperationResolver operationResolver = new OperationResolver();

    private double x;
    private double y;

    //    int sign;
    @Override
    public void setNum(double value, double val) {
        this.x = value;
        this.y = val;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double result(int sign) {
        return operationResolver.getOperationBySign(sign).calculate(getX(), getY());
    }
}
