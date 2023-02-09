/**
 * Класс, задающий общий алгоритм запуска программы. Так же реализовано логирование.
 */
public class Present {
    Calculator calculator;
    ViewModule viewModule;
    BasicLogger basicLogger;

    public Present(Calculator c, ViewModule v, BasicLogger cl) {
        calculator = c;
        viewModule = v;
        basicLogger = cl;
    }
    public void startProgram() {
        double a, b;
        int sign;
        boolean indOut=true;
        do {
            a = viewModule.getValue("a");
            b = viewModule.getValue("b");
            System.out.println("(+)-1, (-)-2, (*)-3, (/)-4");
            do {
                sign = viewModule.getInt("Введите цифру знака:");
                if (sign <= 4 & sign > 0){
                    indOut = false;
                }
                else System.out.println("Повторите ввод знака");
                basicLogger.logMessage("Неправильный ввод знака. Повторный ввод");
            } while (indOut);
            calculator.setNum(a, b);
            viewModule.printNum("Вычисленное значение=", calculator.result(sign));
            int outProgramme=viewModule.getInt("Если хотите повторить вычисление, нажмите 1");
            if (outProgramme==1){
                basicLogger.logMessage("Повторяем вычисление");
                indOut=true;
            }
            else basicLogger.logMessage("Программа завершена");
        }while (indOut);
//
    }
}
