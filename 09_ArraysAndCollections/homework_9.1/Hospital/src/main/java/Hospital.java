import java.text.DecimalFormat;

public class Hospital {



    public static float[] generatePatientsTemperatures(int patientsCount) {

        //TODO: напишите метод генерации массива температур пациентов
        float[] patientsTemperature = new float[patientsCount];
        for(int i = 0; i < patientsTemperature.length; i++) {
            patientsTemperature[i] = (float) (Math.round(( (Math.random() * 8) + 32.0F) * 10.0) / 10.0);

        }
        return patientsTemperature;
    }

    public static String getReport(float[] temperatureData) {
        String str = "";
        int count = 0;
        float average = 0.0F;
        for (int i = 0; i < temperatureData.length; i++) {
            average += temperatureData[i];
            str += temperatureData[i] + " ";
            if (temperatureData[i] >= 36.2F && temperatureData[i] <= 36.9F) {
                count++;
            }
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
