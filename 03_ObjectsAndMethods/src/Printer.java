public class Printer {
    public String queue = "";
    public static int count =0;
    public int totalAmount = 0;

    public static void main(String[] args) {
        Printer print = new Printer();
        print.paper(200);
        print.append("Some text", "Name", 1);
        print.append("Text too", "Name 2");
        print.append("Prikol");
        print.print("Документы на печать: ");
    }
    public void paper(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void append(String text, String name, int number) {
        queue = queue + "\n" + text + " " + name + " - " + number;
        count = count + 1;
        totalAmount = totalAmount - 1;
    }

    public void append(String text, String name) {
        queue = queue + "\n" + text + " " + name;
        count = count + 1;
        totalAmount = totalAmount - 1;
    }

    public void append(String text) {
        queue = queue + "\n" + text;
        count = count + 1;
        totalAmount = totalAmount - 1;
    }

    public int getTotalAmount() {
        return totalAmount;
    }


    public int getPendingPagesCount() {
        return count;
    }

    public void clear() {
        queue = "";
        count = 0;
    }

    public void print(String title) {
        System.out.println(title);
        if(queue.isEmpty()) {
            System.out.println("Очередь на печать пуста...");
        } else {
            System.out.println(queue + "\n");
            System.out.println("Страниц в очереди на печать: " + getPendingPagesCount());
            System.out.println("Распечатано листов: " + getTotalAmount());
            clear();
        }

    }
}
