import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<Flower> flowers;
    List<Animal> animals;

    public Farm(){
        flowers = new ArrayList<>();
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        int numberBig = 0;
        int numberSmall = 0;
        if (animal.size == Size.BIG && numberBig < 10){
            animals.add(animal);
            numberBig++;
        } else {
            System.out.println("There is no space for another BIG nanimal");
        }
        if (animal.size == Size.SMALL && numberSmall < 10){
            animals.add(animal);
            numberSmall++;
        }
    }



}
