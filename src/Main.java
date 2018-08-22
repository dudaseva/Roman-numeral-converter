public class Main {
    public static void main(String[] args) {

        // romai szam atvalto 3999-ig mukodik

        Changer changer = new Changer();
        ChangeToArab changeToArab = new ChangeToArab();
        if (changeToArab.isValid("CD")) {
            System.out.println(changeToArab.changeBack("CD"));
        } else {
            System.out.println("Hibás számformátumot adtál meg!");
        }

        //System.out.println(changer.change(8));
        //System.out.println(changer.change(58));

    }
}

