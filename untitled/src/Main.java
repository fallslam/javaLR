public static void main(String[] args) {
    System.out.println("Выбериет задание 1-3");
    Scanner in = new Scanner(System.in);
    switch (in.nextInt()) {
        case 1: {
            Smartphone phone = new Smartphone("Samsung", 6.5, 4);
            Smartphone phone1 = new Smartphone("Samsung", 6.5, 12);
            System.out.println("Хорошая батарея? " + phone.isGoodBattery());
            System.out.println("Хорошая батарея? " + phone1.isGoodBattery());
            System.out.println(phone);
            break;


        }
        case 2: {
            Park[] a = new Park[6];
            a[0]=new Park("Парк Победы", 32.123,1200);
            a[1]=new Park("Парк Павлова", 2.123,100);
            a[2]=new Park("Парк Горького", 12.123,1000);
            a[3]=new Park("Парк Челюскинцев", 3.123,2111);
            a[4]=new Park("Парк Ленина", 1.100,3403);
            a[5]=new Park("Парк Радуга", 112.123,43211);

            Park maxTres = a[0];
            Park maxArea = a[0];

            for (int i = 1; i < a.length; i++) {
                if (a[i].trees > maxTres.trees) {
                    maxTres = a[i];
                }
                if (a[i].area > maxArea.area) {
                    maxArea = a[i];
                }
            }
            System.out.println("Парк с максимальным кол-во деревьев: "+ maxTres.name+": "+maxTres.trees+" деревьев");
            System.out.println("Парк с максимальной площадью: "+ maxArea.name+": "+maxArea.area+" км.кв");
            break;
        }
        case 3: {
            Order[]order = new Order[5];
            order[0]= new Order(1,OrderStatus.DELIVERED);
            order[1]= new Order(2,OrderStatus.PENDING);
            order[2]= new Order(3,OrderStatus.SHIPPED);
            order[3]= new Order(4,OrderStatus.SHIPPED);
            order[4]=new Order(5,OrderStatus.RETURNED);
            System.out.println("все заказы со статусом SHIPPED");
            for(int i=0;i<order.length;i++){
                if(order[i].status == OrderStatus.SHIPPED)
                    System.out.println("id заказа:"+order[i].id);
            }
            break;

        }
        }

    }