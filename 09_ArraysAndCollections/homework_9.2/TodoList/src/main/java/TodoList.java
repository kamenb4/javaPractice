import java.util.ArrayList;

public class TodoList {

    public static ArrayList<String> toDoList = new ArrayList<>();

    public void add(String todo) {

        toDoList.add(todo);
        // TODO: добавьте переданное дело в конец списка
    }

    public void add(int index, String todo) {
        if (!(index > toDoList.size()) && !(index < 0)) {
            toDoList.add(index, todo);
        } else toDoList.add(todo);
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
    }

    public void edit(String todo, int index) {

        for (int i = 0; i < toDoList.size() - 1; i++) {
            if (index > toDoList.size()) {
                break;
            } else toDoList.set(index, todo);
        }

        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
        if (!(index > toDoList.size()) && !(index < 0)) {
            toDoList.remove(index);
            toDoList.trimToSize();
        }

        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return toDoList;
    }

}