package variable;

import java.util.ArrayList;
import java.util.Arrays;

public class Variable {
	public static ArrayList<String> _imgpath = new ArrayList<String>(Arrays.asList("images/tech_cele/","images/art_cele/"));
	protected static ArrayList<ArrayList<String>> _imgshuffle = new ArrayList<ArrayList<String>>();
	protected static ArrayList<String> _result = new ArrayList<String>();
	protected static int _imgshuffleindex = -1;
	protected static int _shufflecount = 0;
	protected static int _finalresultindex = 7;
	
	
	
	public void setimgshuffle(ArrayList<String> dir) {
		ArrayList<String> one_piece = new ArrayList<String>();
		ArrayList<String> two_piece = new ArrayList<String>();
		ArrayList<String> three_piece = new ArrayList<String>();
		int count = 0;
		for (int x = 0;x<dir.size();x++) {
			if (count == 0) {
				one_piece.add(dir.get(x));
				
			}
			if (count == 1) {
				two_piece.add(dir.get(x));
				
			}
			if (count == 2) {
				three_piece.add(dir.get(x));
				count = -1;
				
			}
			
			count += 1;
		}
		_imgshuffle.add(one_piece);
		_imgshuffle.add(two_piece);
		_imgshuffle.add(three_piece);
	}
	
	
	public void setimgshuffleIndex() {
		_imgshuffleindex += 1;
	}
	public void setDefaultshuffleIndex() {
		_imgshuffleindex = -1;
	}
	public void setShufflecount() {
		_shufflecount += 1;
	}
	public void setResult(String user_result) {
		_result.add(user_result);	
	}
	public void setDefaultshufflecount() {
		_shufflecount = 0;
	}
	public void setFinalresultindex(int _finalresultsindex) {
		_finalresultindex = _finalresultsindex;
	}
	public void setDefaultfinalindex() {
		_finalresultindex = 7;
	}
	public int getShufflecount() {
		return _shufflecount;
	}
	public int getimgshuffleIndex() {
		return _imgshuffleindex;
	}
	public ArrayList<String> getResult() {
		return _result;
	}
	public ArrayList<ArrayList<String>> getimgshuffle() {
		return _imgshuffle;
	}
	public int getFinalresultindex() {
		return _finalresultindex;
	}
	
	

}

