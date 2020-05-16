package com.original_game.janken;

public class VictoryOrDefeat {
	private static int point = 0;
	public static final void decisionVictoryOrDefeat(int computerHand,int playerHand) {
		int playerHandTemp = playerHand;
		playerHandTemp++;

		if (playerHand == computerHand) {
			Panel.headerLabel.setText("あいこ！（" + point + "）");
		}
		else if ((playerHand == 3 && computerHand == 1)||(playerHandTemp == computerHand)) {
		point+=1;
		Panel.headerLabel.setText("あなたの勝ち！（" + point + "連勝）");

	}
	else {
		point=0;
		Panel.headerLabel.setText("あなたの負け！（" + point + "）");
	}

	}
}
