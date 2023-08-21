import ru.netology.stats.StatsServices;


public class Main {
    public static void main(String[] args) {
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsServices service = new StatsServices();
        int sum = service.sumOfAll(array);
        double avSum = service.averageSum(array);
        int topNum = service.numOfTopSaleMonth(array);
        int botNum = service.numOfBotSaleMonth(array);
        int lowAvSale = service.countOfLowAverageSale(array);
        int highAvSale = service.countOfHighAverageSale(array);
        System.out.println("SumOfAll: " + sum + "\nAverageSum: " + avSum + "\nNumOfTopSaleMonth: " + topNum +
                "\nNumOfBotSaleMonth: " + botNum + "\nCountOfLowAverageSale: " + lowAvSale +
                "\nCountOfHighAverageSale: " + highAvSale);
    }
}
