import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This is the test driver class for GasPump class. It calls the GasPump's
 * methods and display the return value of those called method.
 * 
 * @author Priyanka
 *
 */
public class TestDriver {
	public static void main(String[] args) {
		// initialize variables
		// option : selected choice
		// returnValue : return value of method
		int option = -1, returnValue = -1;

		// Create GasPump object
		GasPump gp = new GasPump();
		System.out.println("Driver for GasPump Class");
		do {
			// Display Menu
			System.out.println("\nPlease select the option");
			System.out.println("------------------------");
			System.out.println("1.  Activate(float a, float b, float d)");
			System.out.println("2.  PayCredit()");
			System.out.println("3.  Reject()");
			System.out.println("4.  Cancel()");
			System.out.println("5.  Approved()");
			System.out.println("6.  PayCash(float c)");
			System.out.println("7.  Regular()");
			System.out.println("8.  Super()");
			System.out.println("9.  Diesel()");
			System.out.println("10. StartPump()");
			System.out.println("11. PumpLiter()");
			System.out.println("12. StopPump()");
			System.out.println("13. NoReceipt()");
			System.out.println("14. Receipt()");
			System.out.println("15. TurnOff()");
			System.out.println("------------------------");
			System.out.println("Testing-related Methods");
			System.out.println("16. Show_State()");
			System.out.println("17. Show_Total()");
			System.out.println("18. Show_AllVariables()");
			System.out.println("------------------------");
			System.out.println("19. Quit GasPump Driver");

			// Select the option from above menu
			System.out.printf("\nPlease enter your choice : ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			try {
				option = Integer.parseInt(br.readLine());

				switch (option) {
				case 1:
					System.out.println("\nMethod: Activate(float a, float b, float d)");
					// Get input for Activate(float a, float b, float d) method
					System.out.printf("Enter the value of parameter a : ");
					float a = Float.parseFloat(br.readLine());
					System.out.printf("Enter the value of parameter b : ");
					float b = Float.parseFloat(br.readLine());
					System.out.printf("Enter the value of parameter d : ");
					float d = Float.parseFloat(br.readLine());
					// call GasPump's Activate(float a, float b, float d) Method
					returnValue = gp.Activate(a, b, d);
					// Display the return value of execution of Activate(float
					// a, float b, float d) method
					System.out.println("\nThe value return by Activate(float a, float b, float d) method is " + returnValue);
					break;

				case 2:
					System.out.println("\nMethod: PayCredit()");
					// call GasPump's PayCredit() Method
					returnValue = gp.PayCredit();
					// Display the return value of execution of PayCredit()
					// method
					System.out.println("\nThe value return by PayCredit() method is " + returnValue);
					break;

				case 3:
					System.out.println("\nMethod: Reject()");
					// call GasPump's Reject() Method
					returnValue = gp.Reject();
					// Display the return value of execution of Reject() method
					System.out.println("\nThe value return by Reject() method is " + returnValue);
					break;

				case 4:
					System.out.println("\nMethod: Cancel()");
					// call GasPump's Cancel() Method
					returnValue = gp.Cancel();
					// Display the return value of execution of Cancel() method
					System.out.println("\nThe value return by Cancel() method is " + returnValue);
					break;

				case 5:
					System.out.println("\nMethod: Approved()");
					// call GasPump's Approved() Method
					returnValue = gp.Approved();
					// Display the return value of execution of Approved()
					// method
					System.out.println("\nThe value return by Approved() method is " + returnValue);
					break;

				case 6:
					System.out.println("\nMethod: PayCash(float c)");
					// Get input for PayCash(float c)") method
					System.out.printf("Enter the value of parameter c : ");
					float c = Float.parseFloat(br.readLine());
					// call GasPump's PayCash(float c) Method
					returnValue = gp.PayCash(c);
					// Display the return value of execution of PayCash(float c)
					// method
					System.out.println("\nThe value return by PayCash(float c) method is " + returnValue);
					break;

				case 7:
					System.out.println("\nMethod: Regular()");
					// call GasPump's Regular() Method
					returnValue = gp.Regular();
					// Display the return value of execution of Regular() method
					System.out.println("\nThe value return by Regular() method is " + returnValue);
					break;

				case 8:
					System.out.println("\nMethod: Super()");
					// call GasPump's Super() Method
					returnValue = gp.Super();
					// Display the return value of execution of Super() method
					System.out.println("\nThe value return by Super() method is " + returnValue);
					break;

				case 9:
					System.out.println("\nMethod: Diesel()");
					// call GasPump's Diesel() Method
					returnValue = gp.Diesel();
					// Display the return value of execution of Diesel() method
					System.out.println("The value return by Diesel() method is " + returnValue);
					break;

				case 10:
					System.out.println("\nMethod: StartPump()");
					// call GasPump's StartPump() Method
					returnValue = gp.StartPump();
					// Display the return value of execution of StartPump()
					// method
					System.out.println("\nThe value return by StartPump() method is " + returnValue);
					break;

				case 11:
					System.out.println("\nMethod: PumpLiter()");
					// call GasPump's PumpLiter() Method
					returnValue = gp.PumpLiter();
					// Display the return value of execution of PumpLiter()
					// method
					System.out.println("\nThe value return by PumpLiter() method is " + returnValue);
					break;

				case 12:
					System.out.println("\nMethod: StopPump()");
					// call GasPump's StopPump() Method
					returnValue = gp.StopPump();
					// Display the return value of execution of StopPump()
					// method
					System.out.println("The value return by StopPump() method is " + returnValue);
					break;

				case 13:
					System.out.println("\nMethod: NoReceipt()");
					// call GasPump's NoReceipt() Method
					returnValue = gp.NoReceipt();
					// Display the return value of execution of NoReceipt()
					// method
					System.out.println("\nThe value return by NoReceipt() method is " + returnValue);
					break;

				case 14:
					System.out.println("\nMethod: Receipt()");
					// call GasPump's Receipt() Method
					returnValue = gp.Receipt();
					// Display the return value of execution of Receipt() method
					System.out.println("\nThe value return by Receipt() method is " + returnValue);
					break;

				case 15:
					System.out.println("\nMethod: TurnOff()");
					// call GasPump's TurnOff() Method
					returnValue = gp.TurnOff();
					// Display the return value of execution of TurnOff() method
					System.out.println("\nThe value return by TurnOff() method is " + returnValue);
					break;

				case 16:
					System.out.println("\nTesting-related method: Show_State()");
					// Call GasPump's testing related Show_State() method
					System.out.println("\nThe Current State = " + gp.Show_State() + " State");
					break;

				case 17:
					System.out.println("\nTesting-related method: Show_Total()");
					// Call GasPump's testing related Show_Total() method
					System.out.println("\nTotal = " + gp.Show_Total());
					break;

				case 18:
					System.out.println("\nTesting-related method: Show_AllVariables()");
					// Call GasPump's testing related Show_AllVariables() method
					gp.Show_AllVariables();
					break;

				case 19:
					System.out.println("\nQuit from GasPump Driver.");
					// Quit from GasPump Driver
					System.exit(0);
					break;
				default:
					System.out.println("Invalid option selected.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input.");
			} catch (IOException e) {
				System.out.println("Invalid input.");
			}
		} while (option != 19);
	}
}
