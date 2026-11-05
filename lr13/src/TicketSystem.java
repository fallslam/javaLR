import java.util.ArrayList;
import java.util.List;

public class TicketSystem {
    private List<Train> trains = new ArrayList<>();

    public void addTrain(Train train) {
        trains.add(train);
    }


    public Train findTrain(String number) throws TrainNotFoundException {
        for (Train t : trains) {
            if (t.getNumber().equals(number)) {
                return t;
            }
        }
        throw new TrainNotFoundException("Поезд с номером " + number + " не найден");
    }


    public void buyTicket(String number) throws TrainNotFoundException, TicketException {
        Train t = findTrain(number);
        t.buyTicket();
    }


    public void cancelTicket(String number) throws TrainNotFoundException, TicketException {
        Train t = findTrain(number);
        t.cancelTicket();
    }


    public void showAllTrains() {
        if (trains.isEmpty()) {
            System.out.println("Список поездов пуст.");
            return;
        }
        for (Train t : trains) {
            System.out.println(t);
        }
    }
}