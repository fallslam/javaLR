import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Train> database = new ArrayList<>();

    public static void main(String[] args) {
        try {

            database.add(new Train("102А", "КиБип - Андреева", 12, 50, 160));
            database.add(new Train("045В", "Экзамен - Завтра", 8, 1, 120));

            System.out.println(" Проверка работы системы ");


            Train train1 = findTrain("102А");
            train1.buyTicket();


            train1.cancelTicket();


            Train train2 = findTrain("045В");
            train2.buyTicket();
            train2.buyTicket();

        }
        catch (InvalidTrainDataException | TrainNotFoundException | TicketException e) {
            System.err.println(e.getMessage());
        }




        try {
            database.add(new Train("112B", "Поселок - веселый", 12, 50, 160));
            Train train1 = findTrain("10");
            train1.buyTicket();

        } catch (InvalidTrainDataException | TrainNotFoundException | TicketException e ) {
            System.err.println(e.getMessage());
        }



        try {
            findTrain("999Х");
        } catch (TrainNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public static Train findTrain(String number) throws TrainNotFoundException {
        for (Train train : database) {
            if (train.getNumber().equals(number)) {
                return train;
            }
        }
        throw new TrainNotFoundException("Ошибка: Поезд с номером " + number + " не найден.");
    }
}
