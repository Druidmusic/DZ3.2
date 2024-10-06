// BmiService.java
public class BmiService {
    /**
     * Рассчитываем индекс массы тела (BMI).
     *
     * @param weightKg Вес в килограммах.
     * @param heightMeters Рост в метрах.
     * @return BMI как целое число.
     */
    public int calculate(double weightKg, double heightMeters) {
        double bmi = weightKg / (heightMeters * heightMeters);
        return (int) bmi;
    }
}