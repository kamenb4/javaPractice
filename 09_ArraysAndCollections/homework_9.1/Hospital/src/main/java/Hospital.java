import java.text.DecimalFormat;

public class Hospital {

    static String str = "";
    static int count = 0;
    public static float[] generatePatientsTemperatures(int patientsCount) {

        //TODO: напишите метод генерации массива температур пациентов
        float[] patientsTemperature = new float[patientsCount];
        for(int i = 0; i < patientsTemperature.length; i++) {
            patientsTemperature[i] = (float) (Math.round(( (Math.random() * 8) + 32.0F) * 10.0) / 10.0);
            if (patientsTemperature[i] >= 36.2 && patientsTemperature[i] <= 36.9) {
                count++;
            }
            str += patientsTemperature[i] + " ";
        }
        return patientsTemperature;
    }

    public static String getReport(float[] temperatureData) {
        float average = 0.0F;
        for (int i = 0; i < temperatureData.length; i++) {
            average += temperatureData[i];
        }

        String formattedAverage = new DecimalFormat("#0.00").format
                (((average/ temperatureData.length) * 100.0) / 100.0);
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */




        String report =
                "Температуры пациентов: " + str.trim() +
                        "\nСредняя температура: " + formattedAverage +
                        "\nКоличество здоровых: " + count;

        return report;
    }
}
