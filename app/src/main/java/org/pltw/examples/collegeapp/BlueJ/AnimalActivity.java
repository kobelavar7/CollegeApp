import java.util.ArrayList;
public class AnimalActivity{
    public static void main(String[] args){
        System.out.println("Text Output:");
        
        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        Fish fish = new Fish();
        Duck duck = new Duck();
        Seal seal = new Seal();
        Fox fox = new Fox();
        
        animals.add(duck);
        animals.add(fish);
        animals.add(seal);
        animals.add(fox);
        
        /*System.out.print("\nDuck says " + duck.say());
        System.out.print("\nFish says " + animals.get(1).say());
        System.out.print("\nSeal says " + seal.say());
        System.out.print("\nFox says " + fox.say());
        System.out.print("\nThe object at index 1: " + animals.get(1));*/
        
        for(int i =0; i < animals.size(); i++){
            System.out.println(animals.get(i).say());
        }
        
        for (Animal a: animals){
            if (a instanceof Fox) {
                System.out.print("\n" + ((Fox)a).play());
            }
            
            if (a instanceof Seal) {
                System.out.print("\n" + ((Seal)a).play());
            }
            System.out.print("\n" + a.say());
            
        }
    }
}
