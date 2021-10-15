package com.in28minutes.abstractclass;

public abstract class AbstractRecipe {

	abstract void getReady();

	abstract void prepareDish();

	abstract void cleanup();

	public void execute() {

		getReady();
		prepareDish();
		cleanup();
	}
}
