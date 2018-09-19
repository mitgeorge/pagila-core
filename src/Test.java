import java.util.List;

public class Test {
	public int getstore_id(int store_id){
		System.out.println("store_id value is ="+store_id);
	    return store_id;
	}
	public static void main(String args[]) {
		List findAll = new ActorDAO().findAll();
		for (Object object : findAll) {
			Actor actor = (Actor) object;
			System.err.println(actor.getFirstName() + " >> " + actor.getLastName());
			Test a=new Test();
			//a.getstore_id;
		}
		System.exit(0);
	}
}
