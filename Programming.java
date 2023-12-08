package triviaWithSeven;

import java.util.Scanner;

public class Programming {
	Scanner sc = new Scanner(System.in);
	public int noOfPlayers;
	public int[] score;
	public int currentScore = 0;
	public int maxScore = Integer.MIN_VALUE;
	
	public String[][] questions = {
	        {"What does HTML stand for?\r\n"
	                + "- a) Hyper Text Markup Language\r\n"
	                + "- b) High-Level Text Management Language\r\n"
	                + "- c) Hyperlink and Text Markup Language\r\n"
	                + "- d) Hyper Transferable Markup Language", "a"
	        },
	        {"Which programming language is known for its use in developing web pages?\r\n"
	                + "- a) Java\r\n"
	                + "- b) Python\r\n"
	                + "- c) JavaScript\r\n"
	                + "- d) C++", "c"
	        },
	        {"What is the purpose of CSS in web development?\r\n"
	                + "- a) Creating dynamic content\r\n"
	                + "- b) Styling and formatting web pages\r\n"
	                + "- c) Managing server-side scripts\r\n"
	                + "- d) Handling database operations", "b"
	        },
	        {"In object-oriented programming, what is encapsulation?\r\n"
	                + "- a) Breaking down a complex problem into simpler parts\r\n"
	                + "- b) Combining data and methods that operate on the data into a single unit\r\n"
	                + "- c) Managing memory allocation\r\n"
	                + "- d) Defining the relationship between classes", "b"
	        },
	        {"What is the purpose of the 'final' keyword in Java?\r\n"
	                + "- a) Indicating the end of a program\r\n"
	                + "- b) Declaring a variable that cannot be modified\r\n"
	                + "- c) Specifying the access level of a class\r\n"
	                + "- d) Starting a loop", "b"
	        },
	        {"Which data structure uses the Last In, First Out (LIFO) principle?\r\n"
	                + "- a) Queue\r\n"
	                + "- b) Stack\r\n"
	                + "- c) Linked List\r\n"
	                + "- d) Tree", "b"
	        },
	        {"What is the purpose of the 'this' keyword in Java?\r\n"
	                + "- a) Referring to the current object\r\n"
	                + "- b) Creating a new object\r\n"
	                + "- c) Indicating the end of a statement\r\n"
	                + "- d) Defining a class", "a"
	        },
	        {"In Python, how do you open a file in read mode?\r\n"
	                + "- a) file.open('filename', 'r')\r\n"
	                + "- b) open('filename', 'r')\r\n"
	                + "- c) read('filename')\r\n"
	                + "- d) file.read('filename', 'r')", "b"
	        },
	        {"What is the purpose of the 'git' version control system?\r\n"
	                + "- a) Managing databases\r\n"
	                + "- b) Tracking changes in source code\r\n"
	                + "- c) Creating graphical user interfaces\r\n"
	                + "- d) Running automated tests", "b"
	        },
	        {"What is the main advantage of using a relational database?\r\n"
	                + "- a) Storing data in a hierarchical structure\r\n"
	                + "- b) Ensuring data consistency through relationships\r\n"
	                + "- c) Running code directly on the server\r\n"
	                + "- d) Storing data in plain text files", "b"
	        },
	        {"In Java, what is the difference between '== ' and '.equals()' when comparing strings?\r\n"
	                + "- a) They are interchangeable\r\n"
	                + "- b) '==' compares object references, '.equals()' compares content\r\n"
	                + "- c) '==' compares content, '.equals()' compares object references\r\n"
	                + "- d) Both always return true", "b"
	        },
	        {"What is the purpose of the 'try', 'catch', and 'finally' blocks in Java?\r\n"
	                + "- a) Defining classes and objects\r\n"
	                + "- b) Handling exceptions in code\r\n"
	                + "- c) Controlling program flow\r\n"
	                + "- d) Allocating memory for variables", "b"
	        },
	        {"Which keyword is used to define a constant in C++?\r\n"
	                + "- a) constant\r\n"
	                + "- b) readonly\r\n"
	                + "- c) const\r\n"
	                + "- d) final", "c"
	        },
	        {"What is the purpose of the 'super' keyword in Java?\r\n"
	                + "- a) Accessing the superclass of a derived class\r\n"
	                + "- b) Indicating the end of a loop\r\n"
	                + "- c) Specifying the superclass of a base class\r\n"
	                + "- d) Starting a new thread", "a"
	        },
	        {"Which programming paradigm emphasizes the use of functions as first-class citizens?\r\n"
	                + "- a) Object-oriented programming\r\n"
	                + "- b) Procedural programming\r\n"
	                + "- c) Functional programming\r\n"
	                + "- d) Logical programming", "c"
	        },
	        {"What does the acronym SQL stand for in database management?\r\n"
	                + "- a) Structured Question Language\r\n"
	                + "- b) Simplified Query Language\r\n"
	                + "- c) Sequential Query Language\r\n"
	                + "- d) Structured Query Language", "d"
	        },
	        {"In Python, what is the purpose of the 'lambda' keyword?\r\n"
	                + "- a) Declaring a variable\r\n"
	                + "- b) Creating an anonymous function\r\n"
	                + "- c) Accessing a module\r\n"
	                + "- d) Initializing a class", "b"
	        },
	        {"What is the primary advantage of using version control systems like Git?\r\n"
	                + "- a) Tracking changes in source code\r\n"
	                + "- b) Generating random numbers\r\n"
	                + "- c) Writing documentation\r\n"
	                + "- d) Running automated tests", "a"
	        },
	        {"Which programming language is commonly used for machine learning and data analysis?\r\n"
	                + "- a) Java\r\n"
	                + "- b) C#\r\n"
	                + "- c) Python\r\n"
	                + "- d) Ruby", "c"
	        },
	        {"What is the purpose of the 'break' statement in programming?\r\n"
	                + "- a) Terminating a loop or switch statement\r\n"
	                + "- b) Continuing to the next iteration of a loop\r\n"
	                + "- c) Printing output to the console\r\n"
	                + "- d) Defining a new function", "a"
	        }
	};

	
	public Programming(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
		score = new int[noOfPlayers];
	}
	
	public void quiz(Registration registerObj) {
		for(int playerCount=0;playerCount<noOfPlayers;playerCount++) {
			for(int i=playerCount*10;i<10*(playerCount+1);i++) {
				System.out.println(questions[i][0]);
				String option = sc.nextLine();
				if((questions[i][1]).equals(option.toLowerCase())) {
					currentScore = currentScore + 10;
				}
			}
			maxScore = Math.max(maxScore, currentScore);
			score[playerCount] = currentScore;
			System.out.println("Your score out of 100:"+currentScore);
			currentScore = 0;
		}
		
		System.out.println("~~~~~WINNER(S)~~~~~");
		for(int playerCount=0;playerCount<noOfPlayers;playerCount++) {
			if(score[playerCount]==maxScore) {
				System.out.println(registerObj.players[playerCount]+"("+score[playerCount]+")");
			}
		}
		
		System.out.println("=========END OF GAME=========");
	}
	
}
