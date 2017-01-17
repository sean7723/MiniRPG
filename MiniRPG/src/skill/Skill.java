package skill;

import characters.Characters;

public abstract class Skill {

	protected String _name;
	protected Characters _caster;

	public Skill(String name, Characters caster) {
		_name = name;
		_caster = caster;
	}

	public String getName() {
		return _name;
	}

	public String getCasterName() {
		return _caster.getName();
	}
}
