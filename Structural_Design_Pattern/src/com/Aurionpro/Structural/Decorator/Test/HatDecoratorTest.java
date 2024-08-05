package com.Aurionpro.Structural.Decorator.Test;

import com.Aurionpro.Structural.Decorator.Model.GoldenHat;
import com.Aurionpro.Structural.Decorator.Model.IHat;
import com.Aurionpro.Structural.Decorator.Model.PremiumHat;
import com.Aurionpro.Structural.Decorator.Model.RibbonedHat;
import com.Aurionpro.Structural.Decorator.Model.StandardHat;

public class HatDecoratorTest {
	public static void main(String[] args) {
		IHat standardHat = new StandardHat();
		IHat goldenStandardHat = new GoldenHat(standardHat);
		IHat ribbonedStandardHat = new RibbonedHat(standardHat);
		
		IHat premiumHat = new PremiumHat();
		IHat goldenPremiumHat = new GoldenHat(premiumHat);
		IHat ribbonedPremiumHat = new RibbonedHat(premiumHat);
		
		System.out.println("Standard Hat:");
        printDetails(standardHat);

        System.out.println("\nGolden Standard Hat:");
        printDetails(goldenStandardHat);

        System.out.println("\nRibboned Golden Standard Hat:");
        printDetails(ribbonedStandardHat);

        System.out.println("\nPremium Hat:");
        printDetails(premiumHat);

        System.out.println("\nGolden Premium Hat:");
        printDetails(goldenPremiumHat);

        System.out.println("\nRibboned Golden Premium Hat:");
        printDetails(ribbonedPremiumHat);
	}
	
	public static void printDetails(IHat hat) {
        System.out.println("Name: " + hat.getName());
        System.out.println("Price: " + hat.getPrice());
        System.out.println("Description: " + hat.getDescription());
    }
}
