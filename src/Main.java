public class Main {
    public static void main(String[] args)
    {
        Task1();
        Task2();
        Task3();
        Task4();
    }

    public static int[] generateRandomArray()
    {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void  Task1()
    {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
    }

    public static void Task2()
    {
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int minPay = arr[0];
        int maxPay = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < minPay)
                minPay = arr[i];
            if(arr[i] > maxPay)
                maxPay = arr[i];
        }
        System.out.println("Минимальная сумма трат за день составила " + minPay + " рублей. " +
                "Максимальная сумма трат за день составила " + maxPay + " рублей");
        System.out.println();
    }

    public static void Task3()
    {
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        int total = 0;

        for(int i = 0; i < arr.length; i++)
        {
            total += arr[i];
        }
        double middleValue = total/30;
        System.out.println("Средняя сумма трат за месяц составила " + middleValue + " рублей");
        System.out.println();
    }

    public static void Task4()
    {
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for(int i = reverseFullName.length - 1; i >= 0; i--)
        {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

}