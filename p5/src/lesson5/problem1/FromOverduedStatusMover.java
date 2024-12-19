package lesson5.problem1;

public class FromOverduedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() != Status.OVERDUED) {
            System.out.println("Перевод книги из статуса " + book.getStatus() + " в статус " + requestedStatus + " невозможен");
            return;
        }
        switch (requestedStatus) {
            case AVAILABLE:
                book.setStatus(requestedStatus);
                break;
            default:
                System.out.println("Перевод книги из статуса OVERDUED в статус " + requestedStatus + " невозможен");
        }
    }
}
