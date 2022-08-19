public class Main {
    public static void main(String[] args) {
        AbstractAnimal cow1 = new Cow(100, 5,  "Murka","female");
        AbstractAnimal cow2 = new Cow(120, 4, "Fendinant", "male");
        AbstractAnimal cow3 = new Cow(98, 5, "Boni", "female");
        AbstractAnimal cow4 = new Cow(104, 6, "Sem", "female");
        AbstractAnimal cow5 = new Cow(110, 4, "Tommy" ,"male");
        AbstractAnimal sheep1 = new Sheep(35, 3, "Sharm", "male");
        AbstractAnimal sheep2 = new Sheep(46, 4, "Kalina", "female");
        AbstractAnimal sheep3 = new Sheep(43, 4, "Deni", "male");
        AbstractAnimal horse1 = new Horse(145, 6, "Barhat", "female", "white");
        AbstractAnimal horse2 = new Horse(147, 7, "Zefir", "male", "black");

        AbstractAnimal cow6 = new Cow(106, 4,  "Teni","female");
        AbstractAnimal sheep4= new Sheep(39, 3, "Kyrpyk", "male");
        AbstractAnimal horse3 = new Horse(142, 6, "Boika", "male", "white");
        System.out.println("Farm1:");
        AbstractAnimal[] farm1={cow1,cow2,cow3,cow4,cow5,sheep1,sheep2,sheep3,horse1,horse2};
        for(AbstractAnimal farm:farm1){
            if((farm instanceof Horse)){
                System.out.println("nikeName:"+farm.getNickName()+" age:"+farm.getAge()+" gender:"+farm.getGender()+" weight:"+farm.getWeight()+" color :"+((Horse)farm).getColor());
                System.out.println("-----------------------------------------------------------");
            }
            else{
                System.out.println("nikeName:"+farm.getNickName()+" age:"+farm.getAge()+" gender:"+farm.getGender()+" weight:"+farm.getWeight());
                System.out.println("----------------------------------------------------------");
            }
        }
        System.out.println("\n Farm2:");
        AbstractAnimal[] farm2={cow6,sheep4,horse3};
        for(AbstractAnimal farm:farm2){
            if((farm instanceof Horse)){
                System.out.println("nikeName:"+farm.getNickName()+" age:"+farm.getAge()+" gender:"+farm.getGender()+" weight:"+farm.getWeight()+" color :"+((Horse)farm).getColor());
                System.out.println("-----------------------------------------------------------");
            }
            else{
                System.out.println("nikeName:"+farm.getNickName()+" age:"+farm.getAge()+" gender:"+farm.getGender()+" weight:"+farm.getWeight());
                System.out.println("----------------------------------------------------------");
            }
        }
    }
}