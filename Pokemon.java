package com.tesuan.pokemon;

public abstract class Pokemon {
	
	protected String Name;
	protected String type;
	protected int id;
	protected double health = 100;
	protected boolean heal = false;
	
	
	protected String[] attack;
	protected double[] attackDamage;
	protected String[] specialAttack;
	protected double[] specialAttackDamage;
	
	// Constructor for all the attributes
	
	public Pokemon(String name, String type, int id, String[] attack, double[] attackDamage,
			String[] specialAttack, double[] specialAttackDamage) {
		super();
		Name = name;
		this.type = type;
		this.id = id;
		this.attack = attack;
		this.attackDamage = attackDamage;
		this.specialAttack = specialAttack;
		this.specialAttackDamage = attackDamage;
	}
	
		
	public abstract String specialAttackEffectiveness(Pokemon variant);
	
	public abstract void damageDealt(double dmg);
	

	
	
	
	// Getters and Setters
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getHealth() {
		return health;
	}


	public void setHealth(double health) {
		this.health = health;
	}


	public boolean isHeal() {
		return heal;
	}


	public void setHeal(boolean heal) {
		this.heal = heal;
	}


	public String[] getAttack() {
		return attack;
	}


	public void setAttack(String[] attack) {
		this.attack = attack;
	}


	public double[] getAttackDamage() {
		return attackDamage;
	}


	public void setAttackDamage(double[] attackDamage) {
		this.attackDamage = attackDamage;
	}


	public String[] getSpecialAttack() {
		return specialAttack;
	}


	public void setSpecialAttack(String[] specialAttack) {
		this.specialAttack = specialAttack;
	}


	public double[] getSpecialAttackDamage() {
		return specialAttackDamage;
	}


	public void setSpecialAttackDamage(double[] specialAttackDamage) {
		this.specialAttackDamage = specialAttackDamage;
	}
	
	
	
	
	
	
	// The fight class
	
	public void fight(int abilityID) {
		
	}

	public void useHeal(boolean heal) {
		if(!heal) {
			this.health+=40;
			this.heal = true;
		}
			
	}
	
	public boolean hasFainted() {
		if(this.health<=0)
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}































