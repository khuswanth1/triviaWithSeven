package triviaWithSeven;

import java.util.Scanner;

public class Politics {
	Scanner sc = new Scanner(System.in);
	public int noOfPlayers;
	public int[] score;
	public int currentScore = 0;
	public int maxScore = Integer.MIN_VALUE;
	
	public String[][] questions = {
		{"Who is the current Prime Minister of India?\r\n" + "- a) Narendra Modi\r\n" + "- b) Rahul Gandhi\r\n"
		        + "- c) Arvind Kejriwal\r\n"
		        + "- d) Amit Shah", "a"
		    },
		    {"Which political party is currently in power at the national level in India?\r\n"
		        + "- a) Indian National Congress\r\n"
		        + "- b) Bharatiya Janata Party\r\n"
		        + "- c) Aam Aadmi Party\r\n"
		        + "- d) Communist Party of India (Marxist)", "b"
		    },
		    {"Who is the President of India as of now?\r\n"
		        + "- a) Ram Nath Kovind\r\n"
		        + "- b) Pranab Mukherjee\r\n"
		        + "- c) Narendra Modi\r\n"
		        + "- d) Sonia Gandhi", "a"
		    },
		    {"Which state is known as the 'Land of Five Rivers' in India?\r\n"
		        + "- a) Gujarat\r\n"
		        + "- b) Punjab\r\n"
		        + "- c) Rajasthan\r\n"
		        + "- d) Kerala", "b"
		    },
		    {"What is the capital city of India?\r\n"
		        + "- a) Mumbai\r\n"
		        + "- b) New Delhi\r\n"
		        + "- c) Kolkata\r\n"
		        + "- d) Bangalore", "b"
		    },
		    {"Which political figure is known as the 'Iron Lady of India'?\r\n"
		        + "- a) Indira Gandhi\r\n"
		        + "- b) Sonia Gandhi\r\n"
		        + "- c) Mamata Banerjee\r\n"
		        + "- d) Mayawati", "a"
		    },
		    {"In which year did India gain independence from British rule?\r\n"
		        + "- a) 1942\r\n"
		        + "- b) 1947\r\n"
		        + "- c) 1950\r\n"
		        + "- d) 1962", "b"
		    },
		    {"Who is the Chief Justice of India as of now?\r\n"
		        + "- a) Sharad Arvind Bobde\r\n"
		        + "- b) Ranjan Gogoi\r\n"
		        + "- c) Dipak Misra\r\n"
		        + "- d) Jagdish Singh Khehar", "a"
		    },
		    {"Which political party did Mahatma Gandhi lead during the Indian independence movement?\r\n"
		        + "- a) Indian National Congress\r\n"
		        + "- b) Bharatiya Janata Party\r\n"
		        + "- c) Communist Party of India\r\n"
		        + "- d) Rashtriya Swayamsevak Sangh", "a"
		    },
		    {"Who is known as the 'Father of the Indian Constitution'?\r\n"
		        + "- a) Jawaharlal Nehru\r\n"
		        + "- b) B. R. Ambedkar\r\n"
		        + "- c) Sardar Patel\r\n"
		        + "- d) Rajendra Prasad", "b"
		    },
		    {"Which river is considered the holiest river in India?\r\n"
		        + "- a) Ganges\r\n"
		        + "- b) Yamuna\r\n"
		        + "- c) Brahmaputra\r\n"
		        + "- d) Godavari", "a"
		    },
		    {"Who was the first woman Prime Minister of India?\r\n"
		        + "- a) Sonia Gandhi\r\n"
		        + "- b) Indira Gandhi\r\n"
		        + "- c) Mamata Banerjee\r\n"
		        + "- d) Jayalalithaa", "b"
		    },
		    {"What is the symbol of the Bharatiya Janata Party (BJP)?\r\n"
		        + "- a) Lotus\r\n"
		        + "- b) Hand\r\n"
		        + "- c) Elephant\r\n"
		        + "- d) Cycle", "a"
		    },
		    {"Which state is known as the 'God's Own Country'?\r\n"
		        + "- a) Tamil Nadu\r\n"
		        + "- b) Kerala\r\n"
		        + "- c) Goa\r\n"
		        + "- d) Maharashtra", "b"
		    },
		    {"Who is the Chief Minister of Delhi as of now?\r\n"
		        + "- a) Arvind Kejriwal\r\n"
		        + "- b) Manohar Lal Khattar\r\n"
		        + "- c) Yogi Adityanath\r\n"
		        + "- d) Nitish Kumar", "a"
		    },
		    {"Which Indian political leader is known for the 'Quit India Movement'?\r\n"
		        + "- a) Jawaharlal Nehru\r\n"
		        + "- b) Sardar Patel\r\n"
		        + "- c) Subhas Chandra Bose\r\n"
		        + "- d) Mahatma Gandhi", "d"
		    },
		    {"Who is the Vice President of India as of now?\r\n"
		        + "- a) Venkaiah Naidu\r\n"
		        + "- b) M. Venkaiah Naidu\r\n"
		        + "- c) Rajnath Singh\r\n"
		        + "- d) Arun Jaitley", "b"
		    },
		    {"In which year was the first general election held in independent India?\r\n"
		        + "- a) 1947\r\n"
		        + "- b) 1950\r\n"
		        + "- c) 1952\r\n"
		        + "- d) 1960", "c"
		    },
		    {"Which political party did Vallabhbhai Patel belong to?\r\n"
		        + "- a) Indian National Congress\r\n"
		        + "- b) Bharatiya Janata Party\r\n"
		        + "- c) Communist Party of India\r\n"
		        + "- d) Janata Dal", "a"
		    },
		    {"Who is the Chief Minister of West Bengal as of now?\r\n"
		        + "- a) Mamata Banerjee\r\n"
		        + "- b) Jyotiraditya Scindia\r\n"
		        + "- c) Naveen Patnaik\r\n"
		        + "- d) Pinarayi Vijayan", "a"
		    },
		    {"What is the official residence of the President of India?\r\n"
		        + "- a) Rashtrapati Bhavan\r\n"
		        + "- b) Lok Kalyan Marg\r\n"
		        + "- c) 7, Race Course Road\r\n"
		        + "- d) Raj Bhavan", "a"
		    }
		};

	
	
	public Politics(int noOfPlayers) {
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
