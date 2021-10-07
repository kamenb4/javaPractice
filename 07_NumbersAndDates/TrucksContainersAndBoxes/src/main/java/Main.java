import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();

        int trucks = 0;
        int container = 0;
        int boxInContainer = 27;
        int containerInTruck = 12;
        int box = Integer.parseInt(boxes);

        if(box > 0){
            trucks = 1;
            container = 1;
            System.out.println("Грузовик: " + trucks);
            System.out.println("\tКонтейнер: " + container);
            for(int i = 1; i <= box; i++) {
                System.out.println("\t\tЯщик: " + i);
                if(i % (boxInContainer * containerInTruck) == 0) {
                    trucks += 1;
                    container += 1;
                    System.out.println("Грузовик: " + trucks);
                    System.out.println("\tКонтейнер: " + container);
                } else if (i % boxInContainer == 0 && box > boxInContainer) {
                    container += 1;
                    System.out.println("\tКонтейнер: " + container);
                }
            }
        }
        System.out.println("Необходимо:" + "\n" + "грузовиков - " + trucks + " шт." + "\n" +
                "контейнеров - " + container + " шт.");


        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

}
