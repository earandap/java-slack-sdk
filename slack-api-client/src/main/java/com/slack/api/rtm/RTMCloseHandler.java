package com.slack.api.rtm;

import javax.websocket.CloseReason;

@FunctionalInterface
public interface RTMCloseHandler {

    void handle(CloseReason reason);

}
