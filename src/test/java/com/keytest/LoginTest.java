package com.keytest;

import org.testng.annotations.Test;

import com.keyword.engine.KeywordEngine;

public class LoginTest {
public KeywordEngine keyWordEngine;
	
	@Test
	public void loginTest(){
		keyWordEngine = new KeywordEngine();
		keyWordEngine.startExecution("Sheet1");
	}
}
