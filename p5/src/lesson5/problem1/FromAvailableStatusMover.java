package lesson5.problem1;

public class FromAvailableStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() != Status.AVAILABLE) {
            System.out.println("Перевод книги из статуса " + book.getStatus() + " в статус " + requestedStatus + " невозможен");
            return;
        }
        switch (requestedStatus) {
            case BORROWED:
            case ARCHIVED:
                book.setStatus(requestedStatus);
                break;
            default:
                System.out.println("Перевод книги из статуса AVAILABLE в статус " + requestedStatus + " невозможен");
        }
    }
}
