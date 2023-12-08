package triviaWithSeven;

import java.util.Scanner;

public class Technology {
	Scanner sc = new Scanner(System.in);
	public int noOfPlayers;
	public int[] score;
	public int currentScore = 0;
	public int maxScore = Integer.MIN_VALUE;
	
	public String[][] questions = {
		{"What is the primary function of a CPU in a computer?\r\n" + "- a) Storage\r\n"+ "- b) Graphics\r\n" + "- c) Processing\r\n"+ "- d) Networking", "c"},
		{"Which programming language is often used for developing Android applications?\r\n" + "- a) Swift\r\n" + "- b) Java\r\n" + "- c) C#\r\n" + "- d) Python", "b"},
		{"What does HTML stand for in the context of web development?\r\n" + "- a) Hyperlink and Text Markup Language\r\n" + "- b) Hypertext Markup Language\r\n" + "- c) High-Level Text Management Language\r\n" + "- d) Hyper Transferable Language", "b"},
		{"Which company is known for its series of GeForce graphics processing units (GPUs)?\r\n" + "- a) AMD\r\n" + "- b) Intel\r\n" + "- c) NVIDIA\r\n" + "- d) Qualcomm", "c"},
		{"What is the purpose of a firewall in computer security?\r\n" + "- a) Virus detection\r\n" + "- b) Data encryption\r\n" + "- c) Network protection\r\n" + "- d) Disk cleanup", "c"},
		    {"In computer storage, what does SSD stand for?\r\n"
		            + "- a) Solid State Drive\r\n"
		            + "- b) Serial Storage Device\r\n"
		            + "- c) System Storage Disk\r\n"
		            + "- d) Secure Storage Drive", "a"
		    },
		    {"Which programming language is commonly used for machine learning and artificial intelligence?\r\n"
		            + "- a) Java\r\n"
		            + "- b) Python\r\n"
		            + "- c) C++\r\n"
		            + "- d) Ruby", "b"
		    },
		    {"What is the main purpose of the Domain Name System (DNS) in computer networks?\r\n"
		            + "- a) Data encryption\r\n"
		            + "- b) IP address assignment\r\n"
		            + "- c) File storage\r\n"
		            + "- d) Wireless communication", "b"
		    },
		    {"Which technology is used for wireless communication between devices over short distances?\r\n"
		            + "- a) LTE\r\n"
		            + "- b) Bluetooth\r\n"
		            + "- c) NFC\r\n"
		            + "- d) Wi-Fi", "b"
		    },
		    {"What does the acronym HTTP stand for in the context of web browsing?\r\n"
		            + "- a) HyperText Transfer Protocol\r\n"
		            + "- b) High-Tech Transfer Protocol\r\n"
		            + "- c) Hyper Transfer Text Process\r\n"
		            + "- d) HyperText Toolset Protocol", "a"
		    },
		    {"In computer science, what is an algorithm?\r\n"
		            + "- a) A type of computer virus\r\n"
		            + "- b) A step-by-step procedure or formula for solving problems\r\n"
		            + "- c) A computer operating system\r\n"
		            + "- d) A type of programming language", "b"
		    },
		    {"What does the term \"Open Source\" refer to in the context of software?\r\n"
		            + "- a) Software with no security\r\n"
		            + "- b) Software that is not publicly available\r\n"
		            + "- c) Software with freely available source code\r\n"
		            + "- d) Software with closed interfaces", "c"
		    },
		    {"Which programming paradigm emphasizes the use of functions and avoids changing state and mutable data?\r\n"
		            + "- a) Object-Oriented Programming (OOP)\r\n"
		            + "- b) Functional Programming (FP)\r\n"
		            + "- c) Procedural Programming\r\n"
		            + "- d) Event-Driven Programming", "b"
		    },
		    {"What is the purpose of a cache memory in a computer system?\r\n"
		            + "- a) Long-term data storage\r\n"
		            + "- b) Temporary storage for frequently accessed data\r\n"
		            + "- c) Data encryption\r\n"
		            + "- d) Network routing", "b"
		    },
		    {"Which operating system is known for its open-source nature and is based on the Linux kernel?\r\n"
		            + "- a) Windows\r\n"
		            + "- b) macOS\r\n"
		            + "- c) Ubuntu\r\n"
		            + "- d) Android", "c"
		    },
		    {"What is the purpose of the \"grep\" command in Unix-based operating systems?\r\n"
		            + "- a) Text editing\r\n"
		            + "- b) File compression\r\n"
		            + "- c) Text searching and pattern matching\r\n"
		            + "- d) Network configuration", "c"
		    },
		    {"What is the term for a software development process that involves incremental improvements and feedback from users?\r\n"
		            + "- a) Waterfall model\r\n"
		            + "- b) Agile development\r\n"
		            + "- c) Spiral model\r\n"
		            + "- d) V-Model", "b"
		    },
		    {"Which encryption algorithm is commonly used for securing internet communications (HTTPS)?\r\n"
		            + "- a) DES\r\n"
		            + "- b) AES\r\n"
		            + "- c) RSA\r\n"
		            + "- d) MD5", "b"
		    },
		    {"What is the primary function of a router in a computer network?\r\n"
		            + "- a) Data storage\r\n"
		            + "- b) Device security\r\n"
		            + "- c) Traffic routing between networks\r\n"
		            + "- d) Software development", "c"
		    },
		    {"Which technology is used for connecting devices in a local network with a physical cable?\r\n"
		            + "- a) Wi-Fi\r\n"
		            + "- b) Bluetooth\r\n"
		            + "- c) Ethernet\r\n"
		            + "- d) NFC", "c"
		    },
		    {"What does the acronym IoT stand for in the context of modern technology?\r\n"
		            + "- a) Internet of Things\r\n"
		            + "- b) Input/Output Technology\r\n"
		            + "- c) Intranet of Technology\r\n"
		            + "- d) Integrated Operating Tools", "a"
		    }
		};

	
	
	public Technology(int noOfPlayers) {
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
