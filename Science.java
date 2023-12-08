package triviaWithSeven;

import java.util.Scanner;

public class Science {
	Scanner sc = new Scanner(System.in);
	public int noOfPlayers;
	public int[] score;
	public int currentScore = 0;
	public int maxScore = Integer.MIN_VALUE;
	
	public String[][] questions = {
		    {"What is the chemical symbol for gold?\r\n"
		            + "- a) Au\r\n"
		            + "- b) Ag\r\n"
		            + "- c) Fe\r\n"
		            + "- d) Hg", "a"
		    },
		    {"Which planet is known as the Red Planet?\r\n"
		            + "- a) Venus\r\n"
		            + "- b) Mars\r\n"
		            + "- c) Jupiter\r\n"
		            + "- d) Saturn", "b"
		    },
		    {"What is the powerhouse of the cell?\r\n"
		            + "- a) Nucleus\r\n"
		            + "- b) Mitochondria\r\n"
		            + "- c) Ribosome\r\n"
		            + "- d) Endoplasmic reticulum", "b"
		    },
		    {"Which gas is responsible for the Earth's greenhouse effect?\r\n"
		            + "- a) Oxygen\r\n"
		            + "- b) Nitrogen\r\n"
		            + "- c) Carbon dioxide\r\n"
		            + "- d) Hydrogen", "c"
		    },
		    {"What is the speed of light in a vacuum?\r\n"
		            + "- a) 300,000 km/s\r\n"
		            + "- b) 150,000 km/s\r\n"
		            + "- c) 500,000 km/s\r\n"
		            + "- d) 200,000 km/s", "a"
		    },
		    {"Who is considered the father of modern physics?\r\n"
		            + "- a) Isaac Newton\r\n"
		            + "- b) Albert Einstein\r\n"
		            + "- c) Galileo Galilei\r\n"
		            + "- d) Stephen Hawking", "b"
		    },
		    {"What is the chemical formula for water?\r\n"
		            + "- a) H2O2\r\n"
		            + "- b) CO2\r\n"
		            + "- c) H2O\r\n"
		            + "- d) CH4", "c"
		    },
		    {"Which element is the most abundant in Earth's crust?\r\n"
		            + "- a) Oxygen\r\n"
		            + "- b) Silicon\r\n"
		            + "- c) Aluminum\r\n"
		            + "- d) Iron", "a"
		    },
		    {"What is the smallest unit of matter?\r\n"
		            + "- a) Atom\r\n"
		            + "- b) Molecule\r\n"
		            + "- c) Cell\r\n"
		            + "- d) Proton", "a"
		    },
		    {"Who proposed the theory of evolution by natural selection?\r\n"
		            + "- a) Charles Darwin\r\n"
		            + "- b) Gregor Mendel\r\n"
		            + "- c) Alfred Russel Wallace\r\n"
		            + "- d) Lamarck", "a"
		    },
		    {"What is the main function of the ozone layer?\r\n"
		            + "- a) Absorbing ultraviolet radiation\r\n"
		            + "- b) Regulating temperature\r\n"
		            + "- c) Producing oxygen\r\n"
		            + "- d) Filtering air pollutants", "a"
		    },
		    {"Which gas is known as the \"silent killer\" because it is colorless and odorless?\r\n"
		            + "- a) Oxygen\r\n"
		            + "- b) Carbon monoxide\r\n"
		            + "- c) Nitrous oxide\r\n"
		            + "- d) Methane", "b"
		    },
		    {"What is the process by which plants make their own food using sunlight?\r\n"
		            + "- a) Respiration\r\n"
		            + "- b) Photosynthesis\r\n"
		            + "- c) Transpiration\r\n"
		            + "- d) Fermentation", "b"
		    },
		    {"Which scientist formulated the laws of motion?\r\n"
		            + "- a) Isaac Newton\r\n"
		            + "- b) Albert Einstein\r\n"
		            + "- c) Galileo Galilei\r\n"
		            + "- d) Nikola Tesla", "a"
		    },
		    {"What is the SI unit of force?\r\n"
		            + "- a) Newton\r\n"
		            + "- b) Watt\r\n"
		            + "- c) Joule\r\n"
		            + "- d) Pascal", "a"
		    },
		    {"Which planet is known as the \"Morning Star\" or \"Evening Star\" and is often visible in the night sky?\r\n"
		            + "- a) Mars\r\n"
		            + "- b) Venus\r\n"
		            + "- c) Jupiter\r\n"
		            + "- d) Mercury", "b"
		    },
		    {"What is the largest organ in the human body?\r\n"
		            + "- a) Heart\r\n"
		            + "- b) Brain\r\n"
		            + "- c) Skin\r\n"
		            + "- d) Liver", "c"
		    },
		    {"Who developed the theory of relativity?\r\n"
		            + "- a) Isaac Newton\r\n"
		            + "- b) Albert Einstein\r\n"
		            + "- c) Stephen Hawking\r\n"
		            + "- d) Niels Bohr", "b"
		    },
		    {"What is the chemical symbol for the element with atomic number 79?\r\n"
		            + "- a) Au\r\n"
		            + "- b) Ag\r\n"
		            + "- c) Fe\r\n"
		            + "- d) Hg", "a"
		    },
		    {"What is the process by which a substance changes from a gas to a liquid?\r\n"
		            + "- a) Sublimation\r\n"
		            + "- b) Condensation\r\n"
		            + "- c) Evaporation\r\n"
		            + "- d) Solidification", "b"
		    }
		};

	
	public Science(int noOfPlayers) {
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
