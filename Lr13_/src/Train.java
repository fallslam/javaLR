class Train {
    private String number;
    private String route;
    private int cars;
    private int seats;
    private int speed;


    public Train(String number, String route, int cars, int seats, int speed) throws InvalidTrainDataException {
        setCars(cars);
        setSeats(seats);

        this.number = number;
        this.route = route;
        this.speed = speed;
    }


    public String getNumber() { return number; }
    public String getRoute() { return route; }
    public int getSeats() { return seats; }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setCars(int cars) throws InvalidTrainDataException {
        if (cars <= 0) {
            throw new InvalidTrainDataException("Ошибка: Количество вагонов должно быть больше 0.");
        }
        this.cars = cars;
    }

    public void setSeats(int seats) throws InvalidTrainDataException {
        if (seats <= 0) {
            throw new InvalidTrainDataException("Ошибка: Количество мест должно быть больше 0.");
        }
        this.seats = seats;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void buyTicket() throws TicketException {
        if (seats <= 0) {
            throw new TicketException("Ошибка: Нет свободных мест на поезд " + number);
        }
        seats--;
        System.out.println("Билет успешно куплен на поезд " + number + ". Осталось мест: " + seats);
    }


    public void cancelTicket() {
        seats++;
        System.out.println("Билет отменен для поезда " + number + ". Свободных мест теперь: " + seats);
    }
}
