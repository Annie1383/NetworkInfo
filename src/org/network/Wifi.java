package org.network;

public class Wifi 
{
	private void WifiName()
	{ 
	System.out.println("WiFi Name Is :AirTel");
	}
	public static void main(String[] args)
	{
		Wifi wf=new Wifi();
		wf.WifiName();
		
		mobileData md=new mobileData();
		md.dataName();
		
		lan ln=new lan();
		ln.lanName();
		
		wireless wl=new wireless();
		wl.ModemName();
		
	}
}
