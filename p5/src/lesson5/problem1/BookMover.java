package lesson5.problem1;

abstract class BookMover {
    protected void moveToStatus(Book book, Status requestedStatus) {
        System.out.println("Moving status...");
    }
}
