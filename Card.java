

class Card {

	public enum Suit {
		Clubs, Diamonds, Hearts, Spades
	}

	private int suit; // Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
	private int rank; // 1~13

	/**
	 * @param s suit
	 * @param r rank
	 */
	public Card(int s, int r) {
		suit = s;
		rank = r;
	}

	// TODO: 1. Please implement the printCard method (20 points, 10 for suit, 10
	// for rank)
	public void printCard() {
		// Hint: print (System.out.println) card as suit,rank, for example: print 1,1 as
		// Clubs Ace
		
		
		 
		System.out.println(getSuit() + "," + getRank());

	}

	public Suit getSuit() {
	
		Card.Suit ss1=Suit.Clubs;
		Card.Suit ss2=Suit.Diamonds;
		Card.Suit ss3=Suit.Hearts;
		Card.Suit ss4=Suit.Spades;
		if(suit==1) {
				return ss1;
		}
		else if(suit==2) {
			return ss2;
		}else if(suit==3) {
			return ss3;
		}else if(suit==4) {
			return ss4;
		}
		return ss4;
	}

	public int getRank() {
		return rank;
	}
}