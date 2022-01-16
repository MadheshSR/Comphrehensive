package com.mindtree.stepDefinitions;

import com.mindtree.exceptions.UtilityException;
import com.mindtree.reusableComponents.Base;

import io.cucumber.java.*;

public class Hooks extends Base {

	public Hooks() throws UtilityException, Exception {
		super();
	}

	@BeforeAll
	public static void init() throws Exception {
		initializeReport();
	}

}
