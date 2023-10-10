public class TestaAnimais {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];

        //instancias
        Sapo sapo = new Sapo();
        Cachorro cachorro = new Cachorro();
        Boi boi = new Boi();

        //elementos do vetor
        animais[0] = sapo;
        animais[1] = cachorro;
        animais[2] = boi;

        for (Animal animal : animais) {
            System.out.println(animal.som());
        }
    }
}
