import java.util.Arrays;
public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        //TODO: напишите метод генерации массива температур пациентов
        float[] patientsTemperature = new float[patientsCount];
        for(int i = 0; i < patientsTemperature.length; i++) {
            patientsTemperature[i] = (float) (Math.round(((float) (Math.random() * 8) + 32) * 10.0) / 10.0);
        }
        return patientsTemperature;
    }

    public static String getReport(float[] temperatureData) {
        temperatureData = generatePatientsTemperatures(30);

        String temp = Arrays.toString(temperatureData);
        temp += temp.trim();
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
        int count = 0;
        for (int i = 0; i < temperatureData.length; i++) {
            if (temperatureData[i] > 32.0 && temperatureData[i] < 40.0) {
                count++;
            }
        }


        String report =
                "Температуры пациентов: " + temp +
                        "\nСредняя температура: " + 0 +
                        "\nКоличество здоровых: " + count;

        return report;
    }
}
