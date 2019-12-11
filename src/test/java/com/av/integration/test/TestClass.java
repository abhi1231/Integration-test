package com.av.integration.test;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass {
	

	@Test
	public void myTest1() {

		System.out.println("executing test1");

	}
	

	@Test(groups = { "sanity", "regression", "bvt" })
	public void myTest2() {

		System.out.println("executing test2 with groups");

	}

	@Test(groups = { "regression", "bvt" },dependsOnMethods="myTest2")
	public void myTest3() {

		System.out.println("executing test3 with groups");

	}

	@Test(dataProvider = "testData1", groups = { "regression", "bvt" })
	public void myTest4(String data) {

		System.out.println("executing test4 with dataprovider");
		System.out.println("Test Parameter:: "+data);

	}

	@DataProvider
	public Object[][] testData1() throws Exception {

		return new Object[][] {

			{ "testData1"} 
			
		};
	
	}
	
	@Test(dataProvider = "testData2", groups = { "sanity", "regression", "bvt" })
	public void myTest5(String data1,int a,int b , String data2) {

		System.out.println("executing test5 with dataprovider");
		System.out.println("TestData::"+data1+"\n"+a+"\n"+b+"\n"+data2);

	}

	@DataProvider
	public Object[][] testData2() throws Exception {
		

		return new Object[][] {

			{"testData1",10,20,"testData2" } 
			
			
		};		
	}
	
	@Test(dataProvider = "testData3", groups = { "sanity", "regression", "bvt" })
	public void myTest6(List<String> list) {

		System.out.println("executing test6 with dataprovider");
		
		for(String data: list) {
			
			System.out.println(data+"\n");
		}

	}
	
	@DataProvider
	public Object[][] testData3() throws Exception {
		
		List<String> list = new ArrayList<String>();
		
		list.add("list1");
		list.add("list2");
		list.add("list3");

		return new Object[][] {

			{list} 
			
		};		
	}
	
	@Test(description="Intentionally failing the test case")
	public void myTest7() {

		Assert.fail("Test case failed");

	}

}
