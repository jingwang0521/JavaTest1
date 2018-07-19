package main.java.com.hand;


public class interFaceFactory {

	public interFace getInterface(String interfaceType) {
		if (interfaceType==null) {
			return null;
		}
		if (interfaceType.equalsIgnoreCase("implStream")) {
			return new implStream();
		}
		if (interfaceType.equalsIgnoreCase("implElse")) {
			return new implElse();
		}
		return  null;
	}

}
