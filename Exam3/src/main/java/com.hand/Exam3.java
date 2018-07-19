package main.java.com.hand;

import java.util.*;

public class Exam3 {

	public static void main(String[] args) {

		interFaceFactory interFaceFactoryr=new interFaceFactory();
		implElse implese=(implElse)interFaceFactoryr.getInterface("implElse");
		implese.sortNum(getRandomNum());
		implStream implstream=(implStream)interFaceFactoryr.getInterface("implStream");
		implstream.sortNum(getRandomNum());
		Map<Integer,List> map = implese.sortNum(implstream.sortNum(getRandomNum()));
		for(Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey()+"=>"+entry.getValue());
		}



}

	public static List<Integer> getRandomNum(){

		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		random.ints(0,100)
				.limit(50).sorted().forEach((i)-> list.add(i));
		return list;
	}

}
