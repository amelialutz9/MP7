import java.util.Scanner;

/**
 * The app that drives the project.
 * @author amelialutz
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//prompt for user information (name) and creates the user
		System.out.print("What is your name? ");
		String name = sc.next();
		Human user = new Human(name);
		
		//creates the array of images
		EnhancedImage[] images = initArray();
		for (int i = 0; i < images.length; i++) {
			//prompt if user likes clothes
			// loop through to decide the user's preferences
			System.out.println("Enter 'Y' if you like the item, 'N' if you don't");
			String pref = sc.next();
			if (pref.equals("Y")) {
				images[i].likeImage();
				// add prefs to user
			}
			// else it'll go on to the next image
			
			//make recommendation
		}
	}
	
	public static EnhancedImage[] initArray() {
		EnhancedImage[] images = new EnhancedImage[1];
		images[0] = new EnhancedImage(0, 0, 0, 0, 0, "");
		return images;
	}
}
