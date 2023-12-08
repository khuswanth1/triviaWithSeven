package triviaWithSeven;

import java.util.Scanner;

public class Entertainment {
	Scanner sc = new Scanner(System.in);
	public int noOfPlayers;
	public int[] score;
	public int currentScore = 0;
	public int maxScore = Integer.MIN_VALUE;
	
	public String[][] questions = {
		    {"Who won the Academy Award for Best Actor in 2020?\r\n"
		            + "- a) Joaquin Phoenix\r\n"
		            + "- b) Leonardo DiCaprio\r\n"
		            + "- c) Brad Pitt\r\n"
		            + "- d) Anthony Hopkins", "d"
		    },
		    {"Which movie won the Best Picture at the Oscars in 2019?\r\n"
		            + "- a) Parasite\r\n"
		            + "- b) 1917\r\n"
		            + "- c) Joker\r\n"
		            + "- d) Once Upon a Time in Hollywood", "a"
		    },
		    {"Who is known as the 'Queen of Pop'?\r\n"
		            + "- a) Beyoncé\r\n"
		            + "- b) Madonna\r\n"
		            + "- c) Lady Gaga\r\n"
		            + "- d) Rihanna", "b"
		    },
		    {"Which band is often referred to as the 'Fab Four'?\r\n"
		            + "- a) The Rolling Stones\r\n"
		            + "- b) The Beatles\r\n"
		            + "- c) Led Zeppelin\r\n"
		            + "- d) U2", "b"
		    },
		    {"Who is the lead vocalist of the band Coldplay?\r\n"
		            + "- a) Chris Martin\r\n"
		            + "- b) Bono\r\n"
		            + "- c) Thom Yorke\r\n"
		            + "- d) Brandon Flowers", "a"
		    },
		    {"Which animated film features a character named Simba?\r\n"
		            + "- a) Frozen\r\n"
		            + "- b) The Lion King\r\n"
		            + "- c) Toy Story\r\n"
		            + "- d) Moana", "b"
		    },
		    {"Who directed the movie 'Inception'?\r\n"
		            + "- a) Christopher Nolan\r\n"
		            + "- b) Quentin Tarantino\r\n"
		            + "- c) Steven Spielberg\r\n"
		            + "- d) Martin Scorsese", "a"
		    },
		    {"Which TV series is based on George R.R. Martin's book series 'A Song of Ice and Fire'?\r\n"
		            + "- a) Breaking Bad\r\n"
		            + "- b) The Sopranos\r\n"
		            + "- c) Game of Thrones\r\n"
		            + "- d) Stranger Things", "c"
		    },
		    {"Who played the character of Jack Dawson in the movie 'Titanic'?\r\n"
		            + "- a) Leonardo DiCaprio\r\n"
		            + "- b) Tom Hanks\r\n"
		            + "- c) Johnny Depp\r\n"
		            + "- d) Brad Pitt", "a"
		    },
		    {"Which actress won the Best Actress Oscar for her role in 'La La Land'?\r\n"
		            + "- a) Emma Stone\r\n"
		            + "- b) Meryl Streep\r\n"
		            + "- c) Natalie Portman\r\n"
		            + "- d) Cate Blanchett", "a"
		    },
		    {"Who is the lead guitarist of the rock band Queen?\r\n"
		            + "- a) Brian May\r\n"
		            + "- b) Jimmy Page\r\n"
		            + "- c) Eddie Van Halen\r\n"
		            + "- d) Slash", "a"
		    },
		    {"Which movie features a character named Darth Vader?\r\n"
		            + "- a) Jurassic Park\r\n"
		            + "- b) Star Wars\r\n"
		            + "- c) Harry Potter\r\n"
		            + "- d) The Matrix", "b"
		    },
		    {"Who composed the soundtrack for the movie 'The Dark Knight'?\r\n"
		            + "- a) Hans Zimmer\r\n"
		            + "- b) John Williams\r\n"
		            + "- c) Ennio Morricone\r\n"
		            + "- d) Alan Silvestri", "a"
		    },
		    {"Which pop icon is known as the 'Material Girl'?\r\n"
		            + "- a) Madonna\r\n"
		            + "- b) Lady Gaga\r\n"
		            + "- c) Britney Spears\r\n"
		            + "- d) Beyoncé", "a"
		    },
		    {"In which movie does Tom Hanks play the character Forrest Gump?\r\n"
		            + "- a) Saving Private Ryan\r\n"
		            + "- b) The Green Mile\r\n"
		            + "- c) Cast Away\r\n"
		            + "- d) Forrest Gump", "d"
		    },
		    {"Who won the Grammy Award for Album of the Year in 2022?\r\n"
		            + "- a) Adele\r\n"
		            + "- b) Taylor Swift\r\n"
		            + "- c) Billie Eilish\r\n"
		            + "- d) Kanye West", "a"
		    },
		    {"Which actor portrayed the character of Tony Stark in the Marvel Cinematic Universe?\r\n"
		            + "- a) Chris Hemsworth\r\n"
		            + "- b) Chris Evans\r\n"
		            + "- c) Robert Downey Jr.\r\n"
		            + "- d) Mark Ruffalo", "c"
		    },
		    {"In which year was the first Grammy Awards ceremony held?\r\n"
		            + "- a) 1959\r\n"
		            + "- b) 1969\r\n"
		            + "- c) 1979\r\n"
		            + "- d) 1989", "a"
		    },
		    {"Who is known as the 'King of Pop'?\r\n"
		            + "- a) Elvis Presley\r\n"
		            + "- b) Michael Jackson\r\n"
		            + "- c) Prince\r\n"
		            + "- d) David Bowie", "b"
		    },
		    {"Which film won the Palme d'Or at the 2021 Cannes Film Festival?\r\n"
		            + "- a) Parasite\r\n"
		            + "- b) The Tree of Life\r\n"
		            + "- c) Titane\r\n"
		            + "- d) Blue Is the Warmest Color", "c"
		    }
		};

	
	
	public Entertainment(int noOfPlayers) {
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
