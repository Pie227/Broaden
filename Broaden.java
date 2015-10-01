import java.util.Random;
import java.util.Scanner;

public class Broaden {
	public static Broaden broaden;
	
	public static String name;
	
	public static int hp = 100, stamina = 100, wisdom = 100, courage = 100;
	
	public static Random random = new Random();
	
	public static boolean running = false;
	
	public static Scanner scan = new Scanner(System.in);
	
	public Broaden() {		
		running = true;
		keyCode();
	}
	
	private void keyCode() {
		String i;
		System.out.println(" Do You Have A Key Code From A Previous Game? If Not, Just Hit Enter.");
		i = scan.nextLine();
		if (i.equals("k3g55h")) {
			
		} else if ("q6p77t") {
			
		} else {
			startUp();
		}
	}
	
	private void game1() {
		String i;
		System.out.println("");
		System.out.println(" You wake up, being tossed and turned by someone. Your vison is blurry, and you try to focus it. When your sight is clear, you see an old man shaking you.");
		System.out.println(" \"Hey, wake up! I have to get you off the Spirit Portal!\" He says. He urges you up and off the cool stone platform that you awoke in.");
		System.out.println(" \"So youngster,\" The old man says when we were clear of the stone platform, \"Where'd you come from?\"");
		System.out.println(" #Hey! Whenever you see these pound signs, your about to learn something new. You can type an answer with your keyboard. You will always be prompted with three options to pick from, so look at them, and choose the number answer you want!#");
		System.out.println("");
		System.out.println("      [1] Tell Him: \"I don't know where I came from.\"");
		System.out.println("      [2] Tell Him: \"Where Am I? Who Am I? What Is Going On...\"");
		System.out.println("      [3] Run Away!");
		System.out.println("");
		showStats();
		System.out.println("Choose A Number: ");
		i = scan.nextLine();
		for (int g = 0; g < 3; g++) {
			if (i.equals("1")) {

			} else if (i.equals("2")) {

			} else if (i.equals("3")) {

			} else {
				System.out.println("");
				System.out.println("Please Choose A Number From Your Options:");
				i = scan.nextLine();
			}
		}
		if (i.equals("1")) {
			System.out.println("");
			System.out.println("Var 1");
		} else if (i.equals("2")) {
			System.out.println("");
			System.out.println("Var 2");
		} else if (i.equals("3")) {
			System.out.println("");
			System.out.println("Var 3");
		} else {
			System.out.println("");
			gameOver("You Had Too Many Invalid Answers.");
		}
	}

	private void gameOver(String reason) {
		System.out.println("Game Over! " + reason + " Restart The Game To Play Again!");
	}

	private void showStats() {
		System.out.println(" HP: " + hp);
		System.out.println(" Wisdom: " + wisdom);
		System.out.println(" Stamina: " + stamina);
		System.out.println(" Courage: " + courage);
		System.out.println("");
	}

	public void startUp() {
		@SuppressWarnings("unused")
		String i;
		String u;
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("===========================================");
		System.out.println("================= BROADEN =================");
		System.out.println("===========================================");
		System.out.println("");
		System.out.println(" Is There Anything You Would Like To Know Before We Begin?");
		System.out.println("      What Is Broaden?");
		System.out.println("      How Do I Play?");
		System.out.println("      What Are The Controls?");
		System.out.println("      No Questions.");
		System.out.println(" Go Ahead And Ask Away!");
		u = scan.nextLine();
		System.out.println("");
		if (u.equals("What Is Broaden?") || u.equals("what is broaden") || u.equals("What is broaden") || u.equals("What Is broaden") || u.equals("what Is broaden") || u.equals("What is Broaden") || u.equals("what is Broaden") || u.equals("what is broaden?")) {
			System.out.println("Broaden is a text-based adventure. What is that? Well, it is an adventure that is text written, so you can imagine and paint the picture how you like it.");
			System.out.println("Anything Else?");
			u = scan.nextLine();
			if (u.equals("What Is Broaden?") || u.equals("what is broaden") || u.equals("What is broaden") || u.equals("What Is broaden") || u.equals("what Is broaden") || u.equals("What is Broaden") || u.equals("what is Broaden") || u.equals("what is broaden?")) {
				System.out.println("Broaden is a text-based adventure. What is that? Well, it is an adventure that is text written, so you can imagine and paint the picture how you like it.");
				System.out.println("Anything Else?");
				u = scan.nextLine();
				if (u.equals("What Is Broaden?") || u.equals("what is broaden") || u.equals("What is broaden") || u.equals("What Is broaden") || u.equals("what Is broaden") || u.equals("What is Broaden") || u.equals("what is Broaden") || u.equals("what is broaden?")) {
					System.out.println("Broaden is a text-based adventure. What is that? Well, it is an adventure that is text written, so you can imagine and paint the picture how you like it.");
				}
				if (u.equals("How Do I Play?") || u.equals("how do i play") || u.equals("how do I play") || u.equals("How do I play")) {
					System.out.println("As you go along, you will be prompted on everything you need to do.");
				}
				if (u.equals("What Are The Controls?") || u.equals("what are the controls?") || u.equals("what are the controls") || u.equals("What are the controls")) {
					System.out.println("When you begin, the baisic controls will be explained. You will gain new controls as you go along.");
				}
			}
			if (u.equals("How Do I Play?") || u.equals("how do i play") || u.equals("how do I play") || u.equals("How do I play")) {
				System.out.println("As you go along, you will be prompted on everything you need to do.");
				System.out.println("Anything Else?");
				u = scan.nextLine();
				if (u.equals("What Is Broaden?") || u.equals("what is broaden") || u.equals("What is broaden") || u.equals("What Is broaden") || u.equals("what Is broaden") || u.equals("What is Broaden") || u.equals("what is Broaden") || u.equals("what is broaden?")) {
					System.out.println("Broaden is a text-based adventure. What is that? Well, it is an adventure that is text written, so you can imagine and paint the picture how you like it.");
				}
				if (u.equals("How Do I Play?") || u.equals("how do i play") || u.equals("how do I play") || u.equals("How do I play")) {
					System.out.println("As you go along, you will be prompted on everything you need to do.");
				}
				if (u.equals("What Are The Controls?") || u.equals("what are the controls?") || u.equals("what are the controls") || u.equals("What are the controls")) {
					System.out.println("When you begin, the baisic controls will be explained. You will gain new controls as you go along.");
				}
			}
			if (u.equals("What Are The Controls?") || u.equals("what are the controls?") || u.equals("what are the controls") || u.equals("What are the controls")) {
				System.out.println("When you begin, the baisic controls will be explained. You will gain new controls as you go along.");
				System.out.println("Anything Else?");
				u = scan.nextLine();
				if (u.equals("What Is Broaden?") || u.equals("what is broaden") || u.equals("What is broaden") || u.equals("What Is broaden") || u.equals("what Is broaden") || u.equals("What is Broaden") || u.equals("what is Broaden") || u.equals("what is broaden?")) {
					System.out.println("Broaden is a text-based adventure. What is that? Well, it is an adventure that is text written, so you can imagine and paint the picture how you like it.");
				}
				if (u.equals("How Do I Play?") || u.equals("how do i play") || u.equals("how do I play") || u.equals("How do I play")) {
					System.out.println("As you go along, you will be prompted on everything you need to do.");
				}
				if (u.equals("What Are The Controls?") || u.equals("what are the controls?") || u.equals("what are the controls") || u.equals("What are the controls")) {
					System.out.println("When you begin, the baisic controls will be explained. You will gain new controls as you go along.");
				}
			}
		}
		if (u.equals("How Do I Play?") || u.equals("how do i play") || u.equals("how do I play") || u.equals("How do I play")) {
			System.out.println("As you go along, you will be prompted on everything you need to do.");
			System.out.println("Anything Else?");
			u = scan.nextLine();
			if (u.equals("What Is Broaden?") || u.equals("what is broaden") || u.equals("What is broaden") || u.equals("What Is broaden") || u.equals("what Is broaden") || u.equals("What is Broaden") || u.equals("what is Broaden") || u.equals("what is broaden?")) {
				System.out.println("Broaden is a text-based adventure. What is that? Well, it is an adventure that is text written, so you can imagine and paint the picture how you like it.");
				System.out.println("Anything Else?");
				u = scan.nextLine();
				if (u.equals("What Is Broaden?") || u.equals("what is broaden") || u.equals("What is broaden") || u.equals("What Is broaden") || u.equals("what Is broaden") || u.equals("What is Broaden") || u.equals("what is Broaden") || u.equals("what is broaden?")) {
					System.out.println("Broaden is a text-based adventure. What is that? Well, it is an adventure that is text written, so you can imagine and paint the picture how you like it.");
				}
				if (u.equals("How Do I Play?") || u.equals("how do i play") || u.equals("how do I play") || u.equals("How do I play")) {
					System.out.println("As you go along, you will be prompted on everything you need to do.");
				}
				if (u.equals("What Are The Controls?") || u.equals("what are the controls?") || u.equals("what are the controls") || u.equals("What are the controls")) {
					System.out.println("When you begin, the baisic controls will be explained. You will gain new controls as you go along.");
				}
			}
			if (u.equals("How Do I Play?") || u.equals("how do i play") || u.equals("how do I play") || u.equals("How do I play")) {
				System.out.println("As you go along, you will be prompted on everything you need to do.");
				System.out.println("Anything Else?");
				u = scan.nextLine();
				if (u.equals("What Is Broaden?") || u.equals("what is broaden") || u.equals("What is broaden") || u.equals("What Is broaden") || u.equals("what Is broaden") || u.equals("What is Broaden") || u.equals("what is Broaden") || u.equals("what is broaden?")) {
					System.out.println("Broaden is a text-based adventure. What is that? Well, it is an adventure that is text written, so you can imagine and paint the picture how you like it.");
				}
				if (u.equals("How Do I Play?") || u.equals("how do i play") || u.equals("how do I play") || u.equals("How do I play")) {
					System.out.println("As you go along, you will be prompted on everything you need to do.");
				}
				if (u.equals("What Are The Controls?") || u.equals("what are the controls?") || u.equals("what are the controls") || u.equals("What are the controls")) {
					System.out.println("When you begin, the baisic controls will be explained. You will gain new controls as you go along.");
				}
			}
			if (u.equals("What Are The Controls?") || u.equals("what are the controls?") || u.equals("what are the controls") || u.equals("What are the controls")) {
				System.out.println("When you begin, the baisic controls will be explained. You will gain new controls as you go along.");
				System.out.println("Anything Else?");
				u = scan.nextLine();
				if (u.equals("What Is Broaden?") || u.equals("what is broaden") || u.equals("What is broaden") || u.equals("What Is broaden") || u.equals("what Is broaden") || u.equals("What is Broaden") || u.equals("what is Broaden") || u.equals("what is broaden?")) {
					System.out.println("Broaden is a text-based adventure. What is that? Well, it is an adventure that is text written, so you can imagine and paint the picture how you like it.");
				}
				if (u.equals("How Do I Play?") || u.equals("how do i play") || u.equals("how do I play") || u.equals("How do I play")) {
					System.out.println("As you go along, you will be prompted on everything you need to do.");
				}
				if (u.equals("What Are The Controls?") || u.equals("what are the controls?") || u.equals("what are the controls") || u.equals("What are the controls")) {
					System.out.println("When you begin, the baisic controls will be explained. You will gain new controls as you go along.");
				}
			}
		}
		if (u.equals("What Are The Controls?") || u.equals("what are the controls?") || u.equals("what are the controls") || u.equals("What are the controls")) {
			System.out.println("When you begin, the baisic controls will be explained. You will gain new controls as you go along.");
			System.out.println("");
			System.out.println("Anything Else?");
			u = scan.nextLine();
			if (u.equals("What Is Broaden?") || u.equals("what is broaden") || u.equals("What is broaden") || u.equals("What Is broaden") || u.equals("what Is broaden") || u.equals("What is Broaden") || u.equals("what is Broaden") || u.equals("what is broaden?")) {
				System.out.println("Broaden is a text-based adventure. What is that? Well, it is an adventure that is text written, so you can imagine and paint the picture how you like it.");
				System.out.println("Anything Else?");
				u = scan.nextLine();
				if (u.equals("What Is Broaden?") || u.equals("what is broaden") || u.equals("What is broaden") || u.equals("What Is broaden") || u.equals("what Is broaden") || u.equals("What is Broaden") || u.equals("what is Broaden") || u.equals("what is broaden?")) {
					System.out.println("Broaden is a text-based adventure. What is that? Well, it is an adventure that is text written, so you can imagine and paint the picture how you like it.");
				}
				if (u.equals("How Do I Play?") || u.equals("how do i play") || u.equals("how do I play") || u.equals("How do I play")) {
					System.out.println("As you go along, you will be prompted on everything you need to do.");
				}
				if (u.equals("What Are The Controls?") || u.equals("what are the controls?") || u.equals("what are the controls") || u.equals("What are the controls")) {
					System.out.println("When you begin, the baisic controls will be explained. You will gain new controls as you go along.");
				}
			}
			if (u.equals("How Do I Play?") || u.equals("how do i play") || u.equals("how do I play") || u.equals("How do I play")) {
				System.out.println("As you go along, you will be prompted on everything you need to do.");
				System.out.println("Anything Else?");
				u = scan.nextLine();
				if (u.equals("What Is Broaden?") || u.equals("what is broaden") || u.equals("What is broaden") || u.equals("What Is broaden") || u.equals("what Is broaden") || u.equals("What is Broaden") || u.equals("what is Broaden") || u.equals("what is broaden?")) {
					System.out.println("Broaden is a text-based adventure. What is that? Well, it is an adventure that is text written, so you can imagine and paint the picture how you like it.");
				}
				if (u.equals("How Do I Play?") || u.equals("how do i play") || u.equals("how do I play") || u.equals("How do I play")) {
					System.out.println("As you go along, you will be prompted on everything you need to do.");
				}
				if (u.equals("What Are The Controls?") || u.equals("what are the controls?") || u.equals("what are the controls") || u.equals("What are the controls")) {
					System.out.println("When you begin, the baisic controls will be explained. You will gain new controls as you go along.");
				}
			}
			if (u.equals("What Are The Controls?") || u.equals("what are the controls?") || u.equals("what are the controls") || u.equals("What are the controls")) {
				System.out.println("When you begin, the baisic controls will be explained. You will gain new controls as you go along.");
				System.out.println("Anything Else?");
				u = scan.nextLine();
				if (u.equals("What Is Broaden?") || u.equals("what is broaden") || u.equals("What is broaden") || u.equals("What Is broaden") || u.equals("what Is broaden") || u.equals("What is Broaden") || u.equals("what is Broaden") || u.equals("what is broaden?")) {
					System.out.println("Broaden is a text-based adventure. What is that? Well, it is an adventure that is text written, so you can imagine and paint the picture how you like it.");
				}
				if (u.equals("How Do I Play?") || u.equals("how do i play") || u.equals("how do I play") || u.equals("How do I play")) {
					System.out.println("As you go along, you will be prompted on everything you need to do.");
				}
				if (u.equals("What Are The Controls?") || u.equals("what are the controls?") || u.equals("what are the controls") || u.equals("What are the controls")) {
					System.out.println("When you begin, the baisic controls will be explained. You will gain new controls as you go along.");
				}
			}
		}
		System.out.println("");
		System.out.println(" Please Enter Your Name:");
		name = scan.nextLine();
		System.out.println("");
		System.out.println(" Welcome To Broaden, " + name + ". Press Enter To Start Your Journey");
		i = scan.nextLine();
		System.out.println("");
		System.out.println("");
		game1();
	}
	
	public static void main(String args[]) {
		broaden = new Broaden();
	}
}
