package Week4HW;

import java.util.Scanner;

public class P617 {

	public static void main(String[] args) {
		
		final double inch2feet = .083333;
		final double inch2mile = 0.0000157828;
		final double inch2mm = 25400;
		final double inch2cm = 2.54;
		final double inch2m = 0.0254;
		final double inch2km = 0.0000254;
		
		final double feet2inch = 12;
		final double feet2mile = 0.0001893939;
		final double feet2mm = 304.8;
		final double feet2cm = 30.48;
		final double feet2m = 0.3048;
		final double feet2km = 0.0003048;
		
		final double mile2inch = 63360;
		final double mile2feet = 5280;
		final double mile2mm = 1609344;
		final double mile2cm = 160934.4;
		final double mile2m = 1609.344;
		final double mile2km = 1.609344;
		
		final double mm2inch = 0.0393700787;
		final double mm2feet = 0.0032808399;
		final double mm2mile = 0.0000006213711922;
		final double mm2cm = 0.1;
		final double mm2m = 0.001;
		final double mm2km = 0.000001;
		
		final double cm2inch = 0.3937007874;
		final double cm2feet = 0.032808399;
		final double cm2mile = 0.0000062137;
		final double cm2mm = 10;
		final double cm2m = 0.01;
		final double cm2km = 0.00001;
		
		final double m2inch = 39.37007874;
		final double m2feet = 3.280839895;
		final double m2mile = 0.0006213712;
		final double m2mm = 1000;
		final double m2cm = 100;
		final double m2km = 0.001;
		
		final double km2inch = 39370.07874;
		final double km2feet = 3280.839895;
		final double km2mile = 0.6213711922;
		final double km2mm = 1000000;
		final double km2cm = 100000;
		final double km2m = 1000;
		
        Scanner input = new Scanner(System.in);
		System.out.print("What would you like to convert from ");
		String origin = input.next().toLowerCase();
		System.out.print("What would you like to convert to ");
		String result = input.next().toLowerCase();
		System.out.print("What is the value in " + origin + "? " );
        double value = input.nextDouble();
        double answer = value;
        
        boolean intomm = origin.equals("in") && result.equals("mm");
        boolean intocm = origin.equals("in") && result.equals("cm");
        boolean intom = origin.equals("in") && result.equals("m");
        boolean intokm = origin.equals("in") && result.equals("km");
        boolean intomile = origin.equals("in") && result.equals("mile");
        boolean intofeet = origin.equals("in") && result.equals("ft");

        boolean fttomm = origin.equals("ft") && result.equals("mm");
        boolean fttocm = origin.equals("ft") && result.equals("cm");
        boolean fttom = origin.equals("ft") && result.equals("m");
        boolean fttokm = origin.equals("ft") && result.equals("km");
        boolean fttoinch = origin.equals("ft") && result.equals("in");
        boolean fttomile = origin.contentEquals("ft") && result.equals("mile");
        
        boolean mtomm = origin.equals("m") && result.equals("mm");
        boolean mtocm = origin.equals("m") && result.equals("cm");
        boolean mtoinch = origin.equals("m") && result.equals("in");
        boolean mtokm = origin.equals("m") && result.equals("km");
        boolean mtomile = origin.equals("m") && result.equals("mile");
        boolean mtofeet = origin.equals("m") && result.equals("ft");
        
        boolean miletomm = origin.equals("mile") && result.equals("mm");
        boolean miletocm = origin.equals("mile") && result.equals("cm");
        boolean miletoinch = origin.equals("mile") && result.equals("in");
        boolean miletokm = origin.equals("mile") && result.equals("km");
        boolean miletom = origin.equals("mile") && result.equals("m");
        boolean miletofeet = origin.equals("mile") && result.equals("ft");

        boolean kmtomm = origin.equals("km") && result.equals("mm");
        boolean kmtocm = origin.equals("km") && result.equals("cm");
        boolean kmtoinch = origin.equals("km") && result.equals("in");
        boolean kmtomile = origin.equals("km") && result.equals("mile");
        boolean kmtom = origin.equals("km") && result.equals("m");
        boolean kmtofeet = origin.equals("km") && result.equals("ft");

        boolean mmtomile = origin.equals("mm") && result.equals("mile");
        boolean mmtocm = origin.equals("mm") && result.equals("cm");
        boolean mmtoinch = origin.equals("mm") && result.equals("in");
        boolean mmtokm = origin.equals("mm") && result.equals("km");
        boolean mmtom = origin.equals("mm") && result.equals("m");
        boolean mmtofeet = origin.equals("mm") && result.equals("ft");
        
        boolean cmtomm = origin.equals("cm") && result.equals("mm");
        boolean cmtomile = origin.equals("cm") && result.equals("mile");
        boolean cmtoinch = origin.equals("cm") && result.equals("in");
        boolean cmtokm = origin.equals("cm") && result.equals("km");
        boolean cmtom = origin.equals("cm") && result.equals("m");
        boolean cmtofeet = origin.equals("cm") && result.equals("ft");

        if (intomm) {
        	
        	answer *= inch2mm;
        }
        
        else if (intocm)
        {
            answer *= inch2cm;
        }
       
        else if (intom)
        {
            answer *= inch2m;
        }
        
        else if (intomile)
        {
            answer *= inch2mile;
        }
        
        else if (intofeet)
        {
            answer *= inch2feet;
        }
        
        else if (intokm)
        {
            answer *= inch2km;
        }
        
        else if (fttokm)
        {
            answer *= feet2km;
        }
        else if (fttocm)
        {
            answer *= feet2cm;
        }
       
        else if (fttom)
        {
            answer *= feet2m;
        }
        
        else if (fttoinch)
        {
            answer *= feet2inch;
        }
        
        else if (fttomile)
        {
            answer *= feet2mile;
        }
        
        else if (fttokm)
        {
            answer *= feet2mm;
        }
        
        else if (kmtofeet)
        {
            answer *= km2feet;
        }
        else if (kmtocm)
        {
            answer *= km2cm;
        }
       
        else if (kmtom)
        {
            answer *= km2m;
        }
        
        else if (kmtoinch)
        {
            answer *= km2inch;
        }
        
        else if (kmtomile)
        {
            answer *= km2mile;
        }
        
        else if (kmtomm)
        {
            answer *= km2mm;
        }
        
        else if (mmtofeet)
        {
            answer *= mm2feet;
        }
        else if (mmtocm)
        {
            answer *= mm2cm;
        }
       
        else if (mmtom)
        {
            answer *= mm2m;
        }
        
        else if (mmtoinch)
        {
            answer *= mm2inch;
        }
        
        else if (mmtomile)
        {
            answer *= mm2mile;
        }
        
        else if (mmtokm)
        {
            answer *= mm2km;
        }
        
        else if (mtofeet)
        {
            answer *= m2feet;
        }
        else if (mtocm)
        {
            answer *= m2cm;
        }
       
        else if (mtokm)
        {
            answer *= m2km;
        }
        
        else if (mtoinch)
        {
            answer *= m2inch;
        }
        
        else if (mtomile)
        {
            answer *= m2mile;
        }
        
        else if (mtomm)
        {
            answer *= m2mm;
        }

        else if (cmtofeet)
        {
            answer *= cm2feet;
        }
        else if (cmtokm)
        {
            answer *= cm2km;
        }
       
        else if (cmtom)
        {
            answer *= cm2m;
        }
        
        else if (cmtoinch)
        {
            answer *= cm2inch;
        }
        
        else if (cmtomile)
        {
            answer *= cm2mile;
        }
        
        else if (cmtomm)
        {
            answer *= cm2mm;
        }

        else if (miletofeet)
        {
            answer *= mile2feet;
        }
        else if (miletocm)
        {
            answer *= mile2cm;
        }
       
        else if (miletom)
        {
            answer *= mile2m;
        }
        
        else if (miletoinch)
        {
            answer *= mile2inch;
        }
        
        else if (miletokm)
        {
            answer *= mile2km;
        }
        
        else if (miletomm)
        {
            answer *= mile2mm;
        }
        
        
        System.out.println("Your conversion from " + value + " " + origin + " to " + result + " is " + answer);


		
	}

}




