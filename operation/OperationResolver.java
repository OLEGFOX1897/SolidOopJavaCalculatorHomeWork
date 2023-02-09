package operation;

import operation.impl.Addition;
import operation.impl.Division;
import operation.impl.Multiplication;
import operation.impl.Subtraction;

import java.util.HashMap;
import java.util.Map;

public class OperationResolver {

    private final Map<Integer, BiOperation> operations;

    public OperationResolver() {
        operations = new HashMap<>();
        operations.put(1, new Addition());
        operations.put(2, new Subtraction());
        operations.put(3, new Multiplication());
        operations.put(4, new Division());
    }

    public BiOperation getOperationBySign(int sign) {
        return operations.get(sign);
    }
}
