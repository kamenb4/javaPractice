public class Elevator {
    public int currentFloor = 5;
    public int minFloor, maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
        System.out.println(currentFloor + " этаж");
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        System.out.println(currentFloor + " этаж");
    }

    public void move(int floor) {
        while(floor > currentFloor) {
            moveUp();
        }
        while (floor < currentFloor) {
            moveDown();
        }
    }

}
