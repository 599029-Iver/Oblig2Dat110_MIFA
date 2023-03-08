package no.hvl.dat110.iotsystem;

import no.hvl.dat110.broker.Broker;
import no.hvl.dat110.broker.Dispatcher;
import no.hvl.dat110.broker.Storage;
import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// TODO - start

		// create a client object and use it to
		Client client = new Client("sensor", Common.BROKERHOST, Common.BROKERPORT);
		// - connect to the broker - user "sensor" as the user name
		client.connect();
		// - publish the temperature(s)
		

		for(int i = 0; i < 10; i++){
			client.publish(Common.TEMPTOPIC, Integer.toString(sn.read()));
		}
		
		// - disconnect from the broker
		
		client.disconnect();
		// TODO - end

		System.out.println("Temperature device stopping ... ");



	}
}
