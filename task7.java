public class task7 {
    public static void main(String[] args){
        int totalLose = 7*1000;
        int wayOne = 250, wayTwo = 500;
        System.out.println("Сбрасывая в день по 250гр, ты достигнешь цели через "+totalLose/wayOne+" дней");
        System.out.println("Сбрасывая в день по 500гр, ты достигнешь цели через "+totalLose/wayTwo+" дней");
        System.out.println("В среднем для достижения цели потребуется "+totalLose/((wayOne+wayTwo)/2)+" дней");
    }
}
