import java.util.*;
public class CollectionQustion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Long,Contact> tree=new TreeMap<>();
		//tree.put(1L,(new Contact("----NAME----","-------E-MAIL Address-----","----GENDER----")));
		tree.put(9140551008L,(new Contact("somnath","  somnathwaditake500@gmail.com","   Male")));
		tree.put(6519091008L,(new Contact("sanket","   sanketwaditake@gmail.com","   Male")));
		tree.put(9623871008L,(new Contact("sachin","  sachinwaditake@gmail.com","   Male")));
		tree.put(7640551008L,(new Contact("rushi","  rushiwaman@gmail.com","   Male")));
		tree.put(5340551008L,(new Contact("santosh","  santoshchindhe@gmail.com","   Male")));
		System.out.println(tree);
		Set<Map.Entry<Long,Contact>> entrySet=tree.entrySet();
		System.out.println(entrySet);
		//Map.Entry<Long, Contact>[] entryArray=entrySet.toArray(new Map.Entry[entrySet.size()]);
		System.out.println("Key of Tree Map are :\n");
		for(Map.Entry<Long, Contact> entryArray:entrySet) {
			System.out.println(entryArray.getKey());
		}
		System.out.println("Values of Tree Map are :\n");
		for(Map.Entry<Long, Contact> entryArray:entrySet) {
			System.out.println(entryArray.getValue());
		}

	}
}