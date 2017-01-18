package skill;

import characters.Characters;

public class Fireball extends OffensiveSkills {

	public Fireball(Characters caster) {
		super("Fireball", caster, 20);
	}

	@Override
	public boolean use(Characters target) {
		if (_remainingCharges > 0) {
			_caster.hit(target, 500);
			_remainingCharges--;
			return true;
		}
		return false;
	}

	public int getDamage() {
		return 500;
	}
}