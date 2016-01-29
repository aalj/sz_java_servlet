/**
 * Course.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月14日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Course Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月14日 下午6:11:42
 *
 * @see
 * 
 */
public class Course {
	/**
	 * 学科名字
	 */
	private String couName;
	/**
	 * 学生成绩
	 */
	private Score score;
	public Course(String couName, Score score) {
		this.couName = couName;
		this.score = score;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	public String getCouName() {
		return couName;
	}
	public void setCouName(String couName) {
		this.couName = couName;
	}
	@Override
	public String toString() {
		return "couName=" + couName + ", score=" + score ;
	}
	
}
