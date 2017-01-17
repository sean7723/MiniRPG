package skill;

import characters.Characters;

public abstract class SelfBuffs extends Skill {

	protected int _remainingCharges;

	public SelfBuffs(String name, Characters caster, int charges) {
		super(name, caster);
		_remainingCharges = charges;
	}

	abstract boolean use();
}
