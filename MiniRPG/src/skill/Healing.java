package skill;

import characters.Characters;

public class Healing extends SelfBuffs {

	public Healing(Characters caster) {
		super("Heal", caster, 10);
	}

	@Override
	public boolean use() {
		if (_remainingCharges > 0) {
			_caster.addHealth(200);
			_remainingCharges--;
			return true;
		}
		return false;
	}

	public int getEffect() {
		return 200;
	}
}
