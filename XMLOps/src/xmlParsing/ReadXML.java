package xmlParsing;

public abstract class ReadXML {

	public static int rno;
	public static int sal;
	public static String name;

	public static int getRno() {
		return rno;
	}

	public static void setRno(int rno) {
		ReadXML.rno = rno;
	}

	public static int getSal() {
		return sal;
	}

	public static void setSal(int sal) {
		ReadXML.sal = sal;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		ReadXML.name = name;
	}
	
	abstract void readXMLMethod();
	

}
