package generic;

import java.util.Comparator;

public class NameAscComparator implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return o1.getOwner().compareTo(o2.getOwner());
	}
	

}
