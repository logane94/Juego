package personaje;

public class Melee extends Personaje {
	
	private static final int HP_BASE = 200;
	private static final int DAMAGE_BASE = 90;
	private static final int VELOCIDAD_BASE = 50;
	private Arma arma;
	;
	
	
	
	
	
	Melee(){
		
	}
	Melee( String nombre){
		
		super(nombre, HP_BASE, DAMAGE_BASE, VELOCIDAD_BASE);
		
		
		
	}
	


	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void defender() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void equiparArma() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void equiparArmadura() {
		// TODO Auto-generated method stub
		
	}
}