package skill;

import characters.Characters;

public abstract class SelfBuffs extends Skill {

	public SelfBuffs(String name, Characters caster, int charges) {
		super(name, charges, caster);
	}

	public abstract boolean use();
	
	public abstract int getEffect();
}
