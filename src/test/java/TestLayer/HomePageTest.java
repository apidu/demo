package TestLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import PageLayer.HomePage;
import UtilLayer.Excelereader;

public class HomePageTest extends Baseclass {
	public HomePage hp;
	public Excelereader exp;
	@Test(priority=1)
	public void validateHomepage()
	{
	  hp=new HomePage();
	  hp.homepage();
	  
	}
	
	@Test(priority=2,dataProvider="dealstitle")
	public void clickOndeals(String dealstitle)
	{
		hp.Deals(dealstitle);
	}
	@Test(priority=3)
	public void validTitle()
	{
		hp.caputuretitle();
	}
	
	@DataProvider(name="dealstitle")
	public Object[][] readdeta()
	{
		exp=new Excelereader();
		int row =exp.rowcount(1);
		row +=1;
		System.out.println("rowcount = "+row);
		Object[][] data=new Object[row][1];
		
		for(int i=0;i<row;i++)
		{
			 data[i][0]=exp.cellvalue(1, i, 0);
		}
		return data;
	}
	

}
