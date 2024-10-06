//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Создание объекта сервиса
        BmiService bmiService = new BmiService();

        // Входные данные
        double weightKg = 48.0;
        double heightMeters = 1.6;

        // Расчёт BMI
        int bmi = bmiService.calculate(weightKg, heightMeters);

        // Вывод результата
        System.out.println("Ваш BMI: " + bmi);

        }
}