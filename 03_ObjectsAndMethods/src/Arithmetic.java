public class Arithmetic {
    public int firstInt, secondInt;

    public Arithmetic(int first, int second){
        this.firstInt = first;
        this.secondInt = second;
    }

    public int totalSum(){

        return firstInt + secondInt;
    }

    public int totalProiz() {
        return firstInt * secondInt;
    }

    public int max() {
        if(firstInt > secondInt) {
            return firstInt;
        } else if(secondInt > firstInt) {
            return secondInt;
        } else return 0;
    }

    public int min() {
        if(firstInt < secondInt) {
            return firstInt;
        } else if(secondInt < firstInt) {
            return secondInt;
        }
        return 0;
    }

    public void print() {
        System.out.println("Произведение чисел: " + totalProiz());
        System.out.println("Сумма чисел: " + totalSum());
        System.out.println("Минимальное число: " + min());
        System.out.println("Максимальное число: " + max());
    }


}