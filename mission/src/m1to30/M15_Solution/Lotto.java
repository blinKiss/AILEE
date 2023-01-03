package m1to30.M15_Solution;

import java.util.ArrayList;

public class Lotto {

	private ArrayList<ArrayList<Integer>> gameList; 
//	private ArrayList<Integer> lottoList;
	private ArrayList<String> typeList;
	private static Lotto instance;
	
	public Lotto() {
		gameList = new ArrayList<ArrayList<Integer>>(); 
//		lottoList = new ArrayList<Integer>();
		typeList = new ArrayList<String>();
	}

	public static Lotto getInstance() {
		if( instance == null )
			instance = new Lotto();
		return instance;
	}

	public ArrayList<ArrayList<Integer>> getGameList() {
		return gameList;
	}

	public void setGameList(ArrayList<ArrayList<Integer>> gameList) {
		this.gameList = gameList;
	}

//	public ArrayList<Integer> getLottoList() {
//		return lottoList;
//	}
//
//	public void setLottoList(ArrayList<Integer> lottoList) {
//		this.lottoList = lottoList;
//	}

	public ArrayList<String> getTypeList() {
		return typeList;
	}

	public void setTypeList(ArrayList<String> typeList) {
		this.typeList = typeList;
	}
	
	
}