import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Класс с методами для ввода и вывода информации
 */
public class ViewModule {
    Scanner inputNum = new Scanner(System.in);

    BasicLogger logger = BasicLogger.getInstance();

    public Double getValue(String outName) {
        System.out.printf("Введите число %s \n", outName);
        do {
            try {
                double value = inputNum.nextDouble();
                logger.logMessage(String.format("%s  %f", outName, value));
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Попробуйте еще раз");
                logger.logMessage(String.format("Ошибка ввода числа %s \n", outName));
                inputNum.nextLine();
            }
        } while (true);

    }

    public int getInt(String outName) {
        System.out.printf("Введите число %s \n", outName);
        do {
            try {
                int value = inputNum.nextInt();
                logger.logMessage(String.format("%s = %d", outName, value));
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Попробуйте еще раз");
                logger.logMessage(String.format("Ошибка ввода числа %s \n", outName));
                inputNum.nextLine();
            }
        } while (true);
    }

//    public int getSign(String sign) {
//        System.out.printf("%s", sign);
//        return inputNum.nextInt();
//    }

    public void printNum(String outName, double data) {
        logger.logMessage(String.format("%s  %f", outName, data));
        System.out.printf("%s %f\n", outName, data);
    }
}