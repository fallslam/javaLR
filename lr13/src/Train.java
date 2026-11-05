public class Train {
    private String number;
    private String route;
    private int cars;
    private int seats;
    private int speed;
    private int soldTickets;

    public Train(String number, String route, int cars, int seats, int speed)
            throws InvalidTrainDataException {

        if (cars <= 0) {
            throw new InvalidTrainDataException("Количество вагонов должно быть > 0");
        }
        if (seats <= 0) {
            throw new InvalidTrainDataException("Количество мест должно быть > 0");
        }

        this.number = number;
        this.route = route;
        this.cars = cars;
        this.seats = seats;
        this.speed = speed;
        this.soldTickets = 0;
    }

    public void buyTicket() throws TicketException {
        if (soldTickets >= seats) {
            throw new TicketException("Нет свободных мест на поезд " + number);
        }
        soldTickets++;
        System.out.println("Билет куплен на поезд " + number + ". Осталось мест: " + getFreeSeats());
    }

    public void cancelTicket() throws TicketException {
        if (soldTickets <= 0) {
            throw new TicketException("Нет проданных билетов на поезд " + number);
        }
        soldTickets--;
        System.out.println("Билет отменён на поезд " + number + ". Осталось мест: " + getFreeSeats());
    }

    public int getFreeSeats() {
        return seats - soldTickets;
    }

    public String getNumber() { return number; }
    public String getRoute()  { return route; }
    public int getCars()      { return cars; }
    public int getSeats()     { return seats; }
    public int getSpeed()     { return speed; }

    @Override
    public String toString() {
        return "Поезд №" + number + "  маршрут: " + route +
                "  вагонов: " + cars + "  мест: " + seats +
                "  скорость: " + speed + " км/ч  свободно: " + getFreeSeats();
    }
}