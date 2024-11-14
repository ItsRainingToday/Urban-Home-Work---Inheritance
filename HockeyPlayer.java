public class HockeyPlayer extends Sportsman {
    public HockeyPlayer(String name, String team, int age) {
        super(name, team, age); // это конструктор объекта
    }

    @Override
    public void contest() {
        System.out.println("Хокеист участвует в игре");
    }

    @Override
    public void traning() {
        System.out.println("Хокеист приступил к тренировке");
    }

    public int matches(int match){
        System.out.println("Хокеист участвовал за год - " +match +" матчей");
        return match;
    }
}
