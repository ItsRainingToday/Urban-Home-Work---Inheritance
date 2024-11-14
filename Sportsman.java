public class Sportsman  {
    private String name;
    private String team;
    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sportsman (String name, String team, int age){
        this.name = name;
        this.team = team;
        this.age = age;
    }

    public void traning(){
        System.out.println("Спортсмен приступил к тренировке");
    }

    public void contest(){
        System.out.println("Спортсмен участвует на соревнованиях");
    }
}

