package operation.impl;

import operation.BiOperation;

public class Addition implements BiOperation {
    @Override
    public Double calculate(Double a, Double b) {
        return a + b;
    }
}
