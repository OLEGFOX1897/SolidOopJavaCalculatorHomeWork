package operation.impl;

import operation.BiOperation;

public class Subtraction implements BiOperation {

    @Override
    public Double calculate(Double a, Double b) {
        return a - b;
    }
}
