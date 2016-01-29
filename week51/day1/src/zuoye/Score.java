/**
 * Score.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月15日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;
/**
 * ClassName:Score
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月15日		下午2:41:48
 *
 * @see 	 

 */
public class Score {
	private  int typeScore;
	private  int Score;
	@Override
	public String toString() {
		return "Score [typeScore=" + typeScore + ", Score=" + Score + "]";
	}
	public Score(int typeScore, int score) {
		this.typeScore = typeScore;
		Score = score;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}

}

