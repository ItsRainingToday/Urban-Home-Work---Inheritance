public class Main {
    public static void main(String[] args) {
    Footballer[] footballer = new Footballer[2];
    footballer[0] = new Footballer("Игорь","Спартак",20);
    footballer[1] = new Footballer("Леонид","ЦСКА",19);

    for (int i1 = 0; i1<=1; i1++){
        System.out.println("Футболист по имени: " +footballer[i1].getName() +" из команды: " +footballer[i1].getTeam() +" со стажем: " +footballer[i1].getAge() +" лет");
        footballer[i1].traning();
        footballer[i1].contest();
        footballer[i1].scoringGoals((int) (Math.random() * 5));
        System.out.println();
    }

        System.out.println();

    HockeyPlayer[] hockeyPlayers = new HockeyPlayer[2];
    hockeyPlayers[0] = new HockeyPlayer("Александр","Медведи",2);
    hockeyPlayers[1] = new HockeyPlayer("Виталий","СКА",13);

    for (int i2 = 0; i2<=1; i2++){
        System.out.println("Хокеист по имени: " +hockeyPlayers[i2].getName() +" из команды: " +hockeyPlayers[i2].getTeam() +" со стажем: " +hockeyPlayers[i2].getAge() +" лет");
        hockeyPlayers[i2].traning();
        hockeyPlayers[i2].contest();
        hockeyPlayers[i2].matches((int) (Math.random() * 200));
        System.out.println();
    }

        Skier[] skiers = new Skier[2];
        skiers[0] = new Skier("Евгений","России",7);
        skiers[1] = new Skier("Виктор","Края",11);

        for (int i3 = 0; i3<=1; i3++){
            System.out.println("Лыжник по имени: " +skiers[i3].getName() +" из зборной: " +skiers[i3].getTeam() +" со стажем: " +skiers[i3].getAge() +" лет");
            skiers[i3].traning();
            skiers[i3].contest();
            skiers[i3].result((int) (Math.random() * 4));
            System.out.println();
        }
    }
}
