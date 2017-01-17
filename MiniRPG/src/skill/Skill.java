package skill;

import characters.Characters;

public abstract class Skill {
	
	private boolean _isUnlocked;
	protected String _name;
	protected Characters _caster;
	protected int _remainingCharges;

	public Skill(String name, int remainingCharges, Characters caster) {
		_name = name;
		_caster = caster;
		_remainingCharges = remainingCharges;
		_isUnlocked = false;
	}

	public String getName() {
		return _name;
	}

	public String getCasterName() {
		return _caster.getName();
	}
	
	public boolean isUnlocked() {
		return _isUnlocked;
	}
	
	public void unlock() {
		_isUnlocked = true;
	}
	
	public int getRemainingCharges() {
		return _remainingCharges;
	}
}
