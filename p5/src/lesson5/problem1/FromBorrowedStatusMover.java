package lesson5.problem1;

public class FromBorrowedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() != Status.BORROWED) {
            System.out.println("Перевод книги из статуса " + book.getStatus() + " в статус " + requestedStatus + " невозможен");
            return;
        }
        switch (requestedStatus) {
            case AVAILABLE:
            case OVERDUED:
            case ARCHIVED:
                book.setStatus(requestedStatus);
                break;
            default:
                System.out.println("Перевод книги из статуса BORROWED в статус " + requestedStatus + " невозможен");
        }
    }
}
