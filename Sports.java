package triviaWithSeven;

import java.util.Scanner;

public class Sports {
	Scanner sc = new Scanner(System.in);
	public int noOfPlayers;
	public int [] score;
	public int currentScore = 0;
	public int maxScore = Integer.MIN_VALUE;
	public Sports(int n) {
		noOfPlayers = n;
		score = new int[n];
	}
	public String [][] questions = {
			{"In tennis, who holds the record for the most Grand Slam singles titles?\r\n"
					+ "- a) Rafael Nadal\r\n"
					+ "- b) Serena Williams\r\n"
					+ "- c) Novak Djokovic\r\n"
					+ "- d) Roger Federer","c"
			},
			{" Which country has won the most Olympic gold medals in men's soccer?\r\n"
					+ "- a) Brazil\r\n"
					+ "- b) Germany\r\n"
					+ "- c) Argentina\r\n"
					+ "- d) Hungary","d"
						
			},
			{"Who is the all-time leading scorer in NBA history?\r\n"
					+ "- a) LeBron James\r\n"
					+ "- b) Michael Jordan\r\n"
					+ "- c) Kobe Bryant\r\n"
					+ "- d) Kareem Abdul-Jabbar\r\n","a"
			},
			{"Which athlete holds the world record for the men's marathon?\r\n"
					+ "- a) Eliud Kipchoge\r\n"
					+ "- b) Kelvin Kiptum\r\n"
					+ "- c) Kenenisa Bekele\r\n"
					+ "- d) Usain Bolt","b"
			},
			{"In golf, who holds the record for the most major championships?\r\n"
					+ "- a) Tiger Woods\r\n"
					+ "- b) Jack Nicklaus\r\n"
					+ "- c) Phil Mickelson\r\n"
					+ "- d) Rory McIlroy","b"
			},
			{"Which country has won the most FIFA World Cup titles in women's soccer?\r\n"
					+ "- a) USA\r\n"
					+ "- b) Germany\r\n"
					+ "- c) Brazil\r\n"
					+ "- d) Norway","a"
			},
			{"Who is the only boxer to win world titles in eight different weight divisions?\r\n"
					+ " - a) Floyd Mayweather Jr.\r\n"
					+ "- b) Manny Pacquiao\r\n"
					+ "- c) Muhammad Ali\r\n"
					+ "- d) Sugar Ray Leonard","b"
			},
			{"Which Formula 1 driver holds the record for the most World Drivers' Championships?\r\n"
					+ "- a) Ayrton Senna\r\n"
					+ "- b) Lewis Hamilton\r\n"
					+ "- c) Max Verstappen\r\n"
					+ "- d) Sebastian Vettel","b"
			},
			{"In which year did the first modern Olympic Games take place?\r\n"
					+ "- a) 1886\r\n"
					+ "- b) 1896\r\n"
					+ "- c) 1906\r\n"
					+ "- d) 1916","b"
			},
			{" Who is the only footballer to have won the FIFA World Player of the Year award eight times?\r\n"
					+ "- a) Lionel Messi\r\n"
					+ "- b) Cristiano Ronaldo\r\n"
					+ "- c) Zinedine Zidane\r\n"
					+ "- d) Ronaldinho","a"
			},
			{"Which country has the most Olympic gold medals in ice hockey?\r\n"
					+ "- a) Canada\r\n"
					+ "- b) Russia\r\n"
					+ "- c) Sweden\r\n"
					+ "- d) USA","a"
			},
			{"Who holds the record for the fastest 100m sprint in women's athletics?\r\n"
					+ "- a) Florence Griffith-Joyner\r\n"
					+ "- b) Marion Jones\r\n"
					+ "- c) Usain Bolt\r\n"
					+ "- d) Shelly-Ann Fraser-Pryce","a"
			},
			{"Which country has won the most Rugby World Cup titles?\r\n"
					+ "    - a) South Africa\r\n"
					+ "    - b) Australia\r\n"
					+ "    - c) New Zealand\r\n"
					+ "    - d) England","a"
			},
			{"Who holds the record for the most goals scored in a single NHL season?\r\n"
					+ "- a) Wayne Gretzky\r\n"
					+ "- b) Mario Lemieux\r\n"
					+ "- c) Alexander Ovechkin\r\n"
					+ "- d) Bobby Orr\r\n","a"
			},
			{"Which country has won the most Davis Cup titles in tennis?\r\n"
					+ "- a) USA\r\n"
					+ "- b) Australia\r\n"
					+ "- c) Spain\r\n"
					+ "- d) France","a"
			},
			{"Who is the only driver to have won the Indianapolis 500, the Daytona 500, and the Formula One World Championship?\r\n"
					+ "    - a) Ayrton Senna\r\n"
					+ "    - b) Mario Andretti\r\n"
					+ "    - c) Lewis Hamilton\r\n"
					+ "    - d) Emerson Fittipaldi","b"
			},
			{"In which year did cricket become an Olympic sport?\r\n"
					+ "- a) 1900\r\n"
					+ "- b) 1928\r\n"
					+ "- c) 2028\r\n"
					+ "- d) 2023","a"
			},
			{"Who is the only female tennis player to have completed the Golden Slam (winning all four Grand Slam titles and the Olympic gold medal in a single year)?\r\n"
					+ "    - a) Serena Williams\r\n"
					+ "    - b) Steffi Graf\r\n"
					+ "    - c) Martina Navratilova\r\n"
					+ "    - d) Chris Evert","b"
			},
			{"Which country has the most medals in the history of the Summer Olympics?\r\n"
					+ "- a) USA\r\n"
					+ "- b) China\r\n"
					+ "- c) Russia\r\n"
					+ "- d) Germany","a"
			},
			{"Who holds the record for the most goals scored in a single FIFA World Cup tournament?\r\n"
					+ "- a) Pele\r\n"
					+ "- b) Just Fontaine\r\n"
					+ "- c) Gerd Muller\r\n"
					+ "- d) Miroslav Klose","b"
			},
			{" Which country has won the most Olympic medals in men's soccer?\r\n"
					+ "- a) Brazil\r\n"
					+ "- b) Germany\r\n"
					+ "- c) Argentina\r\n"
					+ "- d) Hungary\r\n","a"
			}
	};

	
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
