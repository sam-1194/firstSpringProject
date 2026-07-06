package map;

import java.util.HashMap;

public class HashMaping {
	public static void main(String[] args) {
		HashMap<String, String> bikeCompany = new HashMap<String, String>();
		{

			bikeCompany.put("royalEnfield", "GT650");
			bikeCompany.put("honda", "Activa");
			bikeCompany.put("suzuki", "Access");
			bikeCompany.put("hero", "Scooty pep");
			bikeCompany.put("bajaj", "Pulsar");
			bikeCompany.put("tvs", "Apache");

//		System.out.println(bikeCompany);
//		
//		String honda = bikeCompany.get("honda");
//		
//		System.out.println(honda);

//		String tvs= bikeCompany.remove("tvs");
//		System.out.println(bikeCompany);

//		bikeCompany.size();
//		System.out.println(bikeCompany.size());

//		bikeCompany.containsKey("bajaj");
//		System.out.println(bikeCompany.containsKey("bajaj"));

			bikeCompany.keySet();
			System.out.println(bikeCompany.keySet());

		}

	}
	
	public static void flatten() {
		
	}
}