/**
 * 
 */
package com.aaxiscommerce.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author ezhang
 *
 */
public interface HostSystemChannel {
	public static final String HOST_UPDATE = "HOST_UPDATE";
	public static final String OUTPUT = HOST_UPDATE + "_OUTPUT";
	public static final String INPUT = HOST_UPDATE + "_INPUT";

	/**
	 * Get update comes from topic 'HOST_UPDATE' in event/message bus and update
	 * is generated by host system.<br/>
	 * 
	 * @return
	 */
	@Input(value = INPUT)
	SubscribableChannel subscribe();

	/**
	 * Publish update to topic 'HOST_UPDATE' in event/message bus and update is
	 * generated by host system.<br/>
	 * 
	 * 
	 * @return
	 */
	@Output(value = OUTPUT)
	MessageChannel publish();
}