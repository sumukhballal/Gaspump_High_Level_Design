package Driver;

import Factory.GasPump1Factory;
import Factory.GasPump2Factory;
import InputProcessor.GasPump1;
import InputProcessor.GasPump2;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose your Gas pump : \n 1.) GasPump 1 \n 2.) GasPump 2 \n >");
		String pump = scanner.next();

			switch (pump) {
				case "1":
					GasPump1 gasPump1=startGasPump1();
					gasPump1.displayOperations();
					String input = "x";

					while(!input.equals("q")) {
						System.out.println();
						gasPump1.displayOperations();
						input = scanner.next();

						switch (input) {
							case "0":
								System.out.println("Option : Activate \n ");
								System.out.println("Please enter price of gas! \n > ");
								try {
									int a = Integer.parseInt(scanner.next());
									gasPump1.Activate(a);
								}
								catch (NumberFormatException e) {
									System.out.println("Please insert an integer value!");
								}
								break;
							case "1":
								System.out.println("Option : Start \n ");
								gasPump1.Start();
								break;
							case "2":
								System.out.println("Option : PayCredit \n ");
								gasPump1.PayCredit();
								break;
							case "3":
								System.out.println("Option : Reject \n ");
								gasPump1.Reject();
								break;
							case "4":
								System.out.println("Option : Cancel \n ");
								gasPump1.Cancel();
								break;
							case "5":
								System.out.println("Option : Approved \n ");
								gasPump1.Approved();
								break;
							case "6":
								System.out.println("Option : PayCash \n ");
								System.out.println("Please enter how much cash! \n > ");
								int c = Integer.parseInt(scanner.next());
								gasPump1.PayCash(c);
								break;
							case "7":
								System.out.println("Option : StartPump \n ");
								gasPump1.StartPump();
								break;
							case "8":
								System.out.println("Option : PumpLiter \n ");
								gasPump1.PumpLiter();
								break;
							case "9":
								System.out.println("Option : StopPump \n ");
								gasPump1.StopPump();
								break;
							case "q":
								System.out.println("Exiting Program! \n");
								break;
							default:
								System.out.println("Invalid Option selected! \n");
								break;
						}
					}
					break;
				case "2":
					GasPump2 gasPump2=startGasPump2();
					gasPump2.displayOperations();
					input = "x";

					while(!input.equals("q")) {
						System.out.println();
						gasPump2.displayOperations();
						input = scanner.next();

						switch (input) {
							case "0":
								System.out.println("Option : Activate \n ");
								System.out.println("Please enter price of Regular Gas! \n > ");
								int a = Integer.parseInt(scanner.next());
								System.out.println("Please enter price of Diesel Gas! \n > ");
								int b = Integer.parseInt(scanner.next());
								System.out.println("Please enter price of Super Gas! \n > ");
								int c = Integer.parseInt(scanner.next());
								gasPump2.Activate(a,b,c);
								break;
							case "1":
								System.out.println("Option : Start \n ");
								gasPump2.Start();
								break;
							case "2":
								System.out.println("Option : PayCredit \n ");
								gasPump2.PayCredit();
								break;
							case "3":
								System.out.println("Option : Reject \n ");
								gasPump2.Reject();
								break;
							case "4":
								System.out.println("Option : PayDebit \n ");
								System.out.println("Please enter pin! \n > ");
								String pin = scanner.next();
								gasPump2.PayDebit(pin);
								break;
							case "5":
								System.out.println("Option : Pin \n ");
								System.out.println("Please enter pin! \n > ");
								String x = scanner.next();
								gasPump2.Pin(x);
								break;
							case "6":
								System.out.println("Option : Cancel \n ");
								gasPump2.Cancel();
								break;
							case "7":
								System.out.println("Option : Approved \n ");
								gasPump2.Approved();
								break;
							case "8":
								System.out.println("Option : Diesel \n ");
								gasPump2.Diesel();
								break;
							case "9":
								System.out.println("Option : Regular \n ");
								gasPump2.Regular();
								break;
							case "10":
								System.out.println("Option : Super \n ");
								gasPump2.Super();
								break;
							case "11":
								System.out.println("Option : StartPump \n ");
								gasPump2.StartPump();
								break;
							case "12":
								System.out.println("Option : PumpGallon \n ");
								gasPump2.PumpGallon();
								break;
							case "13":
								System.out.println("Option : StopPump \n ");
								gasPump2.StopPump();
								break;
							case "14":
								System.out.println("Option : FullTank \n ");
								gasPump2.FullTank();
								break;
							case "q":
								System.out.println("Exiting Program! \n");
								break;
							default:
								System.out.println("Invalid Option selected! \n");
								break;
						}
					}
					break;
				default:
					System.out.println("Invalid Input, Please choose 1 or 2.");
			}
	}

	private static GasPump1 startGasPump1()
	{
		GasPump1Factory gasPump1Factory = new GasPump1Factory();
		GasPump1 gasPump1 = new GasPump1(gasPump1Factory);

		return gasPump1;
	}

	private static GasPump2 startGasPump2()
	{
		GasPump2Factory gasPump2Factory = new GasPump2Factory();
		GasPump2 gasPump2 = new GasPump2(gasPump2Factory);

		return gasPump2;
	}
}