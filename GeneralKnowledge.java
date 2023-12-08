package triviaWithSeven;

import java.util.Scanner;

public class GeneralKnowledge {
	Scanner sc = new Scanner(System.in);
	public int noOfPlayers;
	public int[] score;
	public int currentScore = 0;
	public int maxScore = Integer.MIN_VALUE;
	
	public String[][] questions = {
		    {"Who is known as the Father of the Nation in India?\r\n"
		        + "- a) Jawaharlal Nehru\r\n"
		        + "- b) Sardar Patel\r\n"
		        + "- c) Mahatma Gandhi\r\n"
		        + "- d) Subhas Chandra Bose", "c"
		    },
		    {"Which river is the longest in India?\r\n"
		        + "- a) Ganges\r\n"
		        + "- b) Yamuna\r\n"
		        + "- c) Brahmaputra\r\n"
		        + "- d) Godavari", "a"
		    },
		    {"What is the capital city of Maharashtra?\r\n"
		        + "- a) Kolkata\r\n"
		        + "- b) Chennai\r\n"
		        + "- c) Mumbai\r\n"
		        + "- d) Delhi", "c"
		    },
		    {"Who wrote the Indian National Anthem, 'Jana Gana Mana'?\r\n"
		        + "- a) Rabindranath Tagore\r\n"
		        + "- b) Subhas Chandra Bose\r\n"
		        + "- c) Mahatma Gandhi\r\n"
		        + "- d) Jawaharlal Nehru", "a"
		    },
		    {"Which state is known as the 'Land of Five Rivers'?\r\n"
		        + "- a) Punjab\r\n"
		        + "- b) Haryana\r\n"
		        + "- c) Uttar Pradesh\r\n"
		        + "- d) Rajasthan", "a"
		    },
		    {"Who was the first woman Prime Minister of India?\r\n"
		        + "- a) Sonia Gandhi\r\n"
		        + "- b) Indira Gandhi\r\n"
		        + "- c) Sushma Swaraj\r\n"
		        + "- d) Mamata Banerjee", "b"
		    },
		    {"In which year did India gain independence from British rule?\r\n"
		        + "- a) 1942\r\n"
		        + "- b) 1947\r\n"
		        + "- c) 1950\r\n"
		        + "- d) 1962", "b"
		    },
		    {"Which mountain range separates India from China?\r\n"
		        + "- a) Himalayas\r\n"
		        + "- b) Aravalli Range\r\n"
		        + "- c) Western Ghats\r\n"
		        + "- d) Eastern Ghats", "a"
		    },
		    {"What is the currency of India?\r\n"
		        + "- a) Rupee\r\n"
		        + "- b) Yen\r\n"
		        + "- c) Dollar\r\n"
		        + "- d) Euro", "a"
		    },
		    {"Who is known as the Iron Man of India?\r\n"
		        + "- a) Jawaharlal Nehru\r\n"
		        + "- b) Sardar Patel\r\n"
		        + "- c) Bhagat Singh\r\n"
		        + "- d) Rajendra Prasad", "b"
		    },
		    {"Which Indian state is known as the 'Land of the Rising Sun'?\r\n"
		        + "- a) Arunachal Pradesh\r\n"
		        + "- b) Assam\r\n"
		        + "- c) Manipur\r\n"
		        + "- d) Mizoram", "a"
		    },
		    {"Who is the author of the book 'The Discovery of India'?\r\n"
		        + "- a) Jawaharlal Nehru\r\n"
		        + "- b) Rabindranath Tagore\r\n"
		        + "- c) Sardar Patel\r\n"
		        + "- d) Mahatma Gandhi", "a"
		    },
		    {"Which Indian city is known as the 'City of Lakes'?\r\n"
		        + "- a) Jaipur\r\n"
		        + "- b) Udaipur\r\n"
		        + "- c) Bhopal\r\n"
		        + "- d) Jodhpur", "b"
		    },
		    {"Who was the first Indian woman to win an Olympic medal?\r\n"
		        + "- a) P. T. Usha\r\n"
		        + "- b) Mary Kom\r\n"
		        + "- c) Karnam Malleswari\r\n"
		        + "- d) Sakshi Malik", "c"
		    },
		    {"Which Indian river is also known as the 'Sorrow of Bihar'?\r\n"
		        + "- a) Ganges\r\n"
		        + "- b) Yamuna\r\n"
		        + "- c) Kosi\r\n"
		        + "- d) Brahmaputra", "c"
		    },
		    {"Who is known as the 'Missile Man of India'?\r\n"
		        + "- a) A. P. J. Abdul Kalam\r\n"
		        + "- b) Vikram Sarabhai\r\n"
		        + "- c) Homi Bhabha\r\n"
		        + "- d) C. V. Raman", "a"
		    },
		    {"Which Indian festival is known as the Festival of Lights?\r\n"
		        + "- a) Holi\r\n"
		        + "- b) Diwali\r\n"
		        + "- c) Navratri\r\n"
		        + "- d) Durga Puja", "b"
		    },
		    {"Who is the author of the Indian Constitution?\r\n"
		        + "- a) B. R. Ambedkar\r\n"
		        + "- b) Jawaharlal Nehru\r\n"
		        + "- c) Mahatma Gandhi\r\n"
		        + "- d) Sardar Patel", "a"
		    },
		    {"Which Indian state is known as the 'Land of the Gods'?\r\n"
		        + "- a) Himachal Pradesh\r\n"
		        + "- b) Uttarakhand\r\n"
		        + "- c) Jammu and Kashmir\r\n"
		        + "- d) Sikkim", "b"
		    },
		    {"What is the national animal of India?\r\n"
		        + "- a) Lion\r\n"
		        + "- b) Tiger\r\n"
		        + "- c) Elephant\r\n"
		        + "- d) Leopard", "b"
		    },
		    {"Who composed the music for the Indian national song 'Vande Mataram'?\r\n"
		        + "- a) A. R. Rahman\r\n"
		        + "- b) Rabindranath Tagore\r\n"
		        + "- c) Lata Mangeshkar\r\n"
		        + "- d) Kishore Kumar", "b"
		    }
		};
	public GeneralKnowledge(int noOfPlayers) {
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
