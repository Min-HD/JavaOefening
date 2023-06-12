
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Het werkt");

		Bee bij1 = new Bee();
		Bee bij2 = new Bee();
		Bee bij3 = new Bee("Henk", "blauw", true, false, false, 1, 10000);

		bij1.name = "Harf";
		bij1.age = 2;
		bij1.isQueen = false;
		bij1.dangerous = true;
		bij1.color = "geel";

		bij2.name = "Beebee";
		bij2.age = 4;
		bij2.isQueen = true;
		bij2.dangerous = false;
		bij2.color = "supergeel";
		
		bij1.Age();
		bij2.Color();
		
		bij1.ChangeName("Dough");
		bij1.ChangeAge(85);
		bij1.ChangeThreadLevel(false);
		
		bij1.ChangeName2();
		bij1.ChangeAge2();
		bij1.ChangeThreadLevel2();
		
		System.out.println("New new name: " + bij3.ChangeName2());
		System.out.println("New new name: " + bij3.ChangeAge2());
		System.out.println("New new name: " + bij3.ChangeThreadLevel2());
		
		Cat kat = new Cat();
		kat.setName("Squigles");
		System.out.println("The name of my cat is " + kat.getName() + " and the fact that he eats meat is " + kat.getVega());
		
		Zuivel melk = new Zuivel();
		melk.name = "melk";
		melk.sellable = true;
		System.out.println("Dit product is " + melk.name + " en het kost " + melk.GetPrice() + " euro en het verkoop ervan is " + melk.sellable);
		
		Brood brood = new Brood();
		brood.name = "brood";
		brood.soort = "tijger";
		melk.sellable = false;
		System.out.println("Dit product is " + brood.soort + brood.name + " en het kost " + brood.GetPrice() + " euro en het verkoop ervan is " + brood.sellable);
	}

}
