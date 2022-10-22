public class task8 {
    public static void main(String[] args){
        int mashaOld = 67760, denisOld = 83690, kristinaOld = 76230;
        int mashaNew = mashaOld + mashaOld/100*10, denisNew = denisOld + denisOld/100*10, kristinaNew = kristinaOld + kristinaOld/100*10;
        int mashaDiff = mashaNew*12 - mashaOld*12, denisDiff = denisNew*12 - denisOld*12, kristinaDiff = kristinaNew*12 - kristinaOld*12;
        System.out.println("Маша теперь получает "+mashaNew+" рублей. Годовой доход вырос на "+mashaDiff+" рублей");
        System.out.println("Денис теперь получает "+denisNew+" рублей. Годовой доход вырос на "+denisDiff+" рублей");
        System.out.println("Кристина теперь получает "+kristinaNew+" рублей. Годовой доход вырос на "+kristinaDiff+" рублей");
    }
}
