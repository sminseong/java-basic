package day09;

public class CatMain {
    public static void main(String[] args) {
        ParentCat momCat = new ParentCat();
        //System.out.println(momCat.breed);
        //String breed = momCat.breed;
        //System.out.println("어미고양이 종은 " + breed);
        momCat.methodParentCat();

        ParentCat momCat1 = new ParentCat();
        //momCat1.breed = "점박이";
        momCat1.setBreed("점박이");
        //System.out.println(momCat1.breed);
        momCat1.getBreed();
        momCat1.methodParentCat();

        System.out.println("===============");
        Kitten kitty1 = new Kitten();
        //kitty1.breed = "스핑크스 고양이";
        momCat1.setBreed("스핑크스 고양이");
        //System.out.println(kitty1.breed);
        momCat1.getBreed();
        kitty1.methodParentCat();
        kitty1.methodKitten();

    }
}
