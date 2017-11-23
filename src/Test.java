import java.util.List;

public class Test {
	public static void main(String args[]) {
		List findAll = new ActorDAO().findAll();
		for (Object object : findAll) {
			Actor actor = (Actor) object;
			System.err.println(actor.getFirstName() + " >> " + actor.getLastName());
		}
		System.exit(0);
	}
}
