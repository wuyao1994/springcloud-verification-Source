package com.aaxiscommerce.process;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

//@EnableBinding(Processor.class)
//public class TransformProcessor {
//	@StreamListener(Processor.INPUT)
//	@SendTo(Processor.OUTPUT)
//	public String transform(String message) {
//		return message.toUpperCase();
//	}
//}
