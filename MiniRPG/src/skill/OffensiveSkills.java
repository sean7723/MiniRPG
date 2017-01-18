package skill;

import characters.*;

public abstract class OffensiveSkills extends Skill {

	public OffensiveSkills(String name, Characters caster, int charges) {
		super(name, charges, caster);
	}

	public abstract boolean use(Characters target);

	public abstract int getDamage();
}
