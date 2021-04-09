package JavaDrills.BookDrill;

import JavaDrills.BookDrill.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book subtleArt = new Book(100);
        Book unFuck = new Book(100);
        Book cleanCode = new Book(100);



        subtleArt.made();
        unFuck.made();
        cleanCode.made();
        System.out.println("===============================================================================");
        System.out.println("===============================================================================");

        System.out.println("The Subtle Art published " + subtleArt.getStartingCopies() + " books at launch.");
        System.out.println("The Clean Code published " + cleanCode.getStartingCopies() + " books at launch.");

        System.out.println("===============================================================================");
        System.out.println("===============================================================================");

        subtleArt.setCopiesSold(1000);
        unFuck.setCopiesSold(750);
        cleanCode.setCopiesSold(500);

        System.out.println("The Subtle Art of Not Giving a fuck sold " + subtleArt.getCopies() + " books at opening" );
        System.out.println("UnF*ck Yourself sold " + unFuck.getCopies() + " books at opening" );
        System.out.println("Clean Code sold " + cleanCode.getCopies() + " books at opening" );

        System.out.println("===============================================================================");
        System.out.println("One Week Lataaaaaaaaar~.....................");
        System.out.println("===============================================================================");

        //increase books sold and decrease books sold
        subtleArt.increaseCopiesSold(5000);
        unFuck.increaseCopiesSold(1000);
        cleanCode.increaseCopiesSold(1000);

        System.out.println("The Subtle Art of Not Giving a fuck sold " + subtleArt.getCopies() + " books a week later.");
        System.out.println("The Subtle Art of Not Giving a fuck sold " + subtleArt.getCopies() + " books a week later.");
        System.out.println("UnF*ck Yourself sold " + unFuck.getCopies() + " books a week later." );
        System.out.println("Clean Code sold " + cleanCode.getCopies() + "  books a week later" );

        System.out.println("===============================================================================");
        System.out.println("Two Weeks Lataaaaaaaaar~.....................");
        System.out.println("===============================================================================");

        //Decrease books sold and decrease books sold
        subtleArt.decreaseCopiesSold(123);
        unFuck.decreaseCopiesSold(10);
        cleanCode.decreaseCopiesSold(50);

        System.out.println("The Subtle Art of Not Giving a fuck sold " + subtleArt.getCopies() + " copies two weeks later.");
        System.out.println("UnF*ck Yourself sold " + unFuck.getCopies() + " copies two weeks later." );
        System.out.println("Clean Code sold " + cleanCode.getCopies() + "  copies two weeks later." );

    }

}
