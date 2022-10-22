public class task4 {
    public static void main(String[] args){
    int capacityPerMinute = 16/2;
    String firstCase = "За 20 минут машина производит ", secondCase = "За сутки машина производит ", thirdCase = "За 3 дня машина производит ", fourthCase = "За 1 месяц (30 суток) машина производит ", bottle = " бутылок.";
    System.out.println(firstCase + capacityPerMinute*20 + bottle + '\n' + secondCase + capacityPerMinute*60*24 + bottle + '\n' + thirdCase + capacityPerMinute*60*24*3 + bottle + '\n' + fourthCase + capacityPerMinute*60*24*30 + bottle);
    }
}
