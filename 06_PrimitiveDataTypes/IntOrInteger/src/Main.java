public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());


        for(char alph = 'Ё'; alph <= 'ё'; alph++) {
            if (alph > 'Ё' && alph < 'А' || alph > 'я' && alph < 'ё'){
                continue;
            }
            System.out.println(alph + " (" + ((int) alph) + ")");
        }

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

    }
}
