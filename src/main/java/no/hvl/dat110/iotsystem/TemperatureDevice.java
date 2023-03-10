package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;
import no.hvl.dat110.messages.PublishMsg;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();


		// create a client object and use it to
		Client c= new Client("sensor", Common.BROKERHOST, Common.BROKERPORT);
		// - connect to the broker - user "sensor" as the user name
		c.connect();
		// - publish the temperature(s)
		for(int i=0; i<COUNT; i++) {
			String reading=String.valueOf(sn.read());
			System.out.println("...READING="+reading);
			c.publish(Common.TEMPTOPIC, reading);

		}
		// - disconnect from the broker
		c.disconnect();

		System.out.println("Temperature device stopping ... ");

	}
}
