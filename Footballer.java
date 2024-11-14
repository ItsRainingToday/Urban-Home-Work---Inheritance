public class Footballer extends Sportsman {
    public Footballer(String name, String team, int age) {
        super(name, team, age); // это конструктор объекта
    }

    @Override
    public void traning() {
        System.out.println("Футболист приступил к тренировке");
    }

    @Override
    public void contest() {
        System.out.println("Футболит участвует в игре");
    }

    public int scoringGoals(int score){
        System.out.println("Футболит в игре забил - " +score +" раз(а)");
        return score;
    }
}

