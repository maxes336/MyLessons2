public class Lesson3 {
    public static void main(String[] args) {
        int[] intArray = {0, 2, 3, 10};
        int arrayLength = intArray.length;
        System.out.println("Array Length = " + arrayLength);

        int arrayItem = intArray[2];
        System.out.println("Item 2 = " + arrayItem);
        System.out.println("Item last = " + intArray[intArray.length - 1]);

        //Immutability
        //System.out.println(intArray);
        intArray[0] = 100;
        int[] emptyArray = new int[3];
        emptyArray[0] = 1;
        emptyArray[1] = 5;
        emptyArray[2] = 10;
        //emptyArray[3] = 4;
        //emptyArray[4] = 5;
        System.out.println("emptyArray.length " + emptyArray.length);

        for (int i = emptyArray.length - 1; i >= 0; i--) {
            System.out.println("Array[" + i + "] = " + emptyArray[i]);
        }

        int k = 0;
        printArrayByWhile(emptyArray);

        //Создайте метод, выводящий на экран первые 55 элементов
        // последовательности 1 3 5 7 9 11 13 15 17 …. Цикл FOR
        //printOddByNumber(55);
        // printOddByNumber(900);
        printOddByNumberUseWhile(10);
        System.out.println();
        int a = 10;
        int[] array = {0, 1, 2};
        variableMutator(a);
        arrayMutator(array);
        System.out.println("a= " + a);
        printArrayByWhile(array);

        int[] generatedArray = generateArray(0, 10, 5);
        printArrayByWhile(generatedArray);
        int sum = getSum(generatedArray);
        System.out.println(" Sum = " + sum);
        printOdd(generatedArray);
        printMinMax(generatedArray);
        homeWork();

    }

    public static void print5(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 != 0) {
                continue;
            }
            System.out.println("5 -> " + array[i]);
        }
    }

    public static int printFirstIndexFor0(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.println("o value has index = " + i);
                //break;
                return i;
            }
        }
        System.out.println("End of method");
        return -1;
    }

    public static void printMinMax(int[] array) {
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Max element Index is: " + maxIndex);
        System.out.println("Min element Index is: " + minIndex);

        System.out.println("Max element value is: " + array[maxIndex]);
        System.out.println("Min element value is: " + array[minIndex]);

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
    }


    public static void printOdd(int[] array) {
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }

        System.out.println("Odd count: " + oddCount);
    }


    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    public static int[] generateArray(int from, int to, int capacity) {
        int[] result = new int[capacity];
        for (int i = 0; i < result.length; i++) {
            result[i] = Lesson2.getRandomFromRange(from, to);
        }
        return result;
    }

    public static void variableMutator(int a) {
        a = a + 1;
        System.out.println("a in mutator = " + a);
    }

    public static void arrayMutator(int[] array) {
        array[0] = 9999;
    }


    public static void printArrayByWhile(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static void printOddByNumberUseWhile(int count) {
        int i = 0;
        int j = 1;
        while (i < count) {
            System.out.print(j + ", ");
            j += 2;
            i++;
        }
    }

    public static void printOddByNumber(int count) {
        int j = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(j + ", ");
            j += 2;
        }
    }

    ///////////////////////////////////////
    ///////////////////////////////////////
    //HOMEWORK
    public static void homeWork() {
        System.out.println();
        System.out.println("THIS IS MY HOMEWORK:");
        printDigits();
        System.out.println();
        printNumbersMultiple5();
        System.out.println();
        printMultipleNumbers(5, 0, 100);
        System.out.println();
        print20elements();
        System.out.println();
        printFiboArray();
        System.out.println();
        System.out.println();
        createArrayWithLength20(-100, 100, 20);
    }

    public static void printDigits() {
        int a = 1000;
        while (a < 10000) {
            System.out.print(a + ", ");
            a += 3;
        }
    }

    public static void printNumbersMultiple5() {
        int a = 100;
        while (a <= 200) {
            System.out.print(a + ", ");
            a += 5;
        }
    }

    public static void printMultipleNumbers(int mult, int begin, int end) {
        while (begin <= end) {
            System.out.print(begin + ", ");
            begin += mult;
        }
    }

    public static void print20elements() {
        int count = 1;
        int a = 2;
        do {
            System.out.print(count + ". " + a + ",   ");
            a = a * 2;
            count++;
        } while (count <= 20);
    }

    public static void printFiboArray() {
        int[] fiboArray = new int[20];
        int fiboNumber1 = 0;
        int fiboNumber2 = 1;
        for (int p = 0; p < 20; p++) {
            int fiboNumber3 = fiboNumber1 + fiboNumber2;
            fiboArray[p] = fiboNumber3;
            fiboNumber1 = fiboNumber2;
            fiboNumber2 = fiboNumber3;
        }
        printArrayByWhile(fiboArray);
    }

    public static void createArrayWithLength20(int from, int to, int capacity) {
        int positive = 0;
        int negative = 0;
        int tempNumber = 0;
        int[] randomArray = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            do {
                tempNumber = Lesson2.getRandomFromRange(from, to);
                //System.out.print(tempNumber+", ");
            }while(tempNumber==0);
            randomArray[i]= tempNumber;
            if (tempNumber>0){
                positive++;
                if(positive>(capacity/2)){
                    i--;
                }
            }else{
                negative++;
                if(negative>(capacity/2)){
                    i--;
                }
            }
        }
        System.out.print("randomArray(50% positive and 50% negative): ");
        printArrayByWhile(randomArray);
    }
}