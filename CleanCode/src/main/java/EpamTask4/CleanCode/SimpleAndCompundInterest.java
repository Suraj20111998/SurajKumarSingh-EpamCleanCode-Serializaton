package EpamTask4.CleanCode;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

interface SimpleInterestCompundInterest{
	double InputPrincipalTimeRate(double principle,double time,double RateOfInterest);
}
class SimpleInterest implements SimpleInterestCompundInterest{
	public double InputPrincipalTimeRate(double principle,double time,double RateOfInterest)
	{
		return((principle*RateOfInterest*time)/100);
	}
}
class CompoundInterest implements SimpleInterestCompundInterest{
	public double InputPrincipalTimeRate(double principle,double time,double RateOfInterest)
	{
		return(principle*Math.pow((1+RateOfInterest/100),time)-principle);
	}
}
	
public class SimpleAndCompundInterest {

	public static void main(String[] args) throws IOException {
		SimpleInterest si=new SimpleInterest();
		CompoundInterest ci=new CompoundInterest();
		Scanner input=new Scanner(System.in);
		OutputStreamWriter display=new OutputStreamWriter(System.out);
		display.write("-------------------EPAM CLEAN CODE TASK------------------------");
		display.flush();
		display.write("\nEnter the Principle that was borrowed:::::");
		display.flush();
		double principle=input.nextDouble();
		display.write("\nEnter the Time:::::");
		display.flush();
		double time=input.nextDouble();
		display.write("\nEnter the Rate Of Interest:::::");
		display.flush();
		double RateOfInterest=input.nextDouble();
		double SI=si.InputPrincipalTimeRate(principle,time,RateOfInterest);
		double CI=ci.InputPrincipalTimeRate(principle,time,RateOfInterest);
		display.write("\nThe Simple Interest Of the Given data Would be::"+SI);
		display.flush();
		display.write("\nThe Compound Interest Of the Given data Would be::"+CI);
		display.flush();
		
		
		
		

	}

}
