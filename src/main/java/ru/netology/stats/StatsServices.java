package ru.netology.stats;

public class StatsServices {
    public int sumOfAll(int[] arr) {
        int sum = 0;
        for (int elm : arr) {
            sum += elm;
        }
        return sum;
    }

    public double averageSum(int[] arr) {
        return (double) sumOfAll(arr) / arr.length;
    }

    public int numOfTopSaleMonth(int[] arr) {
        int numOfMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[numOfMax]) {
                numOfMax = i;
            }
        }
        return numOfMax + 1;
    }

    public int numOfBotSaleMonth(int[] arr) {
        int numOfMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[numOfMin]) {
                numOfMin = i;
            }
        }
        return numOfMin + 1;
    }

    public int countOfLowAverageSale(int[] arr) {
        int count = 0;
        double av = averageSum(arr);
        for (int elm : arr) {
            if (elm < av) count++;
        }
        return count;
    }

    public int countOfHighAverageSale(int[] arr) {
        int count = 0;
        double av = averageSum(arr);
        for (int elm : arr) {
            if (elm > av) count++;
        }
        return count;
    }

}
