package Driver;

import Factory.GasPump1Factory;
import Factory.GasPump2Factory;
import InputProcessor.GasPump1;
import InputProcessor.GasPump2;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose your Gas pump. \n 1.) GasPump 1 \n 2.) GasPump 2 \n : ");
		char input = scanner.next().charAt(0);

			switch (input) {
				case '1':
					GasPump1 gasPump1=startGasPump1();
					gasPump1.displayOperations();
					input = scanner.next().charAt(0);

					while(input!='q') {
						gasPump1.displayOperations();
						switch (input) {
							case '0':
								System.out.println("Activate > ");
								System.out.println("Please enter price of gas! ");
								int a = Integer.parseInt(scanner.nextLine());
								gasPump1.Activate(a);
								break;
							default:
								System.out.println("Invalid. \n Please choose one one of the following options. \n");
								gasPump1.displayOperations();
								break;
						}
					}
					break;
				case '2':
					GasPump2 gasPump2=startGasPump2();
					break;
				default:
					System.out.println("Invalid Input, Please choose 1 or 2.");
			}
	}

	private static GasPump1 startGasPump1()
	{
		GasPump1Factory gasPump1Factory = new GasPump1Factory();
		GasPump1 gasPump1 = new GasPump1();
		gasPump1.setAbstractFactory(gasPump1Factory);
		gasPump1.setDatastore(gasPump1Factory);

		return gasPump1;
	}

	private static GasPump2 startGasPump2()
	{
		GasPump2Factory gasPump2Factory = new GasPump2Factory();
		GasPump2 gasPump2 = new GasPump2();
		gasPump2.setAbstractFactory(gasPump2Factory);
		gasPump2.setDatastore(gasPump2Factory);

		return gasPump2;
	}
}