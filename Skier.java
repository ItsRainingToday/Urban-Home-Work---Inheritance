public class Skier extends Sportsman {
    public Skier(String name, String team, int age) {
        super(name, team, age); // это конструктор объекта
    }

    @Override
    public void traning() {
        System.out.println("Лыжник приступил к тренировке");
    }

    @Override
    public void contest() {
        System.out.println("Лыжник участвует в соревнованиях");
    }

    public int result(int medal){
        if (medal == 1){
            System.out.println("Лыжник на соревнованиях занял I место и получил золотую медаль");
        } else if(medal == 2){
            System.out.println("Лыжник на соревнованиях занял II место и получил серебряную медаль");
        } else if(medal == 3){
            System.out.println("Лыжник на соревнованиях занял III место и получил бронзовую медаль");
        } else {
            System.out.println("Лыжник на соревнованиях не занял призовое место");
        }
        return medal;
    }
}

