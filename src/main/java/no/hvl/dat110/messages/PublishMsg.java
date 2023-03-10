package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic=topic;
		this.message=message;
	}

	private String topic;
	private String message;

	@Override
	public MessageType getType() {
		return super.getType();
	}

	@Override
	public String getUser() {
		return super.getUser();
	}

	public String getTopic() {
		return topic;
	}

	public String getMessage() {
		return message;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "PublishMsg{" +
				"topic='" + topic + '\'' +
				", message='" + message + '\'' +
				'}';
	}
}
