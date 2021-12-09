package com.solvd.javacourse.unit;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.solvd.javacourse.enums.Side;

public class StormCommando extends Unit {

	private final static Logger LOG = Logger.getLogger(StormCommando.class.getName());
	private static final int MAX_HEALTH = 125;

	public StormCommando(int unitId, Side side) {
		super(unitId, side);
		this.health = 125;
		this.stamina = 125;
	}

	@Override
	public int getMaxHealth() {
		return MAX_HEALTH;
	}

	@Override
	public void run() {
		if (this.stamina > 0) {
			this.stamina -= 10;
			LOG.log(Level.INFO, "The unit " + this.getUnitId() + " runs and the stamina goes down by 10 points.");
		} else {
			LOG.log(Level.INFO, "The unit " + this.getUnitId() + " doesn't have enough stamina");
		}
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StormCommando [health=" + health + ", stamina=" + stamina + ", unitId=" + unitId + ", isAlive="
				+ isAlive + ", side=" + side + "]";
	}

}
