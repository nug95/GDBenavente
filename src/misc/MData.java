package misc;

import controller.GereSocio;
import model.Socio;

public class MData {
	private static Socio s = new Socio(null, null, null);
	private static GereSocio gs = new GereSocio();

	
	public static void FillData(){
		s.setID(0);
		s.setNome("Nuno");
		s.setLocalidade("Barreiro");
		s.setContacto("912345678");
		gs.addSocio(s);
	}
	public static void ListData(){
		System.out.println(gs.getArSocio().get(0).getID());
		System.out.println(gs.getArSocio().get(0).getNome());
		System.out.println(gs.getArSocio().get(0).getLocalidade());
		System.out.println(gs.getArSocio().get(0).getContacto());
	}
}
