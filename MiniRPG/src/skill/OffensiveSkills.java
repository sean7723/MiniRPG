package skill;

import characters.*;

public abstract class OffensiveSkills extends Skill {

	protected int _remainingCharges;

	public OffensiveSkills(String name, Characters caster, int charges) {
		super(name, caster);
		_remainingCharges = charges;
	}

	abstract boolean use(Characters target);
}
