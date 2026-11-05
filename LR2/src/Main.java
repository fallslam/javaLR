void main() {
    System.out.println("Выберите задачу:");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    switch (n){
        case 1:
            System.out.println("Введите 10 целых чисел:");
            int[]mass = new int [10];
            for(int i=0; i<mass.length; i++) {
            mass[i] = s.nextInt();
            }
            for (int i=0; i<mass.length; i++){
                System.out.println(mass[i]);
            }
            int max=mass[0];
            for(int i=0; i<mass.length;i++){
                if(mass[i] > max){
                    max = mass[i];
                }
            }
            int next = mass[0];
            for(int i=0;i<mass.length;i++){
                if(mass[i]> next && mass[i]<max){
                    next = mass[i];
                }
            }
            System.out.println("Второй по величине элкмент"+next);
            break;
        case 2:
            System.out.println("Введите 9 целых чисел:");

            Random random = new Random();
            int[][]arr = new int[3][3];
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    arr[i][j] = random.nextInt(21)-10;

                }
            }
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (arr[i][j] % 2 != 0) {
                        count++;
                    }
                }
            }
            int[]mas = new int[count];
            int size=0;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    if(arr[i][j]%2!=0){
                        mas[size]=arr[i][j];
                        size++;
                    }
                }
            }
            System.out.println("Одномерный массив из дыумерного:");
            for(int i=0;i<mas.length;i++){
                System.out.print(mas[i]+" ");
            }
    }
}
