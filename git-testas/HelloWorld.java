import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author zwaclaw
 *
 */

public class HelloWorld {
	public static void main(String[] args) {
		SimpleDateFormat dF = new SimpleDateFormat("dd/MM/yyyy");
		Date d = new Date();
		String date= dF.format(d);
		System.out.println("HELLO UGLY WORLD!");
<<<<<<< HEAD
		System.out.println("THE WORLD IS NOT UGLY!");
		Input i = new Input();
		System.out.println("Iveskite savo varda :");
		System.out.println("Hello "+i.input()+" !");
		
=======
		System.out.println("The World is not ugly");
		System.out.println("Siandienos data : "+date);
>>>>>>> master
	}
}
